package pageObjects;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cucumber.api.DataTable;

public class JobDetails_Page extends BasePage{
	
	public @FindBy(css = "#wpjb-scroll ") WebElement button_ApplyOnline;
	public @FindBy(xpath = "//input[@id='applicant_name']") WebElement textfield_FirstName;
	public @FindBy(xpath = "//input[@id='email']") WebElement textfield_EmailAddress;
	public @FindBy(xpath = "//input[@name='phone']") WebElement textfield_Phone;
	public @FindBy(xpath = "//textarea[@id='message']") WebElement textfield_Message;
	public @FindBy(xpath = "//input[@value='Send Application']") WebElement button_Submit;
	public @FindBy(xpath = "//h4[contains(text(),'JOIN OUR TEAM')]") WebElement join_Tag;
	
	public JobDetails_Page() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public JobDetails_Page clickOnApplyOnlineButton() throws Exception{
		waitAndClickElement(button_ApplyOnline);
		return new JobDetails_Page();
	}
	
	public JobDetails_Page enterFirstName(DataTable dataTable, int row, int column) throws Exception {
		List<List<String>> data = dataTable.raw();
		sendKeysToWebElement(textfield_FirstName, data.get(row).get(column));
		return new JobDetails_Page();
	}
	
	
	public JobDetails_Page enterEmailAddress(DataTable dataTable, int row, int column) throws Exception {
		List<List<String>> data = dataTable.raw();
		sendKeysToWebElement(textfield_EmailAddress, data.get(row).get(column));
		return new JobDetails_Page();
	
	}
	
	public JobDetails_Page enterPhone(String phone) throws Exception {
		
		
		sendKeysToWebElement(textfield_FirstName, phone);
		return new JobDetails_Page();
	}

	
	public JobDetails_Page enterComments(DataTable dataTable, int row, int column) throws Exception {
		List<List<String>> data = dataTable.raw();
		sendKeysToWebElement(textfield_Message, data.get(row).get(column));
		return new JobDetails_Page();
	}
	
	public JobDetails_Page clickOnSubmitButton() throws Exception {
		waitAndClickElement(button_Submit);
		return new JobDetails_Page();
	}
	
	public JobDetails_Page validationErrorMessage() throws Exception {
		WebElement jobdetailpage = getDriver().findElement(By.xpath(".//*[@class='wpjb-errors']/h1"));
		WaitUntilWebElementIsVisible(jobdetailpage);
		Assert.assertEquals("You need to upload at least one file.", jobdetailpage.getText().toLowerCase().replaceAll("[ ()0-9]", ""));
		return new JobDetails_Page();
	}

}
