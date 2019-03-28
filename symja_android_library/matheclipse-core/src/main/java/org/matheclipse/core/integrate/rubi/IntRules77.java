package org.matheclipse.core.integrate.rubi;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctions.*;
import org.matheclipse.core.interfaces.IAST;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules77 { 

	public static void initialize() {
		Initializer.init();
	}

	private static class Initializer  {

		private static void init() {
IIntegrate(3851,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),-1)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(d,3),Cot(Plus(e,Times(f,x))),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,Negate(C3))),Power(Times(b,f,Plus(n,Negate(C2))),-1)),x)),Dist(Times(Power(d,3),Power(Times(b,Plus(n,Negate(C2))),-1)),Int(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,Negate(C3))),Simp(Plus(Times(a,Plus(n,Negate(C3))),Times(b,Plus(n,Negate(C3)),Csc(Plus(e,Times(f,x)))),Times(CN1,a,Plus(n,Negate(C2)),Sqr(Csc(Plus(e,Times(f,x)))))),x),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),-1)),x),x)),And(FreeQ(List(a,b,d,e,f),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),GtQ(n,C3))));
IIntegrate(3852,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),CN1D2),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),-1)),x_Symbol),
    Condition(Plus(Dist(Times(Sqr(b),Power(Times(Sqr(a),Sqr(d)),-1)),Int(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),QQ(3L,2L)),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),-1)),x),x),Dist(Power(a,-2),Int(Times(Plus(a,Times(CN1,b,Csc(Plus(e,Times(f,x))))),Power(Times(d,Csc(Plus(e,Times(f,x)))),CN1D2)),x),x)),And(FreeQ(List(a,b,d,e,f),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0))));
IIntegrate(3853,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),-1)),x_Symbol),
    Condition(Plus(Simp(Times(Cot(Plus(e,Times(f,x))),Power(Times(d,Csc(Plus(e,Times(f,x)))),n),Power(Times(a,f,n),-1)),x),Negate(Dist(Power(Times(a,d,n),-1),Int(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,C1)),Simp(Plus(Times(b,n),Times(CN1,a,Plus(n,C1),Csc(Plus(e,Times(f,x)))),Times(CN1,b,Plus(n,C1),Sqr(Csc(Plus(e,Times(f,x)))))),x),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),-1)),x),x))),And(FreeQ(List(a,b,d,e,f),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),LeQ(n,CN1),IntegerQ(Times(C2,n)))));
IIntegrate(3854,Int(Times(Sqrt(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT)),Sqrt(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_))),x_Symbol),
    Condition(Plus(Dist(a,Int(Times(Sqrt(Times(d,Csc(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x),x),Dist(Times(b,Power(d,-1)),Int(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),QQ(3L,2L)),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x),x)),And(FreeQ(List(a,b,d,e,f),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0))));
IIntegrate(3855,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_),Sqrt(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_))),x_Symbol),
    Condition(Plus(Simp(Times(CN2,d,Cos(Plus(e,Times(f,x))),Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Power(Times(f,Plus(Times(C2,n),Negate(C1))),-1)),x),Dist(Times(Sqr(d),Power(Plus(Times(C2,n),Negate(C1)),-1)),Int(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,Negate(C2))),Simp(Plus(Times(C2,a,Plus(n,Negate(C2))),Times(b,Plus(Times(C2,n),Negate(C3)),Csc(Plus(e,Times(f,x)))),Times(a,Sqr(Csc(Plus(e,Times(f,x)))))),x),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x),x)),And(FreeQ(List(a,b,d,e,f),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),GtQ(n,C1),IntegerQ(Times(C2,n)))));
IIntegrate(3856,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),CN1D2),Sqrt(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_))),x_Symbol),
    Condition(Dist(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Times(Sqrt(Times(d,Csc(Plus(e,Times(f,x))))),Sqrt(Plus(b,Times(a,Sin(Plus(e,Times(f,x))))))),-1)),Int(Sqrt(Plus(b,Times(a,Sin(Plus(e,Times(f,x)))))),x),x),And(FreeQ(List(a,b,d,e,f),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0))));
IIntegrate(3857,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_),Sqrt(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_))),x_Symbol),
    Condition(Plus(Simp(Times(Cot(Plus(e,Times(f,x))),Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Times(d,Csc(Plus(e,Times(f,x)))),n),Power(Times(f,n),-1)),x),Negate(Dist(Power(Times(C2,d,n),-1),Int(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,C1)),Simp(Plus(b,Times(CN1,C2,a,Plus(n,C1),Csc(Plus(e,Times(f,x)))),Times(CN1,b,Plus(Times(C2,n),C3),Sqr(Csc(Plus(e,Times(f,x)))))),x),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x),x))),And(FreeQ(List(a,b,d,e,f),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),LeQ(n,CN1),IntegerQ(Times(C2,n)))));
IIntegrate(3858,Int(Times(Sqrt(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT)),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1D2)),x_Symbol),
    Condition(Dist(Times(Sqrt(Times(d,Csc(Plus(e,Times(f,x))))),Sqrt(Plus(b,Times(a,Sin(Plus(e,Times(f,x)))))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),Int(Power(Plus(b,Times(a,Sin(Plus(e,Times(f,x))))),CN1D2),x),x),And(FreeQ(List(a,b,d,e,f),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0))));
IIntegrate(3859,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),QQ(3L,2L)),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1D2)),x_Symbol),
    Condition(Dist(Times(d,Sqrt(Times(d,Csc(Plus(e,Times(f,x))))),Sqrt(Plus(b,Times(a,Sin(Plus(e,Times(f,x)))))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),Int(Power(Times(Sin(Plus(e,Times(f,x))),Sqrt(Plus(b,Times(a,Sin(Plus(e,Times(f,x))))))),-1),x),x),And(FreeQ(List(a,b,d,e,f),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0))));
IIntegrate(3860,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(CN2,Sqr(d),Cos(Plus(e,Times(f,x))),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,Negate(C2))),Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Times(b,f,Plus(Times(C2,n),Negate(C3))),-1)),x),Dist(Times(Power(d,3),Power(Times(b,Plus(Times(C2,n),Negate(C3))),-1)),Int(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,Negate(C3))),Simp(Plus(Times(C2,a,Plus(n,Negate(C3))),Times(b,Plus(Times(C2,n),Negate(C5)),Csc(Plus(e,Times(f,x)))),Times(CN1,C2,a,Plus(n,Negate(C2)),Sqr(Csc(Plus(e,Times(f,x)))))),x),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x),x)),And(FreeQ(List(a,b,d,e,f),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),GtQ(n,C2),IntegerQ(Times(C2,n)))));
IIntegrate(3861,Int(Times(Power($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),-1),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1D2)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Cos(Plus(e,Times(f,x))),Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Times(a,f),-1)),x)),Negate(Dist(Times(b,Power(Times(C2,a),-1)),Int(Times(Plus(C1,Sqr(Csc(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x),x))),And(FreeQ(List(a,b,e,f),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0))));
IIntegrate(3862,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),CN1D2),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1D2)),x_Symbol),
    Condition(Plus(Dist(Power(a,-1),Int(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Times(d,Csc(Plus(e,Times(f,x)))),CN1D2)),x),x),Negate(Dist(Times(b,Power(Times(a,d),-1)),Int(Times(Sqrt(Times(d,Csc(Plus(e,Times(f,x))))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x),x))),And(FreeQ(List(a,b,d,e,f),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0))));
IIntegrate(3863,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),CN1D2)),x_Symbol),
    Condition(Plus(Simp(Times(Cos(Plus(e,Times(f,x))),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,C1)),Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Times(a,d,f,n),-1)),x),Dist(Power(Times(C2,a,d,n),-1),Int(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,C1)),Simp(Plus(Times(CN1,b,Plus(Times(C2,n),C1)),Times(C2,a,Plus(n,C1),Csc(Plus(e,Times(f,x)))),Times(b,Plus(Times(C2,n),C3),Sqr(Csc(Plus(e,Times(f,x)))))),x),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x),x)),And(FreeQ(List(a,b,d,e,f),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),LtQ(n,CN1),IntegerQ(Times(C2,n)))));
IIntegrate(3864,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),QQ(3L,2L))),x_Symbol),
    Condition(Plus(Simp(Times(a,Cot(Plus(e,Times(f,x))),Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Times(d,Csc(Plus(e,Times(f,x)))),n),Power(Times(f,n),-1)),x),Dist(Power(Times(C2,d,n),-1),Int(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,C1)),Simp(Plus(Times(a,b,Plus(Times(C2,n),Negate(C1))),Times(C2,Plus(Times(Sqr(b),n),Times(Sqr(a),Plus(n,C1))),Csc(Plus(e,Times(f,x)))),Times(a,b,Plus(Times(C2,n),C3),Sqr(Csc(Plus(e,Times(f,x)))))),x),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),CN1D2)),x),x)),And(FreeQ(List(a,b,d,e,f),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),LeQ(n,CN1),IntegersQ(Times(C2,n)))));
IIntegrate(3865,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(d,3),Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,C1)),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,Negate(C3))),Power(Times(b,f,Plus(m,n,Negate(C1))),-1)),x)),Dist(Times(Power(d,3),Power(Times(b,Plus(m,n,Negate(C1))),-1)),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,Negate(C3))),Simp(Plus(Times(a,Plus(n,Negate(C3))),Times(b,Plus(m,n,Negate(C2)),Csc(Plus(e,Times(f,x)))),Times(CN1,a,Plus(n,Negate(C2)),Sqr(Csc(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,d,e,f,m),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),GtQ(n,C3),Or(IntegerQ(n),IntegersQ(Times(C2,m),Times(C2,n))),Not(IGtQ(m,C2)))));
IIntegrate(3866,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(b,d,Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,Negate(C1))),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Power(Times(f,Plus(m,n,Negate(C1))),-1)),x)),Dist(Times(d,Power(Plus(m,n,Negate(C1)),-1)),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,Negate(C2))),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,Negate(C1))),Simp(Plus(Times(a,b,Plus(n,Negate(C1))),Times(Plus(Times(Sqr(b),Plus(m,n,Negate(C2))),Times(Sqr(a),Plus(m,n,Negate(C1)))),Csc(Plus(e,Times(f,x)))),Times(a,b,Plus(Times(C2,m),n,Negate(C2)),Sqr(Csc(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,d,e,f),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),LtQ(C0,m,C2),LtQ(C0,n,C3),NeQ(Plus(m,n,Negate(C1)),C0),Or(IntegerQ(m),IntegersQ(Times(C2,m),Times(C2,n))))));
IIntegrate(3867,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Sqr(d),Cot(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,Negate(C2))),Power(Times(f,Plus(m,n,Negate(C1))),-1)),x)),Dist(Times(Sqr(d),Power(Times(b,Plus(m,n,Negate(C1))),-1)),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,Negate(C1))),Power(Times(d,Csc(Plus(e,Times(f,x)))),Plus(n,Negate(C2))),Simp(Plus(Times(a,b,Plus(n,Negate(C2))),Times(Sqr(b),Plus(m,n,Negate(C2)),Csc(Plus(e,Times(f,x)))),Times(a,b,m,Sqr(Csc(Plus(e,Times(f,x)))))),x)),x),x)),And(FreeQ(List(a,b,d,e,f),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),LtQ(CN1,m,C2),LtQ(C1,n,C3),NeQ(Plus(m,n,Negate(C1)),C0),Or(IntegerQ(n),IntegersQ(Times(C2,m),Times(C2,n))))));
IIntegrate(3868,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),CN1D2),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),QQ(3L,2L))),x_Symbol),
    Condition(Plus(Dist(a,Int(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Power(Times(d,Csc(Plus(e,Times(f,x)))),CN1D2)),x),x),Dist(Times(b,Power(d,-1)),Int(Times(Sqrt(Plus(a,Times(b,Csc(Plus(e,Times(f,x)))))),Sqrt(Times(d,Csc(Plus(e,Times(f,x)))))),x),x)),And(FreeQ(List(a,b,d,e,f),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0))));
IIntegrate(3869,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_DEFAULT),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Sin(Plus(e,Times(f,x))),n),Power(Times(d,Csc(Plus(e,Times(f,x)))),n)),Int(Times(Power(Plus(b,Times(a,Sin(Plus(e,Times(f,x))))),m),Power(Power(Sin(Plus(e,Times(f,x))),Plus(m,n)),-1)),x),x),And(FreeQ(List(a,b,d,e,f,n),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IntegerQ(m))));
IIntegrate(3870,Int(Times(Power(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),n_DEFAULT),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Times(d,Csc(Plus(e,Times(f,x)))),n),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m)),x),FreeQ(List(a,b,d,e,f,m,n),x)));
IIntegrate(3871,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),d_DEFAULT),m_),Power(Plus(a_DEFAULT,Times(b_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Times(d,Cos(Plus(e,Times(f,x)))),FracPart(m)),Power(Times(Sec(Plus(e,Times(f,x))),Power(d,-1)),FracPart(m))),Int(Times(Power(Plus(a,Times(b,Sec(Plus(e,Times(f,x))))),p),Power(Power(Times(Sec(Plus(e,Times(f,x))),Power(d,-1)),m),-1)),x),x),And(FreeQ(List(a,b,d,e,f,m,p),x),Not(IntegerQ(m)),Not(IntegerQ(p)))));
IIntegrate(3872,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),p_DEFAULT),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),p),Power(Plus(b,Times(a,Sin(Plus(e,Times(f,x))))),m),Power(Power(Sin(Plus(e,Times(f,x))),m),-1)),x),And(FreeQ(List(a,b,e,f,g,p),x),IntegerQ(m))));
IIntegrate(3873,Int(Times(Power($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),p_DEFAULT),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Negate(Dist(Power(Times(f,Power(b,Plus(p,Negate(C1)))),-1),Subst(Int(Times(Power(Plus(Negate(a),Times(b,x)),Times(C1D2,Plus(p,Negate(C1)))),Power(Plus(a,Times(b,x)),Plus(m,Times(C1D2,Plus(p,Negate(C1))))),Power(Power(x,Plus(p,C1)),-1)),x),x,Csc(Plus(e,Times(f,x)))),x)),And(FreeQ(List(a,b,e,f,m),x),IntegerQ(Times(C1D2,Plus(p,Negate(C1)))),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0))));
IIntegrate(3874,Int(Times(Power($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),p_DEFAULT),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Negate(Dist(Power(f,-1),Subst(Int(Times(Power(Plus(CN1,x),Times(C1D2,Plus(p,Negate(C1)))),Power(Plus(C1,x),Times(C1D2,Plus(p,Negate(C1)))),Power(Plus(a,Times(b,x)),m),Power(Power(x,Plus(p,C1)),-1)),x),x,Csc(Plus(e,Times(f,x)))),x)),And(FreeQ(List(a,b,e,f,m),x),IntegerQ(Times(C1D2,Plus(p,Negate(C1)))),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0))));
IIntegrate(3875,Int(Times(Power($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),-2),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Plus(Simp(Times(Tan(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(f,-1)),x),Dist(Times(b,m),Int(Times(Csc(Plus(e,Times(f,x))),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),Plus(m,Negate(C1)))),x),x)),FreeQ(List(a,b,e,f,m),x)));
IIntegrate(3876,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),p_DEFAULT),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_)),x_Symbol),
    Condition(Dist(Times(Power(Sin(Plus(e,Times(f,x))),FracPart(m)),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),FracPart(m)),Power(Power(Plus(b,Times(a,Sin(Plus(e,Times(f,x))))),FracPart(m)),-1)),Int(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),p),Power(Plus(b,Times(a,Sin(Plus(e,Times(f,x))))),m),Power(Power(Sin(Plus(e,Times(f,x))),m),-1)),x),x),And(FreeQ(List(a,b,e,f,g,m,p),x),Or(EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IntegersQ(Times(C2,m),p)))));
IIntegrate(3877,Int(Times(Power(Times($($s("§cos"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),g_DEFAULT),p_DEFAULT),Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Times(g,Cos(Plus(e,Times(f,x)))),p),Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m)),x),FreeQ(List(a,b,e,f,g,m,p),x)));
IIntegrate(3878,Int(Times(Power(Plus(Times($($s("§csc"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),b_DEFAULT),a_),m_DEFAULT),Power(Times(g_DEFAULT,$($s("§sec"),Plus(e_DEFAULT,Times(f_DEFAULT,x_)))),p_)),x_Symbol),
    Condition(Dist(Times(Power(g,IntPart(p)),Power(Times(g,Sec(Plus(e,Times(f,x)))),FracPart(p)),Power(Cos(Plus(e,Times(f,x))),FracPart(p))),Int(Times(Power(Plus(a,Times(b,Csc(Plus(e,Times(f,x))))),m),Power(Power(Cos(Plus(e,Times(f,x))),p),-1)),x),x),And(FreeQ(List(a,b,e,f,g,m,p),x),Not(IntegerQ(p)))));
IIntegrate(3879,Int(Times(Power($($s("§cot"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),m_DEFAULT),Power(Plus(Times($($s("§csc"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),n_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Times(Power(a,Plus(m,Negate(n),Negate(C1))),Power(b,n),d),-1),Subst(Int(Times(Power(Plus(a,Times(CN1,b,x)),Times(C1D2,Plus(m,Negate(C1)))),Power(Plus(a,Times(b,x)),Plus(Times(C1D2,Plus(m,Negate(C1))),n)),Power(Power(x,Plus(m,n)),-1)),x),x,Sin(Plus(c,Times(d,x)))),x),And(FreeQ(List(a,b,c,d),x),IntegerQ(Times(C1D2,Plus(m,Negate(C1)))),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IntegerQ(n))));
IIntegrate(3880,Int(Times(Power($($s("§cot"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),m_DEFAULT),Power(Plus(Times($($s("§csc"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),n_)),x_Symbol),
    Condition(Negate(Dist(Power(Times(d,Power(b,Plus(m,Negate(C1)))),-1),Subst(Int(Times(Power(Plus(Negate(a),Times(b,x)),Times(C1D2,Plus(m,Negate(C1)))),Power(Plus(a,Times(b,x)),Plus(Times(C1D2,Plus(m,Negate(C1))),n)),Power(x,-1)),x),x,Csc(Plus(c,Times(d,x)))),x)),And(FreeQ(List(a,b,c,d,n),x),IntegerQ(Times(C1D2,Plus(m,Negate(C1)))),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),Not(IntegerQ(n)))));
IIntegrate(3881,Int(Times(Power(Times($($s("§cot"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),e_DEFAULT),m_),Plus(Times($($s("§csc"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(e,Power(Times(e,Cot(Plus(c,Times(d,x)))),Plus(m,Negate(C1))),Plus(Times(a,m),Times(b,Plus(m,Negate(C1)),Csc(Plus(c,Times(d,x))))),Power(Times(d,m,Plus(m,Negate(C1))),-1)),x)),Negate(Dist(Times(Sqr(e),Power(m,-1)),Int(Times(Power(Times(e,Cot(Plus(c,Times(d,x)))),Plus(m,Negate(C2))),Plus(Times(a,m),Times(b,Plus(m,Negate(C1)),Csc(Plus(c,Times(d,x)))))),x),x))),And(FreeQ(List(a,b,c,d,e),x),GtQ(m,C1))));
IIntegrate(3882,Int(Times(Power(Times($($s("§cot"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),e_DEFAULT),m_),Plus(Times($($s("§csc"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(Times(e,Cot(Plus(c,Times(d,x)))),Plus(m,C1)),Plus(a,Times(b,Csc(Plus(c,Times(d,x))))),Power(Times(d,e,Plus(m,C1)),-1)),x)),Negate(Dist(Power(Times(Sqr(e),Plus(m,C1)),-1),Int(Times(Power(Times(e,Cot(Plus(c,Times(d,x)))),Plus(m,C2)),Plus(Times(a,Plus(m,C1)),Times(b,Plus(m,C2),Csc(Plus(c,Times(d,x)))))),x),x))),And(FreeQ(List(a,b,c,d,e),x),LtQ(m,CN1))));
IIntegrate(3883,Int(Times(Power($($s("§cot"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),-1),Plus(Times($($s("§csc"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_)),x_Symbol),
    Condition(Int(Times(Plus(b,Times(a,Sin(Plus(c,Times(d,x))))),Power(Cos(Plus(c,Times(d,x))),-1)),x),FreeQ(List(a,b,c,d),x)));
IIntegrate(3884,Int(Times(Power(Times($($s("§cot"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),e_DEFAULT),m_DEFAULT),Plus(Times($($s("§csc"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_)),x_Symbol),
    Condition(Plus(Dist(a,Int(Power(Times(e,Cot(Plus(c,Times(d,x)))),m),x),x),Dist(b,Int(Times(Power(Times(e,Cot(Plus(c,Times(d,x)))),m),Csc(Plus(c,Times(d,x)))),x),x)),FreeQ(List(a,b,c,d,e,m),x)));
IIntegrate(3885,Int(Times(Power($($s("§cot"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),m_DEFAULT),Power(Plus(Times($($s("§csc"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),n_)),x_Symbol),
    Condition(Negate(Dist(Times(Power(CN1,Times(C1D2,Plus(m,Negate(C1)))),Power(Times(d,Power(b,Plus(m,Negate(C1)))),-1)),Subst(Int(Times(Power(Plus(Sqr(b),Negate(Sqr(x))),Times(C1D2,Plus(m,Negate(C1)))),Power(Plus(a,x),n),Power(x,-1)),x),x,Times(b,Csc(Plus(c,Times(d,x))))),x)),And(FreeQ(List(a,b,c,d,n),x),IntegerQ(Times(C1D2,Plus(m,Negate(C1)))),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0))));
IIntegrate(3886,Int(Times(Power(Times($($s("§cot"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),e_DEFAULT),m_),Power(Plus(Times($($s("§csc"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),n_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Times(e,Cot(Plus(c,Times(d,x)))),m),Power(Plus(a,Times(b,Csc(Plus(c,Times(d,x))))),n),x),x),And(FreeQ(List(a,b,c,d,e,m),x),IGtQ(n,C0))));
IIntegrate(3887,Int(Times(Power($($s("§cot"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),m_DEFAULT),Power(Plus(Times($($s("§csc"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),n_DEFAULT)),x_Symbol),
    Condition(Dist(Times(CN2,Power(a,Plus(Times(C1D2,m),n,C1D2)),Power(d,-1)),Subst(Int(Times(Power(x,m),Power(Plus(C2,Times(a,Sqr(x))),Plus(Times(C1D2,m),n,Negate(C1D2))),Power(Plus(C1,Times(a,Sqr(x))),-1)),x),x,Times(Cot(Plus(c,Times(d,x))),Power(Plus(a,Times(b,Csc(Plus(c,Times(d,x))))),CN1D2))),x),And(FreeQ(List(a,b,c,d),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IntegerQ(Times(C1D2,m)),IntegerQ(Plus(n,Negate(C1D2))))));
IIntegrate(3888,Int(Times(Power(Times($($s("§cot"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),e_DEFAULT),m_),Power(Plus(Times($($s("§csc"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),n_)),x_Symbol),
    Condition(Dist(Times(Power(a,Times(C2,n)),Power(Power(e,Times(C2,n)),-1)),Int(Times(Power(Times(e,Cot(Plus(c,Times(d,x)))),Plus(m,Times(C2,n))),Power(Power(Plus(Negate(a),Times(b,Csc(Plus(c,Times(d,x))))),n),-1)),x),x),And(FreeQ(List(a,b,c,d,e,m),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),ILtQ(n,C0))));
IIntegrate(3889,Int(Times(Power(Times($($s("§cot"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),e_DEFAULT),m_),Power(Plus(Times($($s("§csc"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),n_)),x_Symbol),
    Condition(Negate(Simp(Times(Power(C2,Plus(m,n,C1)),Power(Times(e,Cot(Plus(c,Times(d,x)))),Plus(m,C1)),Power(Plus(a,Times(b,Csc(Plus(c,Times(d,x))))),n),Power(Times(a,Power(Plus(a,Times(b,Csc(Plus(c,Times(d,x))))),-1)),Plus(m,n,C1)),AppellF1(Times(C1D2,Plus(m,C1)),Plus(m,n),C1,Times(C1D2,Plus(m,C3)),Times(CN1,Plus(a,Times(CN1,b,Csc(Plus(c,Times(d,x))))),Power(Plus(a,Times(b,Csc(Plus(c,Times(d,x))))),-1)),Times(Plus(a,Times(CN1,b,Csc(Plus(c,Times(d,x))))),Power(Plus(a,Times(b,Csc(Plus(c,Times(d,x))))),-1))),Power(Times(d,e,Plus(m,C1)),-1)),x)),And(FreeQ(List(a,b,c,d,e,m,n),x),EqQ(Plus(Sqr(a),Negate(Sqr(b))),C0),Not(IntegerQ(n)))));
IIntegrate(3890,Int(Times(Sqrt(Times($($s("§cot"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),e_DEFAULT)),Power(Plus(Times($($s("§csc"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),-1)),x_Symbol),
    Condition(Plus(Dist(Power(a,-1),Int(Sqrt(Times(e,Cot(Plus(c,Times(d,x))))),x),x),Negate(Dist(Times(b,Power(a,-1)),Int(Times(Sqrt(Times(e,Cot(Plus(c,Times(d,x))))),Power(Plus(b,Times(a,Sin(Plus(c,Times(d,x))))),-1)),x),x))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0))));
IIntegrate(3891,Int(Times(Power(Times($($s("§cot"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),e_DEFAULT),m_),Power(Plus(Times($($s("§csc"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),-1)),x_Symbol),
    Condition(Plus(Negate(Dist(Times(Sqr(e),Power(b,-2)),Int(Times(Power(Times(e,Cot(Plus(c,Times(d,x)))),Plus(m,Negate(C2))),Plus(a,Times(CN1,b,Csc(Plus(c,Times(d,x)))))),x),x)),Dist(Times(Sqr(e),Plus(Sqr(a),Negate(Sqr(b))),Power(b,-2)),Int(Times(Power(Times(e,Cot(Plus(c,Times(d,x)))),Plus(m,Negate(C2))),Power(Plus(a,Times(b,Csc(Plus(c,Times(d,x))))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IGtQ(Plus(m,Negate(C1D2)),C0))));
IIntegrate(3892,Int(Times(Power(Times($($s("§cot"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),e_DEFAULT),CN1D2),Power(Plus(Times($($s("§csc"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),-1)),x_Symbol),
    Condition(Plus(Dist(Power(a,-1),Int(Power(Times(e,Cot(Plus(c,Times(d,x)))),CN1D2),x),x),Negate(Dist(Times(b,Power(a,-1)),Int(Power(Times(Sqrt(Times(e,Cot(Plus(c,Times(d,x))))),Plus(b,Times(a,Sin(Plus(c,Times(d,x)))))),-1),x),x))),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0))));
IIntegrate(3893,Int(Times(Power(Times($($s("§cot"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),e_DEFAULT),m_),Power(Plus(Times($($s("§csc"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),-1)),x_Symbol),
    Condition(Plus(Dist(Power(Plus(Sqr(a),Negate(Sqr(b))),-1),Int(Times(Power(Times(e,Cot(Plus(c,Times(d,x)))),m),Plus(a,Times(CN1,b,Csc(Plus(c,Times(d,x)))))),x),x),Dist(Times(Sqr(b),Power(Times(Sqr(e),Plus(Sqr(a),Negate(Sqr(b)))),-1)),Int(Times(Power(Times(e,Cot(Plus(c,Times(d,x)))),Plus(m,C2)),Power(Plus(a,Times(b,Csc(Plus(c,Times(d,x))))),-1)),x),x)),And(FreeQ(List(a,b,c,d,e),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),ILtQ(Plus(m,C1D2),C0))));
IIntegrate(3894,Int(Times(Sqr($($s("§cot"),Plus(c_DEFAULT,Times(d_DEFAULT,x_)))),Power(Plus(Times($($s("§csc"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),n_)),x_Symbol),
    Condition(Int(Times(Plus(CN1,Sqr(Csc(Plus(c,Times(d,x))))),Power(Plus(a,Times(b,Csc(Plus(c,Times(d,x))))),n)),x),And(FreeQ(List(a,b,c,d,n),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0))));
IIntegrate(3895,Int(Times(Power($($s("§cot"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),m_),Power(Plus(Times($($s("§csc"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),n_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(a,Times(b,Csc(Plus(c,Times(d,x))))),n),Power(Plus(CN1,Sqr(Csc(Plus(c,Times(d,x))))),Times(C1D2,m)),x),x),And(FreeQ(List(a,b,c,d,n),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IGtQ(Times(C1D2,m),C0),IntegerQ(Plus(n,Negate(C1D2))))));
IIntegrate(3896,Int(Times(Power($($s("§cot"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),m_),Power(Plus(Times($($s("§csc"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),n_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(a,Times(b,Csc(Plus(c,Times(d,x))))),n),Power(Plus(CN1,Sqr(Sec(Plus(c,Times(d,x))))),Times(CN1,C1D2,m)),x),x),And(FreeQ(List(a,b,c,d,n),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),ILtQ(Times(C1D2,m),C0),IntegerQ(Plus(n,Negate(C1D2))),EqQ(m,CN2))));
IIntegrate(3897,Int(Times(Power(Times($($s("§cot"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),e_DEFAULT),m_),Power(Plus(Times($($s("§csc"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),n_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Times(e,Cot(Plus(c,Times(d,x)))),m),Power(Plus(a,Times(b,Csc(Plus(c,Times(d,x))))),n),x),x),And(FreeQ(List(a,b,c,d,e,m),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IGtQ(n,C0))));
IIntegrate(3898,Int(Times(Power($($s("§cot"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),m_DEFAULT),Power(Plus(Times($($s("§csc"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT),a_),n_)),x_Symbol),
    Condition(Int(Times(Power(Cos(Plus(c,Times(d,x))),m),Power(Plus(b,Times(a,Sin(Plus(c,Times(d,x))))),n),Power(Power(Sin(Plus(c,Times(d,x))),Plus(m,n)),-1)),x),And(FreeQ(List(a,b,c,d),x),NeQ(Plus(Sqr(a),Negate(Sqr(b))),C0),IntegerQ(n),IntegerQ(m),Or(IntegerQ(Times(C1D2,m)),LeQ(m,C1)))));
IIntegrate(3899,Int(Times(Power(Plus(a_DEFAULT,Times($($s("§csc"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),b_DEFAULT)),n_DEFAULT),Power(Times($($s("§cot"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),e_DEFAULT),m_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(Times(e,Cot(Plus(c,Times(d,x)))),m),Power(Plus(a,Times(b,Csc(Plus(c,Times(d,x))))),n)),x),FreeQ(List(a,b,c,d,e,m,n),x)));
IIntegrate(3900,Int(Times(Power(Times($($s("§cot"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))),e_DEFAULT),m_),Power(Plus(a_,Times(b_DEFAULT,$($s("§sec"),Plus(c_DEFAULT,Times(d_DEFAULT,x_))))),n_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(Times(e,Cot(Plus(c,Times(d,x)))),m),Power(Tan(Plus(c,Times(d,x))),m)),Int(Times(Power(Plus(a,Times(b,Sec(Plus(c,Times(d,x))))),n),Power(Power(Tan(Plus(c,Times(d,x))),m),-1)),x),x),And(FreeQ(List(a,b,c,d,e,m,n),x),Not(IntegerQ(m)))));
  }
}
}
