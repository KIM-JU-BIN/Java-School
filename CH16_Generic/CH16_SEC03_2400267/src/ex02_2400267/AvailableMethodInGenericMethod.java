package ex02_2400267;

/*제네릭 메서드 내부에서 사용할 수 있는 메서드*/
class A{
	public <T> void method(T t) {
//		System.out.println(t.length());//불가능 : Object 메서드만 호출가능
		System.out.println(t.equals("안녕"));//Object 메서드만 호출가능
	}
}

public class AvailableMethodInGenericMethod {
	public static void main(String[] args) {
		
		A a = new A();
		a.<String>method("안녕");
		
	}
}
