package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P002_StaticTable {
	public static void main(String[] args) {
		String url = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
		WebDriver driver = new DriverConnection().getDriver(url);
		
		WebElement con = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[5]/td[2]/span"));
		System.out.println(con.getText());
	}
}
