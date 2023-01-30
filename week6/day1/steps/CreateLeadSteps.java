package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CreateLeadSteps extends BaseClass{
	

	@Given("Click on crmsfa link")
	public void clickcrmsfalink() {
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
	}
    @And("Click on Leads link")
	public void clickLeadsLink() {
    	driver.findElement(By.linkText("Leads")).click();
	}
   @And("Click on Create Lead link")
	public void clickCreateLeadLink() {
	   driver.findElement(By.linkText("Create Lead")).click();
	}
    @And("Enter the companyname as (.*)$")
	public void enterCompanyName(String cmNAme) {
    	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cmNAme);
	}
    @And("Enter the firstname as (.*)$")
	public void enterFirstName(String fn) {
    	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fn);
	}
    @And("Enter the lastname as (.*)$")
	public void enterLastName(String ln) {
    	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(ln);
	}
    @And("Click CreateLead button")
	public void clickCreateLeadButton() {
    	driver.findElement(By.name("submitButton")).click();
	}
    @Then("ViewLeads Page should be displayed")
	public void verifyViewLeads() {
    	String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
    	if (text.equalsIgnoreCase("Subraja")) {
    		System.out.println("Lead created successfully");
    	} else {
    		System.out.println("Lead is not created");
	}

	

}}
