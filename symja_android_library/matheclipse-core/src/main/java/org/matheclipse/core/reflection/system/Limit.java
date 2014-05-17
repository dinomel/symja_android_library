package org.matheclipse.core.reflection.system;

import static org.matheclipse.core.expression.F.$p;
import static org.matheclipse.core.expression.F.$s;
import static org.matheclipse.core.expression.F.C0;
import static org.matheclipse.core.expression.F.C1;
import static org.matheclipse.core.expression.F.CInfinity;
import static org.matheclipse.core.expression.F.CN1;
import static org.matheclipse.core.expression.F.CNInfinity;
import static org.matheclipse.core.expression.F.Condition;
import static org.matheclipse.core.expression.F.E;
import static org.matheclipse.core.expression.F.FreeQ;
import static org.matheclipse.core.expression.F.Limit;
import static org.matheclipse.core.expression.F.List;
import static org.matheclipse.core.expression.F.Negative;
import static org.matheclipse.core.expression.F.Plus;
import static org.matheclipse.core.expression.F.Power;
import static org.matheclipse.core.expression.F.Rule;
import static org.matheclipse.core.expression.F.Set;
import static org.matheclipse.core.expression.F.SetDelayed;
import static org.matheclipse.core.expression.F.Times;
import static org.matheclipse.core.expression.F.n;
import static org.matheclipse.core.expression.F.a;
import static org.matheclipse.core.expression.F.a_;
import static org.matheclipse.core.expression.F.x;
import static org.matheclipse.core.expression.F.x_;
import static org.matheclipse.core.expression.F.x_Symbol;

import org.matheclipse.core.convert.JASIExpr;
import org.matheclipse.core.eval.EvalEngine;
import org.matheclipse.core.eval.exception.RecursionLimitExceeded;
import org.matheclipse.core.eval.exception.Validate;
import org.matheclipse.core.eval.interfaces.AbstractFunctionEvaluator;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.IInteger;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.core.polynomials.PartialFractionGenerator;

import edu.jas.poly.GenPolynomial;

/**
 * Limit of a function. See <a href="http://en.wikipedia.org/wiki/List_of_limits">List of Limits</a>
 */
public class Limit extends AbstractFunctionEvaluator {

	// {
	// Limit[x_^n_IntegerQ, x_Symbol->Infinity]:= 0 /; Negative[n],
	// Limit[x_^n_IntegerQ, x_Symbol->DirectedInfinity[-1]]:= 0 /; Negative[n],
	// Limit[(1+x_^(-1))^x_, x_Symbol->Infinity]=E,
	// Limit[(1+a_*(x_^(-1)))^x_, x_Symbol->Infinity]=E^(-1) /; FreeQ(a,x)
	// }

	final static IAST RULES = List(
			SetDelayed(Limit(Power(x_, $p(n, $s("IntegerQ"))), Rule(x_Symbol, CInfinity)), Condition(C0, Negative(n))),
			SetDelayed(Limit(Power(x_, $p(n, $s("IntegerQ"))), Rule(x_Symbol, CNInfinity)), Condition(C0, Negative(n))),
			Set(Limit(Power(Plus(C1, Power(x_, CN1)), x_), Rule(x_Symbol, CInfinity)), E),
			Set(Limit(Power(Plus(C1, Times(a_, Power(x_, CN1))), x_), Rule(x_Symbol, CInfinity)), Condition(Power(E, a),FreeQ(a,x))));

	/**
	 * Try L'hospitales rule. See <a href="http://en.wikipedia.org/wiki/L%27H%C3%B4pital%27s_rule">Wikipedia L'Hôpital's rule</a>
	 * 
	 * @param numerator
	 * @param denominator
	 * @param sym
	 * @param rule
	 * @return
	 */
	private static IExpr lHospitalesRule(IExpr numerator, IExpr denominator, ISymbol sym, IExpr lim, IAST rule) {
		EvalEngine engine = EvalEngine.get();
		int limit = engine.getRecursionLimit();
		if (limit > 0) {
			IExpr expr = F.eval(F.Times(F.D(numerator, sym), F.Power(F.D(denominator, sym), F.CN1)));
			return limit(expr, sym, lim, rule, false);
		}
		try {
			if (limit <= 0) {
				// set recursion limit for using l'Hospitales rule
				engine.setRecursionLimit(128);
			}
			IExpr expr = F.eval(F.Times(F.D(numerator, sym), F.Power(F.D(denominator, sym), F.CN1)));
			return limit(expr, sym, lim, rule, false);
		} catch (RecursionLimitExceeded rle) {
			engine.setRecursionLimit(limit);
		} finally {
			engine.setRecursionLimit(limit);
		}
		return null;
	}

	public static IExpr limit(final IExpr expr, ISymbol sym, IExpr lim, IAST rule, boolean evalExpr) {
		IExpr expression = expr;
		if (evalExpr) {
			IExpr result = F.eval(expression);
			if (result.isNumericFunction()) {
				return result;
			}
			if (!result.equals(F.Indeterminate)) {
				expression = result;
			}

			if (lim.isNumericFunction()) {
				result = expression.replaceAll(rule);
				if (result != null) {
					result = F.eval(result);
					if (result.isNumericFunction()) {
						return result;
					}
				}
			}
		}
		if (expression.isFree(sym, true)) {
			// Limit[a_,sym->lim] -> a
			return expression;
		}
		if (expression.equals(sym)) {
			// Limit[x_,x_->lim] -> lim
			return lim;
		}
		if (expression.isAST()) {
			final IAST arg1 = (IAST) expression;
			final IExpr header = arg1.head();
			if (arg1.size() == 2) {
				if (header.equals(F.Sin) || header.equals(F.Cos)) {
					return F.$(header, F.Limit(arg1.arg1(), rule));
				}
			}
			if (header == F.Plus) {
				// Limit[a_+b_+c_,sym->lim] ->
				// Limit[a,sym->lim]+Limit[b,sym->lim]+Limit[c,sym->lim]
				if (lim.isInfinity() || lim.isNegativeInfinity()) {
					GenPolynomial<IExpr> poly = PolynomialQ.polynomial(arg1, sym, true);
					if (poly != null) {
						IExpr coeff = poly.leadingBaseCoefficient();
						long oddDegree = poly.degree() % 2;
						if (oddDegree == 1) {
							// odd degree
							return F.Limit(F.Times(coeff, lim), rule);
						} else {
							// even degree
							return F.Limit(F.Times(coeff, F.CInfinity), rule);
						}
					}
				}
				return mapLimit(arg1, rule);
			} else if (header == F.Times) {
				IExpr[] parts = org.matheclipse.core.reflection.system.Apart.getFractionalPartsTimes(arg1, false);
				if (parts != null) {

					IExpr numerator = parts[0];
					IExpr denominator = parts[1];
					if (lim.isInfinity() || lim.isNegativeInfinity()) {
						GenPolynomial<IExpr> denominatorPoly = PolynomialQ.polynomial(denominator, sym, true);
						if (denominatorPoly != null) {
							GenPolynomial<IExpr> numeratorPoly = PolynomialQ.polynomial(numerator, sym, true);
							if (numeratorPoly != null) {
								return limitsInfinityOfRationalFunctions(numeratorPoly, denominatorPoly, sym, lim, rule);
							}
						}
					}

					IAST plusResult = org.matheclipse.core.reflection.system.Apart.partialFractionDecompositionRational(
							new PartialFractionGenerator(), parts, sym);
					if (plusResult != null) {
						// OneIdentity if plusResult.size() == 2
						if (plusResult.size() > 2) {
							return mapLimit(plusResult, rule);
						}
					}

					IExpr temp = timesLimit(numerator, denominator, sym, lim, rule);
					if (temp != null) {
						return temp;
					}
				}
				return mapLimit(arg1, rule);
			} else if (arg1.isAST(F.Power, 3)) {
				if (arg1.get(2).isInteger()) {
					// Limit[a_^n_,sym->lim] -> Limit[a,sym->lim]^n
					IInteger n = (IInteger) arg1.get(2);
					IExpr temp = F.eval(F.Limit(arg1.arg1(), rule));
					if (temp.isInfinity()) {
						if (n.isPositive()) {
							return temp;
						} else if (n.isNegative()) {
							return F.C0;
						}
						return null;
					} else if (temp.isNegativeInfinity()) {
						if (n.isPositive()) {
							if (n.isEven()) {
								return F.CInfinity;
							} else {
								return F.CNInfinity;
							}
						} else if (n.isNegative()) {
							return F.C0;
						}
						return null;
					} else if (temp.equals(F.Indeterminate) || temp.isAST(F.Limit)) {
						return null;
					}
					if (n.isPositive()) {
						return F.Power(temp, n);
					} else if (n.isNegative() && n.isEven()) {
						return F.Power(temp, n);
					}

				}
			}

		}

		return null;
	}

	/**
	 * See: <a href="http://en.wikibooks.org/wiki/Calculus/Infinite_Limits">Limits at Infinity of Rational Functions</a>
	 * 
	 * @param numeratorPoly
	 * @param denominatorPoly
	 * @param sym
	 * @param rule
	 * @param denominator
	 * @return
	 */
	private static IExpr limitsInfinityOfRationalFunctions(GenPolynomial<IExpr> numeratorPoly,
			GenPolynomial<IExpr> denominatorPoly, ISymbol sym, IExpr lim, IAST rule) {
		long numDegree = numeratorPoly.degree();
		long denomDegree = denominatorPoly.degree();
		if (numDegree > denomDegree) {
			// If the numerator has the highest term, then the fraction is called "top-heavy". If, when you divide the numerator
			// by the denominator the resulting exponent on the variable is even, then the limit (at both \infty and -\infty) is
			// \infty. If it is odd, then the limit at \infty is \infty, and the limit at -\infty is -\infty.
			long oddDegree = (numDegree + denomDegree) % 2;
			if (oddDegree == 1) {
				return F.Limit(
						F.Times(F.Divide(numeratorPoly.leadingBaseCoefficient(), denominatorPoly.leadingBaseCoefficient()), lim),
						rule);
			} else {
				return F.Limit(F.Times(F.Divide(numeratorPoly.leadingBaseCoefficient(), denominatorPoly.leadingBaseCoefficient()),
						F.CInfinity), rule);
			}
		} else if (numDegree < denomDegree) {
			// If the denominator has the highest term, then the fraction is called "bottom-heavy" and the limit (at both \infty
			// and -\infty) is zero.
			return F.C0;
		}
		// If the exponent of the highest term in the numerator matches the exponent of the highest term in the denominator,
		// the limit (at both \infty and -\infty) is the ratio of the coefficients of the highest terms.
		return F.Divide(numeratorPoly.leadingBaseCoefficient(), denominatorPoly.leadingBaseCoefficient());
	}

	private static IExpr mapLimit(final IAST expr, IAST rule) {
		final IAST resultList = expr.clone();
		for (int i = 1; i < resultList.size(); i++) {
			resultList.set(i, F.Limit(resultList.get(i), rule));
		}
		return resultList;
	}

	/**
	 * 
	 * @param numerator
	 * @param denominator
	 * @param sym
	 * @param lim
	 * @param rule
	 * @return <code>null</code> if no limit found
	 */
	private static IExpr timesLimit(final IExpr numerator, final IExpr denominator, ISymbol sym, IExpr lim, IAST rule) {
		IExpr numValue;
		IExpr denValue;
		if (denominator.isOne() && numerator.isTimes()) {
			// Limit[a_*b_*c_,sym->lim] ->
			// Limit[a,sym->lim]*Limit[b,sym->lim]*Limit[c,sym->lim]
			return mapLimit((IAST) numerator, rule);
		}
		if (!denominator.isNumber() || denominator.isZero()) {
			denValue = F.evalBlock(denominator, sym, lim);
			if (denValue.equals(F.Indeterminate)) {
				return null;
			} else if (denValue.isZero()) {
				numValue = F.evalBlock(numerator, sym, lim);
				if (numValue.isZero()) {
					return lHospitalesRule(numerator, denominator, sym, lim, rule);
				}
				return null;
			} else if (F.CInfinity.equals(denValue)) {
				numValue = F.evalBlock(numerator, sym, lim);
				if (F.CInfinity.equals(numValue)) {
					return lHospitalesRule(numerator, denominator, sym, lim, rule);
				}
				return null;
			} else if (denValue.isNegativeInfinity()) {
				numValue = F.evalBlock(numerator, sym, lim);
				if (numValue.isNegativeInfinity()) {
					return lHospitalesRule(numerator, denominator, sym, lim, rule);
				}
				return null;
			}
		}
		return F.Times(F.Limit(numerator, rule), F.Power(F.Limit(denominator, rule), F.CN1));
	}

	public Limit() {
	}

	@Override
	public IExpr evaluate(final IAST ast) {
		Validate.checkSize(ast, 3);

		if (!ast.arg2().isRuleAST()) {
			return null;
		}
		IAST rule = (IAST) ast.arg2();
		if (!(rule.arg1().isSymbol())) {
			return null;
		}
		ISymbol sym = (ISymbol) rule.arg1();
		IExpr lim = null;
		if (rule.arg2().isFree(sym, true)) {
			lim = rule.get(2);
		} else {
			return null;
		}
		return limit(ast.arg1(), sym, lim, rule, true);
	}

	@Override
	public IAST getRuleAST() {
		return RULES;
	}

}