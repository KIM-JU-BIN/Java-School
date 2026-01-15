package ex02_2400267;

/* 여러개의 객체 생성 및 활용*/

//#1. 클래스의 구성 (정의) : 붕어빵 기계
class A {
	int m=3;//필드
	void print() {//메서드
		System.out.println("객체 생성 및 활용");
	}
	void printM() {//자신의 필드값을 출력하는 메서드
		System.out.println(m);
	}
}

public class CreateObjectAndUsageOfMembers {
	public static void main(String[] args) {
		//#2. 클래스로 부터 2개의 객체 생성 : 붕어빵 2개 찍기
		A a1 = new A();
		A a2 = new A();
		
		//#3. 클래스 멤버 활용 : 붕어빵을 먹기
		//@ 필드활용: 각 객체 내부의 필드에 값을 읽기/쓰기 (필드값은 객체별로 각각 지정가능)
		a1.m=5;
		a2.m=10;
		System.out.println(a1.m);//5
		System.out.println(a2.m);//10
		
		//@메서드를 활용1: 각 객체의 메서드를 호출 (모든 객체가 동일한 메서드를 가짐)
		a1.print();//객체 생성 및 활용
		a2.print();//객체 생성 및 활용
		
		//@메서드를 활용2: 각 객체의 메서드 모양은 동일하지만 필드값이 달라 출력을 서로 다를 수 있음
		a1.printM();//5
		a2.printM();//10
	}
}
