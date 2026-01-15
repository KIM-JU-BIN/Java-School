class A{
	//같은 공간에 메서드의 시그니처가 다른 애들들이 존재하는 걸 메서드 오버라이딩
	void abc() {
		
	}
	void abc(int a) {
		
	}
	void abc(int a, int b) {
		
	}
	void abc(int a, int b, int c) {
	
	}
	void abc(int a, int b, int c, int d) {
	
	}
}
class B{
	void bcd(int... a) {//int들만 주면 1차원 배열로 저장됨
		int sum=0;
		for(int k : a) {
			sum+=k;
		}
		System.out.println(sum);
	}
}
public class Test2 {
	public static void main(String[] args) {
		//객체 생성
		A a = new A();
		
		//메서드 호출
		a.abc();
		a.abc(1);
		a.abc(1,2);
		a.abc(1,2,3);
		a.abc(1,2,3,4);
		
		//객체생성
		B b = new B();
		
		//메서드 호출(배열로 처리됨)
		b.bcd();//0개짜리 배열 1개
		b.bcd(1);
		b.bcd(1,2);
		b.bcd(1,2,3);
		b.bcd(1,2,3,4);//4개짜리 배열 1개
	}
}
