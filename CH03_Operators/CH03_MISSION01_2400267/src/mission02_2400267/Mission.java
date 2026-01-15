package mission02_2400267;

public class Mission {
	public static void main(String[] args) {
		  int a = 3;
		  int b = ++a;		
		  System.out.println(a);		//4
		  System.out.println(b);		//4
		  System.out.println(a++);		//4
		  System.out.println(b++);		//4
//		  System.out.println(a);		//9줄의 a++가 실행되어 a=5
//		  System.out.println(b);		//10줄의 b++가 실행되어 b=5
		  System.out.println(++a + b--);//(6+5)=11
//		  System.out.println(a);		//13번줄의 ++a가 실행되어 a=6
//		  System.out.println(b);		//13번줄의 b--가 실행되어 b=4
		  System.out.println(a + b);	//6+4=10
	}
}
