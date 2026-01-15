package mission05_2400267;

class Thread1 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("안녕하세요");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
}
class Thread2 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("방가");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
}

public class Mission {
	public static void main(String[] args) {
		
		Thread t1 = new Thread1();
		t1.setName("쓰레드1");
		t1.setDaemon(false);//일반쓰레드
		t1.start();
		
		try {Thread.sleep(100);} catch (InterruptedException e) {}
		
		Thread t2 = new Thread2();
		t2.setName("쓰레드2");
		t2.setDaemon(false);//일반쓰레드
		t2.start();
		
		try {Thread.sleep(7500);} catch (InterruptedException e) {}
		System.out.println("main 쓰레드 종료");
	}
}
