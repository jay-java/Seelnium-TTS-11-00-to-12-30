package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P013_ParialLinkText {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.facebook.com/";
		WebDriver driver = new DriverConnection().getDriver(url);
		
		List<WebElement> list = driver.findElements(By.partialLinkText("Create"));
		System.out.println(list.size());
		list.get(1).click();
		Thread.sleep(3000);
		driver.navigate().back();
		
//		for(WebElement ele:list) {
//			System.out.println(ele.getText());
//		}
		driver.close();
	}
}
