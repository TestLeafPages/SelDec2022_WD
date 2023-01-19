package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTabke {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> rowCount = driver
				.findElements(By.xpath("(//span[text()='Customer Analytics Table']/following::table)[2]//tbody/tr"));
		System.out.println(rowCount.size());
		for (int i = 1; i < rowCount.size(); i++) {
			List<WebElement> columnCount = driver.findElements(
					By.xpath("(//span[text()='Customer Analytics Table']/following::table)[2]//tr[" + i + "]/td"));
			for (int j = 1; j < columnCount.size(); j++) {
				String text = driver.findElement(By.xpath(
						"(//span[text()='Customer Analytics Table']/following::table)[2]//tr[" + i + "]/td[" + j + "]"))
						.getText();
				System.out.println(text);
			}
		}
	}

}
