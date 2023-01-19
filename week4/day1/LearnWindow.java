package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindow {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/window.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//To print the window handle of the active browser/tab
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println(parentWindowHandle);
		String parentWindowTitle = driver.getTitle();
		System.out.println(parentWindowTitle);
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		//to switch the control to the new window
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("Window handles :"+windowHandles.size());
		//to switch to the new window Convert Set to list to traverse through the index
		List<String> list = new ArrayList<String>(windowHandles);
		//switch the control to the particular index
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getTitle());
		driver.quit();
//		//driver.switchTo().window(list.get(0));
//		driver.switchTo().window(parentWindowHandle);
//		System.out.println(driver.getTitle());
//		driver.close();
		

	}

}
