package mission01_2400267;

class A{
	A(){
		System.out.println("기본생성자");
	}
	A(int a){
		System.out.println("정수 매개변수 생성자");
	}
	A(double b){
		System.out.println("실수 매개변수 생성자");
	}
	A(String c){
		System.out.println("문자열 매개변수 생성자");
	}
	A(int d, double e){
		System.out.println("정수, 실수 매개변수 생성자");
	}
}

public class Mission {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A(2);
		A a3 = new A(5.8);
		A a4 = new A("안녕");
		A a5 = new A(2, 3.2);	
	}
}
