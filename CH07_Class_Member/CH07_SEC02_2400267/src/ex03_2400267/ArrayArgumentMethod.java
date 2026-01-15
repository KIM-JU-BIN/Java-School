package ex03_2400267;

/*배열 매개변수를 가지는 메서드 호출*/

import java.util.Arrays;

public class ArrayArgumentMethod {
	public static void main(String[] args) {
		//배열을 매개변수로 가지는 메서드 호출
		int[] a = new int[] {1,2,3};
		printArray(a);//함수 호출
		printArray(new int[] {1,2,3});
//		printArray({1,2,3});오류 발생, 배열의 선언과 초기화를 할 때 분리 불가
	}
	public static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}
}
