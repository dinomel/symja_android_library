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
public class IntRules108 { 

	public static void initialize() {
		Initializer.init();
	}

	private static class Initializer  {

		private static void init() {
IIntegrate(5401,Int(Power(Plus(a_DEFAULT,Times(Coth(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))),b_DEFAULT)),p_DEFAULT),x_Symbol),
    Condition(Dist(Power(n,-1),Subst(Int(Times(Power(x,Plus(Power(n,-1),Negate(C1))),Power(Plus(a,Times(b,Coth(Plus(c,Times(d,x))))),p)),x),x,Power(x,n)),x),And(FreeQ(List(a,b,c,d,p),x),IGtQ(Power(n,-1),C0),IntegerQ(p))));
IIntegrate(5402,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Tanh(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))))),p_DEFAULT),x_Symbol),
    Condition(Simp(Integral(Power(Plus(a,Times(b,Tanh(Plus(c,Times(d,Power(x,n)))))),p),x),x),FreeQ(List(a,b,c,d,n,p),x)));
IIntegrate(5403,Int(Power(Plus(a_DEFAULT,Times(Coth(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))),b_DEFAULT)),p_DEFAULT),x_Symbol),
    Condition(Simp(Integral(Power(Plus(a,Times(b,Coth(Plus(c,Times(d,Power(x,n)))))),p),x),x),FreeQ(List(a,b,c,d,n,p),x)));
IIntegrate(5404,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Tanh(Plus(c_DEFAULT,Times(d_DEFAULT,Power(u_,n_)))))),p_DEFAULT),x_Symbol),
    Condition(Dist(Power(Coefficient(u,x,C1),-1),Subst(Int(Power(Plus(a,Times(b,Tanh(Plus(c,Times(d,Power(x,n)))))),p),x),x,u),x),And(FreeQ(List(a,b,c,d,n,p),x),LinearQ(u,x),NeQ(u,x))));
IIntegrate(5405,Int(Power(Plus(a_DEFAULT,Times(Coth(Plus(c_DEFAULT,Times(d_DEFAULT,Power(u_,n_)))),b_DEFAULT)),p_DEFAULT),x_Symbol),
    Condition(Dist(Power(Coefficient(u,x,C1),-1),Subst(Int(Power(Plus(a,Times(b,Coth(Plus(c,Times(d,Power(x,n)))))),p),x),x,u),x),And(FreeQ(List(a,b,c,d,n,p),x),LinearQ(u,x),NeQ(u,x))));
IIntegrate(5406,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Tanh(u_))),p_DEFAULT),x_Symbol),
    Condition(Int(Power(Plus(a,Times(b,Tanh(ExpandToSum(u,x)))),p),x),And(FreeQ(List(a,b,p),x),BinomialQ(u,x),Not(BinomialMatchQ(u,x)))));
IIntegrate(5407,Int(Power(Plus(a_DEFAULT,Times(Coth(u_),b_DEFAULT)),p_DEFAULT),x_Symbol),
    Condition(Int(Power(Plus(a,Times(b,Coth(ExpandToSum(u,x)))),p),x),And(FreeQ(List(a,b,p),x),BinomialQ(u,x),Not(BinomialMatchQ(u,x)))));
IIntegrate(5408,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Tanh(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(n,-1),Subst(Int(Times(Power(x,Plus(Simplify(Times(Plus(m,C1),Power(n,-1))),Negate(C1))),Power(Plus(a,Times(b,Tanh(Plus(c,Times(d,x))))),p)),x),x,Power(x,n)),x),And(FreeQ(List(a,b,c,d,m,n,p),x),IGtQ(Simplify(Times(Plus(m,C1),Power(n,-1))),C0),IntegerQ(p))));
IIntegrate(5409,Int(Times(Power(Plus(a_DEFAULT,Times(Coth(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))),b_DEFAULT)),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Dist(Power(n,-1),Subst(Int(Times(Power(x,Plus(Simplify(Times(Plus(m,C1),Power(n,-1))),Negate(C1))),Power(Plus(a,Times(b,Coth(Plus(c,Times(d,x))))),p)),x),x,Power(x,n)),x),And(FreeQ(List(a,b,c,d,m,n,p),x),IGtQ(Simplify(Times(Plus(m,C1),Power(n,-1))),C0),IntegerQ(p))));
IIntegrate(5410,Int(Times(Power(x_,m_DEFAULT),Sqr(Tanh(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(x,Plus(m,Negate(n),C1)),Tanh(Plus(c,Times(d,Power(x,n)))),Power(Times(d,n),-1)),x)),Dist(Times(Plus(m,Negate(n),C1),Power(Times(d,n),-1)),Int(Times(Power(x,Plus(m,Negate(n))),Tanh(Plus(c,Times(d,Power(x,n))))),x),x),Int(Power(x,m),x)),FreeQ(List(c,d,m,n),x)));
IIntegrate(5411,Int(Times(Sqr(Coth(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_))))),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(x,Plus(m,Negate(n),C1)),Coth(Plus(c,Times(d,Power(x,n)))),Power(Times(d,n),-1)),x)),Dist(Times(Plus(m,Negate(n),C1),Power(Times(d,n),-1)),Int(Times(Power(x,Plus(m,Negate(n))),Coth(Plus(c,Times(d,Power(x,n))))),x),x),Int(Power(x,m),x)),FreeQ(List(c,d,m,n),x)));
IIntegrate(5412,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Tanh(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))))),p_DEFAULT)),x_Symbol),
    Condition(Simp(Integral(Times(Power(x,m),Power(Plus(a,Times(b,Tanh(Plus(c,Times(d,Power(x,n)))))),p)),x),x),FreeQ(List(a,b,c,d,m,n,p),x)));
IIntegrate(5413,Int(Times(Power(Plus(a_DEFAULT,Times(Coth(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))),b_DEFAULT)),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Simp(Integral(Times(Power(x,m),Power(Plus(a,Times(b,Coth(Plus(c,Times(d,Power(x,n)))))),p)),x),x),FreeQ(List(a,b,c,d,m,n,p),x)));
IIntegrate(5414,Int(Times(Power(Times(e_,x_),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Tanh(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(e,IntPart(m)),Power(Times(e,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),Power(Plus(a,Times(b,Tanh(Plus(c,Times(d,Power(x,n)))))),p)),x),x),FreeQ(List(a,b,c,d,e,m,n,p),x)));
IIntegrate(5415,Int(Times(Power(Plus(a_DEFAULT,Times(Coth(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))),b_DEFAULT)),p_DEFAULT),Power(Times(e_,x_),m_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(e,IntPart(m)),Power(Times(e,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),Power(Plus(a,Times(b,Coth(Plus(c,Times(d,Power(x,n)))))),p)),x),x),FreeQ(List(a,b,c,d,e,m,n,p),x)));
IIntegrate(5416,Int(Times(Power(Times(e_,x_),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Tanh(u_))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Times(e,x),m),Power(Plus(a,Times(b,Tanh(ExpandToSum(u,x)))),p)),x),And(FreeQ(List(a,b,e,m,p),x),BinomialQ(u,x),Not(BinomialMatchQ(u,x)))));
IIntegrate(5417,Int(Times(Power(Plus(a_DEFAULT,Times(Coth(u_),b_DEFAULT)),p_DEFAULT),Power(Times(e_,x_),m_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Times(e,x),m),Power(Plus(a,Times(b,Coth(ExpandToSum(u,x)))),p)),x),And(FreeQ(List(a,b,e,m,p),x),BinomialQ(u,x),Not(BinomialMatchQ(u,x)))));
IIntegrate(5418,Int(Times(Power(x_,m_DEFAULT),Power(Sech(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT)))),p_DEFAULT),Power(Tanh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT)))),q_DEFAULT)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(x,Plus(m,Negate(n),C1)),Power(Sech(Plus(a,Times(b,Power(x,n)))),p),Power(Times(b,n,p),-1)),x)),Dist(Times(Plus(m,Negate(n),C1),Power(Times(b,n,p),-1)),Int(Times(Power(x,Plus(m,Negate(n))),Power(Sech(Plus(a,Times(b,Power(x,n)))),p)),x),x)),And(FreeQ(List(a,b,p),x),RationalQ(m),IntegerQ(n),GeQ(Plus(m,Negate(n)),C0),EqQ(q,C1))));
IIntegrate(5419,Int(Times(Power(Coth(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT)))),q_DEFAULT),Power(Csch(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT)))),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(x,Plus(m,Negate(n),C1)),Power(Csch(Plus(a,Times(b,Power(x,n)))),p),Power(Times(b,n,p),-1)),x)),Dist(Times(Plus(m,Negate(n),C1),Power(Times(b,n,p),-1)),Int(Times(Power(x,Plus(m,Negate(n))),Power(Csch(Plus(a,Times(b,Power(x,n)))),p)),x),x)),And(FreeQ(List(a,b,p),x),RationalQ(m),IntegerQ(n),GeQ(Plus(m,Negate(n)),C0),EqQ(q,C1))));
IIntegrate(5420,Int(Power(Tanh(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),n_DEFAULT),x_Symbol),
    Condition(Simp(Integral(Power(Tanh(Plus(a,Times(b,x),Times(c,Sqr(x)))),n),x),x),FreeQ(List(a,b,c,n),x)));
IIntegrate(5421,Int(Power(Coth(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),n_DEFAULT),x_Symbol),
    Condition(Simp(Integral(Power(Coth(Plus(a,Times(b,x),Times(c,Sqr(x)))),n),x),x),FreeQ(List(a,b,c,n),x)));
IIntegrate(5422,Int(Times(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),Tanh(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_))))),x_Symbol),
    Condition(Plus(Simp(Times(e,Log(Cosh(Plus(a,Times(b,x),Times(c,Sqr(x))))),Power(Times(C2,c),-1)),x),Dist(Times(Plus(Times(C2,c,d),Times(CN1,b,e)),Power(Times(C2,c),-1)),Int(Tanh(Plus(a,Times(b,x),Times(c,Sqr(x)))),x),x)),FreeQ(List(a,b,c,d,e),x)));
IIntegrate(5423,Int(Times(Coth(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),Plus(d_DEFAULT,Times(e_DEFAULT,x_))),x_Symbol),
    Condition(Plus(Simp(Times(e,Log(Sinh(Plus(a,Times(b,x),Times(c,Sqr(x))))),Power(Times(C2,c),-1)),x),Dist(Times(Plus(Times(C2,c,d),Times(CN1,b,e)),Power(Times(C2,c),-1)),Int(Coth(Plus(a,Times(b,x),Times(c,Sqr(x)))),x),x)),FreeQ(List(a,b,c,d,e),x)));
IIntegrate(5424,Int(Times(Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT),Power(Tanh(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),n_DEFAULT)),x_Symbol),
    Condition(Simp(Integral(Times(Power(Plus(d,Times(e,x)),m),Power(Tanh(Plus(a,Times(b,x),Times(c,Sqr(x)))),n)),x),x),FreeQ(List(a,b,c,d,e,m,n),x)));
IIntegrate(5425,Int(Times(Power(Coth(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)))),n_DEFAULT),Power(Plus(d_DEFAULT,Times(e_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Simp(Integral(Times(Power(Plus(d,Times(e,x)),m),Power(Coth(Plus(a,Times(b,x),Times(c,Sqr(x)))),n)),x),x),FreeQ(List(a,b,c,d,e,m,n),x)));
IIntegrate(5426,Int(Times(Power(u_,m_DEFAULT),Power(Sech(v_),n_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(ExpandToSum(u,x),m),Power(Sech(ExpandToSum(v,x)),n)),x),And(FreeQ(List(m,n),x),LinearQ(List(u,v),x),Not(LinearMatchQ(List(u,v),x)))));
IIntegrate(5427,Int(Times(Power(Csch(v_),n_DEFAULT),Power(u_,m_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(ExpandToSum(u,x),m),Power(Csch(ExpandToSum(v,x)),n)),x),And(FreeQ(List(m,n),x),LinearQ(List(u,v),x),Not(LinearMatchQ(List(u,v),x)))));
IIntegrate(5428,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sech(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))))),p_DEFAULT),x_Symbol),
    Condition(Dist(Power(n,-1),Subst(Int(Times(Power(x,Plus(Power(n,-1),Negate(C1))),Power(Plus(a,Times(b,Sech(Plus(c,Times(d,x))))),p)),x),x,Power(x,n)),x),And(FreeQ(List(a,b,c,d,p),x),IGtQ(Power(n,-1),C0),IntegerQ(p))));
IIntegrate(5429,Int(Power(Plus(a_DEFAULT,Times(Csch(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))),b_DEFAULT)),p_DEFAULT),x_Symbol),
    Condition(Dist(Power(n,-1),Subst(Int(Times(Power(x,Plus(Power(n,-1),Negate(C1))),Power(Plus(a,Times(b,Csch(Plus(c,Times(d,x))))),p)),x),x,Power(x,n)),x),And(FreeQ(List(a,b,c,d,p),x),IGtQ(Power(n,-1),C0),IntegerQ(p))));
IIntegrate(5430,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sech(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))))),p_DEFAULT),x_Symbol),
    Condition(Unintegrable(Power(Plus(a,Times(b,Sech(Plus(c,Times(d,Power(x,n)))))),p),x),FreeQ(List(a,b,c,d,n,p),x)));
IIntegrate(5431,Int(Power(Plus(a_DEFAULT,Times(Csch(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))),b_DEFAULT)),p_DEFAULT),x_Symbol),
    Condition(Unintegrable(Power(Plus(a,Times(b,Csch(Plus(c,Times(d,Power(x,n)))))),p),x),FreeQ(List(a,b,c,d,n,p),x)));
IIntegrate(5432,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sech(Plus(c_DEFAULT,Times(d_DEFAULT,Power(u_,n_)))))),p_DEFAULT),x_Symbol),
    Condition(Dist(Power(Coefficient(u,x,C1),-1),Subst(Int(Power(Plus(a,Times(b,Sech(Plus(c,Times(d,Power(x,n)))))),p),x),x,u),x),And(FreeQ(List(a,b,c,d,n,p),x),LinearQ(u,x),NeQ(u,x))));
IIntegrate(5433,Int(Power(Plus(a_DEFAULT,Times(Csch(Plus(c_DEFAULT,Times(d_DEFAULT,Power(u_,n_)))),b_DEFAULT)),p_DEFAULT),x_Symbol),
    Condition(Dist(Power(Coefficient(u,x,C1),-1),Subst(Int(Power(Plus(a,Times(b,Csch(Plus(c,Times(d,Power(x,n)))))),p),x),x,u),x),And(FreeQ(List(a,b,c,d,n,p),x),LinearQ(u,x),NeQ(u,x))));
IIntegrate(5434,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sech(u_))),p_DEFAULT),x_Symbol),
    Condition(Int(Power(Plus(a,Times(b,Sech(ExpandToSum(u,x)))),p),x),And(FreeQ(List(a,b,p),x),BinomialQ(u,x),Not(BinomialMatchQ(u,x)))));
IIntegrate(5435,Int(Power(Plus(a_DEFAULT,Times(Csch(u_),b_DEFAULT)),p_DEFAULT),x_Symbol),
    Condition(Int(Power(Plus(a,Times(b,Csch(ExpandToSum(u,x)))),p),x),And(FreeQ(List(a,b,p),x),BinomialQ(u,x),Not(BinomialMatchQ(u,x)))));
IIntegrate(5436,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sech(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(n,-1),Subst(Int(Times(Power(x,Plus(Simplify(Times(Plus(m,C1),Power(n,-1))),Negate(C1))),Power(Plus(a,Times(b,Sech(Plus(c,Times(d,x))))),p)),x),x,Power(x,n)),x),And(FreeQ(List(a,b,c,d,m,n,p),x),IGtQ(Simplify(Times(Plus(m,C1),Power(n,-1))),C0),IntegerQ(p))));
IIntegrate(5437,Int(Times(Power(Plus(a_DEFAULT,Times(Csch(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))),b_DEFAULT)),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Dist(Power(n,-1),Subst(Int(Times(Power(x,Plus(Simplify(Times(Plus(m,C1),Power(n,-1))),Negate(C1))),Power(Plus(a,Times(b,Csch(Plus(c,Times(d,x))))),p)),x),x,Power(x,n)),x),And(FreeQ(List(a,b,c,d,m,n,p),x),IGtQ(Simplify(Times(Plus(m,C1),Power(n,-1))),C0),IntegerQ(p))));
IIntegrate(5438,Int(Times(Power(x_,m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sech(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))))),p_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(x,m),Power(Plus(a,Times(b,Sech(Plus(c,Times(d,Power(x,n)))))),p)),x),FreeQ(List(a,b,c,d,m,n,p),x)));
IIntegrate(5439,Int(Times(Power(Plus(a_DEFAULT,Times(Csch(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))),b_DEFAULT)),p_DEFAULT),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Unintegrable(Times(Power(x,m),Power(Plus(a,Times(b,Csch(Plus(c,Times(d,Power(x,n)))))),p)),x),FreeQ(List(a,b,c,d,m,n,p),x)));
IIntegrate(5440,Int(Times(Power(Times(e_,x_),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sech(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(e,IntPart(m)),Power(Times(e,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),Power(Plus(a,Times(b,Sech(Plus(c,Times(d,Power(x,n)))))),p)),x),x),FreeQ(List(a,b,c,d,e,m,n,p),x)));
IIntegrate(5441,Int(Times(Power(Plus(a_DEFAULT,Times(Csch(Plus(c_DEFAULT,Times(d_DEFAULT,Power(x_,n_)))),b_DEFAULT)),p_DEFAULT),Power(Times(e_,x_),m_DEFAULT)),x_Symbol),
    Condition(Dist(Times(Power(e,IntPart(m)),Power(Times(e,x),FracPart(m)),Power(Power(x,FracPart(m)),-1)),Int(Times(Power(x,m),Power(Plus(a,Times(b,Csch(Plus(c,Times(d,Power(x,n)))))),p)),x),x),FreeQ(List(a,b,c,d,e,m,n,p),x)));
IIntegrate(5442,Int(Times(Power(Times(e_,x_),m_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,Sech(u_))),p_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Times(e,x),m),Power(Plus(a,Times(b,Sech(ExpandToSum(u,x)))),p)),x),And(FreeQ(List(a,b,e,m,p),x),BinomialQ(u,x),Not(BinomialMatchQ(u,x)))));
IIntegrate(5443,Int(Times(Power(Plus(a_DEFAULT,Times(Csch(u_),b_DEFAULT)),p_DEFAULT),Power(Times(e_,x_),m_DEFAULT)),x_Symbol),
    Condition(Int(Times(Power(Times(e,x),m),Power(Plus(a,Times(b,Csch(ExpandToSum(u,x)))),p)),x),And(FreeQ(List(a,b,e,m,p),x),BinomialQ(u,x),Not(BinomialMatchQ(u,x)))));
IIntegrate(5444,Int(Times(Power(x_,m_DEFAULT),Power(Sech(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT)))),p_),Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT))))),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(x,Plus(m,Negate(n),C1)),Power(Sech(Plus(a,Times(b,Power(x,n)))),Plus(p,Negate(C1))),Power(Times(b,n,Plus(p,Negate(C1))),-1)),x)),Dist(Times(Plus(m,Negate(n),C1),Power(Times(b,n,Plus(p,Negate(C1))),-1)),Int(Times(Power(x,Plus(m,Negate(n))),Power(Sech(Plus(a,Times(b,Power(x,n)))),Plus(p,Negate(C1)))),x),x)),And(FreeQ(List(a,b,p),x),IntegerQ(n),GeQ(Plus(m,Negate(n)),C0),NeQ(p,C1))));
IIntegrate(5445,Int(Times(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT)))),Power(Csch(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x_,n_DEFAULT)))),p_),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Plus(Negate(Simp(Times(Power(x,Plus(m,Negate(n),C1)),Power(Csch(Plus(a,Times(b,Power(x,n)))),Plus(p,Negate(C1))),Power(Times(b,n,Plus(p,Negate(C1))),-1)),x)),Dist(Times(Plus(m,Negate(n),C1),Power(Times(b,n,Plus(p,Negate(C1))),-1)),Int(Times(Power(x,Plus(m,Negate(n))),Power(Csch(Plus(a,Times(b,Power(x,n)))),Plus(p,Negate(C1)))),x),x)),And(FreeQ(List(a,b,p),x),IntegerQ(n),GeQ(Plus(m,Negate(n)),C0),NeQ(p,C1))));
IIntegrate(5446,Int(Times(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(c,Times(d,x)),m),Power(Sinh(Plus(a,Times(b,x))),Plus(n,C1)),Power(Times(b,Plus(n,C1)),-1)),x),Negate(Dist(Times(d,m,Power(Times(b,Plus(n,C1)),-1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Power(Sinh(Plus(a,Times(b,x))),Plus(n,C1))),x),x))),And(FreeQ(List(a,b,c,d,n),x),IGtQ(m,C0),NeQ(n,CN1))));
IIntegrate(5447,Int(Times(Power(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),x_Symbol),
    Condition(Plus(Simp(Times(Power(Plus(c,Times(d,x)),m),Power(Cosh(Plus(a,Times(b,x))),Plus(n,C1)),Power(Times(b,Plus(n,C1)),-1)),x),Negate(Dist(Times(d,m,Power(Times(b,Plus(n,C1)),-1)),Int(Times(Power(Plus(c,Times(d,x)),Plus(m,Negate(C1))),Power(Cosh(Plus(a,Times(b,x))),Plus(n,C1))),x),x))),And(FreeQ(List(a,b,c,d,n),x),IGtQ(m,C0),NeQ(n,CN1))));
IIntegrate(5448,Int(Times(Power(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrigReduce(Power(Plus(c,Times(d,x)),m),Times(Power(Sinh(Plus(a,Times(b,x))),n),Power(Cosh(Plus(a,Times(b,x))),p)),x),x),And(FreeQ(List(a,b,c,d,m),x),IGtQ(n,C0),IGtQ(p,C0))));
IIntegrate(5449,Int(Times(Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT),Power(Sinh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT),Power(Tanh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT)),x_Symbol),
    Condition(Plus(Int(Times(Power(Plus(c,Times(d,x)),m),Power(Sinh(Plus(a,Times(b,x))),n),Power(Tanh(Plus(a,Times(b,x))),Plus(p,Negate(C2)))),x),Negate(Int(Times(Power(Plus(c,Times(d,x)),m),Power(Sinh(Plus(a,Times(b,x))),Plus(n,Negate(C2))),Power(Tanh(Plus(a,Times(b,x))),p)),x))),And(FreeQ(List(a,b,c,d,m),x),IGtQ(n,C0),IGtQ(p,C0))));
IIntegrate(5450,Int(Times(Power(Cosh(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),n_DEFAULT),Power(Coth(Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT),Power(Plus(c_DEFAULT,Times(d_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(Plus(Int(Times(Power(Plus(c,Times(d,x)),m),Power(Cosh(Plus(a,Times(b,x))),n),Power(Coth(Plus(a,Times(b,x))),Plus(p,Negate(C2)))),x),Int(Times(Power(Plus(c,Times(d,x)),m),Power(Cosh(Plus(a,Times(b,x))),Plus(n,Negate(C2))),Power(Coth(Plus(a,Times(b,x))),p)),x)),And(FreeQ(List(a,b,c,d,m),x),IGtQ(n,C0),IGtQ(p,C0))));
  }
}
}
