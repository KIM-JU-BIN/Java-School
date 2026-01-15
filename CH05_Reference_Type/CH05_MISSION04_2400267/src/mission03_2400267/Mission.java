package mission03_2400267;

public class Mission {
	public static void main(String[] args) {
		String a = new String("카드사용 내역 [사용일] 2026.05.05 [사용금액] 20000원 사용하였습니다");
		//사용일
		int index1 = a.indexOf("사용일");
		int index2 = a.indexOf("사용금액");
		int index3 = a.indexOf("원");
		String b = a.substring(index1+5, index2-2);//(14, 24)
		String c = a.substring(index2+6, index3);//(32,37) 
		System.out.println("사용일: " + b);//사용일: 2026.05.05
		System.out.println("사용금액: " + c);//사용금액: 20000
	}
}
