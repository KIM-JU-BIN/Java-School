package mission04_2400267;

class A{
	public void abc() {
		System.out.println("A클래스의 abc()");
	}
	private void bcd() {
		System.out.println("B클래스의 bcd()");
	}
}
class B extends A{
    public void abc() {//부모클래스이 메서드보다 범위가 넓거나 같아야함
		System.out.println("B클래스의 abc()");
	}
	void bcd() {
		System.out.println("B클래스이 bcd()");
	}
}

public class Mission {
	public static void main(String[] ar) {
		A aa = new A();
		aa.abc();//A클래스의 abc()
//		aa.bcd();//같은 클래스 내에서만 접근 가능
		
		A ab = new B();
		ab.abc();//B클래스의 abc(), 오버라이딩됨
//		ab.bcd();//A클래스를 가르키고 있으므로 bcd()는 private이므로 안 보임
		
		B bb = new B();
		bb.abc();//B클래스의 abc()
		bb.bcd();//B클래스의 bcd()
	}
}
