package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDragandDrop {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/drag.xhtml;jsessionid=node0oqhxb9ppcuxpxmjg5oohjt3m52371.node0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement source = driver.findElement(By.id("form:drag_content"));
		WebElement destination = driver.findElement(By.id("form:drop_header"));
		Actions builder = new Actions(driver);
		builder.dragAndDrop(source, destination).perform();
		driver.findElement(By.xpath("//span[text()='Start']")).click();
		
	}

}
