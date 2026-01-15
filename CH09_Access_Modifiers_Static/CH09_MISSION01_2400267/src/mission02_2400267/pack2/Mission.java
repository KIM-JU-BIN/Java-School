package mission02_2400267.pack2;

import mission02_2400267.pack1.A;
//import mission02_2400267.pack1.B; //클래스가 default라서 불러오지 못함
import mission02_2400267.pack1.C;
//import mission02_2400267.pack1.D; //클래스가 default라서 불러오지 못함

public class Mission {
	public static void main(String[] args) {
		//#객체 생성
		A a = new A();
//		B b = new B(); //class가 public이 아니라서 객체 생성 불가(B b)
//		C c = new C(); //class는 public이지만 생성자는 default이므로 가져오지 못함, 객체 생성 가능(C c) + 생성자 호출 불가능(new C())
//		D d = new D(); //class가 public이 아니라서 객체 생성 불가능(D d)
		
		
	}
}
