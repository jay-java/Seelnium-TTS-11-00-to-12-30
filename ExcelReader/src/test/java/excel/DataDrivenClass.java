package excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.DriverConnection;

public class DataDrivenClass {
	WebDriver driver = null;
	@BeforeClass
	public void OpenBrowser() {
		driver = DriverConnection.getDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test(dataProvider = "dp")
	public void loginTest(String email,String pass) {
		System.out.println(email+" : "+pass);
		WebElement emailEle = driver.findElement(By.id("email"));
		emailEle.clear();
		emailEle.sendKeys(email);
		WebElement passEle = driver.findElement(By.id("pass"));
		passEle.clear();
		passEle.sendKeys(pass);
	}
	
	@DataProvider(name="dp")
	public static Object[][] data(){
		ExcelReaderClass ex = new ExcelReaderClass("C:\\Users\\jay-pc\\Desktop\\ExcelReader.xlsx", "login");
		int row = ex.rowCount();
		int col = ex.colCount();
		
		Object obj[][] = new Object[row][col];
		for(int i=1;i<row;i++) {
			for(int c=0;c<col;c++) {
				String data = ex.getData(row, col);
				obj[i][c] = data;
			}
		}
		return obj;
	}
}
