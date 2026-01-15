package mission02_2400267;

public class Mission {
	public static void main(String[] args) {
		//1-1
		double[] a = new double[3];
		a[0]=2.3;
		a[1]=5.8;
		a[2]=3.6;
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(double k : a) {
			System.out.print(k+" ");
		}
		System.out.println();
		
		//1-2
		double[] b = new double[] {2.3, 5.8, 3.6};
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		for(double k : b) {
			System.out.print(k+" ");
		}
		System.out.println();
		
		//1-3
		double[] c = {2.3, 5.8, 3.6};
		for(int i=0; i<c.length; i++) {
			System.out.print(c[i]+" ");
		}
		System.out.println();
		for(double k : c) {
			System.out.print(k+" ");
		}
		System.out.println();
		
		
		//2-1
		String[] d = new String[2];
		d[0] = "안녕";
		d[1] = "방가";
		for(int i=0; i<d.length; i++) {
			System.out.print(d[i]+" ");
		}
		System.out.println();
		for(String k : d) {
			System.out.print(k+" ");
		}
		System.out.println();
		
		//2-2
		String[] e = new String[] {"안녕", "방가"};
		for(int i=0; i<e.length; i++) {
			System.out.print(e[i]+" ");//안녕 방가
		}
		System.out.println();
		for(String k : e) {
			System.out.print(k+" ");//안녕 방가
		}
		System.out.println();
		
		//2-3
		String[] f = {"안녕", "방가"};
		for(int i=0; i<f.length; i++) {
			System.out.print(f[i]+" ");//안녕 방가
		}
		System.out.println();
		for(String k : f) {
			System.out.print(k+" ");//안녕 방가
		}
		System.out.println();
	}
}
