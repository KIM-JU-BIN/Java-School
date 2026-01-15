package mission04_2400267;
/*시험문제*/
class A{
	int m = 3;
	static int n = 30;
	void method1() {//default가 기본임
		System.out.println("A클래스의 인스턴스 메서드 method1()");
	}
	static void method2() {
		System.out.println("A클래스의 정적 메서드 method2()");
	}
}
class B extends A{
	int m = 5;
	static int n = 50;
	void method1() {
		System.out.println("B클래스의 인스턴스 메서드 method1()");
	}
	static void method2() {
		System.out.println("B클래스의 정적 메서드 method2()");
	}
}
public class Mission {
	public static void main(String[] ar) {
//정적필드, 정적메서드는 객체 생성 없이 사용 가능
		System.out.println(A.n);//30
		A.method2();//A클래스의 정적 메서드 method2()
		System.out.println(B.n);//50
		B.method2();//B클래스의 정적 메서드 method2()
		
		A aa = new A();
		System.out.println(aa.m);//3
//A생성자로 만들어진 객체 안에 인스턴스 필드 m의 값이 저장되어있어서 그 값 출력 
		System.out.println(aa.n);//30
//A생성자로 만들어진 객체 안에 n이 가르키고 있는 static영역의 n을 가르키고 있으므로 그 값 출력
		aa.method1();//A클래스의 인스턴스 메서드 method1()
//A생성자로 만들어진 객체 안에 method1()이 메소드영역에 있는 method1()을 가르키고 있으므로 그 값 출력
		aa.method2();//A클래스의 정적 메서드 method2()
//A생성자로 만들어진 객체 안에 method2()가 static영역의 method2()를 가르키고 있으므로 그 값 출력
		
		A ab = new B();
		System.out.println(ab.m);//3
//인스턴스 필드는 메모리상에서 다른 공간에 저장됨
//B생성자로 B객체까지 만들어졌지만 A타입으로 만들어져 A객체를 가르키고 있다 A객체의 m값 출력
		System.out.println(ab.n);//30
//static필드는 class안에서 만들어지기 때문에 메모리 상에서 다른 공간에 분리되어 저장됨
//A타입으로 만들어져서 A객체를 가르키고 있으므로 A의 n의 값을 출력
		ab.method1();//B클래스의 인스턴스 메서드 method1()
//인스턴스 메서드는 메모리상에서 같은 공간(메서드영역)에 저장되기 때문에 부모메서드가 먼저 저장되고 
//B의 메서드가 메서드 영역에 저장되어 덮어씌어짐
		ab.method2();//A클래스의 정적 메서드 method2()
//B객체까지 만들어졌지만 method2는 static영역에 저장되기 때문에 메모리상에서 다른 공간에 분리되어 저장됨
//A타입으로 만들어져서 A객체를 가르키므로 객체A의 method2()를 출력
		
		B bb = new B();
		System.out.println(bb.m);//5
//생성자B로 만들어진 객체B의 인스턴스 필드 출력
		System.out.println(bb.n);//50
//생성자B로 만들어진 객체의 정적 필드 출력
		bb.method1();//B클래스의 인스턴스 메서드 method1()
//생성자B로 만들어진 객체B의 인스턴스메서드는 메서드영역에 저장되고 
		bb.method2();//B클래스의 정적 메서드 method2()
//생성자B로 만들어진 객체B의 정적 메서드는 static영역에 저장되므로 그 값 출력
	}
}
