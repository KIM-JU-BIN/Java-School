package mission02_2400267;

class A{
	public <T> T firstElement(T[] t) {
		return t[0];
	}
}

public class Mission {
	public static void main(String[] args) {
		String[] words = {"apple", "banana", "cherry"};
	    Integer[] numbers = {1, 2, 3};
	    
	    A a = new A();
	    
	    System.out.println(a.firstElement(words)); //apple
	    System.out.println(a.firstElement(numbers)); //1
	}
}
