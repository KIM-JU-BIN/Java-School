package mission02_2400267;

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
		System.out.println(aa instanceof A);
//		B b1 = (B)aa; //다운캐스팅 불가능
		System.out.println(aa instanceof B);
//		C c1 = (C)aa; //다운캐스팅 불가능
		System.out.println(aa instanceof C);
//		D d1 = (D)aa; //다운캐스팅 불가능
		System.out.println(aa instanceof D);
//		E e1 = (E)aa; //다운캐스팅 불가능
		System.out.println(aa instanceof E);
//		F f1 = (F)aa; //다운캐스팅 불가능
		System.out.println(aa instanceof F);
		
		A a2 = (A)ab; //가능
		System.out.println(ab instanceof A);
		B b2 = (B)ab; //가능
		System.out.println(ab instanceof B);
//		C c2 = (C)ab; //다운캐스팅 불가능
		System.out.println(ab instanceof C);
//		D d2 = (D)ab; //다운캐스팅 불가능
		System.out.println(ab instanceof D);
//		E e2 = (E)ab; //다운캐스팅 불가능
		System.out.println(ab instanceof E);
//		F f2 = (F)ab; //다운캐스팅 불가능
		System.out.println(ab instanceof F);
		
		A a3 = (A)bb; //가능
		System.out.println(bb instanceof A);
		B b3 = (B)bb; //가능
		System.out.println(bb instanceof B);
//		C c3 = (C)bb; //상속관계가 없어 캐스팅 자체가 불가능 (문법오류 발생)
//		System.out.println(bb instanceof C);//문법오류
//		D d3 = (D)bb; //다운캐스팅 불가능
		System.out.println(bb instanceof D);
//		E e3 = (E)bb; //다운캐스팅 불가능
		System.out.println(bb instanceof E);
//		F f3 = (F)bb; //상속관계가 없어 캐스팅 자체가 불가능 (문법오류 발생)
//		System.out.println(bb instanceof F);//문법오류
		
		A a4 = (A)bd; //가능
		System.out.println(bd instanceof A);
		B b4 = (B)bd; //가능
		System.out.println(bd instanceof B);
//		C c4 = (C)bd; //상속관계가 없어 캐스팅 자체가 불가능 (문법오류 발생)
//		System.out.println(bd instanceof C);//문법오류
		D d4 = (D)bd; //가능
		System.out.println(bd instanceof D);
//		E e4 = (E)bd; //다운캐스팅 불가능
		System.out.println(bd instanceof E);
//		F f4 = (F)bd; //상속관계가 없어 캐스팅 자체가 불가능 (문법오류 발생)
//		System.out.println(bd instanceof F);//문법오류
		
		A a5 = (A)cc; //가능
		System.out.println(cc instanceof A);
//		B b5 = (B)cc; //상속관계가 없어 캐스팅 자체가 불가능 (문법오류 발생)
//		System.out.println(cc instanceof B);//문법오류
		C c5 = (C)cc; //가능
		System.out.println(cc instanceof C);
//		D d5 = (D)cc; //상속관계가 없어 캐스팅 자체가 불가능 (문법오류 발생)
//		System.out.println(cc instanceof D);//문법오류
//		E e5 = (E)cc; //상속관계가 없어 캐스팅 자체가 불가능 (문법오류 발생)
//		System.out.println(cc instanceof E);//문법 오류
//		F f5 = (F)cc; //다운캐스팅 불가능
		System.out.println(cc instanceof F);
		
		A a6 = (A)cf; //가능
		System.out.println(cf instanceof A);
//		B b6 = (B)cf; //상속관계가 없어 캐스팅 자체가 불가능 (문법오류 발생)
//		System.out.println(cf instanceof B);
		C c6 = (C)cf; //가능
		System.out.println(cf instanceof C);
//		D d6 = (D)cf; //상속관계가 없어 캐스팅 자체가 불가능 (문법오류 발생)
//		System.out.println(cf instanceof D);
//		E e6 = (E)cf; //상속관계가 없어 캐스팅 자체가 불가능 (문법오류 발생)
//		System.out.println(cf instanceof E);
		F f6 = (F)cf; //가능
		System.out.println(cf instanceof F);
	}
}