package basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P006_WindowHandle {
	public static void main(String[] args) throws InterruptedException {
		String url ="https://demo.guru99.com/popup.php";
		WebDriver driver = new DriverConnection().getDriver(url);
		
		String mainwin = driver.getWindowHandle();
		System.out.println(mainwin);
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		for(String win:allWindows) {
			if(!win.equals(mainwin)) {
				driver.switchTo().window(win);
			}
		}
		
		driver.findElement(By.name("emailid")).sendKeys("selenium@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(2000);
//		driver.close();
		driver.quit();
	}
}
