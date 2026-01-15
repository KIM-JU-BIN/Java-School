package ex01_2400267.pack2;

/*멤버 및 생성자에 적용되는 네 가지 접근 지정자*/

import ex01_2400267.pack1.A;

public class C {
	public void print() {
		//#객체 생성
		A a = new A();
		
		//#멤버 활용
		System.out.print(a.a+ " "); //가능
		//System.out.print(a.b+ " "); //불가능
		//System.out.print(a.c+ " "); //불가능
		//System.out.print(a.d); //불가능
		System.out.println();
	}
}
