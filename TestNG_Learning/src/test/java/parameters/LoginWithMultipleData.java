package parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import util.DriverConnection;

public class LoginWithMultipleData {
	static WebDriver driver;

//	@BeforeClass
//	public static void openBrowser() {
//		driver = new DriverConnection().getDriver();
//		driver.get("https://www.facebook.com/");
//	}

	@Test(dataProvider = "dp")
	public void login(String email, String password) {
		WebDriver driver =  new DriverConnection().getDriver();
		driver.get("https://www.facebook.com/");
		WebElement emailEle = driver.findElement(By.id("email"));
		emailEle.clear();
		emailEle.sendKeys(email);
		WebElement passEle = driver.findElement(By.id("pass"));
		passEle.clear();
		passEle.sendKeys(password);
	}

	@DataProvider(name="dp")
	public static Object[][] data() {
		Object o[][] = new Object[4][2];
		o[0][0] = "incorrect@gmail.com";
		o[0][1] = "incorrect@123";

		o[1][0] = "incorrect@gmail.com";
		o[1][1] = "correct@123";

		o[2][0] = "correct@gmail.com";
		o[2][1] = "incorrect@123";

		o[3][0] = "correct@gmail.com";
		o[3][1] = "correct@123";
		return o;
	}
}
