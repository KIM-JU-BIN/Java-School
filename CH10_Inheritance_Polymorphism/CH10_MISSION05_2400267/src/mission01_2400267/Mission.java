package mission01_2400267;

class Parent{
	int m = 3;
	void print() {
		System.out.println("Parent클래스의 print() 메서드 호출");
	}
}
class Child extends Parent {
	int m = 5;
	void valueM() {
		System.out.println(m);//this.m, 5
	}
	void valueMInParent() {
		System.out.println(super.m);//3
	}
	@Override
	void print() {
		System.out.println("Child클래스의 print() 메서드 호출");
	}
	void printInParent() {
		super.print();
	}
}
public class Mission {
	public static void main(String[] ar) {
		Parent pc = new Child();
		pc.print();//Child클래스의 print() 메서드 호출
		//Parent객체만 가르키고 있기 때문에 Parent안의 print()만 사용가능
		
		//Parent->Child 다운캐스팅
		Child cc = (Child)pc;
		
		//호출 가능 메서드 4개
		cc.valueM();//5
		//여기서 m은 this.m 즉, 자신의 클래스의 객체안에 있는 필드값 출력
		cc.valueMInParent();//3
		//여기서 m은 super키워드 사용해서 부모클래스의 필드값 출력
		cc.print();//Child클래스의 print() 메서드 호출
		//print()는 부모의 print()와 시그니처, 반환타입이 같으므로 Overriding됨
		cc.printInParent();//Parent클래스의 print() 메서드 호출
		//super키워드 사용했으므로 부모클래스의 print() 호출
	}
}
