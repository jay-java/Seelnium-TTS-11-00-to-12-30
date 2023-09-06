package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class P009_DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.globalsqa.com/demo-site/draganddrop/";
		WebDriver driver = new DriverConnection().getDriver(url);
		
		WebElement iframe = driver.findElement(By.xpath("//div[@rel-title='Photo Manager']/p/iframe"));
		driver.switchTo().frame(iframe);
		
		WebElement from1 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]/img"));
		WebElement from2 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[2]/img"));
		WebElement to = driver.findElement(By.xpath("//*[@id=\"trash\"]"));
		
		Actions action = new Actions(driver);
//		action.clickAndHold(from1).moveToElement(to).release().build().perform();
		Action a1 = action.clickAndHold(from1).moveToElement(to).release().build();
		Action a2 = action.clickAndHold(from2).moveToElement(to).release().build();
		
		a1.perform();
		Thread.sleep(3000);
		a2.perform();
		Thread.sleep(3000);
		driver.close();
		
		
		
	}
}
