package mission01_2400267;

class A{
	//메서드 동기화는 항상 this 키 사용
	synchronized void abc() {
		for(int i=0;i<5;i++) {
			System.out.println("잔고 확인 후 출금하기");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
	void bcd() {
	//블록 동기화는 Object 객체가 키 사용
		synchronized(new Object()) {
			for(int i=0;i<5;i++) {
				System.out.println("영화관 좌석 예매");
				try {Thread.sleep(1000);} catch (InterruptedException e) {}
			}
		}
	}
}
class Thread1 extends Thread{
	public void run() {
		for(int i=0;i<6;i++) {
			System.out.println(getName());
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
}
class Thread2 extends Thread{
	public void run() {
		for(int i=0;i<6;i++) {
			System.out.println(getName());
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
}

public class Mission {
	public static void main(String[] args) {
		A a = new A();
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				a.abc();
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				a.abc();
			}
		});
		Thread t3 = new Thread(new Runnable() {
			public void run() {
				a.bcd();
			}
		});
		Thread t4 = new Thread(new Runnable() {
			public void run() {
				a.bcd();
			}
		});
		
		t1.start();//메서드 동기화
		t2.start();//메서드 동기화
		t3.start();//블록 동기화
		t4.start();//블록 동기화
		
		//총 실행 시간이 10초인 이유?
		//메서드 동기화와 블록 동기화는 각각 다른 키를 사용하고 있으므로 동시에 실행이 가능하다.
		//t1,t2중에서 하나와 t3,t4중에서 하나 동시에 실행=>5초
		//나머지 2개 동시에 실행=>5초
		//그래서 총 10초 걸림
	}
}
