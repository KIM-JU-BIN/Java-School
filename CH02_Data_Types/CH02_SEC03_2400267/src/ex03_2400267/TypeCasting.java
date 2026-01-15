package ex03_2400267;

public class TypeCasting {
	public static void main(String[] args) {
		//#1. 자동타입변환 (업캐스팅 + byte/short 자료형 데이터 입력
		float val1 = 3;//int=>float (up casting)
		long val2 = 5;//int=>long (up casting)
		double val3 = 7;//int=>double (up casting)
		byte val4 = 9;//(예외: int=>byte)
		short val5 = 11;//(예외: int=>short)
		
		System.out.println(val1);//3.0
		System.out.println(val2);//5
		System.out.println(val3);//7.0
		System.out.println(val4);//9
		System.out.println(val5);//11
		System.out.println();
		
		//#2. 수동타입변환
		byte val6 = (byte)128; //int=>byte (down casting)
		int val7 = (int)3.5;//double=>int (down casting)
		float val8 = (float)7.5;//double=>float (down casting)
		
		System.out.println(val6);//-128
		System.out.println(val7);//3
		System.out.println(val8);//7.5
	}
}
