package mission01_2400267;

class MyException extends Exception {
	public MyException() {
		super();
	}
	public MyException(String message) {
		super(message);		
	}	
}

public class Mission {
	public static void main(String[] args)throws MyException {
		double a=5;//학점은 0.0~4.5를 가짐
		MyException me = new MyException("잘못된 학점");
		
		try {
			if(0>a | a>=4.5) {
				throw me;//출력 예외발생 시점
			}else
				System.out.println("당신의 학점 ="+a);
		}catch(MyException e){
			//전달된 예외객체에 포함된 메세지 출력
			System.out.println(e.getMessage());
			
			System.out.println("학점을 다시 확인하세요");
		}
	}
}
