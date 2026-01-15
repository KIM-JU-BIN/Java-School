package mission01_2400267;

class A{
	int m=1;
	int n=2;
	
	void abc(int m, int n) {
		this.m=m; //필드m=지역변수m, 필드m=3
		n=this.n; //지역변수n=필드n, 지역변수n=2
		this.bcd(5);	//메서드 bcd호출
		
	}//지역변수m,n 소멸
	void bcd(int k) {//매개변수로 5받음=>k는 지역변수
		System.out.println(k);//5
		System.out.println(this.m);//3
		System.out.println(this.n);//2				
	}
}
public class Mission {
	public static void main(String[] args) {
		A a = new A();
		a.abc(3, 4);//5 3 2
	}
}
