package mission01_2400267.pack1;

public class B {
	void bcd() {
	    //코드 작성 부분 #1 -----------------------
	    // m, abc(), bcd() 사용가능 (n 사용불가능)
	    
		//#객체 생성
		A a = new A();
				
	   //#멤버 사용
		System.out.println(a.m); //m은 public이므로 모든 클래스 모든 패키지에서 사용 가능
//		System.out.println(a.n); //n은 private이므로 같은 클래스에서만 사용 가능
				
		a.abc(); //접근지정자가 public이므로 모든 패키지, 모든 클래스에서 사용 가능 
		a.bcd(); //접근지정자가 protected이므로 같은 패키지에서는 다 사용 가능, 다른 패키지에서는 자식 class에서만 사용 가능
	    //----------------------------------------
	}
}
