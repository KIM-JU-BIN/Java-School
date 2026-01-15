package mission03_2400267;

public class Mission {
	public static void main(String[] args) {
		int score = 5;
		switch(score) {
		case 10:
		case 9:
			System.out.println("A학점");
			break;
		case 8:
		case 7:
		case 6:
			System.out.println("B학점");
			break;
		case 5:
		case 4:
			System.out.println("C학점");//실행
			break;
		default:
			System.out.println("F학점");
		}
	}
}
