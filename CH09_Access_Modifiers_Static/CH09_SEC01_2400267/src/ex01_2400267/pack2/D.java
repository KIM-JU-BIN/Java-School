package ex01_2400267.pack2;

/*멤버 및 생성자에 적용되는 네 가지 접근 지정자*/

import ex01_2400267.pack1.A;

public class D extends A{//D 클래스는 A 클래스의 자식 클래스이다.
	public void print() {
		System.out.print(a+ " "); //가능
		System.out.print(b+ " "); //가능
		//System.out.print(c+ " "); //불가능
		//System.out.print(d); //불가능
		System.out.println();
	}

}
