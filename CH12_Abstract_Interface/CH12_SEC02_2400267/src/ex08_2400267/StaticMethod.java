package ex08_2400267;

interface A {
	static void abc() {//완성된 메서드(정적 메서드)
		System.out.println("A 인터페이스의 정적 메서드 abc()");
	}
}
public class StaticMethod {
	public static void main(String[] args) {
		//#1.정적메서드 호출
		A.abc();
	}
}
