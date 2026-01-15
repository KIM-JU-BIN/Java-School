package mission02_2400267;

class EvenCheckException extends Exception {
	public EvenCheckException() {
		super();		
	}
	public EvenCheckException(String message) {
		super(message);		
	}	
}
class A{
	void abc(int m) {
		try {
			if(m%2==1) {
				System.out.println("입력된 숫자 = "+m);
			}else {
				throw new EvenCheckException("짝수가 전달되었습니다. ");
			}
		}catch(EvenCheckException e) {
			System.out.println(e.getMessage()+"예외발생");
		}
	}
}
public class Mission {
	public static void main(String[] args) {
		A a = new A();
		a.abc(1);//입력한 숫자 = 1
		a.abc(3);//입력한 숫자 = 3
		a.abc(6);//짝수가 전달되었습니다. 예외발생
	}
}
