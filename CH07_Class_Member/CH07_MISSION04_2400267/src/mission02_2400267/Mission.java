package mission02_2400267;
class A{
	int a=1;
	int b=2;
	int c=3;	
		
	
	A(int a) {
		
		System.out.println("a="+this.a);
	}
	
	A(int a, int b){
		this(a);//A(a)호출
		System.out.println("b="+this.b);
	}
	
	A(int a, int b, int c){
		this(a,b);//A(a,b)호출
		System.out.println("c="+this.c);
	}
}
public class Mission {
	public static void main(String[] args) {
		A a = new A(1,2,3);
	}
}
