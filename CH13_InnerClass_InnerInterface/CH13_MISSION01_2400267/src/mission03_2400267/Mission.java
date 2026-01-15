package mission03_2400267;

class A{
	int m=3;
	int n=5;
	void abc() {
		System.out.println("클래스 A의 abc() 메서드");
	}
	class B {//인스턴스멤버 이너클래스
		int m=7;
		int n=9;
		void abc() {
			System.out.println("클래스 A.B의 abc() 메서드");
		}
		void bcd() {			
			System.out.println(A.this.m); //클래스 A 내부의 m
			System.out.println(A.this.n); //클래스 A 내부의 n
			A.this.abc(); //클래스 A 내부의 abc()
			
			System.out.println(m); //this.m, 클래스 B 내부의 m
			System.out.println(n); //this.n, 클래스 B 내부의 n
			abc(); //this.abc(), 클래스 A.B 내부의 abc()
		}		
	}
	
}
public class Mission {
	public static void main(String[] args) {
		A a = new A();
		A.B ab = a.new B();
		ab.bcd();
	}
}
