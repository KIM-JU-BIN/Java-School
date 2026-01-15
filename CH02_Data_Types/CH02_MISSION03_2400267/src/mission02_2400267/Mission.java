package mission02_2400267;

public class Mission {
	public static void main(String[] args) {
		char a = 'A';//A
		char b = 65;//A
		System.out.println(a);
		/*결과: A
		 * char 자료형은 문자A를 유니코드표에 따라서 해당하는 10진수 값이 변수a에 저장되고
		 * 출력할 때는 정숫값에 해당하는 문자값을 출력한다*/
		System.out.println(b);
		/*결과: A
		 * char 자료형은 정수65를 그대로 변수b에 저장하고
		 * 10진수 65에 해당하는 문자값이 출력된다.*/
		
		int c = 'A';//65
		int d = 65;//65
		System.out.println(c);
		/*결과: 65
		 * char타입인 문자가 유니코드표에 따라서 10진수 정수로 바뀌어 변수c에 저장된다.*/
		System.out.println(d);
		/*결과: 65
		 * 정수타입 변수d에 65인 정수(int)타입을 저장하니 그대로 나옴 */
	}
}
