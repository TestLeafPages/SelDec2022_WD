package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDragandDropBy {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.id("draggable"));
		Point location = source.getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println(x +" "+y);
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(source, 100, 60).perform();
		
	}

}
