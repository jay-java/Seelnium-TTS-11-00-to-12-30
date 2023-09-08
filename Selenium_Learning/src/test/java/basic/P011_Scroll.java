package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P011_Scroll {
	public static void main(String[] args) {
		String url = "https://www.amazon.in/";
		WebDriver driver  = new DriverConnection().getDriver(url);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//1.Scroll By Pixel
		//js.executeScript("window.scrollBy(0,50)");
		
		//2.Scroll By element
//		WebElement ele = driver.findElement(By.id("currentAddress"));
//		WebElement product = driver.findElement(By.xpath("//*[@id=\"xDtEDpM_UsLdQxNMl-Ir8g\"]/div[1]/h2"));
//		js.executeScript("arguments[0].scrollIntoView();", product);
		
		//3.Scroll to Bottom
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
}
