package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefintion {

	public ChromeDriver driver;

	@Given("Open the Chrome Browser")
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Given("Load the application url")
	public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps/control/login");
	}

	@Given("Enter the username as Demosalesmanager")
	public void enterUsername() {
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	}

	@Given("Enter the password as crmsfa")
	public void enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}

	@When("Click on Login button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("HomePage should be displayed")
	public void verifyHomePage() {
		String text = driver.findElement(By.tagName("h2")).getText();
		if (text.contains("Welcome")) {
			System.out.println("HomePage is displayed and successfully logged in");
		} else {
			System.out.println("Not displayed and Login Unsuccessfull");
		}
	}

}
