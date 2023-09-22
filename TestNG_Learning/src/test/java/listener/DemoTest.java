package listener;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

public class DemoTest {
	@Test
	public void test1() {
		System.out.println("test 1 running");
	}
	@Test
	public void test2() {
		assertFalse(true);
		System.out.println("test 2 running");
	}
}
