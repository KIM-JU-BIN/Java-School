package mission03_2400267;

class Printer{
//	@오버로딩(메서드 이름 동일, 시그니처 다름)
	void print() {
		System.out.println("기본 출력");
	}
	void print(String msg) {
		System.out.println("메시지 출력 : msg");
	}
}

class ColorPrinter extends Printer{
	void print() {
		System.out.println("컬러 출력");
	}
}
public class Mission {
	public static void main(String[] ar) {
		Printer pp = new Printer();
		pp.print();//기본 출력
//Printer생성자로 생성된 객체 안에 메서드는 2개, 그 중에서 매개변수가 없는 메서드를 출력
		pp.print("안녕");//메세지 출력 : msg
//Printer생성자로 생성된 객체 안에 메서드는 2개, 그 중에서 매개변수가 있는 메서드 출력
		
		Printer pc = new ColorPrinter();
		pc.print();//오버라이딩, 컬러 출력
//ColorPrinter생성자로 생성된 객체 안에 부모객체인 Printer를 먼저 만들어서 메서드 영역에 메서드 먼저 저장
//ColorPrinter의 메서드가 Printer 메서드와 print() 시그니처+리턴타입 동일해서 메서드 오버라이딩 일어남
//가장 마지막에 저장된 메서드로 덮어씀
		
		pc.print("안녕");//메세지 출력 : msg
//매개변수가 있는 메서드로 출력
	}
}
