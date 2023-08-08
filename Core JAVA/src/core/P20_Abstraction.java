package core;
//no need to create object of abstract class
//static method called directly by class name
abstract class RBI{
	abstract public void interest();//method declaration
	abstract public void HL();
	public static void repoRate() {
		System.out.println("+-4%");
	}
}
class SBI extends RBI{

	@Override
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("sbi interrest : 7%");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("sbi HL 8%");
	}
	
}
class JAVA extends RBI{

	@Override
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("java interest : 8%");
	}

	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("java HL 9%");
	}
	
}
public class P20_Abstraction {
	public static void main(String[] args) {
		SBI s=  new SBI();
		s.interest();
		s.HL();
		SBI.repoRate();
		JAVA j = new JAVA();
		j.interest();
		j.HL();
		JAVA.repoRate();
	}
}
