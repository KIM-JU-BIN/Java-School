package mission01_2400267;

class Alarm{
	void ring() {
		System.out.println("알람이 울립니다");
	}
}
class AlarmClock1 extends Alarm{
	void ring() {
		System.out.println("띠링띠링띠링띠링");
	}
}
class AlarmClock2 extends Alarm{
	void ring() {
		System.out.println("따르르르르릉");
	}
}
public class Mission {
	public static void main(String[] ar) {
		
		Alarm a = new Alarm();
		a.ring(); //알람이 울립니다
//Alarm 객체가 만들어지고 메서드가 메서드 영역에 저장되어 결과 나옴
		
		Alarm b = new AlarmClock1();
		b.ring(); //띠링띠링띠링띠링
//부모인 Alarm 객체가 먼저 만들어지고 메서드 영역에도 Alarm 메서드가 먼저 저장됨
//AlarmClock1 객체가 만들어지고 메서드가 메서드 영역에 저장되는데 
//Alarm 메서드와 리턴타입+시그니처가 같으므로 메서드 오버라이딩이 일어나 덮어씌우기 됨
		
		Alarm c = new AlarmClock2();
		c.ring(); //따르르르르릉
//부모인 Alarm 객체가 먼저 만들어지고 메서드 영역에도 Alarm 메서드가 먼저 저장됨
//AlarmClock2 객체가 만들어지고 메서드가 메서드 영역에 저장되는데 
//Alarm 메서드와 리턴타입+시그니처가 같으므로 메서드 오버라이딩이 일어나 덮어씌우기 됨
	}
}
