package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class JobDetailsSteps extends DriverFactory{
	@Given("^I am on the ilab job details page$")
	public void i_am_on_the_ilab_job_details_page()  {

	}

	@When("^I click on the apply online button$")
	public void i_click_on_the_apply_online_button()  {
	   
	}

	@And("^I enter a \"([^\"]*)\"$")
	public void i_enter_a(String arg1)  {
	    
	}

	@And("^I enter a \"([^\"]*)\" address$")
	public void i_enter_a_address(String arg1) {
	   
	}

	@And("^I enter a \"([^\"]*)\" number$")
	public void i_enter_a_number(String arg1)  {
	   
	}

	@And("^I enter click send buttton$")
	public void i_enter_click_send_buttton()  {
	 
	}

	@Then("^I should be presented with the validation alert \"([^\"]*)\"$")
	public void i_should_be_presented_with_the_validation_alert(String arg1) {
	   
	}

}
