package mission01_2400267;

class Thread1 extends Thread{
//	@override
	public void run() {
		//0.5초마다 10번 출력
		for(int i = 0; i<10;i++) {
			System.out.print("안녕하세요");
			try {Thread.sleep(500);}catch(InterruptedException e) {}
		}
	}
}
class Thread2 extends Thread{
//	@override
	public void run() {
//		1초마다 5번 출력
		for(int i = 0; i<5;i++) {
			System.out.print(" 방가");
			try {Thread.sleep(1000);}catch(InterruptedException e) {}
		}
	}
}
class Thread3 extends Thread{
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
		Thread1 t1 = new Thread1();
		t1.start();
		
		try {Thread.sleep(100);}catch(InterruptedException e) {}
		
		Thread2 t2 = new Thread2();
		t2.start();
		
		try {Thread.sleep(100);}catch(InterruptedException e) {}
		
		Thread3 t3 = new Thread3();
		t3.start();
		
	}
}
