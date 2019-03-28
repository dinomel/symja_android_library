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
public class IntRules41 { 

	public static void initialize() {
		Initializer.init();
	}

	private static class Initializer  {

		private static void init() {
IIntegrate(2051,Int(Times($p("§pq"),Power(Times(c_,x_),m_),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Times(c,x),m),Power(Power(x,m),-1)),Int(Times(Power(x,m),$s("§pq"),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),p)),x),x),And(FreeQ(List(a,b,c,j,m,n,p),x),PolyQ($s("§pq"),Power(x,n)),Not(IntegerQ(p)),NeQ(n,j),IntegerQ(Simplify(Times(j,Power(n,-1)))),IntegerQ(Simplify(Times(n,Power(Plus(m,C1),-1)))),Not(IntegerQ(n)))));
IIntegrate(2052,Int(Times($p("§pq"),Power(Times(c_DEFAULT,x_),m_DEFAULT),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Times(c,x),m),$s("§pq"),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),p)),x),x),And(FreeQ(List(a,b,c,j,m,n,p),x),Or(PolyQ($s("§pq"),x),PolyQ($s("§pq"),Power(x,n))),Not(IntegerQ(p)),NeQ(n,j))));
IIntegrate(2053,Int(Times($p("§pq"),Power(Plus(Times(a_DEFAULT,Power(x_,j_DEFAULT)),Times(b_DEFAULT,Power(x_,n_))),p_)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times($s("§pq"),Power(Plus(Times(a,Power(x,j)),Times(b,Power(x,n))),p)),x),x),And(FreeQ(List(a,b,j,n,p),x),Or(PolyQ($s("§pq"),x),PolyQ($s("§pq"),Power(x,n))),Not(IntegerQ(p)),NeQ(n,j))));
IIntegrate(2054,Int(Times(u_DEFAULT,Power(P_,p_),Power(Q_,q_)),x_Symbol),
    Condition(Module(List(Set($s("§gcd"),PolyGCD(PSymbol,QSymbol,x))),Condition(Int(Times(u,Power($s("§gcd"),Plus(p,q)),Power(PolynomialQuotient(PSymbol,$s("§gcd"),x),p),Power(PolynomialQuotient(QSymbol,$s("§gcd"),x),q)),x),NeQ($s("§gcd"),C1))),And(IGtQ(p,C0),ILtQ(q,C0),PolyQ(PSymbol,x),PolyQ(QSymbol,x))));
IIntegrate(2055,Int(Times(u_DEFAULT,P_,Power(Q_,q_)),x_Symbol),
    Condition(Module(List(Set($s("§gcd"),PolyGCD(PSymbol,QSymbol,x))),Condition(Int(Times(u,Power($s("§gcd"),Plus(q,C1)),PolynomialQuotient(PSymbol,$s("§gcd"),x),Power(PolynomialQuotient(QSymbol,$s("§gcd"),x),q)),x),NeQ($s("§gcd"),C1))),And(ILtQ(q,C0),PolyQ(PSymbol,x),PolyQ(QSymbol,x))));
IIntegrate(2056,Int(Times(u_DEFAULT,Power(P_,p_DEFAULT)),x_Symbol),
    Condition(With(List(Set(m,MinimumMonomialExponent(PSymbol,x))),Dist(Times(Power(PSymbol,FracPart(p)),Power(Times(Power(x,Times(m,FracPart(p))),Power(Distrib(Power(Power(x,m),-1),PSymbol),FracPart(p))),-1)),Int(Times(u,Power(x,Times(m,p)),Power(Distrib(Power(Power(x,m),-1),PSymbol),p)),x),x)),And(FreeQ(p,x),Not(IntegerQ(p)),SumQ(PSymbol),EveryQ(Function(BinomialQ(Slot1,x)),PSymbol),Not(PolyQ(PSymbol,x,C2)))));
IIntegrate(2057,Int(Power(P_,p_),x_Symbol),
    Condition(With(List(Set(u,Factor(ReplaceAll(PSymbol,Rule(x,Sqrt(x)))))),Condition(Int(ExpandIntegrand(Power(ReplaceAll(u,Rule(x,Sqr(x))),p),x),x),Not(SumQ(NonfreeFactors(u,x))))),And(PolyQ(PSymbol,Sqr(x)),ILtQ(p,C0))));
IIntegrate(2058,Int(Power(P_,p_),x_Symbol),
    Condition(With(List(Set(u,Factor(PSymbol))),Condition(Int(ExpandIntegrand(Power(u,p),x),x),Not(SumQ(NonfreeFactors(u,x))))),And(PolyQ(PSymbol,x),ILtQ(p,C0))));
IIntegrate(2059,Int(Power(P_,p_),x_Symbol),
    Condition(With(List(Set(u,Factor(PSymbol))),Condition(Int(Power(u,p),x),Not(SumQ(NonfreeFactors(u,x))))),And(PolyQ(PSymbol,x),IntegerQ(p))));
IIntegrate(2060,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)),Times(d_DEFAULT,Power(x_,3))),p_),x_Symbol),
    Condition(Dist(Power(Power(C3,p),-1),Subst(Int(Power(Simp(Plus(Times(Plus(Times(C3,a,c),Negate(Sqr(b))),Power(c,-1)),Times(Sqr(c),Power(x,3),Power(b,-1))),x),p),x),x,Plus(Times(c,Power(Times(C3,d),-1)),x)),x),And(FreeQ(List(a,b,c,d),x),IGtQ(p,C0),EqQ(Plus(Sqr(c),Times(CN1,C3,b,d)),C0))));
IIntegrate(2061,Int(Power(P_,p_),x_Symbol),
    Condition(Int(ExpandToSum(Power(PSymbol,p),x),x),And(PolyQ(PSymbol,x),IGtQ(p,C0))));
IIntegrate(2062,Int(Power(P_,p_),x_Symbol),
    Condition(Int(ExpandIntegrand(Power(PSymbol,p),x),x),And(PolyQ(PSymbol,x),IntegerQ(p),QuadraticProductQ(Factor(PSymbol),x))));
IIntegrate(2063,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(d_DEFAULT,Power(x_,3))),p_),x_Symbol),
    Condition(Dist(Power(Times(Power(C3,Times(C3,p)),Power(a,Times(C2,p))),-1),Int(Times(Power(Plus(Times(C3,a),Times(CN1,b,x)),p),Power(Plus(Times(C3,a),Times(C2,b,x)),Times(C2,p))),x),x),And(FreeQ(List(a,b,d),x),EqQ(Plus(Times(C4,Power(b,3)),Times(ZZ(27L),Sqr(a),d)),C0),IntegerQ(p))));
IIntegrate(2064,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(d_DEFAULT,Power(x_,3))),p_),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,x),Times(d,Power(x,3))),p),Power(Times(Power(Plus(Times(C3,a),Times(CN1,b,x)),p),Power(Plus(Times(C3,a),Times(C2,b,x)),Times(C2,p))),-1)),Int(Times(Power(Plus(Times(C3,a),Times(CN1,b,x)),p),Power(Plus(Times(C3,a),Times(C2,b,x)),Times(C2,p))),x),x),And(FreeQ(List(a,b,d,p),x),EqQ(Plus(Times(C4,Power(b,3)),Times(ZZ(27L),Sqr(a),d)),C0),Not(IntegerQ(p)))));
IIntegrate(2065,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(d_DEFAULT,Power(x_,3))),p_),x_Symbol),
    Condition(With(List(Set(r,Rt(Plus(Times(CN9,a,Sqr(d)),Times(CSqrt3,d,Sqrt(Plus(Times(C4,Power(b,3),d),Times(ZZ(27L),Sqr(a),Sqr(d)))))),C3))),Dist(Power(Power(d,Times(C2,p)),-1),Int(Times(Power(Simp(Plus(Times(Power(ZZ(18L),C1D3),b,d,Power(Times(C3,r),-1)),Times(CN1,r,Power(ZZ(18L),CN1D3)),Times(d,x)),x),p),Power(Simp(Plus(Times(C1D3,b,d),Times(Power(ZZ(12L),C1D3),Sqr(b),Sqr(d),Power(Times(C3,Sqr(r)),-1)),Times(Sqr(r),Power(Times(C3,Power(ZZ(12L),C1D3)),-1)),Times(CN1,d,Plus(Times(Power(C2,C1D3),b,d,Power(Times(Power(C3,C1D3),r),-1)),Times(CN1,r,Power(ZZ(18L),CN1D3))),x),Times(Sqr(d),Sqr(x))),x),p)),x),x)),And(FreeQ(List(a,b,d),x),NeQ(Plus(Times(C4,Power(b,3)),Times(ZZ(27L),Sqr(a),d)),C0),IntegerQ(p))));
IIntegrate(2066,Int(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x_),Times(d_DEFAULT,Power(x_,3))),p_),x_Symbol),
    Condition(With(List(Set(r,Rt(Plus(Times(CN9,a,Sqr(d)),Times(CSqrt3,d,Sqrt(Plus(Times(C4,Power(b,3),d),Times(ZZ(27L),Sqr(a),Sqr(d)))))),C3))),Dist(Times(Power(Plus(a,Times(b,x),Times(d,Power(x,3))),p),Power(Times(Power(Simp(Plus(Times(Power(ZZ(18L),C1D3),b,d,Power(Times(C3,r),-1)),Times(CN1,r,Power(ZZ(18L),CN1D3)),Times(d,x)),x),p),Power(Simp(Plus(Times(C1D3,b,d),Times(Power(ZZ(12L),C1D3),Sqr(b),Sqr(d),Power(Times(C3,Sqr(r)),-1)),Times(Sqr(r),Power(Times(C3,Power(ZZ(12L),C1D3)),-1)),Times(CN1,d,Plus(Times(Power(C2,C1D3),b,d,Power(Times(Power(C3,C1D3),r),-1)),Times(CN1,r,Power(ZZ(18L),CN1D3))),x),Times(Sqr(d),Sqr(x))),x),p)),-1)),Int(Times(Power(Simp(Plus(Times(Power(ZZ(18L),C1D3),b,d,Power(Times(C3,r),-1)),Times(CN1,r,Power(ZZ(18L),CN1D3)),Times(d,x)),x),p),Power(Simp(Plus(Times(C1D3,b,d),Times(Power(ZZ(12L),C1D3),Sqr(b),Sqr(d),Power(Times(C3,Sqr(r)),-1)),Times(Sqr(r),Power(Times(C3,Power(ZZ(12L),C1D3)),-1)),Times(CN1,d,Plus(Times(Power(C2,C1D3),b,d,Power(Times(Power(C3,C1D3),r),-1)),Times(CN1,r,Power(ZZ(18L),CN1D3))),x),Times(Sqr(d),Sqr(x))),x),p)),x),x)),And(FreeQ(List(a,b,d,p),x),NeQ(Plus(Times(C4,Power(b,3)),Times(ZZ(27L),Sqr(a),d)),C0),Not(IntegerQ(p)))));
IIntegrate(2067,Int(Power($p("§p3"),p_),x_Symbol),
    Condition(With(List(Set(a,Coeff($s("§p3"),x,C0)),Set(b,Coeff($s("§p3"),x,C1)),Set(c,Coeff($s("§p3"),x,C2)),Set(d,Coeff($s("§p3"),x,C3))),Condition(Subst(Int(Power(Simp(Plus(Times(Plus(Times(C2,Power(c,3)),Times(CN1,C9,b,c,d),Times(ZZ(27L),a,Sqr(d))),Power(Times(ZZ(27L),Sqr(d)),-1)),Times(CN1,Plus(Sqr(c),Times(CN1,C3,b,d)),x,Power(Times(C3,d),-1)),Times(d,Power(x,3))),x),p),x),x,Plus(x,Times(c,Power(Times(C3,d),-1)))),NeQ(c,C0))),And(FreeQ(p,x),PolyQ($s("§p3"),x,C3))));
IIntegrate(2068,Int(Power($p("§p4"),p_),x_Symbol),
    Condition(With(List(Set(a,Coeff($s("§p4"),x,C0)),Set(b,Coeff($s("§p4"),x,C1)),Set(c,Coeff($s("§p4"),x,C2)),Set(d,Coeff($s("§p4"),x,C3)),Set(e,Coeff($s("§p4"),x,C4))),Condition(Dist(Power(Power(a,Times(C3,p)),-1),Int(ExpandIntegrand(Power(Times(Power(Plus(a,Times(CN1,b,x)),p),Power(Power(Plus(Power(a,5),Times(CN1,Power(b,5),Power(x,5))),p),-1)),-1),x),x),x),And(NeQ(a,C0),EqQ(c,Times(Sqr(b),Power(a,-1))),EqQ(d,Times(Power(b,3),Power(a,-2))),EqQ(e,Times(Power(b,4),Power(a,-3)))))),And(FreeQ(p,x),PolyQ($s("§p4"),x,C4),ILtQ(p,C0))));
IIntegrate(2069,Int(Power($p("§p4"),p_),x_Symbol),
    Condition(With(List(Set(a,Coeff($s("§p4"),x,C0)),Set(b,Coeff($s("§p4"),x,C1)),Set(c,Coeff($s("§p4"),x,C2)),Set(d,Coeff($s("§p4"),x,C3)),Set(e,Coeff($s("§p4"),x,C4))),Condition(Dist(Times(ZZ(-16L),Sqr(a)),Subst(Int(Times(C1,Power(Times(a,Plus(Times(CN3,Power(b,4)),Times(ZZ(16L),a,Sqr(b),c),Times(CN1,ZZ(64L),Sqr(a),b,d),Times(ZZ(256L),Power(a,3),e),Times(CN1,ZZ(32L),Sqr(a),Plus(Times(C3,Sqr(b)),Times(CN1,C8,a,c)),Sqr(x)),Times(ZZ(256L),Power(a,4),Power(x,4))),Power(Plus(b,Times(CN1,C4,a,x)),-4)),p),Power(Plus(b,Times(CN1,C4,a,x)),-2)),x),x,Plus(Times(b,Power(Times(C4,a),-1)),Power(x,-1))),x),And(NeQ(a,C0),NeQ(b,C0),EqQ(Plus(Power(b,3),Times(CN1,C4,a,b,c),Times(C8,Sqr(a),d)),C0)))),And(FreeQ(p,x),PolyQ($s("§p4"),x,C4),IntegerQ(Times(C2,p)),Not(IGtQ(p,C0)))));
IIntegrate(2070,Int(Power($p("§q6"),p_),x_Symbol),
    Condition(With(List(Set(a,Coeff($s("§q6"),x,C0)),Set(b,Coeff($s("§q6"),x,C2)),Set(c,Coeff($s("§q6"),x,C3)),Set(d,Coeff($s("§q6"),x,C4)),Set(e,Coeff($s("§q6"),x,C6))),Condition(Dist(Power(Times(Power(C3,Times(C3,p)),Power(a,Times(C2,p))),-1),Int(ExpandIntegrand(Times(Power(Plus(Times(C3,a),Times(C3,Sqr(Rt(a,C3)),Rt(c,C3),x),Times(b,Sqr(x))),p),Power(Plus(Times(C3,a),Times(CN1,C3,Power(CN1,C1D3),Sqr(Rt(a,C3)),Rt(c,C3),x),Times(b,Sqr(x))),p),Power(Plus(Times(C3,a),Times(C3,Power(CN1,QQ(2L,3L)),Sqr(Rt(a,C3)),Rt(c,C3),x),Times(b,Sqr(x))),p)),x),x),x),And(EqQ(Plus(Sqr(b),Times(CN1,C3,a,d)),C0),EqQ(Plus(Power(b,3),Times(CN1,ZZ(27L),Sqr(a),e)),C0)))),And(ILtQ(p,C0),PolyQ($s("§q6"),x,C6),EqQ(Coeff($s("§q6"),x,C1),C0),EqQ(Coeff($s("§q6"),x,C5),C0),RationalFunctionQ(u,x))));
IIntegrate(2071,Int(Times(Sqrt(v_),Power(Plus(d_,Times(e_DEFAULT,Power(x_,4))),-1)),x_Symbol),
    Condition(With(List(Set(a,Coeff(v,x,C0)),Set(b,Coeff(v,x,C2)),Set(c,Coeff(v,x,C4))),Condition(Dist(Times(a,Power(d,-1)),Subst(Int(Power(Plus(C1,Times(CN1,C2,b,Sqr(x)),Times(Plus(Sqr(b),Times(CN1,C4,a,c)),Power(x,4))),-1),x),x,Times(x,Power(v,CN1D2))),x),And(EqQ(Plus(Times(c,d),Times(a,e)),C0),PosQ(Times(a,c))))),And(FreeQ(List(d,e),x),PolyQ(v,Sqr(x),C2))));
IIntegrate(2072,Int(Times(Sqrt(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4)))),Power(Plus(d_,Times(e_DEFAULT,Power(x_,4))),-1)),x_Symbol),
    Condition(With(List(Set(q,Sqrt(Plus(Sqr(b),Times(CN1,C4,a,c))))),Plus(Negate(Simp(Times(a,Sqrt(Plus(b,q)),ArcTan(Times(Sqrt(Plus(b,q)),x,Plus(b,Negate(q),Times(C2,c,Sqr(x))),Power(Times(C2,CSqrt2,Rt(Times(CN1,a,c),C2),Sqrt(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))))),-1))),Power(Times(C2,CSqrt2,Rt(Times(CN1,a,c),C2),d),-1)),x)),Simp(Times(a,Sqrt(Plus(Negate(b),q)),ArcTanh(Times(Sqrt(Plus(Negate(b),q)),x,Plus(b,q,Times(C2,c,Sqr(x))),Power(Times(C2,CSqrt2,Rt(Times(CN1,a,c),C2),Sqrt(Plus(a,Times(b,Sqr(x)),Times(c,Power(x,4))))),-1))),Power(Times(C2,CSqrt2,Rt(Times(CN1,a,c),C2),d),-1)),x))),And(FreeQ(List(a,b,c,d,e),x),EqQ(Plus(Times(c,d),Times(a,e)),C0),NegQ(Times(a,c)))));
IIntegrate(2073,Int(Times(Power(P_,p_),Power(Q_,q_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("§pp"),Factor(ReplaceAll(PSymbol,Rule(x,Sqrt(x)))))),Condition(Int(ExpandIntegrand(Times(Power(ReplaceAll($s("§pp"),Rule(x,Sqr(x))),p),Power(QSymbol,q)),x),x),Not(SumQ(NonfreeFactors($s("§pp"),x))))),And(FreeQ(q,x),PolyQ(PSymbol,Sqr(x)),PolyQ(QSymbol,x),ILtQ(p,C0))));
IIntegrate(2074,Int(Times(Power(P_,p_),Power(Q_,q_DEFAULT)),x_Symbol),
    Condition(With(List(Set($s("§pp"),Factor(PSymbol))),Condition(Int(ExpandIntegrand(Times(Power($s("§pp"),p),Power(QSymbol,q)),x),x),Not(SumQ(NonfreeFactors($s("§pp"),x))))),And(FreeQ(q,x),PolyQ(PSymbol,x),PolyQ(QSymbol,x),IntegerQ(p),NeQ(PSymbol,x))));
IIntegrate(2075,Int(Times(Power(P_,p_),$p("§qm")),x_Symbol),
    Condition(With(List(Set($s("§pp"),Factor(PSymbol))),Condition(Int(ExpandIntegrand(Times(Power($s("§pp"),p),$s("§qm")),x),x),QuadraticProductQ($s("§pp"),x))),And(PolyQ($s("§qm"),x),PolyQ(PSymbol,x),ILtQ(p,C0))));
IIntegrate(2076,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,x_),Times(d_DEFAULT,Power(x_,3))),p_DEFAULT)),x_Symbol),
    Condition(Dist(Power(Times(Power(C3,Times(C3,p)),Power(a,Times(C2,p))),-1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Plus(Times(C3,a),Times(CN1,b,x)),p),Power(Plus(Times(C3,a),Times(C2,b,x)),Times(C2,p))),x),x),And(FreeQ(List(a,b,d,e,f,m),x),EqQ(Plus(Times(C4,Power(b,3)),Times(ZZ(27L),Sqr(a),d)),C0),IntegerQ(p))));
IIntegrate(2077,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,x_),Times(d_DEFAULT,Power(x_,3))),p_)),x_Symbol),
    Condition(Dist(Times(Power(Plus(a,Times(b,x),Times(d,Power(x,3))),p),Power(Times(Power(Plus(Times(C3,a),Times(CN1,b,x)),p),Power(Plus(Times(C3,a),Times(C2,b,x)),Times(C2,p))),-1)),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Plus(Times(C3,a),Times(CN1,b,x)),p),Power(Plus(Times(C3,a),Times(C2,b,x)),Times(C2,p))),x),x),And(FreeQ(List(a,b,d,e,f,m,p),x),EqQ(Plus(Times(C4,Power(b,3)),Times(ZZ(27L),Sqr(a),d)),C0),Not(IntegerQ(p)))));
IIntegrate(2078,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,x_),Times(d_DEFAULT,Power(x_,3))),p_DEFAULT)),x_Symbol),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(e,Times(f,x)),m),Power(Plus(a,Times(b,x),Times(d,Power(x,3))),p)),x),x),And(FreeQ(List(a,b,d,e,f,m),x),NeQ(Plus(Times(C4,Power(b,3)),Times(ZZ(27L),Sqr(a),d)),C0),IGtQ(p,C0))));
IIntegrate(2079,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,x_),Times(d_DEFAULT,Power(x_,3))),p_)),x_Symbol),
    Condition(With(List(Set(r,Rt(Plus(Times(CN9,a,Sqr(d)),Times(CSqrt3,d,Sqrt(Plus(Times(C4,Power(b,3),d),Times(ZZ(27L),Sqr(a),Sqr(d)))))),C3))),Dist(Power(Power(d,Times(C2,p)),-1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Simp(Plus(Times(Power(ZZ(18L),C1D3),b,d,Power(Times(C3,r),-1)),Times(CN1,r,Power(ZZ(18L),CN1D3)),Times(d,x)),x),p),Power(Simp(Plus(Times(C1D3,b,d),Times(Power(ZZ(12L),C1D3),Sqr(b),Sqr(d),Power(Times(C3,Sqr(r)),-1)),Times(Sqr(r),Power(Times(C3,Power(ZZ(12L),C1D3)),-1)),Times(CN1,d,Plus(Times(Power(C2,C1D3),b,d,Power(Times(Power(C3,C1D3),r),-1)),Times(CN1,r,Power(ZZ(18L),CN1D3))),x),Times(Sqr(d),Sqr(x))),x),p)),x),x)),And(FreeQ(List(a,b,d,e,f,m),x),NeQ(Plus(Times(C4,Power(b,3)),Times(ZZ(27L),Sqr(a),d)),C0),ILtQ(p,C0))));
IIntegrate(2080,Int(Times(Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,x_),Times(d_DEFAULT,Power(x_,3))),p_)),x_Symbol),
    Condition(With(List(Set(r,Rt(Plus(Times(CN9,a,Sqr(d)),Times(CSqrt3,d,Sqrt(Plus(Times(C4,Power(b,3),d),Times(ZZ(27L),Sqr(a),Sqr(d)))))),C3))),Dist(Times(Power(Plus(a,Times(b,x),Times(d,Power(x,3))),p),Power(Times(Power(Simp(Plus(Times(Power(ZZ(18L),C1D3),b,d,Power(Times(C3,r),-1)),Times(CN1,r,Power(ZZ(18L),CN1D3)),Times(d,x)),x),p),Power(Simp(Plus(Times(C1D3,b,d),Times(Power(ZZ(12L),C1D3),Sqr(b),Sqr(d),Power(Times(C3,Sqr(r)),-1)),Times(Sqr(r),Power(Times(C3,Power(ZZ(12L),C1D3)),-1)),Times(CN1,d,Plus(Times(Power(C2,C1D3),b,d,Power(Times(Power(C3,C1D3),r),-1)),Times(CN1,r,Power(ZZ(18L),CN1D3))),x),Times(Sqr(d),Sqr(x))),x),p)),-1)),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Simp(Plus(Times(Power(ZZ(18L),C1D3),b,d,Power(Times(C3,r),-1)),Times(CN1,r,Power(ZZ(18L),CN1D3)),Times(d,x)),x),p),Power(Simp(Plus(Times(C1D3,b,d),Times(Power(ZZ(12L),C1D3),Sqr(b),Sqr(d),Power(Times(C3,Sqr(r)),-1)),Times(Sqr(r),Power(Times(C3,Power(ZZ(12L),C1D3)),-1)),Times(CN1,d,Plus(Times(Power(C2,C1D3),b,d,Power(Times(Power(C3,C1D3),r),-1)),Times(CN1,r,Power(ZZ(18L),CN1D3))),x),Times(Sqr(d),Sqr(x))),x),p)),x),x)),And(FreeQ(List(a,b,d,e,f,m,p),x),NeQ(Plus(Times(C4,Power(b,3)),Times(ZZ(27L),Sqr(a),d)),C0),Not(IntegerQ(p)))));
IIntegrate(2081,Int(Times(Power($p("§p3"),p_DEFAULT),Power(Plus(e_DEFAULT,Times(f_DEFAULT,x_)),m_DEFAULT)),x_Symbol),
    Condition(With(List(Set(a,Coeff($s("§p3"),x,C0)),Set(b,Coeff($s("§p3"),x,C1)),Set(c,Coeff($s("§p3"),x,C2)),Set(d,Coeff($s("§p3"),x,C3))),Condition(Subst(Int(Times(Power(Plus(Times(Plus(Times(C3,d,e),Times(CN1,c,f)),Power(Times(C3,d),-1)),Times(f,x)),m),Power(Simp(Plus(Times(Plus(Times(C2,Power(c,3)),Times(CN1,C9,b,c,d),Times(ZZ(27L),a,Sqr(d))),Power(Times(ZZ(27L),Sqr(d)),-1)),Times(CN1,Plus(Sqr(c),Times(CN1,C3,b,d)),x,Power(Times(C3,d),-1)),Times(d,Power(x,3))),x),p)),x),x,Plus(x,Times(c,Power(Times(C3,d),-1)))),NeQ(c,C0))),And(FreeQ(List(e,f,m,p),x),PolyQ($s("§p3"),x,C3))));
IIntegrate(2082,Int(Times(x_,Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)),Times(e_DEFAULT,Power(x_,4))),CN1D2)),x_Symbol),
    Condition(With(List(Set($s("§px"),Plus(Times(QQ(1L,320L),C1,Plus(Times(ZZ(33L),Sqr(b),c),Times(C6,a,Sqr(c)),Times(ZZ(40L),Sqr(a),e))),Times(CN1,QQ(1L,5L),ZZ(22L),a,c,e,Sqr(x)),Times(QQ(1L,15L),ZZ(22L),b,c,e,Power(x,3)),Times(C1D4,C1,e,Plus(Times(C5,Sqr(c)),Times(C4,a,e)),Power(x,4)),Times(C1D3,C4,b,Sqr(e),Power(x,5)),Times(C2,c,Sqr(e),Power(x,6)),Times(Power(e,3),Power(x,8))))),Simp(Times(C1,Log(Plus($s("§px"),Times(Dist(Power(Times(C8,Rt(e,C2),x),-1),D($s("§px"),x),x),Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x)),Times(e,Power(x,4))))))),Power(Times(C8,Rt(e,C2)),-1)),x)),And(FreeQ(List(a,b,c,e),x),EqQ(Plus(Times(ZZ(71L),Sqr(c)),Times(ZZ(100L),a,e)),C0),EqQ(Plus(Times(ZZ(1152L),Power(c,3)),Times(CN1,ZZ(125L),Sqr(b),e)),C0))));
IIntegrate(2083,Int(Times(Plus(A_,Times(B_DEFAULT,x_)),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)),Times(d_DEFAULT,Power(x_,3)),Times(e_DEFAULT,Power(x_,4))),CN1D2)),x_Symbol),
    Condition(Dist(BSymbol,Subst(Int(Times(x,Power(Plus(Times(Plus(Times(CN3,Power(d,4)),Times(ZZ(16L),c,Sqr(d),e),Times(CN1,ZZ(64L),b,d,Sqr(e)),Times(ZZ(256L),a,Power(e,3))),Power(Times(ZZ(256L),Power(e,3)),-1)),Times(Plus(Power(d,3),Times(CN1,C4,c,d,e),Times(C8,b,Sqr(e))),x,Power(Times(C8,Sqr(e)),-1)),Times(CN1,Plus(Times(C3,Sqr(d)),Times(CN1,C8,c,e)),Sqr(x),Power(Times(C8,e),-1)),Times(e,Power(x,4))),CN1D2)),x),x,Plus(Times(d,Power(Times(C4,e),-1)),x)),x),And(FreeQ(List(a,b,c,d,e,ASymbol,BSymbol),x),EqQ(Plus(Times(BSymbol,d),Times(CN1,C4,ASymbol,e)),C0),EqQ(Plus(Times(d,Plus(Times(ZZ(141L),Power(d,3)),Times(CN1,ZZ(752L),c,d,e),Times(CN1,ZZ(400L),b,Sqr(e)))),Times(ZZ(16L),Sqr(e),Plus(Times(ZZ(71L),Sqr(c)),Times(ZZ(100L),a,e)))),C0),EqQ(Plus(Times(ZZ(144L),Power(Plus(Times(C3,Sqr(d)),Times(CN1,C8,c,e)),3)),Times(ZZ(125L),Sqr(Plus(Power(d,3),Times(CN1,C4,c,d,e),Times(C8,b,Sqr(e)))))),C0))));
IIntegrate(2084,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_),Times(d_DEFAULT,Sqr(x_))),-1),Plus(f_,Times(g_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)),Times(b_DEFAULT,Power(x_,3)),Times(a_DEFAULT,Power(x_,4))),CN1D2)),x_Symbol),
    Condition(Simp(Times(a,f,ArcTan(Times(Plus(Times(a,b),Times(Plus(Times(C4,Sqr(a)),Sqr(b),Times(CN1,C2,a,c)),x),Times(a,b,Sqr(x))),Power(Times(C2,Rt(Times(Sqr(a),Plus(Times(C2,a),Negate(c))),C2),Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x)),Times(b,Power(x,3)),Times(a,Power(x,4))))),-1))),Power(Times(d,Rt(Times(Sqr(a),Plus(Times(C2,a),Negate(c))),C2)),-1)),x),And(FreeQ(List(a,b,c,d,e,f,g),x),EqQ(Plus(Times(b,d),Times(CN1,a,e)),C0),EqQ(Plus(f,g),C0),PosQ(Times(Sqr(a),Plus(Times(C2,a),Negate(c)))))));
IIntegrate(2085,Int(Times(Power(Plus(d_,Times(e_DEFAULT,x_),Times(d_DEFAULT,Sqr(x_))),-1),Plus(f_,Times(g_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)),Times(b_DEFAULT,Power(x_,3)),Times(a_DEFAULT,Power(x_,4))),CN1D2)),x_Symbol),
    Condition(Negate(Simp(Times(a,f,ArcTanh(Times(Plus(Times(a,b),Times(Plus(Times(C4,Sqr(a)),Sqr(b),Times(CN1,C2,a,c)),x),Times(a,b,Sqr(x))),Power(Times(C2,Rt(Times(CN1,Sqr(a),Plus(Times(C2,a),Negate(c))),C2),Sqrt(Plus(a,Times(b,x),Times(c,Sqr(x)),Times(b,Power(x,3)),Times(a,Power(x,4))))),-1))),Power(Times(d,Rt(Times(CN1,Sqr(a),Plus(Times(C2,a),Negate(c))),C2)),-1)),x)),And(FreeQ(List(a,b,c,d,e,f,g),x),EqQ(Plus(Times(b,d),Times(CN1,a,e)),C0),EqQ(Plus(f,g),C0),NegQ(Times(Sqr(a),Plus(Times(C2,a),Negate(c)))))));
IIntegrate(2086,Int(Times($p("§p3"),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)),Times(d_DEFAULT,Power(x_,3)),Times(e_DEFAULT,Power(x_,4))),-1)),x_Symbol),
    Condition(With(List(Set(q,Sqrt(Plus(Times(C8,Sqr(a)),Sqr(b),Times(CN1,C4,a,c)))),Set(ASymbol,Coeff($s("§p3"),x,C0)),Set(BSymbol,Coeff($s("§p3"),x,C1)),Set(CSymbol,Coeff($s("§p3"),x,C2)),Set(D,Coeff($s("§p3"),x,C3))),Plus(Dist(Power(q,-1),Int(Times(Plus(Times(b,ASymbol),Times(CN1,C2,a,BSymbol),Times(C2,a,D),Times(ASymbol,q),Times(Plus(Times(C2,a,ASymbol),Times(CN1,C2,a,CSymbol),Times(b,D),Times(D,q)),x)),Power(Plus(Times(C2,a),Times(Plus(b,q),x),Times(C2,a,Sqr(x))),-1)),x),x),Negate(Dist(Power(q,-1),Int(Times(Plus(Times(b,ASymbol),Times(CN1,C2,a,BSymbol),Times(C2,a,D),Times(CN1,ASymbol,q),Times(Plus(Times(C2,a,ASymbol),Times(CN1,C2,a,CSymbol),Times(b,D),Times(CN1,D,q)),x)),Power(Plus(Times(C2,a),Times(Plus(b,Negate(q)),x),Times(C2,a,Sqr(x))),-1)),x),x)))),And(FreeQ(List(a,b,c),x),PolyQ($s("§p3"),x,C3),EqQ(a,e),EqQ(b,d))));
IIntegrate(2087,Int(Times($p("§p3"),Power(x_,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)),Times(d_DEFAULT,Power(x_,3)),Times(e_DEFAULT,Power(x_,4))),-1)),x_Symbol),
    Condition(With(List(Set(q,Sqrt(Plus(Times(C8,Sqr(a)),Sqr(b),Times(CN1,C4,a,c)))),Set(ASymbol,Coeff($s("§p3"),x,C0)),Set(BSymbol,Coeff($s("§p3"),x,C1)),Set(CSymbol,Coeff($s("§p3"),x,C2)),Set(D,Coeff($s("§p3"),x,C3))),Plus(Dist(Power(q,-1),Int(Times(Power(x,m),Plus(Times(b,ASymbol),Times(CN1,C2,a,BSymbol),Times(C2,a,D),Times(ASymbol,q),Times(Plus(Times(C2,a,ASymbol),Times(CN1,C2,a,CSymbol),Times(b,D),Times(D,q)),x)),Power(Plus(Times(C2,a),Times(Plus(b,q),x),Times(C2,a,Sqr(x))),-1)),x),x),Negate(Dist(Power(q,-1),Int(Times(Power(x,m),Plus(Times(b,ASymbol),Times(CN1,C2,a,BSymbol),Times(C2,a,D),Times(CN1,ASymbol,q),Times(Plus(Times(C2,a,ASymbol),Times(CN1,C2,a,CSymbol),Times(b,D),Times(CN1,D,q)),x)),Power(Plus(Times(C2,a),Times(Plus(b,Negate(q)),x),Times(C2,a,Sqr(x))),-1)),x),x)))),And(FreeQ(List(a,b,c,m),x),PolyQ($s("§p3"),x,C3),EqQ(a,e),EqQ(b,d))));
IIntegrate(2088,Int(Times(Plus(A_DEFAULT,Times(B_DEFAULT,x_),Times(C_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)),Times(d_DEFAULT,Power(x_,3)),Times(e_DEFAULT,Power(x_,4))),-1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(CSymbol,Plus(Times(C2,e,Plus(Times(BSymbol,d),Times(CN1,C4,ASymbol,e))),Times(CSymbol,Plus(Sqr(d),Times(CN1,C4,c,e))))),C2))),Plus(Simp(Times(CN2,Sqr(CSymbol),ArcTanh(Times(Plus(Times(CSymbol,d),Times(CN1,BSymbol,e),Times(C2,CSymbol,e,x)),Power(q,-1))),Power(q,-1)),x),Simp(Times(C2,Sqr(CSymbol),ArcTanh(Times(CSymbol,Plus(Times(C4,BSymbol,c,CSymbol),Times(CN1,C3,Sqr(BSymbol),d),Times(CN1,C4,ASymbol,CSymbol,d),Times(ZZ(12L),ASymbol,BSymbol,e),Times(C4,CSymbol,Plus(Times(C2,c,CSymbol),Times(CN1,BSymbol,d),Times(C2,ASymbol,e)),x),Times(C4,CSymbol,Plus(Times(C2,CSymbol,d),Times(CN1,BSymbol,e)),Sqr(x)),Times(C8,Sqr(CSymbol),e,Power(x,3))),Power(Times(q,Plus(Sqr(BSymbol),Times(CN1,C4,ASymbol,CSymbol))),-1))),Power(q,-1)),x))),And(FreeQ(List(a,b,c,d,e,ASymbol,BSymbol,CSymbol),x),EqQ(Plus(Times(Sqr(BSymbol),d),Times(C2,CSymbol,Plus(Times(b,CSymbol),Times(ASymbol,d))),Times(CN1,C2,BSymbol,Plus(Times(c,CSymbol),Times(C2,ASymbol,e)))),C0),EqQ(Plus(Times(C2,Sqr(BSymbol),c,CSymbol),Times(CN1,C8,a,Power(CSymbol,3)),Times(CN1,Power(BSymbol,3),d),Times(CN1,C4,ASymbol,BSymbol,CSymbol,d),Times(C4,ASymbol,Plus(Sqr(BSymbol),Times(C2,ASymbol,CSymbol)),e)),C0),PosQ(Times(CSymbol,Plus(Times(C2,e,Plus(Times(BSymbol,d),Times(CN1,C4,ASymbol,e))),Times(CSymbol,Plus(Sqr(d),Times(CN1,C4,c,e)))))))));
IIntegrate(2089,Int(Times(Plus(A_DEFAULT,Times(C_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)),Times(d_DEFAULT,Power(x_,3)),Times(e_DEFAULT,Power(x_,4))),-1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(CSymbol,Plus(Times(CN8,ASymbol,Sqr(e)),Times(CSymbol,Plus(Sqr(d),Times(CN1,C4,c,e))))),C2))),Plus(Simp(Times(CN2,Sqr(CSymbol),ArcTanh(Times(CSymbol,Plus(d,Times(C2,e,x)),Power(q,-1))),Power(q,-1)),x),Simp(Times(C2,Sqr(CSymbol),ArcTanh(Times(CSymbol,Plus(Times(ASymbol,d),Times(CN1,C2,Plus(Times(c,CSymbol),Times(ASymbol,e)),x),Times(CN1,C2,CSymbol,d,Sqr(x)),Times(CN1,C2,CSymbol,e,Power(x,3))),Power(Times(ASymbol,q),-1))),Power(q,-1)),x))),And(FreeQ(List(a,b,c,d,e,ASymbol,CSymbol),x),EqQ(Plus(Times(b,CSymbol),Times(ASymbol,d)),C0),EqQ(Plus(Times(a,Sqr(CSymbol)),Times(CN1,Sqr(ASymbol),e)),C0),PosQ(Times(CSymbol,Plus(Times(CN8,ASymbol,Sqr(e)),Times(CSymbol,Plus(Sqr(d),Times(CN1,C4,c,e)))))))));
IIntegrate(2090,Int(Times(Plus(A_DEFAULT,Times(B_DEFAULT,x_),Times(C_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)),Times(d_DEFAULT,Power(x_,3)),Times(e_DEFAULT,Power(x_,4))),-1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(CN1,CSymbol,Plus(Times(C2,e,Plus(Times(BSymbol,d),Times(CN1,C4,ASymbol,e))),Times(CSymbol,Plus(Sqr(d),Times(CN1,C4,c,e))))),C2))),Plus(Simp(Times(C2,Sqr(CSymbol),ArcTan(Times(Plus(Times(CSymbol,d),Times(CN1,BSymbol,e),Times(C2,CSymbol,e,x)),Power(q,-1))),Power(q,-1)),x),Negate(Simp(Times(C2,Sqr(CSymbol),ArcTan(Times(CSymbol,Plus(Times(C4,BSymbol,c,CSymbol),Times(CN1,C3,Sqr(BSymbol),d),Times(CN1,C4,ASymbol,CSymbol,d),Times(ZZ(12L),ASymbol,BSymbol,e),Times(C4,CSymbol,Plus(Times(C2,c,CSymbol),Times(CN1,BSymbol,d),Times(C2,ASymbol,e)),x),Times(C4,CSymbol,Plus(Times(C2,CSymbol,d),Times(CN1,BSymbol,e)),Sqr(x)),Times(C8,Sqr(CSymbol),e,Power(x,3))),Power(Times(q,Plus(Sqr(BSymbol),Times(CN1,C4,ASymbol,CSymbol))),-1))),Power(q,-1)),x)))),And(FreeQ(List(a,b,c,d,e,ASymbol,BSymbol,CSymbol),x),EqQ(Plus(Times(Sqr(BSymbol),d),Times(C2,CSymbol,Plus(Times(b,CSymbol),Times(ASymbol,d))),Times(CN1,C2,BSymbol,Plus(Times(c,CSymbol),Times(C2,ASymbol,e)))),C0),EqQ(Plus(Times(C2,Sqr(BSymbol),c,CSymbol),Times(CN1,C8,a,Power(CSymbol,3)),Times(CN1,Power(BSymbol,3),d),Times(CN1,C4,ASymbol,BSymbol,CSymbol,d),Times(C4,ASymbol,Plus(Sqr(BSymbol),Times(C2,ASymbol,CSymbol)),e)),C0),NegQ(Times(CSymbol,Plus(Times(C2,e,Plus(Times(BSymbol,d),Times(CN1,C4,ASymbol,e))),Times(CSymbol,Plus(Sqr(d),Times(CN1,C4,c,e)))))))));
IIntegrate(2091,Int(Times(Plus(A_DEFAULT,Times(C_DEFAULT,Sqr(x_))),Power(Plus(a_,Times(b_DEFAULT,x_),Times(c_DEFAULT,Sqr(x_)),Times(d_DEFAULT,Power(x_,3)),Times(e_DEFAULT,Power(x_,4))),-1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(CN1,CSymbol,Plus(Times(CN8,ASymbol,Sqr(e)),Times(CSymbol,Plus(Sqr(d),Times(CN1,C4,c,e))))),C2))),Plus(Simp(Times(C2,Sqr(CSymbol),ArcTan(Times(Plus(Times(CSymbol,d),Times(C2,CSymbol,e,x)),Power(q,-1))),Power(q,-1)),x),Negate(Simp(Times(C2,Sqr(CSymbol),ArcTan(Times(CN1,CSymbol,Plus(Times(CN1,ASymbol,d),Times(C2,Plus(Times(c,CSymbol),Times(ASymbol,e)),x),Times(C2,CSymbol,d,Sqr(x)),Times(C2,CSymbol,e,Power(x,3))),Power(Times(ASymbol,q),-1))),Power(q,-1)),x)))),And(FreeQ(List(a,b,c,d,e,ASymbol,CSymbol),x),EqQ(Plus(Times(b,CSymbol),Times(ASymbol,d)),C0),EqQ(Plus(Times(a,Sqr(CSymbol)),Times(CN1,Sqr(ASymbol),e)),C0),NegQ(Times(CSymbol,Plus(Times(CN8,ASymbol,Sqr(e)),Times(CSymbol,Plus(Sqr(d),Times(CN1,C4,c,e)))))))));
IIntegrate(2092,Int(Times(Power($p("§p4"),p_),$p("§px")),x_Symbol),
    Condition(With(List(Set(a,Coeff($s("§p4"),x,C0)),Set(b,Coeff($s("§p4"),x,C1)),Set(c,Coeff($s("§p4"),x,C2)),Set(d,Coeff($s("§p4"),x,C3)),Set(e,Coeff($s("§p4"),x,C4))),Condition(Dist(Power(Power(a,Times(C3,p)),-1),Int(ExpandIntegrand(Times($s("§px"),Power(Times(Power(Plus(a,Times(CN1,b,x)),p),Power(Power(Plus(Power(a,5),Times(CN1,Power(b,5),Power(x,5))),p),-1)),-1)),x),x),x),And(NeQ(a,C0),EqQ(c,Times(Sqr(b),Power(a,-1))),EqQ(d,Times(Power(b,3),Power(a,-2))),EqQ(e,Times(Power(b,4),Power(a,-3)))))),And(FreeQ(p,x),PolyQ($s("§p4"),x,C4),PolyQ($s("§px"),x),ILtQ(p,C0))));
IIntegrate(2093,Int(Times(Plus(A_,Times(B_DEFAULT,Power(x_,n_))),Power(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,n_)),Times(d_DEFAULT,Power(x_,$p("n2")))),-1)),x_Symbol),
    Condition(Dist(Times(Sqr(ASymbol),Plus(n,Negate(C1))),Subst(Int(Power(Plus(a,Times(Sqr(ASymbol),b,Sqr(Plus(n,Negate(C1))),Sqr(x))),-1),x),x,Times(x,Power(Plus(Times(ASymbol,Plus(n,Negate(C1))),Times(CN1,BSymbol,Power(x,n))),-1))),x),And(FreeQ(List(a,b,c,d,ASymbol,BSymbol,n),x),EqQ($s("n2"),Times(C2,n)),NeQ(n,C2),EqQ(Plus(Times(a,Sqr(BSymbol)),Times(CN1,Sqr(ASymbol),d,Sqr(Plus(n,Negate(C1))))),C0),EqQ(Plus(Times(BSymbol,c),Times(C2,ASymbol,d,Plus(n,Negate(C1)))),C0))));
IIntegrate(2094,Int(Times(Power(x_,m_DEFAULT),Plus(A_,Times(B_DEFAULT,Power(x_,n_DEFAULT))),Power(Plus(a_,Times(b_DEFAULT,Power(x_,k_DEFAULT)),Times(c_DEFAULT,Power(x_,n_DEFAULT)),Times(d_DEFAULT,Power(x_,$p("n2")))),-1)),x_Symbol),
    Condition(Dist(Times(Sqr(ASymbol),Plus(m,Negate(n),C1),Power(Plus(m,C1),-1)),Subst(Int(Power(Plus(a,Times(Sqr(ASymbol),b,Sqr(Plus(m,Negate(n),C1)),Sqr(x))),-1),x),x,Times(Power(x,Plus(m,C1)),Power(Plus(Times(ASymbol,Plus(m,Negate(n),C1)),Times(BSymbol,Plus(m,C1),Power(x,n))),-1))),x),And(FreeQ(List(a,b,c,d,ASymbol,BSymbol,m,n),x),EqQ($s("n2"),Times(C2,n)),EqQ(k,Times(C2,Plus(m,C1))),EqQ(Plus(Times(a,Sqr(BSymbol),Sqr(Plus(m,C1))),Times(CN1,Sqr(ASymbol),d,Sqr(Plus(m,Negate(n),C1)))),C0),EqQ(Plus(Times(BSymbol,c,Plus(m,C1)),Times(CN1,C2,ASymbol,d,Plus(m,Negate(n),C1))),C0))));
IIntegrate(2095,Int(Times(Plus(a_,Times(b_DEFAULT,Sqr(x_)),Times(c_DEFAULT,Power(x_,4))),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_)),Times(f_DEFAULT,Power(x_,4)),Times(g_DEFAULT,Power(x_,6))),-1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(Plus(Times(CN1,a,c,Sqr(f)),Times(ZZ(12L),Sqr(a),Sqr(g)),Times(f,Plus(Times(C3,Sqr(c),d),Times(CN1,C2,a,b,g)))),Power(Times(c,g,Plus(Times(C3,c,d),Times(CN1,a,f))),-1)),C2)),Set(r,Rt(Times(Plus(Times(a,c,Sqr(f)),Times(C4,g,Plus(Times(b,c,d),Times(Sqr(a),g))),Times(CN1,f,Plus(Times(C3,Sqr(c),d),Times(C2,a,b,g)))),Power(Times(c,g,Plus(Times(C3,c,d),Times(CN1,a,f))),-1)),C2))),Plus(Simp(Times(c,ArcTan(Times(Plus(r,Times(C2,x)),Power(q,-1))),Power(Times(g,q),-1)),x),Negate(Simp(Times(c,ArcTan(Times(Plus(r,Times(CN1,C2,x)),Power(q,-1))),Power(Times(g,q),-1)),x)),Negate(Simp(Times(c,ArcTan(Times(Plus(Times(C3,c,d),Times(CN1,a,f)),x,Plus(Times(b,Sqr(c),d,f),Times(CN1,a,Sqr(b),f,g),Times(CN1,C2,Sqr(a),c,f,g),Times(C6,Sqr(a),b,Sqr(g)),Times(c,Plus(Times(C3,Sqr(c),d,f),Times(CN1,a,c,Sqr(f)),Times(CN1,b,c,d,g),Times(C2,Sqr(a),Sqr(g))),Sqr(x)),Times(Sqr(c),g,Plus(Times(C3,c,d),Times(CN1,a,f)),Power(x,4))),Power(Times(g,q,Plus(Times(b,c,d),Times(CN1,C2,Sqr(a),g)),Plus(Times(b,c,d),Times(CN1,a,b,f),Times(C4,Sqr(a),g))),-1))),Power(Times(g,q),-1)),x)))),And(FreeQ(List(a,b,c,d,e,f,g),x),EqQ(Plus(Times(C9,Power(c,3),Sqr(d)),Times(CN1,c,Plus(Sqr(b),Times(C6,a,c)),d,f),Times(Sqr(a),c,Sqr(f)),Times(C2,a,b,Plus(Times(C3,c,d),Times(a,f)),g),Times(CN1,ZZ(12L),Power(a,3),Sqr(g))),C0),EqQ(Plus(Times(C3,Power(c,4),Sqr(d),e),Times(CN1,C3,Sqr(a),Sqr(c),d,f,g),Times(Power(a,3),c,Sqr(f),g),Times(C2,Power(a,3),Sqr(g),Plus(Times(b,f),Times(CN1,C6,a,g))),Times(CN1,Power(c,3),d,Plus(Times(C2,b,d,f),Times(a,e,f),Times(CN1,ZZ(12L),a,d,g)))),C0),NeQ(Plus(Times(C3,c,d),Times(CN1,a,f)),C0),NeQ(Plus(Times(b,c,d),Times(CN1,C2,Sqr(a),g)),C0),NeQ(Plus(Times(b,c,d),Times(CN1,a,b,f),Times(C4,Sqr(a),g)),C0),PosQ(Times(Plus(Times(CN1,a,c,Sqr(f)),Times(ZZ(12L),Sqr(a),Sqr(g)),Times(f,Plus(Times(C3,Sqr(c),d),Times(CN1,C2,a,b,g)))),Power(Times(c,g,Plus(Times(C3,c,d),Times(CN1,a,f))),-1))))));
IIntegrate(2096,Int(Times(Plus(a_,Times(c_DEFAULT,Power(x_,4))),Power(Plus(d_,Times(e_DEFAULT,Sqr(x_)),Times(f_DEFAULT,Power(x_,4)),Times(g_DEFAULT,Power(x_,6))),-1)),x_Symbol),
    Condition(With(List(Set(q,Rt(Times(Plus(Times(CN1,a,c,Sqr(f)),Times(ZZ(12L),Sqr(a),Sqr(g)),Times(C3,f,Sqr(c),d)),Power(Times(c,g,Plus(Times(C3,c,d),Times(CN1,a,f))),-1)),C2)),Set(r,Rt(Times(Plus(Times(a,c,Sqr(f)),Times(C4,Sqr(a),Sqr(g)),Times(CN1,C3,Sqr(c),d,f)),Power(Times(c,g,Plus(Times(C3,c,d),Times(CN1,a,f))),-1)),C2))),Plus(Simp(Times(c,ArcTan(Times(Plus(r,Times(C2,x)),Power(q,-1))),Power(Times(g,q),-1)),x),Negate(Simp(Times(c,ArcTan(Times(Plus(r,Times(CN1,C2,x)),Power(q,-1))),Power(Times(g,q),-1)),x)),Negate(Simp(Times(c,ArcTan(Times(c,Plus(Times(C3,c,d),Times(CN1,a,f)),x,Plus(Times(C2,Sqr(a),f,g),Times(CN1,Plus(Times(C3,Sqr(c),d,f),Times(CN1,a,c,Sqr(f)),Times(C2,Sqr(a),Sqr(g))),Sqr(x)),Times(CN1,c,Plus(Times(C3,c,d),Times(CN1,a,f)),g,Power(x,4))),Power(Times(C8,Power(a,4),Power(g,3),q),-1))),Power(Times(g,q),-1)),x)))),And(FreeQ(List(a,c,d,e,f,g),x),EqQ(Plus(Times(C9,Power(c,3),Sqr(d)),Times(CN1,C6,a,Sqr(c),d,f),Times(Sqr(a),c,Sqr(f)),Times(CN1,ZZ(12L),Power(a,3),Sqr(g))),C0),EqQ(Plus(Times(C3,Power(c,4),Sqr(d),e),Times(CN1,C3,Sqr(a),Sqr(c),d,f,g),Times(Power(a,3),c,Sqr(f),g),Times(CN1,ZZ(12L),Power(a,4),Power(g,3)),Times(CN1,a,Power(c,3),d,Plus(Times(e,f),Times(CN1,ZZ(12L),d,g)))),C0),NeQ(Plus(Times(C3,c,d),Times(CN1,a,f)),C0),PosQ(Times(Plus(Times(CN1,a,c,Sqr(f)),Times(ZZ(12L),Sqr(a),Sqr(g)),Times(C3,Sqr(c),d,f)),Power(Times(c,g,Plus(Times(C3,c,d),Times(CN1,a,f))),-1))))));
IIntegrate(2097,Int(Times(Power($p("§q6"),p_),u_),x_Symbol),
    Condition(With(List(Set(a,Coeff($s("§q6"),x,C0)),Set(b,Coeff($s("§q6"),x,C2)),Set(c,Coeff($s("§q6"),x,C3)),Set(d,Coeff($s("§q6"),x,C4)),Set(e,Coeff($s("§q6"),x,C6))),Condition(Dist(Power(Times(Power(C3,Times(C3,p)),Power(a,Times(C2,p))),-1),Int(ExpandIntegrand(Times(u,Power(Plus(Times(C3,a),Times(C3,Sqr(Rt(a,C3)),Rt(c,C3),x),Times(b,Sqr(x))),p),Power(Plus(Times(C3,a),Times(CN1,C3,Power(CN1,C1D3),Sqr(Rt(a,C3)),Rt(c,C3),x),Times(b,Sqr(x))),p),Power(Plus(Times(C3,a),Times(C3,Power(CN1,QQ(2L,3L)),Sqr(Rt(a,C3)),Rt(c,C3),x),Times(b,Sqr(x))),p)),x),x),x),And(EqQ(Plus(Sqr(b),Times(CN1,C3,a,d)),C0),EqQ(Plus(Power(b,3),Times(CN1,ZZ(27L),Sqr(a),e)),C0)))),And(ILtQ(p,C0),PolyQ($s("§q6"),x,C6),EqQ(Coeff($s("§q6"),x,C1),C0),EqQ(Coeff($s("§q6"),x,C5),C0),RationalFunctionQ(u,x))));
IIntegrate(2098,Int(Times($p("§pm"),Power($p("§qn"),-1)),x_Symbol),
    Condition(With(List(Set(m,Expon($s("§pm"),x)),Set(n,Expon($s("§qn"),x))),Condition(Plus(Simp(Times(Coeff($s("§pm"),x,m),Log($s("§qn")),Power(Times(n,Coeff($s("§qn"),x,n)),-1)),x),Dist(Simplify(Plus($s("§pm"),Times(CN1,Coeff($s("§pm"),x,m),D($s("§qn"),x),Power(Times(n,Coeff($s("§qn"),x,n)),-1)))),Int(Power($s("§qn"),-1),x),x)),And(EqQ(m,Plus(n,Negate(C1))),EqQ(D(Simplify(Plus($s("§pm"),Times(CN1,Coeff($s("§pm"),x,m),D($s("§qn"),x),Power(Times(n,Coeff($s("§qn"),x,n)),-1)))),x),C0)))),And(PolyQ($s("§pm"),x),PolyQ($s("§qn"),x))));
IIntegrate(2099,Int(Times($p("§pm"),Power($p("§qn"),p_)),x_Symbol),
    Condition(With(List(Set(m,Expon($s("§pm"),x)),Set(n,Expon($s("§qn"),x))),Condition(Plus(Simp(Times(Coeff($s("§pm"),x,m),Power($s("§qn"),Plus(p,C1)),Power(Times(n,Plus(p,C1),Coeff($s("§qn"),x,n)),-1)),x),Dist(Simplify(Plus($s("§pm"),Times(CN1,Coeff($s("§pm"),x,m),D($s("§qn"),x),Power(Times(n,Coeff($s("§qn"),x,n)),-1)))),Int(Power($s("§qn"),p),x),x)),And(EqQ(m,Plus(n,Negate(C1))),EqQ(D(Simplify(Plus($s("§pm"),Times(CN1,Coeff($s("§pm"),x,m),D($s("§qn"),x),Power(Times(n,Coeff($s("§qn"),x,n)),-1)))),x),C0)))),And(FreeQ(p,x),PolyQ($s("§pm"),x),PolyQ($s("§qn"),x),NeQ(p,CN1))));
IIntegrate(2100,Int(Times($p("§pm"),Power($p("§qn"),-1)),x_Symbol),
    Condition(With(List(Set(m,Expon($s("§pm"),x)),Set(n,Expon($s("§qn"),x))),Condition(Plus(Simp(Times(Coeff($s("§pm"),x,m),Log($s("§qn")),Power(Times(n,Coeff($s("§qn"),x,n)),-1)),x),Dist(Power(Times(n,Coeff($s("§qn"),x,n)),-1),Int(Times(ExpandToSum(Plus(Times(n,Coeff($s("§qn"),x,n),$s("§pm")),Times(CN1,Coeff($s("§pm"),x,m),D($s("§qn"),x))),x),Power($s("§qn"),-1)),x),x)),EqQ(m,Plus(n,Negate(C1))))),And(PolyQ($s("§pm"),x),PolyQ($s("§qn"),x))));
  }
}
}
