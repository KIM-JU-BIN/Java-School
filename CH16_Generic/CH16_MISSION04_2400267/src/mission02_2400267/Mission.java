package mission02_2400267;

class A{
	void print() {
		System.out.println("클래스 A의 print() 메서드");
	}
}
class B extends A{
	void print() {
		System.out.println("클래스 B의 print() 메서드");
	}
}
class C extends B{
	void print() {
		System.out.println("클래스 C의 print() 메서드");
	}
}
class D extends C{
	void print() {
		System.out.println("클래스 D의 print() 메서드");
	}
}

class G{
	<T extends B> void print(T t) {//B와 B의 자식클래스의 객체만 매개변수로 받음
		t.print();
	}
}
public class Mission {
	public static void main(String[] args) {
		
		G g = new G();
//		g.<A>print(new A());//오류 발생, B와 B의 자식클래스의 객체만 매개변수로 받을 수 있음
		g.<B>print(new B()); //클래스 B의 print()메서드
		g.<C>print(new C()); //클래스 C의 print()메서드
		g.<D>print(new D()); //클래스 D의 print()메서드
	}
}
