package mission01_2400267;

class AB<T>{
	T t;
	public void set(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
}

public class Mission {
	public static void main(String[] args) {
		//#1. Integer 입출력 전용
		AB<Integer> ab1 = new AB<>();
		ab1.set(3);
		Integer a = ab1.get();
		System.out.println(a);//3
		
		//#2. String 입출력 전용
		AB<String> ab2 = new AB<>();
		ab2.set("안녕");
		String b = ab2.get();
		System.out.println(b);//안녕
		
		//# 오류 발생 코드
//		ab1.set("안녕"); 
//		ab1은 AB<Integer> 타입으로 선언되었기 때문에 set() 메서드는 Integer 타입의 매개변수만 들어갈 수 있다.
		
//		String bb = ab1.get();
//		ab1에 저장된 필드값은 Integer 타입이다. String 타입과 다르기 때문에 bb에 값을 저장할 수 없다.

//		ab2.set(3);
//		ab2는 AB<String> 타입으로 선언되었기 때문에 set() 메서드는 String 타입의 매개변수만 들어갈 수 있다. 
		
//		Integer aa = ab2.get();
//		ab2에 저장된 필드값은 String 타입이다. Integer 타입과 다르기 때문에 참조변수 aa에 값을 넣을 수 없음.
	}
}
