package mission01_2400267;

class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends B{}
class F extends C{}

public class Mission {
	public static void main(String[] ar_) {
		//6개의 객체 생성
		A aa = new A();
		A ab = new B();
		
		B bb = new B();
		B bd = new D();
		
		C cc = new C();
		C cf = new F();
		
		//참조변수 aa~cf를 A~F까지 업캐스팅 또는 다운캐스팅 (불가능한 코드는 주석처리 및 이유 작성)

		A a1 = (A)aa; //가능
//		B b1 = (B)aa; //다운캐스팅 불가능
//		C c1 = (C)aa; //다운캐스팅 불가능
//		D d1 = (D)aa; //다운캐스팅 불가능
//		E e1 = (E)aa; //다운캐스팅 불가능
//		F f1 = (F)aa; //다운캐스팅 불가능
		
		A a2 = (A)ab; //가능
		B b2 = (B)ab; //가능
//		C c2 = (C)ab; //다운캐스팅 불가능
//		D d2 = (D)ab; //다운캐스팅 불가능
//		E e2 = (E)ab; //다운캐스팅 불가능
//		F f2 = (F)ab; //다운캐스팅 불가능
		
		A a3 = (A)bb; //가능
		B b3 = (B)bb; //가능
//		C c3 = (C)bb; //상속관계가 없어 캐스팅 자체가 불가능 (문법오류 발생)
//		D d3 = (D)bb; //다운캐스팅 불가능
//		E e3 = (E)bb; //다운캐스팅 불가능
//		F f3 = (F)bb; //상속관계가 없어 캐스팅 자체가 불가능 (문법오류 발생)
		
		A a4 = (A)bd; //가능
		B b4 = (B)bd; //가능
//		C c4 = (C)bd; //상속관계가 없어 캐스팅 자체가 불가능 (문법오류 발생)
		D d4 = (D)bd; //가능
//		E e4 = (E)bd; //다운캐스팅 불가능
//		F f4 = (F)bd; //상속관계가 없어 캐스팅 자체가 불가능 (문법오류 발생)
		
		A a5 = (A)cc; //가능
//		B b5 = (B)cc; //상속관계가 없어 캐스팅 자체가 불가능 (문법오류 발생)
		C c5 = (C)cc; //가능
//		D d5 = (D)cc; //상속관계가 없어 캐스팅 자체가 불가능 (문법오류 발생)
//		E e5 = (E)cc; //상속관계가 없어 캐스팅 자체가 불가능 (문법오류 발생)
//		F f5 = (F)cc; //다운캐스팅 불가능
		
		A a6 = (A)cf; //가능
//		B b6 = (B)cf; //상속관계가 없어 캐스팅 자체가 불가능 (문법오류 발생)
		C c6 = (C)cf; //가능
//		D d6 = (D)cf; //상속관계가 없어 캐스팅 자체가 불가능 (문법오류 발생)
//		E e6 = (E)cf; //상속관계가 없어 캐스팅 자체가 불가능 (문법오류 발생)
		F f6 = (F)cf; //가능
	}
}
