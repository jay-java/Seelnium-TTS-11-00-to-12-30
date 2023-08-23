package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {
	public static void main(String[] args) throws InterruptedException {
		//1.Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jay-pc\\Downloads\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.close();
		
		
		//2.Firefox
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\jay-pc\\Downloads\\geckodriver-v0.33.0-win64(1)\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.facebook.com/");
		
//		3.Edge
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\jay-pc\\Downloads\\edgedriver_win32 (1)\\msedgedriver.exe");
//		WebDriver driver = new EdgeDriver();
//		driver.get("https://www.facebook.com/");
	}
}
