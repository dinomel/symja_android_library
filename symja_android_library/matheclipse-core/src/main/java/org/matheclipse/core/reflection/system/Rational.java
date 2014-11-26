package org.matheclipse.core.reflection.system;

import org.matheclipse.core.basic.Config;
import org.matheclipse.core.eval.EvalEngine;
import org.matheclipse.core.eval.exception.Validate;
import org.matheclipse.core.eval.interfaces.AbstractFunctionEvaluator;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.IInteger;
import org.matheclipse.core.interfaces.INum;
import org.matheclipse.core.interfaces.ISymbol;

/**
 * Representation for a rational number
 * 
 */
public class Rational extends AbstractFunctionEvaluator {
	public final static Rational CONST = new Rational();

	public Rational() {
	}

	@Override
	public IExpr evaluate(final IAST ast) {
		Validate.checkSize(ast, 3);

		try {
			// try to convert into a fractional number
			IExpr arg0 = ast.arg1();
			IExpr arg1 = ast.arg2();
			if (arg0.isInteger() && arg1.isInteger()) {
				// already evaluated
			} else if (arg0 instanceof INum && arg1 instanceof INum) {
				// already evaluated
			} else {
				final EvalEngine engine = EvalEngine.get();
				arg0 = engine.evaluate(arg0);
				arg1 = engine.evaluate(arg1);
			}
			if (arg0.isInteger() && arg1.isInteger()) {
				// symbolic mode
				IInteger numerator = (IInteger) arg0;
				IInteger denominator = (IInteger) arg1;
				if (denominator.isZero()) {
					EvalEngine ee = EvalEngine.get();
					ee.printMessage("Division by zero expression: " + numerator.toString() + "/" + denominator.toString());
					if (numerator.isZero()) {
						// 0^0
						return F.Indeterminate;
					}
					return F.CComplexInfinity;
				}
				if (numerator.isZero()) {
					return F.C0;
				}
				return F.fraction(numerator, denominator);
			} else if (arg0 instanceof INum && arg1 instanceof INum) {
				// numeric mode
				INum numerator = (INum) arg0;
				INum denominator = (INum) arg1;
				if (denominator.isZero()) {
					EvalEngine ee = EvalEngine.get();
					ee.printMessage("Division by zero expression: " + numerator.toString() + "/" + denominator.toString());
					if (numerator.isZero()) {
						// 0^0
						return F.Indeterminate;
					}
					return F.CComplexInfinity;
				}
				if (numerator.isZero()) {
					return F.C0;
				}
				return F.num(numerator.doubleValue() / denominator.doubleValue());
			}
		} catch (Exception e) {
			if (Config.SHOW_STACKTRACE) {
				e.printStackTrace();
			}
		}

		return null;
	}

	public void setUp(final ISymbol symbol) {
		symbol.setAttributes(ISymbol.HOLDALL);
	}
}
