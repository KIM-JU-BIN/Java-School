package mission01_2400267;

class A1{}
class B1{
	void abc() {
		System.out.println("기본 기능");
	}
}
abstract class C1{
	abstract void abc();
}

class A2 extends A1{
	void abc() {
		System.out.println("향상 기능");
	}
}
class B2 extends B1{
	void abc() {
		System.out.println("향상 기능");
	}
}
class C2 extends C1{
	//C1은 추상 클래스이므로 C2의 뱃속의 abstract 메서드를 가시고 있어서 미완성 메서드를 완성 시켜야함
	void abc() {
		System.out.println("향상 기능");
	}
}

public class Mission {
	public static void main(String[] ar) {
		A1 a = new A2();
//		a.abc();//A1객체를 가르키고 있는데 A1객체 안에 abc()메서드 없음
		
		B1 b= new B2();
		b.abc();//향상 기능
		
		C1 c = new C2();
		c.abc();//향상 기능
		
	}
}
