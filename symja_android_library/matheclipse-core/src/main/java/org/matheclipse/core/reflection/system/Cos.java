package org.matheclipse.core.reflection.system;

import static org.matheclipse.core.expression.F.CN1;
import static org.matheclipse.core.expression.F.Cos;
import static org.matheclipse.core.expression.F.Times;

import org.apache.commons.math3.complex.Complex;
import org.apfloat.Apcomplex;
import org.apfloat.ApcomplexMath;
import org.apfloat.Apfloat;
import org.apfloat.ApfloatMath;
import org.matheclipse.core.eval.interfaces.AbstractFunctionEvaluator;
import org.matheclipse.core.eval.interfaces.AbstractTrigArg1;
import org.matheclipse.core.eval.interfaces.INumeric;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.IFraction;
import org.matheclipse.core.interfaces.IInteger;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.core.reflection.system.rules.CosRules;
import org.matheclipse.parser.client.SyntaxError;

/**
 * Cosine function
 * 
 * See <a href="http://en.wikipedia.org/wiki/Trigonometric_functions">Trigonometric functions</a> and <a
 * href="http://en.wikipedia.org/wiki/Exact_trigonometric_constants">Wikipedia - Exact trigonometric constants</a>
 */
public class Cos extends AbstractTrigArg1 implements INumeric, CosRules {

	@Override
	public IAST getRuleAST() {
		return RULES;
	}

	public Cos() {
	}

	@Override
	public IExpr evaluateArg1(final IExpr arg1) {
		if (AbstractFunctionEvaluator.isNegativeExpression(arg1)) {
			return Cos(Times(CN1, arg1));
		}
		IExpr imPart = AbstractFunctionEvaluator.getPureImaginaryPart(arg1);
		if (imPart != null) {
			return F.Cosh(imPart);
		}
		IExpr[] parts = AbstractFunctionEvaluator.getPeriodicParts(arg1);
		if (parts != null) {
			if (parts[1].isInteger()) {
				// period 2*Pi
				IInteger i = (IInteger) parts[1];
				if (i.isEven()) {
					return F.Cos(parts[0]);
				} else {
					return F.Times(F.CN1, F.Cos(parts[0]));
				}
			} else if (parts[1].isFraction()) {
				// period 2*Pi
				IFraction f = (IFraction) parts[1];
				if (f.equals(F.C1D2)) {// TODO refine this
					return F.Times(F.CN1, F.Sin(parts[0]));
				}
			}
		}
		return null;
	}

	@Override
	public IExpr e1DblArg(final double arg1) {
		return F.num(Math.cos(arg1));
	}

	@Override
	public IExpr e1ComplexArg(final Complex arg1) {
		return F.complexNum(arg1.cos());
	}

	@Override
	public IExpr e1ApfloatArg(Apfloat arg1) {
		return F.num(ApfloatMath.cos(arg1));
	}

	@Override
	public IExpr e1ApcomplexArg(Apcomplex arg1) {
		return F.complexNum(ApcomplexMath.cos(arg1));
	}
	
	public double evalReal(final double[] stack, final int top, final int size) {
		if (size != 1) {
			throw new UnsupportedOperationException();
		}
		return Math.cos(stack[top]);
	}

	// public IExpr evalInteger(IInteger i) {
	// if (i.equals(F.C0)) {
	// return F.C1;
	// }
	// return null;
	// }

	// public void setUp(ISymbol symbol) throws SyntaxError {
	// super.setUp(symbol);
	// createRuleFromMethodName(symbol, "Cos[x_Integer]", "evalInteger");
	// }
	@Override
	public void setUp(final ISymbol symbol) throws SyntaxError {
		symbol.setAttributes(ISymbol.LISTABLE | ISymbol.NUMERICFUNCTION);
		super.setUp(symbol);
	}
}
