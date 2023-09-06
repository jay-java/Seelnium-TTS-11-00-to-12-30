package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PracticeForm {
	public static void main(String[] args) {
		String url ="https://demoqa.com/automation-practice-form";
		WebDriver driver = new DriverConnection().getDriver(url);
		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
	}
}
