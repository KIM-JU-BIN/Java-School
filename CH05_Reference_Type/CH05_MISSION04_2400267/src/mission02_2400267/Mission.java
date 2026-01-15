package mission02_2400267;

public class Mission {
	public static void main(String[] args) {
		String a = "방가";
		String b = new String("방가");
		String c = "방가";
		String d = new String("방가");
		String e = "방가";
		String f = new String("방가");

		System.out.println(a == b);//stack값비교, false
		System.out.println(a == c);//리터럴로 작성하였으므로 같은 객체를 공유함 => 같은 주소값을 가짐, true
		System.out.println(a == d);//stack값비교, false
		System.out.println(a == e);//리터럴로 작성하였으므로 같은 객체를 공유함 => 같은 주소값을 가짐, true
		System.out.println(a == f);//stack값비교, false
		System.out.println();
		System.out.println(b == c);//stack값비교 다른 객체 가르킴, false
		System.out.println(b == d);//stack값비교 다른 객체 가르킴, false
		System.out.println(b == e);//stack값비교 다른 객체 가르킴, false
		System.out.println(b == f);//stack값비교 다른 객체 가르킴, false
	}
}
