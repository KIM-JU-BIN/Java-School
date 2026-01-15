package mission01_2400267;

import java.awt.print.Printable;

public class Mission {
	public static void main(String[] ar) {
		A a1 = new A();//객체생성
		A a2 = new A();//객체생성
		
		//필드 사용
		a1.name = "홍길동";
		a1.age = 17;
		a2.name = "성춘향";
		a2.age = 18;
		
		System.out.println(a1.name);//홍길동
		System.out.println(a1.age);//17
		System.out.println(a2.name);//성춘향
		System.out.println(a2.age);//18
		
		//메서드 사용
		a1.printName();//홍길동
		a1.printAge();//17
		a2.printName();//성춘향
		a2.printAge();//18
		
	}
}

