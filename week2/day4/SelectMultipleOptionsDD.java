package week2.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMultipleOptionsDD {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		//Load the url
		driver.get("https://www.leafground.com/select.xhtml");
		//maximize the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement dd = driver.findElement(By.className("ui-selectonemenu"));
		Select sec = new Select(dd);
		List<WebElement> options = sec.getOptions();
		List<Integer> list = new ArrayList<>();
		int size = options.size();
		System.out.println(size);
		//   datatype    variable  :  data
//		for (WebElement each : options) {
//			Thread.sleep(2000);
//			each.click();
//			String text = each.getText();
//			System.out.println(text);
//		}
		
		for (int i = 1; i <size; i++) {
			
			options.get(i).click();
			String text = options.get(i).getText();
            System.out.println(text);
			
		}
		
		
	}

}
