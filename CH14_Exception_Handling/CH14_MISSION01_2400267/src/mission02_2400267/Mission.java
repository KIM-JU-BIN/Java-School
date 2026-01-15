package mission02_2400267;

class A{int m;}
class B extends A{}
class C extends B{}

public class Mission {
	public static void main(String[] args) {
		//#다운캐스팅
		A a = new B();
		B b = (B)a;
		try{
			C c = (C)a;//실행예외, ClassCastException
		}
		catch(ClassCastException e) {
			System.out.println("ClassCastException 실행예외");
		}
		//#String->기본자료형
		int d = Integer.parseInt("54");
		double e = Double.parseDouble("3.8");
		
//		int f = Integer.parseInt("3.8");//실행예외, NumberFormatException
		double g = Double.parseDouble("54");
		
		//#멤버 사용하기
		A aa = null;
//		System.out.println(aa.m);//실행예외,NullPointerException
		
		System.out.println("프로그램 정상 종료");
	}
}
