package mission02_2400267;

public class Mission {
	public static void main(String[] args) {
		int score = 8;
		if(score >= 9) {
			System.out.println("A학점");
		}
		else if(score >= 6 && score < 9) {
			System.out.println("B학점");//실행
		}
		else if(score >= 4 && score < 6) {
			System.out.println("C학점");
		}
		else {
			System.out.println("F학점");
		}
	}
}
