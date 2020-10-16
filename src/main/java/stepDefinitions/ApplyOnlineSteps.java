package stepDefinitions;

import java.io.IOException;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class ApplyOnlineSteps extends DriverFactory{
	
	@Given("^I access iLabquality website$")
	public void i_access_iLabURL() throws IOException {
		careersPage.getCareersPage();  	
	    
	}

	@When("^I click on the Career hyperlink$")
	public void i_click_on_the_Career_hyperlink() throws Exception {
	    careersPage.selectCareersHyperlink();
	}

	@Then("^I should see the ilab career page$")
	public void i_should_see_the_ilab_career_page() throws Exception {
	    careersPage.ValidateText();
	}

	@When("^I click on the South Africa hyperlink$")
	public void i_click_on_the_South_Africa_hyperlink() throws Exception {
		careersSAPage.selectSAHyperlink();
	}

	@Then("^I should see the ilab careers South Africa page$")
	public void i_should_see_the_ilab_careers_South_Africa_page() throws Exception {
		careersSAPage.validateSAPage();
	}

	@When("^I click on the the first available job hyperlink$")
	public void i_click_on_the_the_first_available_job_hyperlink() throws Exception {
		 currentOpeningsPage.selectFirstEntry();
	}

	@Then("^I should see the ilab job details page$")
	public void i_should_see_the_ilab_job_details_page() throws Exception {
		currentOpeningsPage.validatejobDetails();
	}

	@When("^I click on the apply online button$")
	public void i_click_on_the_apply_online_button() throws Exception {
		jobDetailsPage.clickOnApplyOnlineButton(); 
	}

	@And("^I enter a first name \"([^\"]*)\"$")
	public void i_enter_a(String Firstname) throws Exception {
		jobDetailsPage.enterFirstName(Firstname);
	}

	@And("^I enter an email \"([^\"]*)\" address$")
	public void i_enter_a_address(String Email) throws Exception {
		jobDetailsPage.enterEmailAddress(Email);
	}

	@And("^I enter an phone number$")
	public void i_enter_a_number() throws Exception {
		 jobDetailsPage.enterPhone();
	}

	@And("^I enter click send button$")
	public void i_enter_click_send_buttton() throws Exception {
		 jobDetailsPage.clickOnSubmitButton();
	}

	@Then("^I should be presented with the validation alert message$")
	public void i_should_be_presented_with_the_validation_alert() throws Exception {
		 jobDetailsPage.validationErrorMessage();
	}

}
