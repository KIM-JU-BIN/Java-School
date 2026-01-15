package mission02_2400267;

public class Mission {
	public static void main(String[] args) {
		int a=3, b=5, c=7;
		
		System.out.println((a >= 4) || (b < 3));//false || false=>false
		System.out.println(false ^ (a <= 4));//true
		System.out.println(!(b <=c));//!true=>false
	}
}
