package mission02_2400267;

public class Mission {
	public static void main(String[] args) {
		//1-1
		//방법1
		String[][] a = new String[3][];
		a[0]=new String[2];
		a[0][0]="안녕"; a[0][1]="방가";
		a[1]=new String[1];
		a[1][0]="잘가";
		a[2]=new String[3];
		a[2][0]="떙큐"; a[2][1]="베리"; a[2][2]="감사";
		
		//방법2
		String[][] b = new String[][] {{"안녕", "방가"},{"잘가"},{"땡큐", "베리", "감사"}};
		
		//방법3
		String[][] c = {{"안녕", "방가"},{"잘가"},{"땡큐", "베리", "감사"}};
		
		
		//1-2
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}
		System.out.println();
		
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				System.out.println(b[i][j]);
			}
		}
		System.out.println();
		
		for(int i=0; i<c.length; i++) {
			for(int j=0; j<c[i].length; j++) {
				System.out.println(c[i][j]);
			}
		}
		System.out.println();
		
		
		//1-3
		for(String[] m:a) {
			for(String k: m) {
				System.out.println(k);
			}
		}
		System.out.println();
		
		for(String[] m:b) {
			for(String k: m) {
				System.out.println(k);
			}
		}
		System.out.println();
		
		for(String[] m:c) {
			for(String k: m) {
				System.out.println(k);
			}
		}
		System.out.println();
	}
}
