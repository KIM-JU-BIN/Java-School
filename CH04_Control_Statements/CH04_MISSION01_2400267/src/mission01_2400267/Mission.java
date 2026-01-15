package mission01_2400267;

public class Mission {
	public static void main(String[] args) {
		int score = 33;
		if(score >= 85) {
			System.out.println("A학점");
		}
		else if(score >= 75 && score < 85) {
			System.out.println("B학점");
		}
		else if(score >= 55 && score < 75) {
			System.out.println("C학점");
		}
		else {
			System.out.println("F학점");//실행
		}
	}
}
