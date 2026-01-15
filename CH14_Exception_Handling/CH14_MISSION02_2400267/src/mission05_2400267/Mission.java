package mission05_2400267;

public class Mission {
	public static void main(String[] args) {
		//---(영역1). ArithmeticExceptio이 발생하는 초기값 지정
//		int a = 0;		 
//		int[] b = new  int[3];
//		String c = "12a"; 
//				
		//---(영역2). ArrayIndexOutOfBoundsException이 발생하는 초기값 지정
//		int a = 1;		 
//		int[] b = new  int[3];
//		String c = "12a";  
				
		//---(영역3). NumberFormat이 발생하는 초기값 지정
		int a = 1;		 
		int[] b = new  int[4];
		String c = "12a"; 
		
		
		//# 예외가 발생할 수 있는 코드
		try {
			System.out.println(1/a);
			System.out.println(b[3]);
			Integer.parseInt(c);
		}catch(ArithmeticException | NumberFormatException e){
			System.out.println("ArithmeticException 또는 NumberFormatException 발생");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException 발생");
		}finally {
			System.out.println("프로그램 정상종료");
			System.out.println("안녕히가세요");
		}
	}
}
