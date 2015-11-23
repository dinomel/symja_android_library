package org.matheclipse.core.reflection.system;

import java.math.BigInteger;

import org.matheclipse.core.eval.interfaces.AbstractTrigArg1;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.IInteger;
import org.matheclipse.core.interfaces.ISymbol;
import org.matheclipse.parser.client.SyntaxError;

/**
 * 
 * See <a href="http://en.wikipedia.org/wiki/Catalan_number">Wikipedia:Catalan
 * number</a>
 * 
 */
public class CatalanNumber extends AbstractTrigArg1 {
	public CatalanNumber() {
	}

	@Override
	public IExpr evaluateArg1(final IExpr arg1) {
		if (arg1.isInteger()) {
			return F.integer(catalanNumber(((IInteger) arg1).getBigNumerator()));
		}

		return null;
	}

	public static BigInteger catalanNumber(BigInteger n) {
		n = n.add(BigInteger.ONE);
		if (!(n.compareTo(BigInteger.ZERO) > 0)) {
			return BigInteger.ZERO;
		}
		BigInteger i = BigInteger.ONE;
		BigInteger c = BigInteger.ONE;
		final BigInteger temp1 = n.shiftLeft(1).subtract(BigInteger.ONE);
		while (i.compareTo(n) < 0) {
			c = c.multiply(temp1.subtract(i)).divide(i);
			i = i.add(BigInteger.ONE);
		}
		return c.divide(n);
	}
	
	public static IInteger catalanNumber(IInteger n) {
		n = n.add(F.C1);
		if (!(n.compareInt(0) > 0)) {
			return F.C0;
		}
		IInteger i = F.C1;
		IInteger c = F.C1;
		final IInteger temp1 = n.shiftLeft(1).subtract(F.C1);
		while (i.compareTo(n) < 0) {
			c = c.multiply(temp1.subtract(i)).div(i);
			i = i.add(F.C1);
		}
		return c.div(n);
	}

	@Override
	public void setUp(final ISymbol symbol) throws SyntaxError {
		symbol.setAttributes(ISymbol.LISTABLE | ISymbol.NUMERICFUNCTION);
		super.setUp(symbol);
	}
}
