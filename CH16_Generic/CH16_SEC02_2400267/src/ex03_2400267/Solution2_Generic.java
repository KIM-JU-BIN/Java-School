package ex03_2400267;

/*해결책 ② 제네릭 클래스를 사용한 다양한 객체의 저장*/
class Apple{}
class Pencil{}

class Goods<T>{
	private T t;
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}
public class Solution2_Generic {
	public static void main(String[] args) {
		//#1. Goods을 통해서 Apple 객체 추가 및 가져오기
		Goods<Apple> goods1 = new Goods<>();
		goods1.set(new Apple());
		Apple apple = goods1.get();
		
		//#2. Goods을 통해서 Pencil 객체 추가 및 가져오기
		Goods<Pencil> goods2 = new Goods<>();
		goods2.set(new Pencil());
		Pencil penci = goods2.get();
		
		//#. 잘못된 타입선언
		Goods<Apple> goods3 = new Goods<>();
		goods3.set(new Apple());
//		Pencil pencil2 = goods3.get();//강한 타입 체크
	}
}
