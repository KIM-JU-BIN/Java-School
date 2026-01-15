package ex03_2400267;

/*여러 개의 예외 한꺼번에 전가하기*/

//#1. 여러 개의 예외를 하위메서드에 직접 예외를 처리하는 경우
class A {
	
	void abc() {
		bcd();
	}	
	void bcd() {
		try {
			Class cls = Class.forName("java.lang.Object"); //일반예외 : ClassNotFoundException
			Thread.sleep(1000); //일반예외 : InterruptedException
		} catch (InterruptedException | ClassNotFoundException e) {
			//예외처리 구문
		} 
	}
}

//#2. 여러 개의 예외를 예외를 호출 메서드로 전가하는 경우
class B {
	void abc() {		
		try {
			bcd(); //일반예외 : InterruptedException
		} catch (InterruptedException | ClassNotFoundException e) {
			//예외처리 구문
		}
	}
	void bcd() throws InterruptedException, ClassNotFoundException {
		Class cls = Class.forName("java.lang.Object"); //일반예외 : ClassNotFoundException
		Thread.sleep(1000); //일반예외 : InterruptedException
	}
}

public class ThrowsException_3 {
	public static void main(String[] args) {
	
	}
}
