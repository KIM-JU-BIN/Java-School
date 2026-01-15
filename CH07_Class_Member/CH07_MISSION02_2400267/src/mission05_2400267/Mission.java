package mission05_2400267;

class A{
	void abc(int... a) {
		int sum = 0;
		/*for(int i=0; a.length>=i; i++) {
			sum = sum + i;
		}
		System.out.println(sum);*/
		for(int k : a){
			sum+=k;
		 }
		System.out.println(sum);
	}
	
}
public class Mission {
	public static void main(String[] args) {
		A a = new A();
		a.abc();
		a.abc(1);
		a.abc(1,2);
		a.abc(1,2,3);
		a.abc(1,2,3,4);
		a.abc(1,2,3,4,5);
		a.abc(1,2,3,4,5,6);
	}
}
