package mission01_2400267;

public class Mission {
	public static void main(String[] args) {
		//1-1
		//방법1
		double[][] a = new double[2][4];
		a[0][0]=1.1;
		a[0][1]=2.2;
		a[0][2]=3.3;
		a[0][3]=4.4;
		a[1][0]=5.5;
		a[1][1]=6.6;
		a[1][2]=7.7;
		a[1][3]=8.8;
		
		//방법2
		double[][] b = new double[2][];
		b[0]=new double[4];
		b[0][0]=1.1; b[0][1]=2.2; b[0][2]=3.3; b[0][3]=4.4;
		b[1]=new double[4];
		b[1][0]=5.5; b[1][1]=6.6; b[1][2]=7.7; b[1][3]=8.8;
		
		//방법3
		double[][] c = new double[][] {{1.1, 2.2, 3.3, 4.4},{5.5, 6.6, 7.7, 8.8}};
		
		//방법4
		double[][] d = {{1.1, 2.2, 3.3, 4.4},{5.5, 6.6, 7.7, 8.8}};
		
		
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
		
		for(int i=0; i<d.length; i++) {
			for(int j=0; j<d[i].length; j++) {
				System.out.println(d[i][j]);
			}
		}
		System.out.println();
		
		
		//1-3
		for(double[] m:a) {
			for(double k: m) {
				System.out.println(k);
			}
		}
		System.out.println();
		
		for(double[] m:b) {
			for(double k: m) {
				System.out.println(k);
			}
		}
		System.out.println();
		
		for(double[] m:c) {
			for(double k: m) {
				System.out.println(k);
			}
		}
		System.out.println();
		
		for(double[] m:d) {
			for(double k: m) {
				System.out.println(k);
			}
		}
		System.out.println();
	}
}
