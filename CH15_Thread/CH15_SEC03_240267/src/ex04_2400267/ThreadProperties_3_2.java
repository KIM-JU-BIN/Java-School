package ex04_2400267;

/*쓰레드의 데몬 설정 ② 데몬 쓰레드*/
class MyThread extends Thread{
	public void run() {
		System.out.println(getName() + ":" + (isDaemon()? "데몬쓰레드" : "일반쓰레드"));
		for(int i=0; i<6; i++) {
			System.out.println(getName() + ":" + i + "초");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
}

public class ThreadProperties_3_2 {
	public static void main(String[] ar){
		
//		//# 일반쓰레드 - main쓰레드 종료 후에도 진행
//		Thread thread1 = new MyThread();
//		thread1.setDaemon(false);//디폴트
//		thread1.setName("thread1");
//		thread1.start();
		
		//# 데몬쓰레드 - main 쓰레드 종료후 같이 종료 됨
		Thread thread2 = new MyThread();
		thread2.setDaemon(true);
		thread2.setName("thread2");
		thread2.start();
		
		//# 3.5초 후 main Thread 종료
		try {Thread.sleep(3500);}catch(InterruptedException e) {}
		System.out.println("main Thread 종료");
	}
}
