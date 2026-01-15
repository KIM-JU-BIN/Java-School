package mission02_2400267;

public class Mission {
	public static void main(String[] args) {
		
		
		//방법1
		int[] a = new int[50];
		for(int i=0; i<a.length; i++) {
			a[i]=i*2;
		}
		//방법2
		for(int i=0,j=0; i<a.length; i++, j+=2) {
			a[i]=j;
		}
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
