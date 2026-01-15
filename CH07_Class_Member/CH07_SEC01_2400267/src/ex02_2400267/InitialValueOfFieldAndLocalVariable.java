package ex02_2400267;

/*필드와 지역변수의 초기값*/

//#1 클래스 생성(정의)
class A {
	boolean m1;//필드
	int m2;//필드
	double m3;//필드
	String m4;//필드
	void printFieldValue () {
		System.out.println(m1); //false
		System.out.println(m2); //0
		System.out.println(m3); //0.0
		System.out.println(m4); //null: 객체를 가리키지 않고 있다.
	}	
	void printLocalVariable() {
		int k;//지역변수, stack메모리에 저장되므로 자동으로 초기화X
		//System.out.println(k); //지역변수는 반드시 초기화하여야 함
	}
}

public class InitialValueOfFieldAndLocalVariable {
	public static void main(String[] args) {		
		//#2. 클래스를 활용하여 객체 생성
		A a = new A();	
		
		//#3. 객체활용
		a.printFieldValue();//false 0 0.0 null
	}
}
