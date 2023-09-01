package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P003_WebTable {
	public static void main(String[] args) {
		String url = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
		WebDriver driver = new DriverConnection().getDriver(url);
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println(row.size());
		
		List<WebElement> headers = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
		System.out.println(headers.size());
		for(WebElement h:headers) {
			System.out.print(h.getText()+" : ");
		}
		System.out.println();
		for(int i=2;i<=7;i++) {
			for(int j=1;j<=3;j++) {
				WebElement ele = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td["+j+"]"));
				System.out.print(ele.getText()+" : ");
			}
			System.out.println();
		}
	}
}
