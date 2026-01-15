package mission01_2400267;

public class Mission {
	public static void main(String[] arg){
		System.out.println("for문으로 작성");
		for(int a=0; a<20; a++ ) {
			System.out.printf("%d. 2학년\n",a+1);
		}
		
		
		System.out.println("while문으로 작성");
		int a=0;
		while(a<20) {
			if(a>20) {
				break;
			}
			System.out.printf("%d. 2학년\n",a+1);
			a++;
		}
		
		System.out.println("do-while문으로 작성");
		int b=0;
		do {
			System.out.printf("%d. 2학년\n",b+1);
			b++;
		}while(b<20);
	}
}
