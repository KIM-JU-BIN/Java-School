package mission01_2400267;

public class Mission {
	public static void main(String[] arg) {
		for(int i=0; ;i++) {
			if(i%2==0) {
				continue;
			}
			if(i>10) {
				break;
			}
			System.out.println(i);//1 3 5 7 9
		}
	}
}
