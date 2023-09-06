package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P007_IFrame {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new DriverConnection().getDriver("https://demoqa.com/frames");
		String window = driver.getWindowHandle();
		WebElement iframe = driver.findElement(By.xpath("//*[@id=\"frame1\"]"));
		driver.switchTo().frame(iframe);
		
		WebElement text = driver.findElement(By.id("sampleHeading"));
		System.out.println("Iframe 1 text : "+text.getText());
		
		driver.switchTo().window(window);
		WebElement iframe2 = driver.findElement(By.xpath("//*[@id=\"frame2\"]"));
		driver.switchTo().frame(iframe2);
		
		WebElement text2 = driver.findElement(By.id("sampleHeading"));
		System.out.println("Iframe 2 text : "+text2.getText());
		driver.switchTo().window(window);
		
		Thread.sleep(5000);
		driver.close();
	}
}
