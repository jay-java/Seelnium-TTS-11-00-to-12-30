package listener;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import util.DriverConnection;

public class FBTest {
	@Test(priority = 1)
	public void titleTest(ITestContext i) {
		WebDriver driver = new DriverConnection().getDriver();
		driver.get("https://www.facebook.com/");
		i.setAttribute("jay", driver);
		assertEquals(driver.getTitle(), "FB");
	}

	@Test(priority = 2, dependsOnMethods = "titleTest")
	public void loginTest() {
		System.out.println("login worked");
		WebDriver driver = new DriverConnection().getDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("selenium@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("selenium@123");
		driver.findElement(By.name("login")).click();
	}
}