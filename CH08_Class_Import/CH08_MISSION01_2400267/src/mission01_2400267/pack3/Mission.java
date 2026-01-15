package mission01_2400267.pack3;

import mission01_2400267.pack1.A;
//import mission01_2400267.pack2.B;

public class Mission {
	public static void main(String[] args) {
		A a = new A();
		
		System.out.println(a.m);
		System.out.println(a.n);
		
		a.abc();
		a.bcd();
		
		
		//B클래스가 public이 아니면 import불가 다른 패키지에서 접근이 불가하다.
	}
}
