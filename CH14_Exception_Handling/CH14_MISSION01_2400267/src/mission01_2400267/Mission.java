package mission01_2400267;

public class Mission {
	public static void main(String[] args) {
		int a, b;
		
		//# 나눗셈 결과 출력하기 1
		a=10;
		b=5;
		System.out.println(a/b);//2
		
		//# 1초 기다리기
		try {Thread.sleep(1000);}
		catch(InterruptedException e) {
			System.out.println("InterruptedException 예외 발생");
		}
		//일반예외로 인한 문법오류 발생(일반예외)
		//InterruptedException 예외처리 필요
		
		//# 나눗셈 결과 출력하기 2
		a=10;
		b=0;
		System.out.println(a/b);
		//실행 중 프로그램 강제 종료(실행예외), 분모가 0인 연산은 불가함
		//예외처리는 안 해줘도 됨, ArithmeticException
		
		//#배열 사용하기
		int[] c = {1,2,3};
		System.out.println(c[3]);
		//실행 중 프로그램 강제 종료(실행예외), 인덱스 범위를 넘음
		//ArrayIndexOutBoundException
	}
}
