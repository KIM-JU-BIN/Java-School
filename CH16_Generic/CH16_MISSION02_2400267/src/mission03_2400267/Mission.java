package mission03_2400267;

class A<T>{
	T m;
	public void setM(T m) {
		this.m = m;
	}
	public T getM() {
		return m;
	}
}

public class Mission {
	public static void main(String[] args) {
		//# A<T> 객체 생성하기 (3개)
		A a1 = new A();//A<object> 생략됨
		A<String> a2 = new A<>();
		A<Integer> a3 = new A<>();	
		
		//# 필드에 값 대입
		a1.setM(5.4);
		a2.setM("안녕");
		a3.setM(3);
		
		//# 필드값 출력
		System.out.println(a1.getM());//5.4
		System.out.println(a2.getM());//안녕
		System.out.println(a3.getM());//3
		System.out.println();
		
		//#오류 수정
		Double r1 = (Double)a1.getM();
		//a1.getM()의 필드는 Object 타입이라서 Double타입의 r1에 값을 저장하려면 타입변환 필요함
		String r2 = a2.getM();
		Integer r3 = a3.getM();
		
		System.out.println(r1);//5.4
		System.out.println(r2);//안녕
		System.out.println(r3);//3
	}
}
