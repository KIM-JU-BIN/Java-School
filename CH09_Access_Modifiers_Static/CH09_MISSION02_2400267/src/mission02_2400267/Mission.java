package mission02_2400267;
class A{	
	static int n;
		
	static {//static 초기화 블럭
		n=10;
		System.out.println("클래스 로딩시 static 블록이 실행됨");
	}
}
public class Mission {
	public static void main(String[] args) {
		
		System.out.println(A.n); 
		
	}
}
