package week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnHandlingAlert {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Simple Alert
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		//switch the control to the alert
		Alert alert = driver.switchTo().alert();
		//get the text of the alert
		String text = alert.getText();
		System.out.println(text);
		//accept the alert
		alert.accept();
		//get the text of the message
		String text2 = driver.findElement(By.id("simple_result")).getText();
		if (text2.contains("clicked")) {
			System.out.println("Alert accepted");
		}
		else {
			System.out.println("Not accepted");
		}
		

	}

}
