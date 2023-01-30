package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefintion extends BaseClass {

	@Given("Enter the username as {string}")
	public void enterUsername(String username) {
		System.out.println(driver);
		driver.findElement(By.id("username")).sendKeys(username);
	
	}

	@Given("Enter the password as {string}")
	public void enterPassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
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

	@But("Error message should be displayed")
	public void verifyErrorMessage() {
		String text = driver.findElement(By.id("errorDiv")).getText();
		if (text.contains(" Errors Occurred:")) {
			System.out.println("Error message is verified");
		} else {
			System.out.println("Not verified");
		}

	}

}
