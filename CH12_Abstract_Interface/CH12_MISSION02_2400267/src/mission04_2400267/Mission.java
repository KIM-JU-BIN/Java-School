package mission04_2400267;

interface A{
	default void abc1() {
		System.out.println("인터페이스 A의 디폴트 메서드 abc1()");
	}
	static void abc2() {
		System.out.println("인터페이스 A의 정적 메서드 abc2()");
	}
}
class B implements A{
	public void abc1() {
		System.out.println("클래스 B의 abc1()의 메서드");
	}
	void bcd() {
		A.super.abc1();
	}
}
public class Mission {
	public static void main(String[] args) {
		A.abc2();//인터페이스 A의 정적메서드 abc2()
		
		B b = new B();
		b.abc1();//클래스 B의 abc1()의 메서드
		b.bcd();//인터페이스 A의 디폴트 메서드 abc1()
	}
}
