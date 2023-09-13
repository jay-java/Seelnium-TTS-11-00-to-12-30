package junit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.DriverConnnection;

public class P05_AnnotaionPractical {
	static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		driver = new DriverConnnection().getDriver();
		driver.get("https://www.facebook.com/");
	}

	@Test
	public void loginTest() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("selenium@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("selenium@123");
		Thread.sleep(3000);
	}

	@AfterClass
	public static void afterClass() {
		driver.close();
	}
}
