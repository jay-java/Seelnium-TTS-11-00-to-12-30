package junit;

import org.junit.Test;

public class P06_Exception {
	@Test(expected = ArithmeticException.class)
	public void test1() {
		System.out.println("test 1 runnning");
		int i=10/0;
		System.out.println(i);
	}
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void test2() {
		System.out.println("test 2 running");
		int a[] = new int[5];
		a[6] = 13;
	}
}
