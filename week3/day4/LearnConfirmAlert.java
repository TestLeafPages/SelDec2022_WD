package week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnConfirmAlert {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Confirm Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.dismiss();
		String text2 = driver.findElement(By.id("result")).getText();
		if (text2.contains("Cancel")) {
			System.out.println("alert is dimsissed");
		}
		else {
			System.out.println("Not done");
		}
		

	}

}
