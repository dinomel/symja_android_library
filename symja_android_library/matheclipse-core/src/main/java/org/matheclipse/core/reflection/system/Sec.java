package org.matheclipse.core.reflection.system;

import static org.matheclipse.core.expression.F.CN1;
import static org.matheclipse.core.expression.F.Sec;
import static org.matheclipse.core.expression.F.Times;

import org.apache.commons.math3.complex.Complex;
import org.matheclipse.core.eval.interfaces.AbstractFunctionEvaluator;
import org.matheclipse.core.eval.interfaces.AbstractTrigArg1;
import org.matheclipse.core.eval.interfaces.INumeric;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.IInteger;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.core.reflection.system.rules.SecRules;
import org.matheclipse.parser.client.SyntaxError;

/**
 * Secant function
 * 
 * See <a href="http://en.wikipedia.org/wiki/Trigonometric_functions">Trigonometric functions</a>
 */
public class Sec extends AbstractTrigArg1 implements INumeric, SecRules {

	@Override
	public IAST getRuleAST() {
		return RULES;
	}

	public Sec() {
	}

	@Override
	public IExpr evaluateArg1(final IExpr arg1) {
		if (AbstractFunctionEvaluator.isNegativeExpression(arg1)) {
			return Sec(Times(CN1, arg1));
		}
		IExpr imPart = AbstractFunctionEvaluator.getPureImaginaryPart(arg1);
		if (imPart != null) {
			return F.Sech(imPart);
		}
		IExpr[] parts = AbstractFunctionEvaluator.getPeriodicParts(arg1);
		if (parts != null) {
			if (parts[1].isInteger()) {
				// period 2*Pi
				IInteger i = (IInteger) parts[1];
				if (i.isEven()) {
					return F.Sec(parts[0]);
				} else {
					return F.Times(F.CN1, F.Sec(parts[0]));
				}
			}
		}
		return null;
	}

	@Override
	public IExpr e1DblArg(final double arg1) {
		return F.num(1.0D / Math.cos(arg1));
	}

	@Override
	public IExpr e1ComplexArg(final Complex arg1) {
		return F.complexNum(arg1.cos().reciprocal());
	}

	public double evalReal(final double[] stack, final int top, final int size) {
		if (size != 1) {
			throw new UnsupportedOperationException();
		}
		return 1.0D / Math.cos(stack[top]);
	}

	@Override
	public void setUp(final ISymbol symbol) throws SyntaxError {
		symbol.setAttributes(ISymbol.LISTABLE | ISymbol.NUMERICFUNCTION);
		super.setUp(symbol);
	}
}
