package mission03_2400267;

class A{
	public <T> boolean isEqual(T a, T b) {
		return a.equals(b);
	}
}

public class Mission {
	public static void main(String[] args) {
		
		A a = new A();
		
		System.out.println(a.isEqual(10, 10)); //true
		System.out.println(a.isEqual("안녕", "안녕")); //true
//		Object 클래스의 기본 equals()는 '=='와 동등하게 stack 메모리에 저장된 메모리 주소로 비교를 한다.
//		String과 Integer의 equals()는 개발자가 equals 메서드를 오버라이딩해서 heap메모리에 저장된 실제 값을
//		비교하는 것으로 변경함
		
		class B{}
		B b1 = new B();
		B b2 = new B();
		System.out.println(a.isEqual(b1, b2)); //false
		//b1과 b2는 다른 객체 이므로 힙 메모리의 저장된 주소가 다른다 그러므로 equals의 값은 false
		
	}
}
