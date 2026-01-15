package mission01_2400267;

class Thread1 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<3; i++) {//3초 동안 이름 출력
			System.out.println(getName());
			try {Thread.sleep(1000);}catch(InterruptedException e) {}
		}
	}
}
class Thread2 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<6; i++) {//6초 동안 이름 출력
			System.out.println(getName());
			try {Thread.sleep(1000);}catch(InterruptedException e) {}
		}
	}
}

public class Mission {
	public static void main(String[] args) {
		Thread t1 = new Thread1();
		t1.setName("쓰레드1");
		t1.start();
		try {Thread.sleep(100);}catch(InterruptedException e) {}
		
		Thread t2 = new Thread2();
		t2.setName("쓰레드2");
		t2.start();
		try {Thread.sleep(100);}catch(InterruptedException e) {}
	
		for(int i=0; i<9; i++) {
			Thread curThread = Thread.currentThread();
			System.out.println(curThread.getName());
			System.out.println("현재 동작 중인 쓰레드 수 " + Thread.activeCount());
			try {Thread.sleep(1000);}catch(InterruptedException e) {}
		}
	}
}
