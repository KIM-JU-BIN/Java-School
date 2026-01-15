package mission04_2400267;

public class Mission {
	public static void main(String[] args) {
		//Thread 객체 생성(익명이너클래스)
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for(int i = 0; i<10; i++) {
					System.out.print("안녕하세요");
					try {Thread.sleep(500);}catch(InterruptedException e) {}
				}
			}
		});
		t1.start();
		
		//0.1c초 sleep
		try {Thread.sleep(100);}catch(InterruptedException e) {}
		
		//Thread 객체 생성(익명이너클래스)
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for(int i = 0; i<5; i++) {
					System.out.print(" 방가");
					try {Thread.sleep(1000);}catch(InterruptedException e) {}
				}
			}
		});
		t2.start();
		
		try {Thread.sleep(100);}catch(InterruptedException e) {}//0.1c초 sleep
		
		//Thread 객체 생성(익명이너클래스)
//		Thread t3 = new Thread(new Runnable() {
//			public void run() {
//				for(int i = 0; i<10; i++) {
//					System.out.println();
//					try {Thread.sleep(500);}catch(InterruptedException e) {}
//				}
//			}
//		});
//		t3.start();
		//# 객체 생성을 안하고 바로 start() 해버리기
		new Thread (new Runnable() {
			public void run() {
				for(int i = 0; i<10; i++) {
					System.out.println();
					try {Thread.sleep(500);}catch(InterruptedException e) {}
				}
			}
		}).start();
		
		
	}
}
