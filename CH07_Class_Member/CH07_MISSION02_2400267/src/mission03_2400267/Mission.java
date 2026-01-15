package mission03_2400267;

class A{
	int m=3;
	int n=5;
	void abc() {
		System.out.println("abc() 메서드");
	}
	void bcd(int a) {
		System.out.println("bcd() 메서드" + " 매개변수:"+a);
	}
	void cde() {
		System.out.println(m);
		System.out.println(n);
		abc();
		bcd(7);
	}
}

public class Mission {
	public static void main(String[] args) {
		A a = new A();
		a.cde();
	}
}
