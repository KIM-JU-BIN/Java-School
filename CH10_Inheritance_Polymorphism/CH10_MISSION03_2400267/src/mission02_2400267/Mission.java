package mission02_2400267;

class A{
	void print() {
		System.out.println("클래스 A의 print()");
	}
}
class B extends A{
	void print() {
		System.out.println("클래스 B의 print()");
	}
}
class C extends B{
	void print() {
		System.out.println("클래스 C의 print()");
	}
}

public class Mission {
	public static void main(String[] ar) {
		A aa = new A();
		aa.print();//클래스 A의 print()
//A 생성자로 만든 객체안에 메서드는 1개이므로 그거 출력
		
		A ab = new B();
		ab.print();//클래스 B의 print()
//생성자 B를 통해서 만들어진 객체가 부모인 A의 객체가 먼저 만들어지고 메서드도 메서드 영역에 저장되고 B의 메서드도 메서드 영역에 저장됨
//A와 B의 메서드가 리턴타입+시그니처가 동일하므로 메서드 오버라이딩이 되어 마지막으로 저장된 메서드로 덮어씌어짐
		
		A ac = new C();
		ac.print();//클래스 C의 print()
//생성자 C를 통해서 만들어진 객체가 부모인 A의 객체가 먼저 만들어지고 메서드도 메서드 영역에 저장되고 C의 메서드도 메서드 영역에 저장됨
//A, C의 메서드가 리턴타입+시그니처가 동일하므로 메서드 오버라이딩이 되어 가장 마지막으로 저장된 메서드로 덮어씌어짐
		
		B bb = new B();
		bb.print();//클래스 B의 print()
//B생성자로 만든 객체안에 메서드는 2개인데 A와 B의 메서드가 리턴타입+시그니처가 동일하므로 메서드 오버라이딩이 일어남
//마지막으로 저장된 B의 메서드로 출력됨
		
		B bc = new C();
		bc.print();//클래스 C의 print()
//생성자C로 만들어진 객체 안에 부모B의 메서드가 먼저 저장되고 C의 메서드가 저장되므로 덮어씌어짐
		
		C cc = new C();
		cc.print();
//객체 C의 메서드를 가르키므로 C의 메서드 출력
		
		
	}
}
