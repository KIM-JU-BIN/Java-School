package mission01_2400267;

class Point2D<T>{
	T x; //가로
	T y; //세로
}
class Point3D<T,V> extends Point2D<T>{
	V z;
}

public class Mission {
	public static void main(String[] args) {
		Point3D<Integer, Double> p = new Point3D<>();
		p.x=10; //기로(정수)
		p.y=20; //세로(정수)
		p.z=5.8; //높이(실수)
		
		System.out.println(p.x);
		System.out.println(p.y);
		System.out.println(p.z);
	}
}
