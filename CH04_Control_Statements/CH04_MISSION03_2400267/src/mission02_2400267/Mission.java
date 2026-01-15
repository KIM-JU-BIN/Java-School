package mission02_2400267;

public class Mission {
	public static void main(String[] arg) {
		for(int i=0;i<3;i++) {
			for(int j=0; j<5; j++) {
				if(j==3) {
					i=2;
					break;
				}
				System.out.println(i+", "+j);
			}
		}
	}
}
