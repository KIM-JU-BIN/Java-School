package mission02_2400267;

public class Mission {
	public static void main(String[] args) {
		//아래 코드 중에서 오류가 있는 부분을 주석처리하고 오류의 이유를 주석으로 표기
//		byte a = 250;	//byte로 저장할 수 있는 최대값은 127까지임
//		int b = 5.8;	//b는 정수를 저장하는 메모리 공간이므로 5.8인 실수를 저장할 수 없음
//		float c = 3.2;	//3.2는 실수인데 실수는 기본적으로 double로 저장이 되는데 
		//c는 double보다 작은 범위를 나타내므로 저장할 없다
		double d = 3;
		
		//#다음의 출력값을 확인하고 해당 출력값이 나온 이유를 주석으로 설명
		System.out.println(d);
		//3.0
		//d라는 변수에 3이라는 정수를 저장하려면 3을 먼저 int형 저장공간에 저장하고
		//int=>double로 저장하는 up Casting 과정을 거치므로 3.0인 실수로 나오게 된다 
		
	}
}
