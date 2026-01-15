package mission01_2400267;

abstract class A{
	abstract void sayHello();
}
class B extends A{
	void sayHello(){
		System.out.println("안녕하세요");
	}
}
class C extends A{ 
	void sayHello() {
		System.out.println("Hi, Hello");
	}
}

public class Mission {
	public static void main(String[] args) {
		A ab1 = new B();
		ab1.sayHello();//안녕하세요
		A ab2 = new B();
		ab2.sayHello();//안녕하세요
		
		A ac1 = new C();
		ac1.sayHello();//Hi, Hello
		A ac2 = new C();
		ac2.sayHello();//Hi, Hello
	}
}
