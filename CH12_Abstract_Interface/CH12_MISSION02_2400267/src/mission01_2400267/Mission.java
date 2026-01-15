package mission01_2400267;

class A{}
class B extends A{}
interface C{}
interface D{}
class E implements C{}
interface F extends D{}
class G implements C,F{}
class H extends B implements C,D{}

public class Mission {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		E e = new E();
		G g = new G();
		H h = new H();
	}
}
