package core;
//final 
//1. variable -> cannot change value of variable
//2. method -> cannot override
//3. class -> cannot inherit
final class FinalCall{
	final int i = 1;
	final public void change() {
		i++;
		System.out.println(i);
	}
}
class IN extends FinalCall{
	public void change() {
		System.out.println("hello");
	}
}
public class P24_Final {
	public static void main(String[] args) {
		FinalCall f = new FinalCall();
		f.change();
	}
}
