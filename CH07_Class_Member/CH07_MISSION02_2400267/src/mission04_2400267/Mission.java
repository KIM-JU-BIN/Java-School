package mission04_2400267;

class A{
	void abc() {
		System.out.println("Hello");
	}
	void abc(boolean a) {
		System.out.println(a);
	}
	void abc(int b) {
		System.out.println(b);
	}
	void abc(double c) {
		System.out.println(c);
	}
	void abc(String d) {
		System.out.println(d);
	}
	void abc(int a, int b) {
		System.out.println(a+", "+b);
	}
	void abc(String a, String b) {
		System.out.println(a+", "+b);
	}
}

public class Mission {
	public static void main(String[] args) {
		A a = new A();
		a.abc();
		a.abc(true);
		a.abc(3);
		a.abc(5.8);
		a.abc("안녕");
		a.abc(2,3);
		a.abc("땡큐", "감사");
	}
}
