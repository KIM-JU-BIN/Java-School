package mission04_2400267;

public class Mission {
	public static void main(String[] args) {
		int score = 75;
		switch(score/10) {
		case 10:
		case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");//실행
			break;
		default:
			System.out.println("F학점");
		}
	}
}
