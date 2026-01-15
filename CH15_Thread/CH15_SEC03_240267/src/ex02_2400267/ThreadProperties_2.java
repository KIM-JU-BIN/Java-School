package ex02_2400267;

/*쓰레드의 우선순위(priority)*/

//우선순위
class MyThread extends Thread{
	@Override
	public void run() {
		long sum=0;
		//시간 지연용 for 문
		for(long i=0; i<1_00_000_000; i++) {
			sum+=i;
		}
		System.out.println(getName() + " 우선순위: "+ getPriority());//자동으로 메서드 앞에 this가 붙음
	}
}
public class ThreadProperties_2 {
	public static void main(String[] args) {
		
		//#참고. CPU core
		System.out.println("코어 수: "+ Runtime.getRuntime().availableProcessors());//8
		
		//#1. 디폴트 우선순위(출력되는 순서는 정해지지 않음)
		for(int i=0; i<3; i++) {
			Thread thread = new MyThread();
			thread.start();
		}
		
		try { Thread.sleep(1000); } catch (InterruptedException e) {}
		
		//#2. 2개 쓰레드 생성 및 우선순위를 직접 지정
		Thread thread_lowPriority = new MyThread();
		thread_lowPriority.setPriority(Thread.MIN_PRIORITY);
		thread_lowPriority.setName("LowPriority 쓰레드");
		
		Thread thread_highPriority = new MyThread();
		thread_highPriority.setPriority(Thread.MAX_PRIORITY);
		thread_highPriority.setName("HighPriority 쓰레드");
		
		//#3. 낮은 우선순위 쓰레드 먼저 시작 + 1ms 지연 + 높은 우선순위 쓰레드 시작
		//순서가 어떻게 나올지 아무도 몰루
		thread_lowPriority.start();//낮은 priority 먼저 시작
		try {Thread.sleep(1);} catch (InterruptedException e) {}
		thread_highPriority.start();//높은 priority 1ms 나중 시작
	}
}
