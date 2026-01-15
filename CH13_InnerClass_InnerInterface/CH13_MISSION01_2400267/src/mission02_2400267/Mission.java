package mission02_2400267;

class A{
	int m=2;//인스턴스 필드
	void abc() {//인스턴스 메서드
		System.out.println("A 클래스의 abc() 메서드");
	}
	class B{//인스턴스멤버 이너클래스
		int n=3;//인스턴스 필드
		void bcd() {
			System.out.println("A.B 클래스의 bcd()메서드");
		}
	}
	class C{//인스턴스멤버 이너클래스
		int p=4;//인스턴스 필드
		void cde() {
			System.out.println("A.C 클래스의 cde() 메서드");
		}
	}
}

public class Mission {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.m);//2
		a.abc();//A 클래스의 abc() 메서드
		
		A.B ab = a.new B();
		System.out.println(ab.n);//3
		ab.bcd();//A.B 클래스의 bcd()메서드
		
		A.C ac = a.new C();
		System.out.println(ac.p);//4
		ac.cde();//A.C 클래스의 cde() 메서드
	}
}
