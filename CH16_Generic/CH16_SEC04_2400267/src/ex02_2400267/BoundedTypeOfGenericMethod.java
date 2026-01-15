package ex02_2400267;

/*제네릭 메서드에서의 제네릭 타입 제한 범위 설정*/

class A{
	public <T extends Number> void method1(T t) {
		System.out.println(t.intValue());
	}
}
interface MyInterface{
	public abstract void print();
}
class B{
	public <T extends MyInterface> void method1(T t) {
		t.print();
	}
}

public class BoundedTypeOfGenericMethod {
	public static void main(String[] args) {
		A a = new A();
		a.method1(5.8);// = a.<Double>method1(5.8);
		
		B b = new B();
		b.method1(new MyInterface() {
			public void print() {
				System.out.println("print() 구현");
			}
		});
	}
}
