package core;
//same function same
//arguments same
//into different
//inheritance compulsary
class Parent{
	public void call() {
		System.out.println("parent calling");
	}
	public void call123() {
		System.out.println("parent 123 calling");
	}
}
class Child extends Parent{
	public void call() {
		super.call();
		System.out.println("child calling");
	}
}
public class P19_Overriding {
	public static void main(String[] args) {
		Child c = new Child();
		c.call();
		c.call();
	}
}
