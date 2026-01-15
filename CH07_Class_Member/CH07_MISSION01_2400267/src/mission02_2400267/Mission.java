package mission02_2400267;

class A {
	boolean[] a;//필드, boolean배열(참조자료형)
	short b;//필드, short 변수
	long[] c;//필드, long배열(참조자료형)
	float d;//필드, float 변수
	double[] e;//필드, double배열(참조자료형)
	String f;//필드, String 변수(참조자료형)

	void abc() {
		System.out.println(a);//null, boolean배열은 참조자료형이므로 heap메모리에서 null로 초기화
		System.out.println(b);//0, heap메모리에서 숫자는 0로 초기화
		System.out.println(c);//null, long배열은 참조자료형이므로 heap메모리에서 null로 초기화
		System.out.println(d);//0.0, heap메모리에서 숫자는 0로 초기화(float, double은 0.0)
		System.out.println(e);//null, double배열은 참조자료형이므로 heap메모리에서 null로 초기화
		System.out.println(f);//null, heap메모리에서 참조자료형은 null로 초기화, 객체를 가르키고 있지 않음
	}
}

public class Mission {
	public static void main(String[] args) {
		A a = new A();//객체 생성
		a.abc();//메서드 사용
	}
}


