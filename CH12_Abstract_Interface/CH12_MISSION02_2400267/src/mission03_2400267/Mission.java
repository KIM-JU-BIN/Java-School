package mission03_2400267;

interface A{
	public static final int m=3;//정적 메서드는 정의되어야 함, public static final int m=3;
	public abstract void abc();//public abstract void abc();
}
class B implements A{
	public void abc() {
		System.out.println("자식클래스 직접 생성 방법");
	}
}

public class Mission {
	public static void main(String[] args) {
		A a1 = new B();
		A a2 = new B();
		
		A a3 = new A() {
			public void abc() {
				System.out.println("익명이너클래스 방법");
			}
		};
		A a4 = new A() {
			public void abc() {
				System.out.println("익명이너클래스 방법");
			}
		};
		
		System.out.println(A.m);//3
		a1.abc();//자식클래스 직접 생성 방법
		a2.abc();//자식클래스 직접 생성 방법
		a3.abc();//익명이너클래스 방법
		a4.abc();//익명이너클래스 방법
		
	}
}
