package mission01_2400267;

import java.util.Arrays;

public class Mission {
	public static void main(String[] args) {
		//1
		String  a = new String( "    I like java programming and I like apples    ");
		
		//2
		a = a.trim();//공백제거
		System.out.println(a);//I like java programming and I like apples
		
		//3
		System.out.println(a.length());//41, 문자열의 개수 출력
		
		//4
		if(a.indexOf("apples") == -1) {
			System.out.println(false);
		}else {
			System.out.println(true);//출력
		}
		
		//5
		System.out.println(a.toUpperCase());//I LIKE JAVA PROGRAMMING AND I LIKE APPLES
		
		//6
		String b = a.replace("like", "love");//I LIKE JAVA PROGRAMMING AND I LIKE APPLES
		System.out.println(b);
		
		//7
		for(int k = a.indexOf("like"); k >= 0; k = a.indexOf("like", k+1)) {
			System.out.println(k);//2, 30
		}
		System.out.println();
		
		//8
		for(int i = a.length()-1; i>=0; i--) {
			System.out.println(a.charAt(i));
		}
	}
}
