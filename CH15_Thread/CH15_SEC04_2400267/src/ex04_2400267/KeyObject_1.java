package ex04_2400267;

/*동기화 메서드 2개와 동기화 블록1개가 다른 열쇠를 사용할 때*/

class MyData{
	//동기화 메서드는 항상 this 키 사용
	synchronized void abc() {
		for(int i=0;i<3;i++) {
			System.out.println(i+"sec");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
	//동기화 메서드는 항상 this 키 사용
	synchronized void bcd() {
		for(int i=0; i<3; i++) {
			System.out.println(i + "초");
			try { Thread.sleep(1000); } catch (InterruptedException e) {}
		}		
	}
	
	//동기화 블록과 동기화 메서드가 다른 키를 사용하기 때문에 abc()와 bcd()는 동시에 실행 됨
	
	void cde() {
		//this 키 사용
		synchronized(new Object()) {
			for(int i=0; i<3; i++) {
				System.out.println(i + "번째");
				try { Thread.sleep(1000); } catch (InterruptedException e) {}
			}
		}
	}
}

public class KeyObject_1 {
	public static void main(String[] args) {
		//#공유객체 생성
		MyData myData = new MyData();
				
		//#세개의 쓰레드가 각각의 메서드 호출
		new Thread() {
			public void run() {
				myData.abc();
			}
		}.start();
		
		new Thread() {
			public void run() {
				myData.bcd();
			}
		}.start();
		
		new Thread() {
			public void run() {
				myData.cde();
			}
		}.start();
		
	}
}
