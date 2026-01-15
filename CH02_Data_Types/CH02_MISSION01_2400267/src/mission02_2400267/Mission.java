package mission02_2400267;

public class Mission {
	public static void main(String[] args) {
		int a = 3;//변수 a가 생성
		{
			int b;//변수 b가 생성
			b = 5;//변수 b의 값 저장
		}//변수 b 소멸
		int c = 7;//변수 c가 생성
	}//변수 a, c 소멸
}
