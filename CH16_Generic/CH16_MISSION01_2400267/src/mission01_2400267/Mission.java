package mission01_2400267;

class A{
	int m;
	public void set(Integer m) {
		this.m = m;
	}
	public Integer get() {
		return m;
	}
}
class B{
	String n;
	public void set(String n) {
		this.n = n;
	}
	public String get() {
		return n;
	}
}

public class Mission {
	public static void main(String[] args) {
		
		A a = new A();
		a.set(3);//m에 3을 저장
		System.out.println(a.get());//3
		
		//# 오류코드(약한타입체크)
//		a.set("안녕");
//		a 참조변수의 set()메서드는 Integer 타입을 매개변수로 받는데 String 타입을
//		넣었기 떄문에 오류가 난다.
		
		B b = new B();
		b.set("안녕");//n에 "안녕" 저장
		System.out.println(b.get());//안녕
		
		//# 오류코드(약한타입체크)
//		b.set(3);
//		b 참조변수의 set메서드는 String 타입을 매개변수로 받는데 int 타입으로
//		넣었기 때문에 오류가 난다
//		
		
	}
}
