package ex01_2400267.pack1;

public class B {
	public void print() {
		//#객체 생성
		A a = new A();//class A는 public이므로 객체 생성가능
		
		//#멤버 활용
		System.out.print(a.a+" ");//가능
		System.out.print(a.b+ " "); //가능
		System.out.print(a.c+ " "); //가능
		//System.out.print(a.d); //불가능
		System.out.println();
	}
}
