package mission03_2400267;

public class Mission {
	public static void main(String[] args) {
		  int a, b, c;
		  
		  a=4; b=5; c=6;
		  
		  System.out.println(false && a-- > 6);//false
		  //a=4, a--실행 안 됨
		  System.out.println(true || b++ > 6);//true
		  //b=5, b++실행 안 됨
		  System.out.println(true ^ c++ > 6);//true ^ false =>true
		  //c=7, c++실행 됨
		  System.out.println(a);//4
		  System.out.println(b);//5
		  System.out.println(c);//7
		  System.out.println();
		  
		  a = 4; b = 5; c = 6;
		  System.out.println(false & a-- > 6);//false & false =>false
		  //a=3. a--실행 됨
		  System.out.println(true | b++ > 6);//true | false => true
		  //b=6, b++실행됨 
		  System.out.println(true ^ c++ > 6);//true ^ false => true
		  //c=7, c++실행 됨
		  System.out.println(a);//3
		  System.out.println(b);//6
		  System.out.println(c);//7
	}
}
