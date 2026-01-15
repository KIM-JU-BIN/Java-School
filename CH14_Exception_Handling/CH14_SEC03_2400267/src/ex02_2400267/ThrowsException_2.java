package ex02_2400267;
/*최상위 메서드인 main() 메서드가 예외를 전가했을 때*/

public class ThrowsException_2 {
	public static void main(String[] args) throws ClassNotFoundException{
		Class cls = Class.forName("java.lang.Object2");
	}
}

