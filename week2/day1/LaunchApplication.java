package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {

	public static void main(String[] args) {
		//To set the path
		//To launch the browser
		ChromeDriver driver = new ChromeDriver();
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize the window
		driver.manage().window().maximize();
		//enter the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//to verify the title
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		

	}

}
