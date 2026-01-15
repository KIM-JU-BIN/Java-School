package mission02_2400267;

class A{
	final void abc() {
		System.out.println("A 클래스의 abc() 메서드 호출");
	}
	void bcd() {
		System.out.println("A 클래스의 bcd() 메서드 호출");
	}
}
class B extends A{
	//fianl 키워드의 메서드는 overriding불가
//	void abc() {
//		System.out.println("B 클래스의 abc() 메서드 호출");
//	}
	void bcd() {
		System.out.println("B 클래스의 bcd() 메서드 호출");
	}
}

public class Mission {
	public static void main(String[] ar) {
		A ab = new B();
//final 키워드의 메서드는 오버라이딩이 불가해서 A객체 내의 abc()메서드 안의 결과를 출력
		ab.abc();//A 클래스의 abc() 메서드 호출
//일반 메서드 bcd()는 객체 B의 메서드 오버라이딩에 의해서 bcd()메서드는 마지막에 저장된 값을 출력
		ab.bcd();//B 클래스의 bcd() 메서드 호출
		
		B bb = new B();
//B객체 안에 있는 abc()메서드는 없기 때문에 부모인 A 객체 안의 abc() 메서드의 결과를 출력
		bb.abc();//A 클래스의 abc() 메서드 호출
//B객체 안에 있는 bcd()메서드 출력
		bb.bcd();//B 클래스의 bcd() 메서드 호출
		
	}
}
