package ex01_2400267;

/*직접 예외 처리를 할 때와 호출메서드로 예외를 전가할 때*/

//#1. 하위메서드에 직접 예외를 처리하는 경우
class A {
	void abc() {
		bcd();
	}	
	void bcd() {
		try {
			Thread.sleep(1000); //일반예외 : InterruptedException
		} catch (InterruptedException e) {
			//예외처리 구문
		} 
	}
}

//#2. 예외를 호출 메서드로 전가하는 경우
class B {
	void abc() {		
		try {
			bcd(); //일반예외 : InterruptedException
		} catch (InterruptedException e) {
			//예외처리 구문
		}
	}
	void bcd() throws InterruptedException {
		Thread.sleep(1000); //일반예외 : InterruptedException
	}
}
public class ThrowsException_1 {
	public static void main(String[] args) {
		
	}
}
