package org.matheclipse.core.builtin;

import org.gavaghan.geodesy.Ellipsoid;
import org.gavaghan.geodesy.GeodeticCalculator;
import org.gavaghan.geodesy.GeodeticMeasurement;
import org.gavaghan.geodesy.GlobalPosition;
import org.matheclipse.core.eval.EvalEngine;
import org.matheclipse.core.eval.interfaces.AbstractEvaluator;
import org.matheclipse.core.expression.DataExpr;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;

public class GeodesyFunctions {
	/**
	 * 
	 * See <a href="https://pangin.pro/posts/computation-in-static-initializer">Beware of computation in static
	 * initializer</a>
	 */
	private static class Initializer {

		private static void init() {
			F.GeoDistance.setEvaluator(new GeoDistance());
			F.GeoPosition.setEvaluator(new GeoPosition());
		}
	}

	private static class GeoDistance extends AbstractEvaluator {

		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			Object lhs = ast.arg1().toData();
			Object rhs = ast.arg2().toData();
			if (lhs instanceof GlobalPosition && rhs instanceof GlobalPosition) {
				GeodeticCalculator geoCalc = new GeodeticCalculator();
				Ellipsoid reference = Ellipsoid.WGS84;

				GlobalPosition p1=(GlobalPosition)lhs;
				GlobalPosition p2=(GlobalPosition)rhs;
				
				GeodeticMeasurement gm = geoCalc.calculateGeodeticMeasurement(reference, p1, p2);
				return F.UnitConvert(F.Quantity(F.num(gm.getPointToPointDistance()), F.stringx("m")), F.stringx("mi"));
			}
			if (ast.arg1().isAST(F.List, 3) && ast.arg2().isAST(F.List, 3)) {
				GeodeticCalculator geoCalc = new GeodeticCalculator();
				Ellipsoid reference = Ellipsoid.WGS84;

				double[] list1 = ((IAST) ast.arg1()).toDoubleVector();
				double[] list2 = ((IAST) ast.arg2()).toDoubleVector();

				GlobalPosition p1 = new GlobalPosition(list1[0], list1[1], 0.0);
				GlobalPosition p2 = new GlobalPosition(list2[0], list2[1], 0.0);

				GeodeticMeasurement gm = geoCalc.calculateGeodeticMeasurement(reference, p1, p2);
				return F.UnitConvert(F.Quantity(F.num(gm.getPointToPointDistance()), F.stringx("m")), F.stringx("mi"));
			}
			return F.NIL;
		}

		@Override
		public int[] expectedArgSize() {
			return IOFunctions.ARGS_2_2;
		}
	}

	private static class GeoPosition extends AbstractEvaluator {

		@Override
		public IExpr evaluate(final IAST ast, EvalEngine engine) {
			if (ast.isAST1()) {
				if (ast.arg1().isList()) {
					double[] list1 = ((IAST) ast.arg1()).toDoubleVector();
					if (list1.length == 2) {
						return DataExpr.newInstance(F.GeoPosition, new GlobalPosition(list1[0], list1[1], 0.0));
					} else if (list1.length == 3) {
						return DataExpr.newInstance(F.GeoPosition, new GlobalPosition(list1[0], list1[1], list1[2]));
					}

				}
			}
			return F.NIL;
		}

		@Override
		public int[] expectedArgSize() {
			return IOFunctions.ARGS_1_1;
		}
	}

	public static void initialize() {
		Initializer.init();
	}

	private GeodesyFunctions() {

	}

}
