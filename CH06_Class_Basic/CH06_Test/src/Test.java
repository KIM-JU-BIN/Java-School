

public class Test {
	public static void main(String[] args) {//main메서드 1개 => 멤버 1개
		int a = 3;//지역변수
		//객체 생성
		A a1 = new A();
		A a2 = new A();
		
		//#필드를 사용 (값을 넣거나 읽느 것)
		a1.m = 5;
		a1.n = 5.8;
		a2.m = 8;
		a2.n = 8.8;
		
		//#메서드를 사용
		a1.abc();
		a2.abc();
	}
}
