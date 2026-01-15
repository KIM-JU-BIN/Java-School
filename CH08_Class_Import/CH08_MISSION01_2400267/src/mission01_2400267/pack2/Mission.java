package mission01_2400267.pack2;

public class Mission {
	public static void main(String[] args) {
		mission01_2400267.pack1.A a = new mission01_2400267.pack1.A();
		
		System.out.println(a.m);//3
		System.out.println(a.n);//5
		
		a.abc();//Hello
		a.bcd();//Good Morning
	}
}

class B{
	int k = 3;
	void bbb() {
		System.out.println("Hi");
	}
}
