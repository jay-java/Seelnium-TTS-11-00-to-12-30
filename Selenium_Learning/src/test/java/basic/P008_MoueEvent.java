package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class P008_MoueEvent {
	public static void main(String[] args) throws InterruptedException {
		String url ="https://www.amazon.in/";
		WebDriver driver = new DriverConnection().getDriver(url);
		
		WebElement miniTV  = driver.findElement(By.linkText("Amazon miniTV"));
		WebElement sell  = driver.findElement(By.linkText("Sell"));
		WebElement bs  = driver.findElement(By.linkText("Best Sellers"));
		WebElement td  = driver.findElement(By.linkText("Today's Deals"));
		
		Actions action = new Actions(driver);
		action.moveToElement(miniTV).build().perform();
		action.moveToElement(sell).build().perform();
		action.moveToElement(bs).build().perform();
		action.moveToElement(td).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Today's Deals")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
