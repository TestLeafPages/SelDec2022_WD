package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnFramesBuyTheValue {

	public static void main(String[] args) throws InterruptedException {
		//disable browser notifications
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://buythevalue.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//switch to the frame by using index
		//driver.switchTo().frame(1);
		//switch to the frame by using webelement
		WebElement eleFrame = driver.findElement(By.xpath("//div[@id='hubspot-messages-iframe-container']//iframe"));
		driver.switchTo().frame(eleFrame);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='initial-message-bubble']/button")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[contains(text(),' Fairbeat ')]")).click();

	}

}
