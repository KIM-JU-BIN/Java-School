package mission01_2400267;

public class Mission {
	public static void main(String[] args) {
		
		//#정수를 저장하는 4개 자요형의 최소/최대값
		byte b_max = 127;
		byte b_min = -128;
		short s_max = 32767;
		short s_min = -32768;
		int c_max = 2147483647;
		int c_min = -2147483648;
		long l_max = 9223372036854775807L;
		long l_min = -9223372036854775808L;
		
		//#위의 8개 변수값 출력
		System.out.println(b_max);
		System.out.println(b_min);
		System.out.println(s_max);
		System.out.println(s_min);
		System.out.println(c_max);
		System.out.println(c_min);
		System.out.println(l_max);
		System.out.println(l_min);
	}
}
