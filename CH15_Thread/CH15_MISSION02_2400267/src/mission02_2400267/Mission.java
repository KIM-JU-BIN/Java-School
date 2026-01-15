package mission02_2400267;

class Runnable1 implements Runnable{
//	@override
	public void run() {
		//0.5초마다 10번 출력
		for(int i = 0; i<10;i++) {
			System.out.print("안녕하세요");
			try {Thread.sleep(500);}catch(InterruptedException e) {}
		}
	}
}
class Runnable2 implements Runnable{
//	@override
	public void run() {
//		1초마다 5번 출력
		for(int i = 0; i<5;i++) {
			System.out.print(" 방가");
			try {Thread.sleep(1000);}catch(InterruptedException e) {}
		}
	}
}
class Runnable3 implements Runnable{
//	@override
	public void run() {
		for(int i = 0; i<10;i++) {
			System.out.println();
			try {Thread.sleep(500);}catch(InterruptedException e) {}
		}
	}
}

public class Mission {
	public static void main(String[] args) {
		//Runnable1객체 생성
		Runnable1 r1 = new Runnable1();
		//Thread 객체 생성(생성자로 r1 전달)
		Thread t1 = new Thread(r1);
		t1.start();
		
		//0.1c초 sleep
		try {Thread.sleep(100);}catch(InterruptedException e) {}
		
		//Runnable2객체 생성
		Runnable2 r2 = new Runnable2();
		//Thread 객체 생성(생성자로 r2 전달)
		Thread t2 = new Thread(r2);
		t2.start();
		
		//0.1c초 sleep
		try {Thread.sleep(100);}catch(InterruptedException e) {}
		
		//Runnable3객체 생성
		Runnable3 r3 = new Runnable3();
		//Thread 객체 생성(생성자로 r3 전달)
		Thread t3 = new Thread(r3);
		t3.start();
		
	}
}
