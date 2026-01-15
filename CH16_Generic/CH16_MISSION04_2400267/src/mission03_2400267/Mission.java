package mission03_2400267;

class A{}
class B extends A{}
class C extends B{}
class D extends C{}
class E extends C{}

class G<T>{
	private T t;
	
}
class M {
	void abc(G<D> t) {
		System.out.println("클래스 M의 abc() 메서드");
	}
	void bcd(G<? super E> t) {
		System.out.println("클래스 M의 bcd() 메서드");
	}
	void cde(G<? extends C> t) {
		System.out.println("클래스 M의 cde() 메서드");
	}
	void def(G<?> t) {
		System.out.println("클래스 M의 def() 메서드");
	}
}

public class Mission {
	public static void main(String[] args) {
		G<A> g1 = new G<>();
		G<B> g2 = new G<>();
		G<C> g3 = new G<>();
		G<D> g4 = new G<>();
		G<E> g5 = new G<>();
		
		//# 제네릭클래스 G의 제네릭 타입이 D인 객체만 매개변수로 넣었을 때 오류가 안 남
		M m = new M();
//		m.abc(g1); //오류발생
//		m.abc(g2); //오류발생
//		m.abc(g3); //오류발생
		m.abc(g4);
//		m.abc(g5); //오류발생
		System.out.println();
		
		//# 제네릭클래스 G의 제네릭 타입이 E와 E의 부모클래스의 객체만 매개변수로 넣었을 때 오류가 안 남
		m.bcd(g1);
		m.bcd(g2);
		m.bcd(g3);
//		m.bcd(g4); //오류발생
		m.bcd(g5);
		System.out.println();
		
		//# 제네릭클래스의 G의 제네릭 타입이 C와 C의 자식클래스의 객체만 오류 안 남
//		m.cde(g1); //오류발생
//		m.cde(g2); //오류발생
		m.cde(g3);
		m.cde(g4);
		m.cde(g5);
		System.out.println();
		
		//# 제네릭클래스의 G의 제네릭 타입 상관 없이 다 올 수 있음
		m.def(g1);
		m.def(g2);
		m.def(g3);
		m.def(g4);
		m.def(g5);
	}
}
