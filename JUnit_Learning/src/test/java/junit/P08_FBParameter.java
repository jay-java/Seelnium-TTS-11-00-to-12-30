package junit;

import java.util.Arrays;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnnection;

@RunWith(Parameterized.class)
public class P08_FBParameter {
	String email;
	String password;
	
	public P08_FBParameter(String email,String password) {
		this.email=email;
		this.password=password;
	}
	
	static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
		driver = new DriverConnnection().getDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@AfterClass
	public static void afterClass() {
		driver.close();
	}
	
	@Test
	public void loginTest() throws InterruptedException {
//		WebDriver driver = new DriverConnnection().getDriver();
//		driver.get("https://www.facebook.com/");
		WebElement emailEle = driver.findElement(By.id("email"));
		emailEle.clear();
		emailEle.sendKeys(email);
		Thread.sleep(500);
		WebElement passwordEle = driver.findElement(By.id("pass"));
		passwordEle.clear();
		passwordEle.sendKeys(password);
		Thread.sleep(500);
	}
	
	@Parameters
	public static List<Object[]> getData() {
		Object[][] o = new Object[4][2];
		o[0][0] = "incorrect@gmail.com";
		o[0][1] = "incorrect@123";
		
		o[1][0] = "correct@gmail.com";
		o[1][1] = "incorrect@123";
		
		o[2][0] = "incorrect@gmail.com";
		o[2][1] = "correct@123";
		
		o[3][0] = "correct@gmail.com";
		o[3][1] = "correct@123";
		
		return Arrays.asList(o);
	}
	


}
