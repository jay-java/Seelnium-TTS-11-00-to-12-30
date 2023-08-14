package core;
//interface -> same as class but not class
//			->cannot create object of interface
//			->can create reference
//			->by default properties are abstract in interface
//			->interface provides 100% abstraction
//			->abstract property should be implemented
interface inter1{
	public void interface1();
	public static void interface4() {
		System.out.println("interface 4");
	}
}
interface inter2 extends inter1{
	public void interface2();
}
interface inter3{
	public void interface3();
}
class InterCall implements inter2,inter3{

	@Override
	public void interface1() {
		System.out.println("interfac 1");
	}

	@Override
	public void interface3() {
		System.out.println("interfac 3");
	}

	@Override
	public void interface2() {
		System.out.println("interfac 2");
	}
	
}
public class P21_Interface {
	public static void main(String[] args) {
		InterCall i = new InterCall();
		i.interface1();
		i.interface2();
		i.interface3();
		inter1.interface4();
	}
}
