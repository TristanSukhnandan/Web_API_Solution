package stepDefinitions;

import java.io.IOException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class CareersSteps extends DriverFactory{

	@Given("^I access iLabURL$")
	public void i_access() throws IOException   {
		careersPage.getCareersPage();  	
	}

	@When("^I click on the Career hyperlink$")
	public void i_click_on_the_hyperlink() throws Exception  {
		careersPage.getCareersHyperlink(); 
	}


	@Then("^I should see the ilab career page$")
	public void i_should_see_the_ilab_career_page() throws Exception {
		careersPage.ValidateText();
	}
	
}
