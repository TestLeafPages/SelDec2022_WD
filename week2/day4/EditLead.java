package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//enter the username
		////input[@id='username']
		driver.findElement(By.xpath("//label[text()='Username']/following-sibling::input")).sendKeys("Demosalesmanager");
		//enter the password 
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//Click login button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();

		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Find ')]")).click();
		
		driver.findElement(By.xpath("(//label[text()='First name:'])[3]/following::input")).sendKeys("Subraja");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		String text = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(text);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		String text1 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (text1.equalsIgnoreCase("subraja")) {
			System.out.println("Lead Created successfully");
		}
		else {
			System.out.println("Lead is not created Successfully");
		}
	
		
		
//		driver.findElement(By.linkText("Create Lead")).click();
//		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
//		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subraja");
//		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Subi");
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
