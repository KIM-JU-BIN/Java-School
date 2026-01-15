package mission03_2400267;

public class Mission {
	public static void main(String[] args) {
		//Runnable1객체 생성(익명이너클래스)
		Runnable r1 = new Runnable() {
			public void run() {
				for(int i = 0; i<10; i++) {
					System.out.print("안녕하세요");
					try {Thread.sleep(500);}catch(InterruptedException e) {}
				}
			}
		};
		//Thread 객체 생성(생성자로 r1 전달)
		Thread t1 = new Thread(r1);
		t1.start();
		
		//0.1c초 sleep
		try {Thread.sleep(100);}catch(InterruptedException e) {}
		
		//Runnable2객체 생성(익명이너클래스)
		Runnable r2 = new Runnable() {
			public void run() {
				for(int i = 0; i<5; i++) {
					System.out.print(" 방가");
					try {Thread.sleep(1000);}catch(InterruptedException e) {}
				}
			}
		};
		//Thread 객체 생성(생성자로 r2 전달)
		Thread t2 = new Thread(r2);
		t2.start();
		
		//0.1c초 sleep
		try {Thread.sleep(100);}catch(InterruptedException e) {}
		
		//Runnable2객체 생성(익명이너클래스)
		Runnable r3 = new Runnable() {
			public void run() {
				for(int i = 0; i<10; i++) {
					System.out.println();
					try {Thread.sleep(500);}catch(InterruptedException e) {}
				}
			}
		};
		//Thread 객체 생성(생성자로 r3 전달)
		Thread t3 = new Thread(r3);
		t3.start();
	}
}
