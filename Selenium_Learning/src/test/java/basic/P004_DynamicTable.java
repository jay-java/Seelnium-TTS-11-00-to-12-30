package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P004_DynamicTable {
	public static void main(String[] args) {
		String url = "https://cosmocode.io/automation-practice-webtable/";
		WebDriver driver = new DriverConnection().getDriver(url);

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr"));
		System.out.println(rows.size());

		for (int i = 1; i < rows.size(); i++) {
			for (int j = 2; j <= 5; j++) {
				WebElement data = driver
						.findElement(By.xpath("//table[@id='countries']/tbody/tr[" + i + "]/td[" + j + "]"));
				System.out.print(data.getText() + "  ");
			}
			System.out.println();
		}
	}
}
