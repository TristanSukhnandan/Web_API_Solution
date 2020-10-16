package pageObjects;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cucumber.api.DataTable;

public class JobDetails_Page extends BasePage{
	
	public @FindBy(linkText = "Apply Online") WebElement button_ApplyOnline;
	public @FindBy(xpath = "//input[@id='applicant_name']") WebElement textfield_FirstName;  //(xpath = "//p[contains(text(),'WORK WITH')]") /  (id = "applicant_name]")
	public @FindBy(id = "email") WebElement textfield_EmailAddress;
	public @FindBy(id = "phone") WebElement textfield_Phone;
	public @FindBy(id = "message") WebElement textfield_Message;
	public @FindBy(id = "wpjb_submit") WebElement button_Submit;
	public @FindBy(css = ".wpjb-element-input-file li") WebElement validationTag;
	
	public JobDetails_Page() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public JobDetails_Page clickOnApplyOnlineButton() throws Exception{
		scrollToElementByWebElementLocator(button_ApplyOnline);
		waitAndClickElement(button_ApplyOnline);
		return new JobDetails_Page();
	}
	
	public JobDetails_Page enterFirstName(String firstname) throws Exception {
		sendKeysToWebElement(textfield_FirstName,firstname);
		return new JobDetails_Page();
	}
	
	
	public JobDetails_Page enterEmailAddress(String email) throws Exception {
		sendKeysToWebElement(textfield_EmailAddress, email);
		return new JobDetails_Page();
	
	}
	
	public JobDetails_Page enterPhone() throws Exception {
		
		Random rand = new Random();
        int num1 = (rand.nextInt(7) + 1) * 100 + (rand.nextInt(8) * 10) + rand.nextInt(8);
        int num2 = rand.nextInt(743);
        int num3 = rand.nextInt(1000);

        
        DecimalFormat df3 = new DecimalFormat("000"); // 3 zeros
        DecimalFormat df4 = new DecimalFormat("000"); // 4 zeros

        String phone = "0" + df3.format(num1) + " " + df3.format(num2) + " " + df4.format(num3);

		sendKeysToWebElement(textfield_Phone, phone);
		return new JobDetails_Page();
	}

	
	public JobDetails_Page clickOnSubmitButton() throws Exception {
		waitAndClickElement(button_Submit);
		return new JobDetails_Page();
	}
	
	public JobDetails_Page validationErrorMessage() throws Exception {
		//WebElement validationmessage = getDriver().findElement(By.xpath("//li[contains(text(),'You need to upload at least one file.')]"));
															 //(xpath = "//li[contains(text(),'You need to upload at least one file.')]")  //   (".//*[@class='wpjb-errors']/h1")
		WaitUntilWebElementIsVisible(validationTag);
		//Assert.assertEquals("You need to upload at least one file.", validationTag.getText().toLowerCase().replaceAll("[ ()0-9]", ""));
		Assert.assertEquals("You need to upload at least one file.", validationTag.getText());
		return new JobDetails_Page();
	}

}
