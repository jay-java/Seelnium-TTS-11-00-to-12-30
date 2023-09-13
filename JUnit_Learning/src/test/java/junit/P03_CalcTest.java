package junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class P03_CalcTest {
	@Test
	public void test() {
		Calc c = new Calc();
		int actual = c.addition(10, 20);
		int expected = 30;
		assertEquals(expected, actual);
	}
}
