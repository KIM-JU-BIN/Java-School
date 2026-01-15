package mission02_2400267;

class A<T1,T2,T3>{
	T1 a;
	T2 b;
	T3 c;
	
	public void setA(T1 a) {
		this.a = a;
	}
	public T1 getA() {
		return a;
	}
	public void setB(T2 b) {
		this.b = b;
	}
	public T2 getB() {
		return b;
	}
	public void setC(T3 c) {
		this.c = c;
	}
	public T3 getC() {
		return c;
	}
}

public class Mission {
	public static void main(String[] args) {
		//#1. 객체 a1
		A<String, String, String> a1 = new A<>();
	
		a1.setA("객체 a1의 setA()");
		a1.setB("객체 a1의 setB()");
		a1.setC("객체 a1의 setC()");
		
		System.out.println(a1.getA()+'\n'+a1.getB()+'\n'+a1.getC());
		//#2. 객체 a2
		A<Integer,Integer,Integer> a2 = new A<>();
		
		a2.setA(1);
		a2.setB(2);
		a2.setC(3);
		
		System.out.println(a2.getA());//1
		System.out.println(a2.getB());//2
		System.out.println(a2.getC());//3
		
		//#3. 객체 a3
		A<String, Integer, Double> a3 = new A<>();
		
		a3.setA("자바");
		a3.setB(2);
		a3.setC(3.5);
		
		System.out.println(a3.getA());//자바
		System.out.println(a3.getB());//2
		System.out.println(a3.getC());//3.5
	}
}
