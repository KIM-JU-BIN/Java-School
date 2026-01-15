package mission02_2400267;

class A{
	static int m = 3;
}
class B extends A{
	static int m = 5;
}
class C extends B{
	static int m = 7;
}
public class Mission {
	public static void main(String[] ar) {
//static은 class영역에 class가 저장될 때 class안에 static멤버들이 같이 저장되므로 객체 생성 없이 바로 접근 가능 
		System.out.println(A.m);//3
		System.out.println(B.m);//5
		System.out.println(C.m);//7
		System.out.println();
		
		A aa = new A();
		System.out.println(aa.m);//3
//static영역에 생성자 A의 필드만 저장됨  그 값 출력
//static은 메모리공간에서 각각 따로 저장되므로 오버라이딩X
		A ab = new B();
		System.out.println(ab.m);//3
//B객체가 만들어지기 전에 부모인 A객체 먼저 만들어지고 참조변수가 A를 가르키고 있으므로 A안의 m값 출력
//static은 메모리공간에서 각각 따로 저장되므로 오버라이딩X		
		A ac = new C();
		System.out.println(ac.m);//3
//C객체가 만들어지기 전에 부모인 A객체 먼저 만들어지고 참조변수가 A를 가르키고 있으므로 A안의 m값 출력
//static은 메모리공간에서 각각 따로 저장되므로 오버라이딩X	
		B bb = new B();
		System.out.println(bb.m);//5
//static은 메모리공간에서 각각 따로 저장되므로 오버라이딩X
		B bc = new C();
		System.out.println(bc.m);//5
//C객체가 만들어지기 전에 부모인 B객체 먼저 만들어지고 참조변수가 B를 가르키고 있으므로 B안의 m값 출력
//static은 메모리공간에서 각각 따로 저장되므로 오버라이딩X	
		C cc = new C();
		System.out.println(cc.m);//7
//static은 메모리공간에서 각각 따로 저장되므로 오버라이딩X
	}
}
