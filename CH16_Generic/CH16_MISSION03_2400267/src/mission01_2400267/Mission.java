package mission01_2400267;

class A{
	//일반 메서드(오버로딩)
	void abc(int a) {
		System.out.println(a);
	}
	void abc(double a) {
		System.out.println(a);
	}
	void abc(String a) {
		System.out.println(a);
	}
	
	//제너릭메서드
	public <T> void bcd(T a) {
		System.out.println(a);
	}
}

public class Mission {
	public static void main(String[] args) {
		
		A a = new A();
		
		//일반메서드 사용
		a.abc(2);
		a.abc(3.5);
		a.abc("안녕");
		System.out.println();
		
		//제너릭메서드 사용
		a.<Integer>bcd(2); 
		//매개변수 타입으로 유투 가능할 때, a.bcd(2)로 생략 가능
		a.<Double>bcd(3.5); 
		a.<String>bcd("안녕");
		
	}
}
