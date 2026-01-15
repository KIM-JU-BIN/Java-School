package mission01_2400267;

class A {
	int a;//필드
	String b;//필드
	void abc(int c) {//매개변수=지역변수
		int d=4;//지역변수
//		int e;//지역변수, 오류발생, 지역변수는 강제 초기화 안 됨
		System.out.println(a);//0
		System.out.println(b);//null, 필드 heap메모리에 저장=>null로 초기화
		System.out.println(c);//3
		System.out.println(d);//4
//		System.out.println(e);//오류 발생, 지역변수는 stack메모리에 저장=>강제 초기화 안 됨 
	}
}

public class Mission {
	public static void main(String[] args) {
		A a = new A();//객체생성
		a.abc(3);//abc() 메서드를 호출하면서 c에 3을 전달
	}
}
