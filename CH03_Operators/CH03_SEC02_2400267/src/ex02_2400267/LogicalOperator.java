package ex02_2400267;

public class LogicalOperator {
	public static void main(String[] args) {
//		#1. 논리연산자
//		@AND (&&)
		System.out.println(true && true);//true
		System.out.println(true && false);//false
		System.out.println(true && (5<3));//true && false =false
		System.out.println((5<=5) && (7>2));//true && true = true
		System.out.println();
		
//		@OR (||)
		System.out.println(true || true);//true
		System.out.println(true || false);//true
		System.out.println(false || (5<3));//false || false = false
		System.out.println((5<=5) || (7>2));//true || true = true
		System.out.println();
		
//		@XOR (^)
		System.out.println(true ^ true);//false
		System.out.println(true ^ false);//true
		System.out.println(false ^ (5<3));//false ^ false = false
		System.out.println((5<=5) ^ (7>2));//true ^ true = false
		System.out.println();
		
//		@NOT (!)
		System.out.println(!true);//false
		System.out.println(!false);//true
		System.out.println(false || !(5<3));//false || !false =true
		System.out.println((5<=5) || !(7>2));//true || !true = true
		System.out.println();
		
//		#2. 비트연산자로 논리연산 수행
		System.out.println(true & true);//true
		System.out.println(true & false);//false
		System.out.println(true | (5<3));//true | false = true
		System.out.println((5<=5) | (7>2)); //true | true = true
        System.out.println();
        
//      @숏 서킷 사용 여부 (논리연산자는 O,  비트연산자는 X)
        int value1 = 3;
        System.out.println(false && ++value1>4);//false 논리연산자이므로 앞에만 보고 바로 결과 유출
        System.out.println(value1);//3, 43번줄에서 논리연산자 왼쪽은 실행X
        
        int value2 = 3;
        System.out.println(false & ++value2>4);//false & false=false
        System.out.println(value2);//4
        
        int value3 = 3;
        System.out.println(true || ++value3>4); //둘 중 하나만 true면 true
        System.out.println(value3); //3, 51번 뒤에 실행 안 함
        
        int value4 = 3;
        System.out.println(true | ++value4>4); //true | false = true
        System.out.println(value4); //4		
    }
}
