package basic;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P005_Alert {
	public static void main(String[] args) throws InterruptedException {
		String url="https://demoqa.com/alerts";
		WebDriver driver = new DriverConnection().getDriver(url);
		//Alert 1
//		WebElement btn1 = driver.findElement(By.id("alertButton"));
//		btn1.click();
//		Alert a1 = driver.switchTo().alert();
//		Thread.sleep(3000);
//		a1.accept();
		
		
		//Alert 2
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		WebElement btn1 = driver.findElement(By.id("timerAlertButton"));
//		btn1.click();
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert a1 = driver.switchTo().alert();
//		Thread.sleep(3000);
//		a1.accept();
		
		//Alert 3
//		WebElement btn1 = driver.findElement(By.id("confirmButton"));
//		btn1.click();
//		Alert a1 = driver.switchTo().alert();
////		a1.accept();
//		Thread.sleep(3000);
//		a1.dismiss();
		
		//Alert 4
		WebElement btn1 = driver.findElement(By.id("promtButton"));
		btn1.click();
		Alert a1 = driver.switchTo().alert();
		a1.sendKeys("welcome selenium");
		Thread.sleep(3000);
		a1.accept();
	}
}
