package ex05_2400267;

public class ArgumentOfMainMethod {
	public static void main(String[] args) {
		//#1. args 배열의 길이 구하기
		System.out.println(args.length);//3
		System.out.println();
		
		//#2. 매개변수 출력1
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
//		System.out.println(Integer.parseInt(args[1])+1); //4=>문자열 3을 정수로 바꾸고 연산
		System.out.println();
		
		//#3. 매개변수 출력2
		for(String s: args) {
			System.out.println(s);
		}
		System.out.println();
		
	}
}
