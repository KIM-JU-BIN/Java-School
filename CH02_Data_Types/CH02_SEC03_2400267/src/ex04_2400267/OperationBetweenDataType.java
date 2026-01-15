package ex04_2400267;

public class OperationBetweenDataType {
	public static void main(String[] args) {
		//#1. 같은 자료형간의 연산
		int val1 = 3+5;//8
		int val2 = 8/5;//1
		float val3 = 3.0f + 5.0f;//8.0
		double val4 = 8.0/5.0;//1.6
		
		byte data1 = 3;//3
		byte data2 = 5;//5
//		byte val5 = data1+data2;//오류: byte + byte=>int인데 저정공간은 byte자료형임
		//근데 변수로 더하면 다운캐스팅이 예외사항으로 적용이 안 됨
		int val5 = data1 + data2;
		
		System.out.println(val1); //8
        System.out.println(val2); //1
        System.out.println(val3); //8.0
        System.out.println(val4); //1.6
        System.out.println(val5); //8
        System.out.println();
        
        //#2. 다른 자료형간의 연산
        //int val6 = 5 + 3.5 //오류: int+double=>double인데 int의 저장공간에 넣으려면 다운캐스팅이라서 타입변환 필요
        double val6 = 5 + 3.5;//8.5
        int val7 = 5 + (int)3.5;//8
        
        double val8 = 5/2.0;//2.5
        byte data3 = 3;//3
        short data4 = 5;//5
        int val9 = data3 + data4;//8
        double val10 = data3 + data4;//8.0
        
        System.out.println(val6); //8.5
        System.out.println(val7); //8
        System.out.println(val8); //2.5
        System.out.println(val9); //8
        System.out.println(val10);//8.0		
	}
}
