package mission01_2400267;

interface A{
	public abstract void abc();
}
class AA implements A{
	public void abc() {
		System.out.println("인터페이스 A의 abc() 메서드 구현");
	}
}
class B {
	//자식클래스 사용
	A a = new AA();
	
//	A a = new A() {//익명이너클래스 활용
//		public void abc() {
//			System.out.println("인터페이스 A의 abc() 메서드 구현");
//		}
//	};
	
	void bcd() {
		a.abc();
	}
}

public class Mission {
	public static void main(String[] args) {
		B b = new B();
		b.bcd();//인터페이스 A의 abc() 메서드 구현
	}
}
