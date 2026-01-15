package ex01_2400267.pack1;

/*멤버 및 생성자에 적용되는 네 가지 접근 지정자*/

public class A {
	public int a=1;//모든 패키지, 모든 클래스
	protected int b=2;//동일 패키지, 자식 클래스
	int c=3;//default=package 동일 패키지
	private int d=4;//동일 클래스
	
	public void print() {
		System.out.print(a+ " "); //가능
		System.out.print(b+ " "); //가능
		System.out.print(c+ " "); //가능
		System.out.print(d); //가능
		System.out.println();
	}
}
