package ex01_2400267;

/*멤버 및 생성자에 적용되는 네 가지 접근 지정자*/

import ex01_2400267.pack1.A;
import ex01_2400267.pack1.B;
import ex01_2400267.pack2.C;
import ex01_2400267.pack2.D;

public class AccessModifierOfMember {
	public static void main(String[] args) {
		//객체 생성
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		//멤버 활용
		a.print();//1 2 3 4
		b.print();//1 2 3
		c.print();//1
		d.print();//1 2
	}
}
