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
public class IntRules234 { 

	public static void initialize() {
		Initializer.init();
	}

	private static class Initializer  {

		private static void init() {
IIntegrate(5851,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),$p("§px",true),Power(Plus(f_,Times(g_DEFAULT,Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_))),m_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Times($s("§px"),Power(Plus(f,Times(g,Power(Plus(d,Times(e,Sqr(x))),p))),m),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n)),x))),Condition(Int(u,x),SumQ(u))),And(FreeQ(List(a,b,c,d,e,f,g),x),PolynomialQ($s("§px"),x),EqQ(e,Times(Sqr(c),d)),IGtQ(Plus(p,C1D2),C0),IntegersQ(m,n))));
IIntegrate(5852,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),$p("§px",true),Power(Plus(f_,Times(g_DEFAULT,Power(Plus($p("d1"),Times($p("e1",true),x_)),p_),Power(Plus($p("d2"),Times($p("e2",true),x_)),p_))),m_DEFAULT)),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Times($s("§px"),Power(Plus(f,Times(g,Power(Plus($s("d1"),Times($s("e1"),x)),p),Power(Plus($s("d2"),Times($s("e2"),x)),p))),m),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x))),Condition(Int(u,x),SumQ(u))),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2"),f,g),x),PolynomialQ($s("§px"),x),EqQ(Subtract($s("e1"),Times(c,$s("d1"))),C0),EqQ(Plus($s("e2"),Times(c,$s("d2"))),C0),IGtQ(Plus(p,C1D2),C0),IntegersQ(m,n))));
IIntegrate(5853,Int(Times(Power(ArcSinh(Times(c_DEFAULT,x_)),n_DEFAULT),$p("§rfx")),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Power(ArcSinh(Times(c,x)),n),$s("§rfx"),x))),Condition(Int(u,x),SumQ(u))),And(FreeQ(c,x),RationalFunctionQ($s("§rfx"),x),IGtQ(n,C0))));
IIntegrate(5854,Int(Times(Power(ArcCosh(Times(c_DEFAULT,x_)),n_DEFAULT),$p("§rfx")),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Power(ArcCosh(Times(c,x)),n),$s("§rfx"),x))),Condition(Int(u,x),SumQ(u))),And(FreeQ(c,x),RationalFunctionQ($s("§rfx"),x),IGtQ(n,C0))));
IIntegrate(5855,Int(Times(Power(Plus(Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT),a_),n_DEFAULT),$p("§rfx")),x_Symbol),
    Condition(Int(ExpandIntegrand(Times($s("§rfx"),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c),x),RationalFunctionQ($s("§rfx"),x),IGtQ(n,C0))));
IIntegrate(5856,Int(Times(Power(Plus(Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT),a_),n_DEFAULT),$p("§rfx")),x_Symbol),
    Condition(Int(ExpandIntegrand(Times($s("§rfx"),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c),x),RationalFunctionQ($s("§rfx"),x),IGtQ(n,C0))));
IIntegrate(5857,Int(Times(Power(ArcSinh(Times(c_DEFAULT,x_)),n_DEFAULT),$p("§rfx"),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Times(Power(Plus(d,Times(e,Sqr(x))),p),Power(ArcSinh(Times(c,x)),n)),$s("§rfx"),x))),Condition(Int(u,x),SumQ(u))),And(FreeQ(List(c,d,e),x),RationalFunctionQ($s("§rfx"),x),IGtQ(n,C0),EqQ(e,Times(Sqr(c),d)),IntegerQ(Subtract(p,C1D2)))));
IIntegrate(5858,Int(Times(Power(ArcCosh(Times(c_DEFAULT,x_)),n_DEFAULT),$p("§rfx"),Power(Plus($p("d1"),Times($p("e1",true),x_)),p_),Power(Plus($p("d2"),Times($p("e2",true),x_)),p_)),x_Symbol),
    Condition(With(List(Set(u,ExpandIntegrand(Times(Power(Plus($s("d1"),Times($s("e1"),x)),p),Power(Plus($s("d2"),Times($s("e2"),x)),p),Power(ArcCosh(Times(c,x)),n)),$s("§rfx"),x))),Condition(Int(u,x),SumQ(u))),And(FreeQ(List(c,$s("d1"),$s("e1"),$s("d2"),$s("e2")),x),RationalFunctionQ($s("§rfx"),x),IGtQ(n,C0),EqQ(Subtract($s("e1"),Times(c,$s("d1"))),C0),EqQ(Plus($s("e2"),Times(c,$s("d2"))),C0),IntegerQ(Subtract(p,C1D2)))));
IIntegrate(5859,Int(Times(Power(Plus(Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT),a_),n_DEFAULT),$p("§rfx"),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_))),p_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(Plus(d,Times(e,Sqr(x))),p),Times($s("§rfx"),Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,d,e),x),RationalFunctionQ($s("§rfx"),x),IGtQ(n,C0),EqQ(e,Times(Sqr(c),d)),IntegerQ(Subtract(p,C1D2)))));
IIntegrate(5860,Int(Times(Power(Plus(Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT),a_),n_DEFAULT),$p("§rfx"),Power(Plus($p("d1"),Times($p("e1",true),x_)),p_),Power(Plus($p("d2"),Times($p("e2",true),x_)),p_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus($s("d1"),Times($s("e1"),x)),p),Power(Plus($s("d2"),Times($s("e2"),x)),p)),Times($s("§rfx"),Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),x),And(FreeQ(List(a,b,c,$s("d1"),$s("e1"),$s("d2"),$s("e2")),x),RationalFunctionQ($s("§rfx"),x),IGtQ(n,C0),EqQ(Subtract($s("e1"),Times(c,$s("d1"))),C0),EqQ(Plus($s("e2"),Times(c,$s("d2"))),C0),IntegerQ(Subtract(p,C1D2)))));
IIntegrate(5861,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),u_DEFAULT),x_Symbol),
    Condition(Unintegrable(Times(u,Power(Plus(a,Times(b,ArcSinh(Times(c,x)))),n)),x),FreeQ(List(a,b,c,n),x)));
IIntegrate(5862,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Times(c_DEFAULT,x_)),b_DEFAULT)),n_DEFAULT),u_DEFAULT),x_Symbol),
    Condition(Unintegrable(Times(u,Power(Plus(a,Times(b,ArcCosh(Times(c,x)))),n)),x),FreeQ(List(a,b,c,n),x)));
IIntegrate(5863,Int(Power(Plus(a_DEFAULT,Times(ArcSinh(Plus(c_,Times(d_DEFAULT,x_))),b_DEFAULT)),n_DEFAULT),x_Symbol),
    Condition(Dist(Power(d,CN1),Subst(Int(Power(Plus(a,Times(b,ArcSinh(x))),n),x),x,Plus(c,Times(d,x))),x),FreeQ(List(a,b,c,d,n),x)));
IIntegrate(5864,Int(Power(Plus(a_DEFAULT,Times(ArcCosh(Plus(c_,Times(d_DEFAULT,x_))),b_DEFAULT)),n_DEFAULT),x_Symbol),
    Condition(Dist(Power(d,CN1),Subst(Int(Power(Plus(a,Times(b,ArcCosh(x))),n),x),x,Plus(c,Times(d,x))),x),FreeQ(List(a,b,c,d,n),x)));
IIntegrate(5865,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Plus(c_,Times(d_DEFAULT,x_))),b_DEFAULT)),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Dist(Power(d,CN1),Subst(Int(Times(Power(Plus(Times(Subtract(Times(d,e),Times(c,f)),Power(d,CN1)),Times(f,x,Power(d,CN1))),m),Power(Plus(a,Times(b,ArcSinh(x))),n)),x),x,Plus(c,Times(d,x))),x),FreeQ(List(a,b,c,d,e,f,m,n),x)));
IIntegrate(5866,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Plus(c_,Times(d_DEFAULT,x_))),b_DEFAULT)),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Dist(Power(d,CN1),Subst(Int(Times(Power(Plus(Times(Subtract(Times(d,e),Times(c,f)),Power(d,CN1)),Times(f,x,Power(d,CN1))),m),Power(Plus(a,Times(b,ArcCosh(x))),n)),x),x,Plus(c,Times(d,x))),x),FreeQ(List(a,b,c,d,e,f,m,n),x)));
IIntegrate(5867,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Plus(c_,Times(d_DEFAULT,x_))),b_DEFAULT)),n_DEFAULT),Power(Plus(A_DEFAULT,Times(B_DEFAULT,x_),Times(C_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(d,CN1),Subst(Int(Times(Power(Plus(Times(C,Power(d,CN2)),Times(C,Sqr(x),Power(d,CN2))),p),Power(Plus(a,Times(b,ArcSinh(x))),n)),x),x,Plus(c,Times(d,x))),x),And(FreeQ(List(a,b,c,d,ASymbol,BSymbol,C,n,p),x),EqQ(Subtract(Times(BSymbol,Plus(C1,Sqr(c))),Times(C2,ASymbol,c,d)),C0),EqQ(Subtract(Times(C2,c,C),Times(BSymbol,d)),C0))));
IIntegrate(5868,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Plus(c_,Times(d_DEFAULT,x_))),b_DEFAULT)),n_DEFAULT),Power(Plus(A_DEFAULT,Times(B_DEFAULT,x_),Times(C_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(d,CN1),Subst(Int(Times(Power(Plus(Times(CN1,C,Power(d,CN2)),Times(C,Sqr(x),Power(d,CN2))),p),Power(Plus(a,Times(b,ArcCosh(x))),n)),x),x,Plus(c,Times(d,x))),x),And(FreeQ(List(a,b,c,d,ASymbol,BSymbol,C,n,p),x),EqQ(Plus(Times(BSymbol,Subtract(C1,Sqr(c))),Times(C2,ASymbol,c,d)),C0),EqQ(Subtract(Times(C2,c,C),Times(BSymbol,d)),C0))));
IIntegrate(5869,Int(Times(Power(Plus(a_DEFAULT,Times(ArcSinh(Plus(c_,Times(d_DEFAULT,x_))),b_DEFAULT)),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(A_DEFAULT,Times(B_DEFAULT,x_),Times(C_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(d,CN1),Subst(Int(Times(Power(Plus(Times(Subtract(Times(d,e),Times(c,f)),Power(d,CN1)),Times(f,x,Power(d,CN1))),m),Power(Plus(Times(C,Power(d,CN2)),Times(C,Sqr(x),Power(d,CN2))),p),Power(Plus(a,Times(b,ArcSinh(x))),n)),x),x,Plus(c,Times(d,x))),x),And(FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol,C,m,n,p),x),EqQ(Subtract(Times(BSymbol,Plus(C1,Sqr(c))),Times(C2,ASymbol,c,d)),C0),EqQ(Subtract(Times(C2,c,C),Times(BSymbol,d)),C0))));
IIntegrate(5870,Int(Times(Power(Plus(a_DEFAULT,Times(ArcCosh(Plus(c_,Times(d_DEFAULT,x_))),b_DEFAULT)),n_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(A_DEFAULT,Times(B_DEFAULT,x_),Times(C_DEFAULT,Sqr(x_))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(d,CN1),Subst(Int(Times(Power(Plus(Times(Subtract(Times(d,e),Times(c,f)),Power(d,CN1)),Times(f,x,Power(d,CN1))),m),Power(Plus(Times(CN1,C,Power(d,CN2)),Times(C,Sqr(x),Power(d,CN2))),p),Power(Plus(a,Times(b,ArcCosh(x))),n)),x),x,Plus(c,Times(d,x))),x),And(FreeQ(List(a,b,c,d,e,f,ASymbol,BSymbol,C,m,n,p),x),EqQ(Plus(Times(BSymbol,Subtract(C1,Sqr(c))),Times(C2,ASymbol,c,d)),C0),EqQ(Subtract(Times(C2,c,C),Times(BSymbol,d)),C0))));
IIntegrate(5871,Int(Sqrt(Plus(a_DEFAULT,Times(ArcSinh(Plus(c_,Times(d_DEFAULT,Sqr(x_)))),b_DEFAULT))),x_Symbol),
    Condition(Plus(Simp(Times(x,Sqrt(Plus(a,Times(b,ArcSinh(Plus(c,Times(d,Sqr(x)))))))),x),Negate(Simp(Times(Sqrt(Pi),x,Subtract(Cosh(Times(a,Power(Times(C2,b),CN1))),Times(c,Sinh(Times(a,Power(Times(C2,b),CN1))))),FresnelC(Times(Sqrt(Times(CN1,c,Power(Times(Pi,b),CN1))),Sqrt(Plus(a,Times(b,ArcSinh(Plus(c,Times(d,Sqr(x))))))))),Power(Times(Sqrt(Times(CN1,c,Power(b,CN1))),Plus(Cosh(Times(C1D2,ArcSinh(Plus(c,Times(d,Sqr(x)))))),Times(c,Sinh(Times(C1D2,ArcSinh(Plus(c,Times(d,Sqr(x))))))))),CN1)),x)),Simp(Times(Sqrt(Pi),x,Plus(Cosh(Times(a,Power(Times(C2,b),CN1))),Times(c,Sinh(Times(a,Power(Times(C2,b),CN1))))),FresnelS(Times(Sqrt(Times(CN1,c,Power(Times(Pi,b),CN1))),Sqrt(Plus(a,Times(b,ArcSinh(Plus(c,Times(d,Sqr(x))))))))),Power(Times(Sqrt(Times(CN1,c,Power(b,CN1))),Plus(Cosh(Times(C1D2,ArcSinh(Plus(c,Times(d,Sqr(x)))))),Times(c,Sinh(Times(C1D2,ArcSinh(Plus(c,Times(d,Sqr(x))))))))),CN1)),x)),And(FreeQ(List(a,b,c,d),x),EqQ(Sqr(c),CN1))));
IIntegrate(5872,Int(Power(Plus(a_DEFAULT,Times(ArcSinh(Plus(c_,Times(d_DEFAULT,Sqr(x_)))),b_DEFAULT)),n_),x_Symbol),
    Condition(Plus(Simp(Times(x,Power(Plus(a,Times(b,ArcSinh(Plus(c,Times(d,Sqr(x)))))),n)),x),Dist(Times(C4,Sqr(b),n,Subtract(n,C1)),Int(Power(Plus(a,Times(b,ArcSinh(Plus(c,Times(d,Sqr(x)))))),Subtract(n,C2)),x),x),Negate(Simp(Times(C2,b,n,Sqrt(Plus(Times(C2,c,d,Sqr(x)),Times(Sqr(d),Power(x,C4)))),Power(Plus(a,Times(b,ArcSinh(Plus(c,Times(d,Sqr(x)))))),Subtract(n,C1)),Power(Times(d,x),CN1)),x))),And(FreeQ(List(a,b,c,d),x),EqQ(Sqr(c),CN1),GtQ(n,C1))));
IIntegrate(5873,Int(Power(Plus(a_DEFAULT,Times(ArcSinh(Plus(c_,Times(d_DEFAULT,Sqr(x_)))),b_DEFAULT)),CN1),x_Symbol),
    Condition(Plus(Simp(Times(x,Subtract(Times(c,Cosh(Times(a,Power(Times(C2,b),CN1)))),Sinh(Times(a,Power(Times(C2,b),CN1)))),CoshIntegral(Times(Plus(a,Times(b,ArcSinh(Plus(c,Times(d,Sqr(x)))))),Power(Times(C2,b),CN1))),Power(Times(C2,b,Plus(Cosh(Times(C1D2,ArcSinh(Plus(c,Times(d,Sqr(x)))))),Times(c,Sinh(Times(C1D2,ArcSinh(Plus(c,Times(d,Sqr(x))))))))),CN1)),x),Simp(Times(x,Subtract(Cosh(Times(a,Power(Times(C2,b),CN1))),Times(c,Sinh(Times(a,Power(Times(C2,b),CN1))))),SinhIntegral(Times(Plus(a,Times(b,ArcSinh(Plus(c,Times(d,Sqr(x)))))),Power(Times(C2,b),CN1))),Power(Times(C2,b,Plus(Cosh(Times(C1D2,ArcSinh(Plus(c,Times(d,Sqr(x)))))),Times(c,Sinh(Times(C1D2,ArcSinh(Plus(c,Times(d,Sqr(x))))))))),CN1)),x)),And(FreeQ(List(a,b,c,d),x),EqQ(Sqr(c),CN1))));
IIntegrate(5874,Int(Power(Plus(a_DEFAULT,Times(ArcSinh(Plus(c_,Times(d_DEFAULT,Sqr(x_)))),b_DEFAULT)),CN1D2),x_Symbol),
    Condition(Plus(Simp(Times(Plus(c,C1),Sqrt(CPiHalf),x,Subtract(Cosh(Times(a,Power(Times(C2,b),CN1))),Sinh(Times(a,Power(Times(C2,b),CN1)))),Erfi(Times(Sqrt(Plus(a,Times(b,ArcSinh(Plus(c,Times(d,Sqr(x))))))),Power(Times(C2,b),CN1D2))),Power(Times(C2,Sqrt(b),Plus(Cosh(Times(C1D2,ArcSinh(Plus(c,Times(d,Sqr(x)))))),Times(c,Sinh(Times(C1D2,ArcSinh(Plus(c,Times(d,Sqr(x))))))))),CN1)),x),Simp(Times(Subtract(c,C1),Sqrt(CPiHalf),x,Plus(Cosh(Times(a,Power(Times(C2,b),CN1))),Sinh(Times(a,Power(Times(C2,b),CN1)))),Erf(Times(Sqrt(Plus(a,Times(b,ArcSinh(Plus(c,Times(d,Sqr(x))))))),Power(Times(C2,b),CN1D2))),Power(Times(C2,Sqrt(b),Plus(Cosh(Times(C1D2,ArcSinh(Plus(c,Times(d,Sqr(x)))))),Times(c,Sinh(Times(C1D2,ArcSinh(Plus(c,Times(d,Sqr(x))))))))),CN1)),x)),And(FreeQ(List(a,b,c,d),x),EqQ(Sqr(c),CN1))));
IIntegrate(5875,Int(Power(Plus(a_DEFAULT,Times(ArcSinh(Plus(c_,Times(d_DEFAULT,Sqr(x_)))),b_DEFAULT)),QQ(-3L,2L)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Sqrt(Plus(Times(C2,c,d,Sqr(x)),Times(Sqr(d),Power(x,C4)))),Power(Times(b,d,x,Sqrt(Plus(a,Times(b,ArcSinh(Plus(c,Times(d,Sqr(x)))))))),CN1)),x)),Negate(Simp(Times(Power(Times(CN1,c,Power(b,CN1)),QQ(3L,2L)),Sqrt(Pi),x,Subtract(Cosh(Times(a,Power(Times(C2,b),CN1))),Times(c,Sinh(Times(a,Power(Times(C2,b),CN1))))),FresnelC(Times(Sqrt(Times(CN1,c,Power(Times(Pi,b),CN1))),Sqrt(Plus(a,Times(b,ArcSinh(Plus(c,Times(d,Sqr(x))))))))),Power(Plus(Cosh(Times(C1D2,ArcSinh(Plus(c,Times(d,Sqr(x)))))),Times(c,Sinh(Times(C1D2,ArcSinh(Plus(c,Times(d,Sqr(x)))))))),CN1)),x)),Simp(Times(Power(Times(CN1,c,Power(b,CN1)),QQ(3L,2L)),Sqrt(Pi),x,Plus(Cosh(Times(a,Power(Times(C2,b),CN1))),Times(c,Sinh(Times(a,Power(Times(C2,b),CN1))))),FresnelS(Times(Sqrt(Times(CN1,c,Power(Times(Pi,b),CN1))),Sqrt(Plus(a,Times(b,ArcSinh(Plus(c,Times(d,Sqr(x))))))))),Power(Plus(Cosh(Times(C1D2,ArcSinh(Plus(c,Times(d,Sqr(x)))))),Times(c,Sinh(Times(C1D2,ArcSinh(Plus(c,Times(d,Sqr(x)))))))),CN1)),x)),And(FreeQ(List(a,b,c,d),x),EqQ(Sqr(c),CN1))));
  }
}
}