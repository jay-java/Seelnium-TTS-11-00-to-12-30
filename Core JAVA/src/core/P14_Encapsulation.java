package core;
//OOPS-> Object Oriented Programming system/Structure
//1.Class->structure in which we can have member function and member variable
//2.Object-> instance of class
//3.Encapsulation->To wrapping up data into single unit
//4.Inheritance->To access property of one class to another class
	//types 1.single 2.Multilevel 3.Multiple 4.Hierarchical 5.Hybrid
//5.Polymorphism->same method name but having different functionality
//6.Abstraction->hiding internal details and showing only essential info to user
class NewData1{
	private int i;
	private String name;
	private double value;
	public NewData1() {
	}
	public NewData1(int i,String name,double value) {
		this.i = i;
		this.name=name;
		this.value=value;
	}
	public void setI(int i) {
		this.i=i;
	}
	public int getI() {
		return i;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setValue(double value) {
		this.value=value;
	}
	public double getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "i = "+i+" name : "+name+" value : "+value;
	}
}
public class P14_Encapsulation {
	public static void main(String[] args) {
		NewData1 d1 = new NewData1(1, "java", 23.2);
		System.out.println(d1);
//		System.out.println(d1.getI());
//		System.out.println(d1.getName());
//		System.out.println(d1.getValue());
	}
}
