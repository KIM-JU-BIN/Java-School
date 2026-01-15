package mission01_2400267;

class A{//A.class
	void abc() {
		class E{}//A$1E.class, 지역이너클래스
	}
	void bcd() {
		class E{}//A$2E.class, 지역이너클래스
	}
}
class B{//B.class
	class C{//B$C.class, 인스턴스 이너 클래스
		class D{}//B$C$D.class, 인스턴스 이너클래스
	}
}

public class Mission {//Mission.class
	public static void main(String[] args) {
		
	}
}
