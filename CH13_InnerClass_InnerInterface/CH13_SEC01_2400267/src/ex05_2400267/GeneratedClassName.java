package ex05_2400267;
/*지역이너클래스의 컴파일 이후 생성 클래스 파일*/

class A{//A.class
	void abc() {
		class B{}//A$1B.class
		class C{}//A$1C.class
	}
	void bcd() {
		class C{}//A$2C.class
		class D{}//A$1D.class
	}
}
public class GeneratedClassName {
	public static void main(String[] args) {
	
	}
}
