package mission05_2400267;

class A{
	int m = 3;
	void abc() {
		int n = 5;//final int n=5, 지역변수
		class B{//지역이너클래스
			void bcd() {
				System.out.println(m);//A.this.m=3
				System.out.println(n);//5
				m=30;
//				n=50;//지역이너클래스에서 사용하는 지역변수는 자동으로 final로 선언=>값 변경X
			}
		}
//		int n=7;//여기서 값 바꾸면 오류남, 이미 class B때문에 지역변수가 final로 바뀌기때문 
		//지역이너클래스는 반드시 클래스 끝나면 바로 객체 생성
		B b = new B();
		b.bcd();
	}
}

public class Mission {
	public static void main(String[] args) {
		A a = new A();
		a.abc();
	}
}	
