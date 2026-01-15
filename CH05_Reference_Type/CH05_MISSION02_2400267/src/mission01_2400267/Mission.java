package mission01_2400267;

import java.util.Arrays;

public class Mission {
	public static void main(String[] args) {
		//1
		boolean[] a = new boolean[3];
		System.out.println(Arrays.toString(a));//[false, false, false]
		
		//2
		int[] b = new int[3];
		System.out.println(Arrays.toString(b));//[0, 0, 0]
		
		//3
		double[] c = new double[3];
		System.out.println(Arrays.toString(c));//[0.0 0.0 0.0]
		
		//4
		char[] d = new char[3];
		for(int i=0; i<3; i++) {
			System.out.print((int)d[i]+" ");//0 0 0
		}
		System.out.println();
		
		//5
		String[] e = new String[3];
		System.out.println(Arrays.toString(e));//[null, null, null]
		
	}
}
