package ex03_2400267;

/*메서드 매개변수로서 제네릭 클래스의 타입 제한 범위 설정*/

class A{}
class B extends A{}
class C extends B{}
class D extends C{}

class Goods<T>{
	private T t;
	public void set(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
}

class Test{
	void method1(Goods<A> g) {}//case1, 제네릭 타입 = A 객체만 가능
	void method2(Goods<?> g) {} //case2, 제네릭 타입 = 모든 객체 가능
	void method3(Goods<? extends B> g) {} //case3, 제네릭 타입 = B와 자식 클래스인 객체 가능
	void method4(Goods<? super B> g) {} //case4, 제네릭 타입 = B와 부모 클래스인 객체 가능
}

public class BoundedTypeOfInputArguments {
	public static void main(String[] args) {
		Test t = new Test();
		
		//#1. case1
		t.method1(new Goods<A>());
//		t.method1(new Goods<B>());
//		t.method1(new Goods<C>());
//		t.method1(new Goods<D>());
		
		//#2. case2
		t.method2(new Goods<A>());
		t.method2(new Goods<B>());
		t.method2(new Goods<C>());
		t.method2(new Goods<D>());
		
		//#3. case3
//		t.method3(new Goods<A>());
		t.method3(new Goods<B>());
		t.method3(new Goods<C>());
		t.method3(new Goods<D>());
		
		//#4. case4
		t.method4(new Goods<A>());
		t.method4(new Goods<B>());
//		t.method4(new Goods<C>());
//		t.method4(new Goods<D>());		
	}
}
