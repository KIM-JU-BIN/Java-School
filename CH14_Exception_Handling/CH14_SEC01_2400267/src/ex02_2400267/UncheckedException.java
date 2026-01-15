package ex02_2400267;

/*대표적인 실행예외(UnChecked Exception) : 예외처리 옵션(예외 발생시 실행 중 오류남)*/

class A{}
class B extends A{}

public class UncheckedException {
	public static void main(String[] args) {
		
		//#UncheckedException (실행예외) = RuntimeException
		
		//#1. ArithmeticException
		System.out.println(3/0);
		
		//#2. ClassCastException
		A a = new A();
		B b = (B)a;
		
		//#3. ArrayIndexOutOfBoundException
		int[] array = {1,2,3};
		System.out.println(array[3]);
		
		//#4. NumberFormatException
		int num = Integer.parseInt("10!");
		
		//#5. NullPointerException
		String str = null;
		System.out.println(str.charAt(2));
	}
}
