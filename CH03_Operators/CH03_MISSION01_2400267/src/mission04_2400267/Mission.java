package mission04_2400267;

public class Mission {
	public static void main(String[] args) {
		System.out.println(7<<2);	//7*4=>28
		System.out.println(7>>1);	//7/2=3.5인데 양수라서 소수버림 => 3
		System.out.println(-7<<1);	//-14
		System.out.println(-7>>2);	//-7/4=>-(1+1)=>-2
		
		System.out.println(-1>>>30);//3
//		System.out.println(0x1111...1110>>>30);
//		31비트가 1, 1비트가 0으로 된 -1을 30비트만큼 오른쪽으로 옮기니 00...011 => 3
		}
}
