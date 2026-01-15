package mission01_2400267;

class A{//A.class
	static interface B{//A$B.class
		public abstract void bcd();
	}
}
class C implements A.B{//C.class
	 public void bcd() {//public 무조건 쓰기
		System.out.println("자식클래스를 직접 생성하여 bcd() 메서드 구현");
	}
}

public class Mission {//Mission.class
	public static void main(String[] args) {
		//1.자식클래스 사용
		C c = new C();
		c.bcd();//자식클래스를 직접 생성하여 bcd() 메서드 구현
		
		//2.익명클래스 사용
		A.B ab = new A.B() {
			public void bcd() {
				System.out.println("익명이너클래스 방법을 사용하여 bcd() 메서드 구현");
			}
		};
		ab.bcd();//익명이너클래스 방법을 사용하여 bcd() 메서드 구현
	}
}
