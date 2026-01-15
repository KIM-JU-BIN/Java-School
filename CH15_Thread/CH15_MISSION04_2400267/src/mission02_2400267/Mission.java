package mission02_2400267;

class A{
	synchronized void abc() {
		for(int i=0;i<3;i++) {
			System.out.println("클래스 A의 abc() 메서드");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
	synchronized void bcd() {
		for(int i=0;i<3;i++) {
			System.out.println("클래스 A의 bcd() 메서드");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
	void cde() {
		synchronized(this) {
			for(int i=0;i<3;i++) {
				System.out.println("클래스 A의 cde() 메서드");
				try {Thread.sleep(1000);} catch (InterruptedException e) {}
			}
		}
	}
	void def() {
		synchronized(this) {
			for(int i=0;i<3;i++) {
				System.out.println("클래스 A의 def() 메서드");
				try {Thread.sleep(1000);} catch (InterruptedException e) {}
			}
		}
	}
	void efg() {
		synchronized(new Object()) {
			for(int i=0;i<3;i++) {
				System.out.println("클래스 A의 efg() 메서드");
				try {Thread.sleep(1000);} catch (InterruptedException e) {}
			}
		}
	}
	void fgh() {
		synchronized(new Object()) {
			for(int i=0;i<3;i++) {
				System.out.println("클래스 A의 fgh() 메서드");
				try {Thread.sleep(1000);} catch (InterruptedException e) {}
			}
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
				a.bcd();
			}
		});
		Thread t3 = new Thread(new Runnable() {
			public void run() {
				a.cde();
			}
		});
		Thread t4 = new Thread(new Runnable() {
			public void run() {
				a.def();
			}
		});
		Thread t5 = new Thread(new Runnable() {
			public void run() {
				a.efg();
			}
		});
		Thread t6 = new Thread(new Runnable() {
			public void run() {
				a.fgh();
			}
		});
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		
		//실행 시간 12초인 이유는?
		//abc()~def()까지는 같은 키를 사용하고 있으므로 동시에 실행될 수 없다.
		//efg(),fgh()끼리도 같은 키를 공류하고 있기 때문에 동시에 실행 할 수 없다.
		//하지만 abc()~def()와 efg()~fgh()는 다른 동기화 키를 사용하고 있으므로 다른 키를 사용하는
		//메서드들 끼리는 동시에 실행이 가능하다
		//t1~t4중 하나와 t5~t6중 하나 동시 실행=>3초
		//위에서 실행한 객체 t1~t4중 하나와 t5~t6중 하나 동시 실행=>3초
		//나머지 2개의 객체(메서드 동기화)는 각각 실행=>6초
		//그래서 총 12초 실행
	}
}
