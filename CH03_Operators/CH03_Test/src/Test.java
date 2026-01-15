
class A{
	int m;
	int n;
	A(int m ,int n){
		this.m=m;
		this.n=n;
	}

	public String toString() {
		return "m="+m+"n="+n;
	}
	
	public boolean equals(Object obj) {
		if (this.m==((A)obj).m)
			return true;
		else
			return false;
	}
	
}


public class Test {
	public static void main(String[] args) {
		//main쓰고 ctrl+스페이스바 누르고 enter
//		System.out.println();
		//sysout쓰고 ctrl+스페이스바 누르고 enter
//		A a1=new A();
		A a1=new A(2,3);
		A a2=new A(2,5);
		
		//해쉬코드 비교
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		
		//toString위 비교
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		
		//equals의 비교 즉, m의 값만 비교
		System.out.println(a1.equals(a2));
		System.out.println(a2.equals(a1));
		System.out.println(a1==a2);

	}
}
