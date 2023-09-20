package basic;

import org.testng.annotations.Test;

public class NewTest {
	@Test(enabled = false)
	public void test1() {
		System.out.println("test 1");
	}
	@Test(priority = 4,expectedExceptions = ArithmeticException.class)
	public void test2() {
		int i = 10/0;
		System.out.println("test 2 : "+i);
	}
	@Test(priority = 1)
	public void test3() {
		System.out.println("test 3");
	}
	@Test(priority = 2)
	public void test4() {
		System.out.println("test 4");
	}
}
