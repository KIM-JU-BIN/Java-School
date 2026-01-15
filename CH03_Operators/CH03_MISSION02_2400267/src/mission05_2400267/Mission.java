package mission05_2400267;

public class Mission {
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int c = 7;
		
		System.out.println((a > b)? "안녕" : "방가");//방가
		System.out.println((a > b)? "떙큐" : (b > c)? "베리" : "감사");//감사
		System.out.println((a < b)? (b > c)? "안녕" : "땡큐" : (b > c)? "베리" : "감사");//떙큐
	}
}
