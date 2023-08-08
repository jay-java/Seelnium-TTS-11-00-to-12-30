package core;

//same function name
//into same class
//with different arguments
class Overload {
	public void area(int side) {
		System.out.println("square area : "+(side*side));
	}

	public void area(int length, int breadth) {
		System.out.println("rectanlge area : "+(length*breadth));
	}

	public void area(double base, double height) {
		System.out.println("triangle area : "+((base*height)/2));
	}
}

public class P18_Overloading {
	public static void main(String[] args) {
		Overload o = new Overload();
		o.area(12);
		o.area(12, 13);
		o.area(13.1, 13.3);
	}
}
