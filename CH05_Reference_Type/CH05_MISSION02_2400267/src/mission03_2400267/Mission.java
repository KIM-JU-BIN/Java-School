package mission03_2400267;

public class Mission {
	public static void main(String[] args) {
		//실행 전 출력 결과를 쓰고 주석으로 이유를 설명하라 
		  
		  //boolean vs. boolean[]----------
		  boolean a1 = true;
		  boolean b1 = a1;//bl=true
		  b1=false;
		  
		  System.out.println(a1);//true
		  //'='는 stack 값을 넣는다
		  //기본자료형의 값은 stack에 저장되므로 bl 값이 바뀌어도 al 값은 변하지 않음
		  System.out.println(b1);//false
		  
		  
		  boolean[] a2 = {true};
		  boolean[] b2 = a2;
		  b2[0]=false;
		  
		  System.out.println(a2[0]);//false
		  //참조자료형은 stack에는 주소값을 저장하므로 a2와 b2는 같은 참조값을 갖음
		  //b2값이 바뀌면 a2값도 바뀜
		  System.out.println(b2[0]);//false
		  
		  //int vs. int[]-----------------
		  int a3 = 3;
		  int b3 = a3;//b3=3
		  b3 = 5;
		  
		  System.out.println(a3);//3
		  //참조자료형이 아니라 기본자료형이므로 서로 연관 없다.
		  System.out.println(b3);//5
		  
		  int[] a4 = {3};
		  int[] b4 = a4;
		  b4[0] = 5;
		  
		  System.out.println(a4[0]);//5
		  System.out.println(b4[0]);//5
		  //a4와 b4는 참조자료형으로 같은 주소값을 갖으므로 하나를 변경하면 같이 변경됨
	        
	
	}
}
