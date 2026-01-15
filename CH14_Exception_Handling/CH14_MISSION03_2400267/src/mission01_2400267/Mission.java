package mission01_2400267;

class A {
	
	int a=1;
	int[] b = {1,2,3, 4};
	String c = "12a";
		
	void abc() throws ArrayIndexOutOfBoundsException, NumberFormatException{
		try{
			bcd();
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException 예외 발생");
		}
	}
	void bcd() throws ArithmeticException, ArrayIndexOutOfBoundsException, NumberFormatException{
		try{
			cde();
		}catch(ClassNotFoundException e) {
			System.out.println("ClassNotFoundException 예외 발생");
		}
	}
	void cde() throws ClassNotFoundException, ArithmeticException, ArrayIndexOutOfBoundsException, NumberFormatException{
		//일반예외
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println("InterruptedException 예외 발생");
		}
		Class.forName("java.util.Arrays");
		//실행예외
		System.out.println(b[3]); 
		System.out.println(1/a);
		Integer.parseInt(c);
	}
}

public class Mission {
	public static void main(String[] args) throws NumberFormatException {
		A a = new A();
		try{
			a.abc();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 예외 발생");
		}
		System.out.println("프로그램 정상 종료");
	}
}
