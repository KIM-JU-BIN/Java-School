package mission03_2400267;

class A{
	int m;
	
	A(int m){
		this.m=m;
	}
}
public class Mission {
	public static void main(String[] args) {
		A a1 = new A(3);
		A a2 = new A(3);
		
		A a3 = a1;//a3가 a1과 같은 객체 가르킴
		A a4 = a2;//a4가 a2와 같은 객체 가르킴
		
		System.out.printf("%x\n", a1.hashCode());//6f2b958e
//a2와 hashcode()가 다른 이유는 다른 객체를 생성해서 참조하고 있기 때문에 다른 참조값 가짐
//참조변수 a3와 값이 같은 이유는 a1이 가지고 있는 주소값을 복사해서 a3에 저장하기 때문에, 둘이 같은 객체를 가르키고 있음
		
		System.out.printf("%x\n", a2.hashCode());//3339ad8e
//a1와 hashcode()가 다른 이유는 다른 객체를 생성해서 참조하고 있기 때문에 다른 참조값 가짐
//참조변수 a4와 값이 같은 이유는 a2가 가지고 있는 주소값을 복사해서 a4에 저장하기 때문에, 둘이 같은 객체를 가르키고 있음
		
		System.out.printf("%x\n", a3.hashCode());//6f2b958e
//a2와 hashcode()가 다른 이유는 다른 객체를 생성해서 참조하고 있기 때문에 다른 참조값 가짐
//참조변수 a1와 값이 같은 이유는 a1이 가지고 있는 주소값을 복사해서 a3에 저장하기 때문에, 둘이 같은 객체를 가르키고 있음
				
		System.out.printf("%x\n", a4.hashCode());//3339ad8e
//a1와 hashcode()가 다른 이유는 다른 객체를 생성해서 참조하고 있기 때문에 다른 참조값 가짐
//참조변수 a2와 값이 같은 이유는 a2가 가지고 있는 주소값을 복사해서 a4에 저장하기 때문에, 둘이 같은 객체를 가르키고 있음
	}
}
