package mission01_2400267;

class A{
	void abc() {
		System.out.println("안녕");
	}
	void bcd(int i) {
		System.out.println("입력값 = " + i);
	}
	int cde(int j) {
		return j*2;
	}
	String def(String a, int b) {
		return "이름:" + a + " 나이:" + b;
	}
}
public class Mission {
	public static void main(String[] args) {
		A a = new A();
		a.abc();//안녕
		a.bcd(3);//입력값=3
		int m = a.cde(5);//입력값의 2배
		System.out.println(m);//10
		String n = a.def("홍길동", 16);
		System.out.println(n);//이름: 홍길동 나이: 16
	}
}
