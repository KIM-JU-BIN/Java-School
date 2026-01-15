package abc;

class AB<T1, T2, T3>{
	T1 a;
	T2 b;
	T3 c;
	void setA(T1 a) {
		this.a=a;
	}
	T1 getA() {
		return a;
	}
}


public class Test {
	public static void main(String[] ar) {
		AB<String,String,String> ab1=new AB<>();
		ab1.setA("");
		
}}
