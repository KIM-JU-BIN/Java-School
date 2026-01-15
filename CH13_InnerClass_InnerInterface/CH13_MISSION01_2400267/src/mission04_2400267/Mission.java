package mission04_2400267;

class A{
	int m=3;
	static int n=4;
	void aaa1() {
		System.out.println("클래스 A의 aaa1()메서드");
	}
	static void aaa2() {
		System.out.println("클래스 A의 aaa2() 메서드");
	}
	static class B{//정적이너클래스
		static void bbb1() {
//			System.out.println(m);//static class는 static 멤버만 올 수 있음
			System.out.println(n);
//			aaa1();//static class는 static멤버만 올 수 있음
			aaa2();
		}
		void bbb2() {
//			System.out.println(m);//static class는 static 멤버만 올 수 있음
			System.out.println(n);
//			aaa1();//static class는 static 멤버만 올 수 있음
			aaa2();
		}
	}
}

public class Mission {
	public static void main(String[] args) {
		A.B ab = new A.B();
		ab.bbb1();
		ab.bbb2();
	}
}
