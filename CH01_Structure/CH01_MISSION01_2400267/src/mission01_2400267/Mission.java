package mission01_2400267;

class A{
	class B{
	}
}
public class Mission {
	class D{
		class E{
		}
	}
}
/*소스파일은 Mission.java 하나지만 
 * 그 안에 있는 class의 개수만큼 실행파일이 생성된다
 * 소스파일 개수: 1개(Mission.java)
 * 실행파일 개수: 5개(A.class, A$B.class, 
 * 				Mission.class, Mission$D.class,
 * 				Mission$D$E.class)*/

