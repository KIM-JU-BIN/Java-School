package ex06_2400267;

public class MethodOverloading {
	public static void main(String[] args) {
		
	}
	public static void print() {
		System.out.println("데이터가 없습니다.");
	}	
	public static void print(int a) {
		System.out.println(a);
	}	
	public static void print(double a) {
		System.out.println(a);
	}
	/* 불가능 (void print(double a) {}와 중복)
	public static void print(double b) { //불가능
		System.out.println(b);
	}
	*/	
	public static void print(int a, int b) {
		System.out.println("a: "+ a + " b: "+b);
	}
	/* 불가능 (void print(int a, int b){}와 중복)
	public static int print(int a, int b) { //불가능
		System.out.println("a: "+ a + " b: "+b);
		return a+b;
	} 
	*/
}
