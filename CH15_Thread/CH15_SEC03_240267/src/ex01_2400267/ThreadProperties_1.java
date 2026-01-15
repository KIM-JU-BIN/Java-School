package ex01_2400267;

/*쓰레드 객체의 속성 다루기(쓰레드 객체 가져오기/ 이름설정/ 쓰레드 수)*/

public class ThreadProperties_1 {
	public static void main(String[] args) {
		//#1. 객체가져오기 (currentThread()) / 쓰레드 수 (activeCount())
		Thread curThread = Thread.currentThread();//정적 메서드
		System.out.println("현재 쓰레드의 이름 = " + curThread.getName());//main, 인스턴스 메서드
		System.out.println("동작하는 쓰레스 수 = " + Thread.activeCount());//1개, 인스턴스 메서드
		
		//#2. 쓰레드 이름 지정 (자동지정)
		for(int i=0; i<3; i++) {//3개 만들음
			Thread thread = new Thread();
			System.out.println(thread.getName());//Thread-0~2, 인스턴스 메서드
			thread.start();
		}
		
		//#3. 쓰레드 이름 직접 지정
		for(int i=0; i<3; i++) {//3개 만들음
			Thread thread = new Thread();
			thread.setName(i+"번째 쓰레드");
			System.out.println(thread.getName());//0번째 쓰레드~2번째 쓰레드, 인스턴스 메서드
			thread.start();
		}
		
		//#4. 쓰레드 이름 지정 (자동지정)
		for(int i=0; i<3; i++) {//3개 만들음
			Thread thread = new Thread();
			System.out.println(thread.getName());//Thread-6~8, 인스턴스 메서드
			thread.start();
		}
		
		//#5. 쓰레드 수 
		System.out.println("동작하는 쓰레스 수 = " + Thread.activeCount());//동작하는 쓰레드 수는 PC의 성능에 따라 다르게 나옴
	}
}
