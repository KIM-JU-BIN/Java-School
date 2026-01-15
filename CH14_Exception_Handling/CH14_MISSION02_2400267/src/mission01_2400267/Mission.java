package mission01_2400267;

public class Mission {
	public static void main(String[] args) {
		//---(영역1). ArithmeticExceptin이 발생하는 초기값 지정
//		int a = 0;		 
//		int[] b = {1,2,3};
//		String c = "12a"; 
//				
		//---(영역2). ArrayIndexOutOfBoundsException이 발생하는 초기값 지정
		int a = 1;		 
		int[] b = {1,2,3};
		String c = "12a";  
				
		//---(영역3). NumberFormat이 발생하는 초기값 지정
//		int a = 1;		 
//		int[] b = {1,2,3,4};
//		String c = "12a"; 
		 

		//# 예외가 발생할 수 있는 코드
		try {
			System.out.println(1/a);
		}catch(ArithmeticException e){
			System.out.println();
		}
		System.out.println(b[3]);
		Integer.parseInt(c);	
	}
}
