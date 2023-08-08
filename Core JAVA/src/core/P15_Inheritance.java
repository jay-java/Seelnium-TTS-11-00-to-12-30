package core;
//single
class A{
	A(){
		System.out.println("A cons");
	}
	public void classA() {
		System.out.println("class A method");
	}
}
class B extends A{
	B(){
		System.out.println("B cosn");
	}
	public void classB() {
		System.out.println("class B method");
	}
}
//multilevel
class C extends B{
	C(){
		System.out.println("C cons");
	}
	public void classC() {
		System.out.println("class C method");
	}
}
class D extends C{
	D(){
		System.out.println("D cons");
	}
	public void classD() {
		System.out.println("class D method");
	}
}
public class P15_Inheritance {
	public static void main(String[] args) {
		B b = new B();
		b.classA();
		b.classB();
		A a = new A();
		a.classA();
		D d = new D();
		d.classA();
		d.classB();
		d.classC();
		d.classD();
	}
}
