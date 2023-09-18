package junit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class P07_Parameterized {
	int a;
	int b;
	int result;
	
	public P07_Parameterized(int a,int b,int result) {
		this.a=a;
		this.b=b;
		this.result=result;
	}
	
	@Test
	public void testAddition() {
		Calc c = new Calc();
		int actual = c.addition(a, b);
		int expected = result;
		assertEquals(expected, actual);
	}
	
	@Parameters
	public static List<Object[]> getData() {
		Object[][] obj = new Object[4][3];
		
		obj[0][0] = 1;
		obj[0][1] = 2;
		obj[0][2] = 3;
		
		obj[1][0] = 10;
		obj[1][1] = 20;
		obj[1][2] = 30;
		
		obj[2][0] = 112;
		obj[2][1] = 11;
		obj[2][2] = 100;
		
		obj[3][0] = 1;
		obj[3][1] = 1;
		obj[3][2] = 2;
		
		return Arrays.asList(obj);
		
	}
}
