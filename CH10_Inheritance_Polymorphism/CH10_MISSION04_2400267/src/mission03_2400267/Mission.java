package mission03_2400267;

class A{
	static void print() {
		System.out.println("A클래스 정적 메서드 print()");
	}
}
class B extends A{
	static void print() {
		System.out.println("B클래스 정적 메서드 print()");
	}
}
class C extends B{
	static void print() {
		System.out.println("C클래스 정적 메서드 print()");
	}
}

public class Mission {
	public static void main(String[] args) {
//static메서드는 class생성시 같이 생기기 때문에 객체 생성 없이도 메서드 호출 가능
		A.print();//A클래스 정적 메서드 print()
		B.print();//B클래스 정적 메서드 print()
		C.print();//C클래스 정적 메서드 print()
		
		A aa = new A();
		aa.print();//A클래스 정적 메서드 print()
//객체 A안의 print()메서드가 class A안에 있는 메서드를 가르키고 있으므로 그 값 출력
		
		A ab = new B();
		ab.print();//A클래스 정적 메서드 print()
//객체 B까지 만들어졌지만 A와 B의 static 메서드는 메모리상 저장공간이 달라 오버라이딩 안 됨
//A타입으로 만들어졌으므로 A의 메서드 출력
		
		A ac = new C();
		ac.print();//A클래스 정적 메서드 print()
//객체 C까지 만들어졌지만 A, C의 static 메서드는 메모리상 저장공간이 달라 오버라이딩 안 됨
//A타입으로 만들어졌으므로 A의 메서드 출력
		
		B bb = new B();
		bb.print();//B클래스 정적 메서드 print()
//객체 B안에 print()가 class B안에 있는 메서드를 가르키고 있으므로 그 값 출력
		
		B bc = new C();
		bc.print();//B클래스 정적 메서드 print()
//객체C까지 만들어졌지만 B와 C의 static 메서드는 메모리 상에서 저장공간이 달라 오버라이딩이 안 됨
//B타입으로 만들어졌으므로 B의 메서드를 출력
		
		C cc = new C();
		cc.print();//C클래스 정적 메서드 print()
//객체 C안에 print()메서드가 class C안에 있는 메서드를 가르키고 있으므로 그 값 출력
		
	}
}
