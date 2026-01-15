package ex01_2400267.method2;

/*외부패키지의 클래스 사용방법 #2 (임포트 구문 사용)*/

import ex01_2400267.common.A; 

public class PackageImport_2 {
	public static void main(String[] args) {		
		//#1. 객체생성
		A a = new A(); //정상동작
		
		//#2. 멤버활용
		System.out.println(a.m); //3
		System.out.println(a.n); //4
		a.print(); //임포트
	}
}
