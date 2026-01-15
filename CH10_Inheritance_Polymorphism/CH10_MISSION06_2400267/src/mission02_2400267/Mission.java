package mission02_2400267;

class A{
	int code;
	String name;
	
	A(int code, String name){
		this.code=code;
		this.name=name;
	}
	
//	@Override
	public boolean equals(Object o) {
		if(this.code == ((A)o).code) {
			return true;
		}else 
			return false;
	}
}
public class Mission {
	public static void main(String[] args) {
		A a1 = new A(123, "연필");
		A a2 = new A(123, "펜슬");
		//a1과 a2의 위치 달라서 hashCode()다름
		
		System.out.println(a1.equals(a2));
	}
}
