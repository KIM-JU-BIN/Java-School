package mission06_2400267;
interface A{
	public abstract void abc();
}
class AA implements A{
	@Override
		public void abc() {
			System.out.println("자식클래스 직접 생성");
		}	
}
class B{
	void bcd(A a) {
		a.abc();
	}
}
public class Test {
	public static void main(String[] args) {
		B b = new B();
		
//		b.bcd(A의 객체);
		//A객체를 넘기는 방법 4가지
		
		//#1. 방법1. 클래스이름 O(AA) + 참조변수 O(a1)
		A a1 = new AA();
		b.bcd(a1);
		
		//#1. 방법2. 클래스이름 O(AA) + 참조변수 X
		b.bcd(new AA());
		
		//#1. 방법3. 클래스이름 X + 참조변수 O
		A a2 = new A() {
			@Override
			public void abc() {
				System.out.println("익명이너클래스로 생성");
			}
		};
		b.bcd(a2);
		
		//#1. 방법4. 클래스이름 X + 참조변수 X
		b.bcd(new A() {//중괄호까지 친 다음에 ctrl+spacebar
			@Override
			public void abc() {
				System.out.println("익명이너클래스로 생성");
			}
		});
	
	}
}
