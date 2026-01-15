package ex01_2400267;

/*클래스의 상속과 사용가능한 멤버*/

class Human{
	String name;
	int age;
	void eat() {
		System.out.println("Human-eat() 실행");
	}
	void sleep() {
		System.out.println("Human-sleep() 실행");
	}
}

class Student extends Human{
	int studentID;
	void goToSchool() {
		System.out.println("Student-goToSchool() 실행");
	}
}

class Worker extends Human{
	int workerID;
	void goToWork() {
		System.out.println("Worker-goToWork() 실행");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		

		
		//#1. Human 객체 생성
		Human h= new Human();
		h.name = "성춘향";
		h.age = 11;
		h.eat();
		h.sleep();
		
		//#2. Student 객체 생성
		Student s = new Student();
		s.name = "이몽룡";
		s.age = 16;
		s.studentID = 128;
		s.eat();
		s.sleep();
		s.goToSchool();
		
		//#3. Worker 객체 생성
		Worker w = new Worker();
		w.name = "변학도";
		w.age = 45;
		w.workerID = 128;
		w.eat();
		w.sleep();
		w.goToWork();
	}
}
