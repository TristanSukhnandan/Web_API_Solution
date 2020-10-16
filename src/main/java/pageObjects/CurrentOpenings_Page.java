package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CurrentOpenings_Page extends BasePage{
	
	public @FindBy(linkText = "CAREERS") WebElement hyperlink_Careers;
	public @FindBy(css = ".wpjb-grid-row:nth-child(1) .wpjb-job_title") WebElement hyperlink_job;
	public @FindBy(xpath = "//h1[contains(text(),'Interns')]") WebElement jobHeader;

	public CurrentOpenings_Page() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CurrentOpenings_Page selectFirstEntry() throws Exception{
		waitAndClickElement(hyperlink_job);
		return new CurrentOpenings_Page();
	}
	
	public CurrentOpenings_Page validatejobDetails() throws Exception{
		WaitUntilWebElementIsVisible(jobHeader);
		return new CurrentOpenings_Page();
	}

}
