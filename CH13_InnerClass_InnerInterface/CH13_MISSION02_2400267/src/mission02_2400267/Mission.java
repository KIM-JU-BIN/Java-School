package mission02_2400267;

interface A{
	public abstract void abc();
}
class B{
	void bcd(A a) {//인터페이스 A타입의 객체를 매개변수로 받음
		a.abc();
	}
}
class M1 implements A{
//	@override
	public void abc() {
		System.out.println("클래스명 O + 참조변수명 O");
	}
}
class M2 implements A{
//	@override
	public void abc() {
		System.out.println("클래스명 O + 참조변수명 X");
	}
}

public class Mission {
	public static void main(String[] args) {
		B b = new B();
		
		//#1. 클래스명 O(M1) + 참조변수명 O(m1)
		A m1 = new M1();
		b.bcd(m1);
		
		//#2. 클래스명 O(M2) + 참조변수명 X
		b.bcd(new M2());
		
		//#3. 클래스명 X + 참조변수명 O(m3)
		A m3 = new A() {
			public void abc() {
				System.out.println("클래스명 X + 참조변수명 O");
			}
		};
		b.bcd(m3);
		
		//#4. 클래스명 X + 참조변수명 X
		b.bcd(new A() {
			public void abc() {
				System.out.println("클래스명 X + 참조변수명 X");
			}
		});
		
	}
}
