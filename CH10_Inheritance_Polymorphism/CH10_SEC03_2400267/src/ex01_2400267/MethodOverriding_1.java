package ex01_2400267;

/*메서드 오버라이딩의 기본 동작*/

class A{
	void print() {
		System.out.println("A 클래스");
	}
}
class B extends A{
//	@Override
	void print() {
		System.out.println("B 클래스");
	}
}

public class MethodOverriding_1 {
	public static void main(String[] ar) {
		//#1. A 타입 / A 생성자
		A aa = new A();
		aa.print(); //A클래스
		
		//#2. B 타입 / B 생성자
		B bb = new B();
		bb.print(); //B클래스
		
		//#3. A 타입 / B 생성자
		A ab = new B();
		ab.print(); //B클래스
	}
}
