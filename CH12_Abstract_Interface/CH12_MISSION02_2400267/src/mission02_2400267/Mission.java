package mission02_2400267;

interface A{
	public static final int m=3;//정적 메서드는 정의되어야 함, public static final int m=3;
	public abstract void abc();//public abstract void abc();
}

class B implements A{
	public void abc() {//부모의 접근지정자보다 작을 수 없음
		System.out.println("B 클래스의 abc() 메서드");
	}
}

public class Mission {
	public static void main(String[] args) {
		A a = new B();
//		System.out.println(A.m);//정적 필드 출력
		System.out.println(a.m);//참조변수를 이용한 필드 출력
		a.abc();
	}
}
