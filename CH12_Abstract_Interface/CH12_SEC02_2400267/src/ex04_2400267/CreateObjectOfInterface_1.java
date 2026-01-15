package ex04_2400267;
//#방법1. 자식클래스 생성 + 자식클래스 생성자로 객체 생성
interface A{
	int a= 3;
	void abc();
}
class B implements A {	
	public void abc() {
		System.out.println("방법1. 자식클래스 생성 + 자식클래스 생성자로 객체 생성");		
	}
}

public class CreateObjectOfInterface_1 {
	public static void main(String[] args) {
		//#1. 객체 생성(오버라이딩 됨)
		B b1 = new B();//A b1 = new B();
		A b2 = new B();
		
		//#2. 메서드 호출
		b1.abc();
		b2.abc();
	}
}
