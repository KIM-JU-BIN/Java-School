package mission02_2400267;

class A{
	A(){
		System.out.println("A 클래스의 첫 번째 생성자");
	}
	A(int m){
		System.out.println("A 클래스의 두 번째 생성자");
	}
}
class B extends A{
	B(){
//		자식클래스의 생성자 첫 줄에 무조건 super() or this()있어야함
//		super(); //컴파일러가 자동 생성
		System.out.println("B 클래스의 첫 번째 생성자");
	}
	B(int m){
//		자식클래스의 생성자 첫 줄에 무조건 super() or this()있어야함
		super(2);
		System.out.println("B 클래스의 두 번째 생성자");
	}
}
class C extends B{
	C(){
//		자식클래스의 생성자 첫 줄에 무조건 super() or this()있어야함
//		super(); //컴파일러가 자동 생성
		System.out.println("C 클래스의 첫 번째 생성자");
	}
	C(int m){
//		자식클래스의 생성자 첫 줄에 무조건 super() or this()있어야함
		super(2);
		System.out.println("C 클래스의 두 번째 생성자");
	}
}
public class Mission {
	public static void main(String[] ar) {
		A aa = new A();
		//A 클래스의 첫 번째 생성자
		System.out.println();
//A생성자를 호출=>A생성자의 결과 출력
		
		A ab = new B();
		//A 클래스의 첫 번째 생성자
		//B 클래스의 첫 번째 생성자
		System.out.println();
//B생성자 호출=>첫 줄에 super()있으므로 부모인 A생성자 호출=>A생성자 결과 출력=>B생성자 결과 출력
		
		A ac = new C();
		//A 클래스의 첫 번째 생성자
		//B 클래스의 첫 번째 생성자
		//C 클래스의 첫 번째 생성자
		System.out.println();
//C생성자 호출=>첫 줄에 super()있으므로 부모인 B생성자 호출=>첫 줄에 super()있으므로 부모인 A생성자 호출
//=>A생성자 결과 출력=>B생성자 결과 출력=>C생성자 결과 출력
		
		B bb = new B();
		//A 클래스의 첫 번째 생성자
		//B 클래스이 첫 번째 생성자
		System.out.println();
//B생성자 호출=>첫 줄에 super()있으므로 부모인 A생성자 호출=>A생성자 결과 출력=>B생성자 결과 출력
		
		B bc = new C();
		//A 클래스의 첫 번째 생성자
		//B 클래스의 첫 번째 생성자
		//C 클래스의 첫 번째 생성자
		System.out.println();
//C생성자 호출=>첫 줄에 super()있으므로 부모인 B생성자 호출=>첫 줄에 super()있으므로 부모인 A생성자 호출
//=>A생성자 결과 출력=>B생성자 결과 출력=>C생성자 결과 출력
		
		C cc = new C();
		//A 클래스의 첫 번째 생성자
		//B 클래스의 첫 번째 생성자
		//C 클래스의 첫 번째 생성자
		System.out.println();
//C생성자 호출=>첫 줄에 super()있으므로 부모인 B생성자 호출=>첫 줄에 super()있으므로 부모인 A생성자 호출
//=>A생성자 결과 출력=>B생성자 결과 출력=>C생성자 결과 출력
		
		B bc2 = new C(3);
		//A 클래스의 첫 번째 생성자
		//B 클래스의 첫 번째 생성자
		//C 클래스의 두 번쨰 생성자
		System.out.println();
//C(int m)생성자 호출=>첫 줄에 super()있으므로 부모인 B생성자 호출=>첫 줄에 super()있으므로 부모인 A생성자 호출
//=>A생성자 결과 출력=>B생성자 결과 출력=>C(int m)생성자 결과 출력
		
		B bc3 = new C(3);
		//A 클래스의 두번째 생성자
		//B 클래스의 두번째 생성자
		//C 클래스의 두번째 생성자
		System.out.println();
//C(int m)생성자 호출=>첫 줄에 super(m)있으므로 부모의 B(int m)생성자 호출
//첫 줄에 super(m) 생성자 있으므로 부모인 A생성자 호출=>A(int m)의 결과 출력=>B(int m)의 결과 출력=>C(int m)의 결과 출력
		
	}
}
