package mission01_2400267;

class A{}
class B extends A{}
class C extends A{}
class D extends B{}

class E{}

class G<T extends A>{//A, A의 자식클래스만 가능 
	private T t;
}

public class Mission {
	public static void main(String[] args) {
		
		G g1 = new G(); // = G<A> g1=new G<A>(); 제네릭 타입 생략하면 최상위 클래스로 인식  
	    G<A> g2 = new G<>(); //A클래스라서 가능
	    G<B> g3 = new G<>(); //B클래스는 A의 자식 클래스
	    G<C> g4 = new G<>(); //C클래스는 A의 자식 클래스
	    G<D> g5 = new G<>(); //D클래스는 A의 자식 클래스
//	    G<E> g6 = new G<>(); //E클래스는 A의 자식 클래스가 아니므로 오류남
	}
}
