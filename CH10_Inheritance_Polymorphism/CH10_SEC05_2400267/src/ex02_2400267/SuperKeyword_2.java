package ex02_2400267;
/*멤버 앞에 super 키워드를 사용한 경우의 메서드 호출*/
class A{
	void abc() {
		System.out.println("A클래스의 abc()");
	}
}
class B extends A{
	void abc() {
		System.out.println("B클래스의 abc()");
	}
	void bcd() {
		super.abc();//super.abc() : 부모클래스 객체의 abc() 메서드 호출
	}
}

public class SuperKeyword_2 {
	public static void main(String[] ar) {
		//#1. 객체 생성
		B bb = new B();
		
		//#2. 메서드 호출
		bb.bcd();//A 클래스의 abc()
	}
}
