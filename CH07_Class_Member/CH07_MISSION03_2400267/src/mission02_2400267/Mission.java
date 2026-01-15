package mission02_2400267;

class A{
	int k;
	double m;
	String n;
	
	A(int a){
		k=a;
	}
	A(double b){
		m=b;
	}
	A(String c){
		n=c;
	}
	A(int a, double b, String c){
		k=a;
		m=b;
		n=c;
	}
}

public class Mission {
	public static void main(String[] args) {
		A a1 = new A(3);
		System.out.println(a1.k);//3
		System.out.println(a1.m);//0.0
		System.out.println(a1.n);//null
		System.out.println();
		
		A a2 = new A(5.8);
		System.out.println(a2.k);//0
		System.out.println(a2.m);//5.8
		System.out.println(a2.n);//null
		System.out.println();
		
		A a3 = new A("안녕");
		System.out.println(a3.k);//0
		System.out.println(a3.m);//0.0
		System.out.println(a3.n);//안녕
		System.out.println();
		
		A a4 = new A(2, 3.5, "방가");
		System.out.println(a4.k);//2
		System.out.println(a4.m);//3.5
		System.out.println(a4.n);//방가
		System.out.println();
	}
}
