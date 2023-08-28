package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P001_BasicSelectors {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.facebook.com/";
		WebDriver driver = new DriverConnection().getDriver(url);

		WebElement createAccount = driver.findElement(By.linkText("Create new account"));
		createAccount.click();

		Thread.sleep(3000);

		WebElement fn = driver.findElement(By.name("firstname"));
		fn.sendKeys("selenium");

		WebElement ln = driver.findElement(By.name("lastname"));
		ln.sendKeys("java");

		WebElement em = driver.findElement(By.name("reg_email__"));
		em.sendKeys("selenium@gmail.com");

		WebElement pass = driver.findElement(By.name("reg_passwd__"));
		pass.sendKeys("selenium@123");

		WebElement day = driver.findElement(By.id("day"));
		Select days = new Select(day);
		days.selectByVisibleText("1");

		WebElement month = driver.findElement(By.id("month"));
		Select months = new Select(month);
		months.selectByValue("5");

		WebElement year = driver.findElement(By.id("year"));
		Select years = new Select(year);
		years.selectByIndex(5);

		List<WebElement> list = driver.findElements(By.name("sex"));
		System.out.println(list.size());
		list.get(1).click();

//		WebElement email = driver.findElement(By.id("email"));
//		email.sendKeys("selenium@gmail.com");
//		WebElement pass = driver.findElement(By.id("pass"));
//		pass.sendKeys("selenium@123");
//		Thread.sleep(2000);
//		driver.findElement(By.name("email"));
		// *[@id="email"]
//		#email
//		u_m_b_Ms
		// *[@id="icon-4"]/div/a

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
