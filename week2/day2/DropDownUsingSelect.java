package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownUsingSelect {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize the window
		driver.manage().window().maximize();
		//Apply implicitlywait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//enter the username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	
		//enter the password 
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subraja");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Subi");
		
		WebElement dropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select source = new Select(dropDown);
	//	source.selectByIndex(1);
		
	//	source.selectByValue("LEAD_TRADESHOW");
		
		source.selectByVisibleText("Partner");
		
		
		
		
		
		
		
//		driver.findElement(By.className("smallSubmit")).click();
//		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
//		if (text.equalsIgnoreCase("subraja")) {
//			System.out.println("Lead Created successfully");
//		}
//		else {
//			System.out.println("Lead is not created Successfully");
//		}
		
	}

}
