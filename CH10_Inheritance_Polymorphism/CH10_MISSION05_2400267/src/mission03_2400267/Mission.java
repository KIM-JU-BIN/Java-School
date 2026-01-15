package mission03_2400267;

class A{
	A(){
		this(3.2);//자기 객체의 A(double m)생성자 호출
		System.out.println("A 클래스의 첫 번째 생성자");
	}
	A(int m){
		this();//자기 객체의 A()생성자 호출
		System.out.println("A 클래스의 두 번째 생성자");
	}
	A(double m){
		System.out.println("A 클래스의 세 번째 생성자");
	}
}
class B extends A{
	B(){
		super(3);//부모 객체의 A(int m)생성자 호출
		System.out.println("B 클래스의 첫 번쨰 생성자");
	}
	B(int m){//첫번째로 호출됨
		this(2.8);//자기 객체의 B(double m)생성자 호출
		System.out.println("B 클래스의 두 번째 생성자");
	}
	B(double m){
		this();//자기 객체의 B()생성자 호출
		System.out.println("B 클래스의 세 번째 생성자");
	}
}
public class Mission {
	public static void main(String[] ar) {
		A ab = new B(3);
/*호출을 먼저하고 출력은 호출의 역순으로 되므로 출력되는 순서에서 반대로 따라가면서 생성자들 호s출
		A 클래스의 세 번째 생성자
		A 클래스의 첫 번째 생성자
		A 클래스의 두 번째 생성자
		B 클래스의 첫 번째 생성자
		B 클래스의 세 번째 생성자
		B 클래스의 두 번째 생성자
 * 
 */
	}
}
