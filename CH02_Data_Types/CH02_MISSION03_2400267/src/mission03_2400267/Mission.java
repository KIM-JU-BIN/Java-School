package mission03_2400267;

public class Mission {
	public static void main(String[] args) {
		byte a = 3;
		byte b = 5;
		byte c = (byte)130;//byte자료형은 양수로 127까지만 표현 가능함, -128쪽으로 다시 돌아감
		byte d = (byte)(a+b);//byte + byte = int이므로 byte로 타입변환
		long e = 100;
		float f = 3.5F;//double=>float 다운캐스팅이므로 F를 써줘야함
		
		System.out.println(a);//3
		System.out.println(b);//5
		System.out.println(c);//-126
		System.out.println(d);//8
		System.out.println(e);//100
		System.out.println(f);//3.5
	}
}
