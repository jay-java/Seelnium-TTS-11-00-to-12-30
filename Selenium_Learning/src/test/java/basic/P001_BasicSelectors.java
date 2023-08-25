package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P001_BasicSelectors {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.facebook.com/";
		WebDriver driver = new DriverConnection().getDriver(url);
		
		WebElement createAccount = driver.findElement(By.linkText("Create new account"));
		createAccount.click();
		
//		WebElement email = driver.findElement(By.id("email"));
//		email.sendKeys("selenium@gmail.com");
//		WebElement pass = driver.findElement(By.id("pass"));
//		pass.sendKeys("selenium@123");
//		Thread.sleep(2000);
//		driver.findElement(By.name("email"));
		//*[@id="email"]
//		#email
//		u_m_b_Ms
		//*[@id="icon-4"]/div/a
		
//		By.class
//		By.className(url)
//		By.cssSelector(url)
//		By.id(url)
//		By.linkText(url)
//		By.name(url)
//		By.partialLinkText(url)
//		By.tagName(url)
//		By.xpath(url)
//		driver.close();
	}
}
