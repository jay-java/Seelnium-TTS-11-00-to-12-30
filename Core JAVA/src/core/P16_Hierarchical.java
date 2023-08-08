package core;
//Hierarchical
class A1{
	public void classA() {
		System.out.println("class A method");
	}
}
class B1 extends A1{
	public void classB() {
		System.out.println("class B method");
	}
}
class C1 extends A1{
	public void classC() {
		System.out.println("class C method");
	}
}
public class P16_Hierarchical {
	public static void main(String[] args) {
		B1 b = new B1();
		b.classA();
		b.classB();
		C1 c = new C1();
		c.classA();
		c.classC();
	}
}
