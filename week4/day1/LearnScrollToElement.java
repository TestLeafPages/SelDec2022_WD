package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScrollToElement {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement scroll = driver.findElement(By.xpath("//span[contains(text(),'© 1996-20')]"));
		Actions builder = new Actions(driver);
		builder.scrollToElement(scroll).perform();
		String text = scroll.getText();
		System.out.println(text);
		
		

	}

}
