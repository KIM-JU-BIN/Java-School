package ex02_2400267;

public class NamingVariableAndConstant {

	public static void main(String[] args) {
		//변수의 이름
		boolean aBcD;  // 가능은 하지만 권장사항에 위배
		byte 가나다;
		short _abcd;
		char $ab_cd;
		//int 3abcd;	//불가능 - 숫자가 맨 앞에 올 수 없음
		long abcd3;
		//float int;	//불가능 - 자바에서 사용하는 키워드 변수이름으로 사용 안 됨
		double main;	//가능 - 메서드 이름과 변수이름은 동일해도 무관
		//int my Work;	//불가능 - 스페이스 불가능
		String myClassName;
		int ABC;		//가능은 하지만 권고사항에 위반
		
		//상수이름
		final double PI;
		final int MY_DATA;
		final float myData;	//가능은 하지만 권고사항에 위반
	}
}
