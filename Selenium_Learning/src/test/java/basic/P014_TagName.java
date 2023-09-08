package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P014_TagName {
	public static void main(String[] args) throws InterruptedException {
		String url = "https://www.facebook.com/";
		WebDriver driver  = new DriverConnection().getDriver(url);
		List<WebElement> list= driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		String str[] = new String[list.size()];
		int k =0;
		for(WebElement ele:list) {
			System.out.println(ele.getText());
			if(!ele.getText().equals("")) {
				str[k] = ele.getText();
				k++;
			}
		}
		
		for(String s:str) {
			System.out.println();
			System.out.println("-------->>>>> Without blank");
			System.out.println(s);
//			driver.findElement(By.linkText(s)).click();
//			Thread.sleep(3000);
//			driver.navigate().back();
		}
	}
}
