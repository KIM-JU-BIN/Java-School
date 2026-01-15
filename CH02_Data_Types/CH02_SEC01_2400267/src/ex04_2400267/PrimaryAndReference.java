package ex04_2400267;

/*변수의 생존기간*/

public class PrimaryAndReference {
	public static void main(String[] args) {
		int a = 3;		//기본자료형
		int[] b = {1,2,3};//참조자료형
		
		System.out.println(a);//3
		System.out.println(b);//[I@515f550a
	}
}
