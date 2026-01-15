package ex03_2400267;

/*정적이너클래스의 외부멤버 사용 및 객체 생성*/

class A{
	int a=3;
	static int b=4;
	void method1(){
		System.out.println("instance method");
	}
	static void method2() {
		System.out.println("static method");
	}
	//static inner class
	static class B{
		void bcd(){
			//#1. 필드 사용
//			system.out.println(a); //static은 static만 포함 가능
			System.out.println(b);//4
			//#2. 메서드 호출
//			method1();//static은 static만 포함 가능
			method2();//static method
		}
	}
}
public class CreateObjectAndAccessMember {
	public static void main(String[] args) {
		//1. static inner class의 객체 생성
		A.B b = new A.B();//static은 객체 생성하지 않고도 사용 가능하므로 인스턴스 이너 클래스와 다르게 참조변수로 객체 생성하지 않음
		//#2. 메서드 호출
		b.bcd();
	}
}
