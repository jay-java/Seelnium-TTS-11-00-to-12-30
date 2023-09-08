package basic;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class P012_ScreeenShot {
	public static void getScreenShot(WebDriver driver,String path) {
		TakesScreenshot ss = (TakesScreenshot)driver;
		
		File source = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		try {
			FileUtils.copyFile(source, dest);
			System.out.println("ss taken successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		String url = "https://www.amazon.in/";
		WebDriver driver = new DriverConnection().getDriver(url);
		
		getScreenShot(driver, "D:\\ScreenShot\\ss\\amazon.png");
		
	}
}
