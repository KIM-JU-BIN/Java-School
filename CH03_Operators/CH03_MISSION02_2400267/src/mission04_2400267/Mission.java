package mission04_2400267;

public class Mission {
	public static void main(String[] args) {
		int a = 5;
		
		a <<= 1;//a=a<<1
		System.out.println(a);//a*2=5*2=10
		
		a &= 3;//a=a&3 -> 10&3 -> 1010 & 0011
		System.out.println(a);//0010 => 2
		
		a +=2;//a=a+2
		System.out.println(a *=2);//8
	}
}
