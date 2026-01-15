package mission01_2400267;

class A{
	final String name="홍길동";//final은 반드시 초기화 되어야 함
	final int age;//final은 반드시 초기화 되어야 함
	void abc() {
		final int a;
		int b=4;
		a=5;//final키워드의 지역변수 a 초기화
		b=5;//그냥 필드는 다른 값 대입 가능
//		a=5;//final 필드는 한번 정해진 값을 바꿀수 없다. (최초선언된 이후 값을 대입할 수 없다)
		b=6;//그냥 필드는 다른 값 대입 가능
	}
	A(){
		age=16;
	}
	
}

public class Mission {
	public static void main(String[] ar) {
		A aa = new A();
		
		System.out.println(aa.name);
		System.out.println(aa.age);
//		System.out.println(aa.name = "성춘향");//final키워드의 필드는 최초 선언된 값만 대입할 수 있다
//		System.out.println(aa.age = 16);//final키워드의 필드는 최초 선언된 값만 대입할 수 있다
	}
}
