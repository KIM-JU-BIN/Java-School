package mission01_2400267;

class Parent{
	int a = 10;
	void method1() {
		System.out.println("Parent - method1()");
	}
}

class Child extends Parent{
	int b = 20;
	void method2() {
		System.out.println("Child - method2()");
	}
}

public class Mission {
	public static void main(String[] args) {
		//parent클래스 멤버만 사용 가능
		Parent p = new Parent();
		System.out.println(p.a);
		p.method1();
		
		//Child는 Parent의 멤버를 상속받아 두 클래스의 멤버 전부 사용 가능
		Child c = new Child();
		System.out.println(c.a);
		System.out.println(c.b);
		c.method1();
		c.method2();
		
		//Parent타입으로 선언했으므로 Child안에 Parent만 가르키고 있음, Parent 멤버만 사용 가능
		Parent pc = new Child();//Child는 Parent이다
		System.out.println(pc.a);
//		System.out.println(pc.b);//Parent멤버만 가르키고 있어서 오류남
		pc.method1();
//		pc.method2();//Parent멤버만 가르키고 있어서 오류남
		
	}
}
