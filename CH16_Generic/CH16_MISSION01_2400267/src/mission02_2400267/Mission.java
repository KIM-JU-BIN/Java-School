package mission02_2400267;

class AB{
	Object n;
	public void set(Object n) {
		this.n = n;
	}
	public Object get() {
		return n;
	}
}

public class Mission {
	public static void main(String[] args) {
		
		AB ab = new AB();
		
		//#Integer 저장 => Integer 출력
		ab.set(3);
		Integer aa = (Integer)ab.get();
		System.out.println(aa);//3
		
		//#String 저장 => String 출력
		ab.set("안녕");
		String bb = (String)ab.get();
		System.out.println(bb);//안녕
	}
}
