package mission01_2400267.pack3;

import mission01_2400267.pack1.A;

public class D extends A{//클래스 D가 클래스 A의 자식
	void def() {
		//코드 작성 부분 #3 -----------------------
	    // m, abc(), bcd() 사용가능 (n 사용불가능)
	 
	    //#멤버 사용
		System.out.println(m); //m은 public이므로 모든 클래스 모든 패키지에서 사용 가능
//		System.out.println(n); //n은 private이므로 같은 클래스에서만 사용 가능
				
		abc(); //접근지정자가 public이므로 모든 패키지, 모든 클래스에서 사용 가능 
		bcd(); //접근지정자가 protected이므로 같은 패키지에서는 다 사용 가능, 다른 패키지에서는 자식 class에서만 사용 가능
	    //---------------------------------------
	}
}
