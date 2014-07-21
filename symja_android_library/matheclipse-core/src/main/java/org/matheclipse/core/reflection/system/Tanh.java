package org.matheclipse.core.reflection.system;

import static org.matheclipse.core.expression.F.CN1;
import static org.matheclipse.core.expression.F.Tanh;
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
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.core.reflection.system.rules.TanhRules;
import org.matheclipse.parser.client.SyntaxError;

/**
 * Hyperbolic tangent
 * 
 * See <a href="http://en.wikipedia.org/wiki/Hyperbolic_function">Hyperbolic function</a>
 */
public class Tanh extends AbstractTrigArg1 implements INumeric, TanhRules {

	@Override
	public IAST getRuleAST() {
		return RULES;
	}
	
	public Tanh() {
	}

	@Override
	public IExpr evaluateArg1(final IExpr arg1) {
		if (AbstractFunctionEvaluator.isNegativeExpression(arg1)) {
			return Times(CN1, Tanh(Times(CN1, arg1)));
		}
		IExpr imPart = AbstractFunctionEvaluator.getPureImaginaryPart(arg1);
		if (imPart != null) {
			return F.Times(F.CI, F.Tan(imPart));
		}
		if (arg1.isZero()) {
			return F.C0;
		}
		return null;
	}

	@Override
	public IExpr e1DblArg(final double arg1) {
		return F.num(Math.tanh(arg1));
	}

	@Override
	public IExpr e1ComplexArg(final Complex arg1) {
		return F.complexNum(arg1.tanh());
	}

	@Override
	public IExpr e1ApfloatArg(Apfloat arg1) {
		return F.num(ApfloatMath.tanh(arg1));
	}

	@Override
	public IExpr e1ApcomplexArg(Apcomplex arg1) {
		return F.complexNum(ApcomplexMath.tanh(arg1));
	}
	
	public double evalReal(final double[] stack, final int top, final int size) {
		if (size != 1) {
			throw new UnsupportedOperationException();
		}
		return Math.tanh(stack[top]);
	}

	@Override
	public void setUp(final ISymbol symbol) throws SyntaxError {
		symbol.setAttributes(ISymbol.LISTABLE | ISymbol.NUMERICFUNCTION);
		super.setUp(symbol);
	}
}
