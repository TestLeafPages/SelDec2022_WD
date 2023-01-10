package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
		List<WebElement> price = driver.findElements(By.className("a-price-whole"));
		List<Integer> listOfPrice=new ArrayList<>();
		for (WebElement each : price) {
			String text = each.getText();
			String replaceAll = text.replaceAll(",", "");
			if (!replaceAll.isEmpty()) {
				int parseInt = Integer.parseInt(replaceAll);
				listOfPrice.add(parseInt);
			}
		}
		Collections.sort(listOfPrice);
		System.out.println(listOfPrice);
		System.out.println("The least value :"+listOfPrice.get(0));
	}

}
