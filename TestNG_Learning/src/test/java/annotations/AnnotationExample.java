package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationExample {
	@BeforeTest
	public void before() {
		System.out.println("before test");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("after test");
	}
	
	@Test
	public void test1() {
		System.out.println("test 1 running");
	}
	@Test
	public void test2() {
		System.out.println("test 2 running");
	}
	@BeforeClass
	public void beforeClassss() {
		System.out.println("before class");
	}
	@AfterClass
	public void afetClasss() {
		System.out.println("after class");
	}
}
