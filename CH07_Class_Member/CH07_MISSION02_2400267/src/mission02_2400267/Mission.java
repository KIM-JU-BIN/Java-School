package mission02_2400267;

class A{
	int m=3;
	int n=4;
	
	void abc(int a, double b ) {
		System.out.println("두 수의 합 : "+ (a+b));
	}
	
	void bcd(String name) {
		System.out.println("당신의 이름은 "+name);
	}
	
	double cde(double a, double b) { //'첫번째 실수 * 두번째 실수의 곱'을 반환		
		double c = a*b;		
		return c;
	}
	String def() {		 
		return "필드 m:"+m +", 필드 n:"+n;		
	}
}

public class Mission {
	public static void main(String[] args) {
		//객체 생성
		A a= new A();
		
		//메소드 호출
		a.abc(2, 3.7);
		a.bcd("유재석");
		
		double k = a.cde(5.6, 6.9);
		System.out.println("두 수의 곱: " + k);
		String i = a.def();
		System.out.println(i);
	}
}
