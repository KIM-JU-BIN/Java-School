package mission06_2400267;

class A implements AutoCloseable{
	void abc() {
		System.out.println("클래스 A의 abc() 메서드");
	}
	public void close() throws Exception{
		System.out.println("클래스 A의 close() 메서드");
	}
}

public class Mission {
	public static void main(String[] args) {
		try(A a = new A()){
			a.abc();
		}
		catch(Exception e) {
			System.out.println("예외발생");
		}
	}
}
