package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinks {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/link.xhtml;");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//number of links 
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int size = links.size();
		System.out.println(size);
		
		List<String> list = new ArrayList<String>();
		
		
		//Total link text
		for (WebElement each : links) {
			String text = each.getText();
			list.add(text);	
		}
		//To sort
		Collections.sort(list);
		System.out.println(list);
		//Second link name
		WebElement eleSecondLink = links.get(45);
		String text = eleSecondLink.getText();
		System.out.println("45th link of this page:"+text);

	}

}
