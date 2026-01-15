package mission02_2400267;

class A{}
class B extends A{}
class E extends B{}
class C extends B{}
class F extends C{}
class D extends C{}
class G extends D{}

public class Mission {
	public static void main(String[] args) {
		//A type 선언
		A aa = new A();//A는 A이다.
		A ab = new B();//B는 A이다.
		A ac = new C();//C는 A이다.
		A ad = new D();//D는 A이다.
		A ae = new E();//E는 A이다.
		A af = new F();//F는 A이다.
		A ag = new G();//G는 A이다.
		
		//B type 선언
//		B ba = new A();//A는 B이다.(오류: B의 멤버에 A가 포함하지 않는 것도 있기 떄문이다.)
		B bb = new B();//B는 B이다.
		B bc = new C();//C는 B이다.
		B bd = new D();//D는 B이다.
		B be = new E();//E는 B이다.
		B ef = new F();//F는 B이다.
		B eg = new G();//G는 B이다.
		
		//C type 선언
//		C ca = new A();//A는 C이다.(오류: C의 멤버에 A가 포함하지 않는 것도 있기 떄문이다.)
//		C cb = new B();//B는 C이다.(오류: C의 멤버에 A가 포함하지 않는 것도 있기 때문)
		C cc = new C();//C는 C이다.
		C cd = new D();//D는 C이다.
//		C ce = new E();//E는 C이다.(오류: E는 C와 형제관계임)
		C cf = new F();//F는 C이다.
		C cg = new G();//G는 C이다.
		
		//D type 선언
//		D da = new A();//A는 D이다.(오류: 부모 클래스쪽으로 화살표)
//		D db = new B();//B는 D이다.(오류: 부모 클래스쪽으로 화살표)
//		D dc = new C();//C는 D이다.(오류: 부모 클래스쪽으로 화살표)
		D dd = new D();//D는 D이다.
//		D de = new E();//E는 D이다.(오류: E의 멤버에 D가 포함하지 않는 멤버가 들어있기 때문))
//		D df = new F();//F는 D이다.(오류: F의 멤버에 D가 포함하지 않는 멤버가 들어있기 때문)
		D dg = new G();//G는 D이다.
		
		//E type 선언
//		E ea = new A();//A는 E이다.(오류)
//		E eb = new B();//B는 E이다.(오류)
//		E ec = new C();//C는 E이다.(오류)
//		E ed = new D();//D는 E이다.(오류)
		E ee = new E();//E는 E이다.
//		E ef = new F();//F는 E이다.(오류)
//		E eg = new G();//G는 E이다.(오류)
		
		//F type 선언
//		F fa = new A();//A는 F이다.(오류)
//		F fb = new B();//B는 F이다.(오류)
//		F fc = new C();//C는 F이다.(오류)
//		F fd = new D();//D는 F이다.(오류)
//		F fe = new E();//E는 F이다.(오류)
		F ff = new F();//F는 F이다.
//		F fg = new G();//G는 F이다.(오류)
		
		//G type 선언
//		G ga = new A();//A는 G이다.(오류)
//		G gb = new B();//B는 G이다.(오류)
//		G gc = new C();//C는 G이다.(오류)
//		G gd = new D();//D는 G이다.(오류)
//		G ge = new E();//E는 G이다.(오류)
//		G gf = new F();//F는 G이다.(오류)
		G gg = new G();//G는 G이다.
	}
}
