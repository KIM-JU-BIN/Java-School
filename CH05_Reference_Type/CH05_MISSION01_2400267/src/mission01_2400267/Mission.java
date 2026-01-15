package mission01_2400267;

import java.util.Arrays;

public class Mission {

	public static void main(String[] args) {
		//1-1
		int[] a = new int[5];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		//1-2
//		System.out.println(Arrays.toString(a));
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println();
		
		
		//2-1
		double[] b = new double[] {1.5, 2.6, 3.8};
		//2-2
//		System.out.println(Arrays.toString(b));
		for(double k: b) {
			System.out.println(k);
		}
		System.out.println();
		
		
		//3-1
		String[] c = new String[] {"땡큐", "베리", "감사"};
		//3-2
		System.out.println(Arrays.toString(c));
		System.out.println();
		
		
		//4-1
		boolean[] d = new boolean[] {false, true, false, true};
		System.out.println(Arrays.toString(d));
		
	}
}
