package mission01_2400267;

class A{
	int m = 3;
}
class B extends A{
	int m = 5;
}
class C extends B{
	int m = 7;
}

public class Mission {
	public static void main(String[] ar) {
		A aa = new A();
		System.out.println(aa.m);//3
//A생성자의 결과인 객체에 m값은 3
		A ab = new B();
		System.out.println(ab.m);//3
//B생성자의 결과인 객체안에 부모객체인 A를 가르키고 있으므로 A안의 필드값 출력
//필드는 저장될 때 메모리공간이 각각 달라서 오버라이딩X
		A ac = new C();
		System.out.println(ac.m);//3
//C생성자의 결과인 객체안에 부모객체인 A를 가르키고 있으므로 A안의 필드값 출력
//필드는 저장될 때 메모리공간이 각각 달라서 오버라이딩X
		B bb = new B();
		System.out.println(bb.m);//5
//B생성자의 결과인 객체에 m값은 5
		B bc = new C();
		System.out.println(bc.m);//5
//C생성자의 결과인 객체안에 부모객체인 B를 가르키고 있으므로 B안의 필드값 출력
//필드는 저장될 때 메모리공간이 각각 달라서 오버라이딩X
		C cc = new C();
		System.out.println(cc.m);//7
//C생성자의 결과인 객체에 m값은 7		
		
	}
}
