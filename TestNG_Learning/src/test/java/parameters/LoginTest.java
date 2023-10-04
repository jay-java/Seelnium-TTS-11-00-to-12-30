package parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import util.DriverConnection;

public class LoginTest {
	@Parameters({"email","pass"})
	@Test
	public void login(String email,String password) {
		WebDriver driver = new DriverConnection().getDriver();
		driver.get("https://www.facebook.com/");
		WebElement emailEle = driver.findElement(By.id("email"));
		emailEle.clear();
		emailEle.sendKeys(email);
		WebElement passEle = driver.findElement(By.id("pass"));
		passEle.clear();
		passEle.sendKeys(password);
	}
}
