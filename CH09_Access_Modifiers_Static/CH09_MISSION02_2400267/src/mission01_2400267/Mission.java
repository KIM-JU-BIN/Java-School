package mission01_2400267;

class A{
	int m=0;//인스턴스 필드
	static int n=0;//static 필드, 객체간 공유
	
	void increaseM() {//인스턴스 메소드
		m++;
		n++;
	}
	
	static void increaseN() {//static 메소드
//		m++; //m은 인스턴스 필드로 객체를 생성 후 사용 가능하다. 
//static 메소드는 객체를 생성하지 않고도 사용 가능해서 static 메소드는 static 멤버만 사용 가능하다.
		n++;
	}
}

public class Mission {
	public static void main(String[] args) {
		//#객체 생성
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();

		//static int n은 객체 공유
		a1.increaseN();//n=1
		a2.increaseN();//n=2
		a3.increaseN();//n=3

		a1.increaseM();//m=1, n=4
		a2.increaseM();//m=1, n=5
		a3.increaseM();//m=1, n=6

		System.out.println(a1.m);//1
		System.out.println(a1.n);//6
		System.out.println(a2.m);//1
		System.out.println(a2.n);//6
		System.out.println(a3.m);//1
		System.out.println(a3.n);//6
		//m은 static 필드로 객체간 공유를 하고있어 메서드를 호출할 때마다 m++가 됨
	}
}
