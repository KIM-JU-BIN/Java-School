package ex03_2400267;

/*다른 패키지에서의 클래스 접근지정자 vs. 생성자 접근지정자*/

import ex03_2400267.pack.AA;
//import ex03_학번.BB; //불가능, 클래스가 public이 아니기때문에 import불가
import ex03_2400267.pack.CC;

public class AccessModifierOfClass_2 {
	public static void main(String[] args) {
		//#1. 객체 생성
		AA a = new AA(); //객체생성가능(A a) + 생성자 호출 가능(new AA())
		//BB b = new BB(); //객체생성불가능(BB b)
		//CC c = new CC(); //객체생성가능(CC c) + 생성자 호출 불가능(new CC())

	}
}
