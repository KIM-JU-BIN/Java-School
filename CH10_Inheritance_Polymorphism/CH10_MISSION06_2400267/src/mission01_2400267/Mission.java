package mission01_2400267;
class A{
	String name;
	int age;
	
//	@Override
	public String toString() {
//		return "{name : \""+name+"\", age : "+age+"}";
		return "{name:\""+name+"\", age:"+age+"}";
	}
}
public class Mission {
	public static void main(String[] ar) {
		A aa = new A();
		aa.name = "홍길동";
		aa.age = 16;
		
		System.out.println(aa);
	}
}
