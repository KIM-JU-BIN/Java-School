package mission03_2400267;

class A {
	int a, b, c;

	A() {
		this(3);
	}

	A(int k) {
		a = k;
		b = k;
		c = k;
	}
		
}

public class Mission {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.a);//3
		System.out.println(a.b);//3
		System.out.println(a.c);//3
	}
}
