package mission02_2400267;

abstract class A{
	abstract void sayHello();
}

public class Mission {
	public static void main(String[] args) {
		//#객체 생성
		A ab1 = new A() {
			void sayHello() {
				System.out.println("안녕하세요");
			}
		};
		A ab2 = new A() {
			void sayHello() {
				System.out.println("안녕하세요");
			}
		};
		A ac1 = new A() {
			void sayHello() {
				System.out.println("Hi, Hello");
			}
		};
		A ac2 = new A() {
			void sayHello() {
				System.out.println("Hi, Hello");
			}
		};
		
		//#메서드 호출
//		* 익명이너클래스를 사용함으로써 추가적인 자식클래스 정의 불필요 (단, 중복코드 발생) *
		ab1.sayHello();
		ab2.sayHello();
		ac1.sayHello();
		ac2.sayHello();
		
	}
}
