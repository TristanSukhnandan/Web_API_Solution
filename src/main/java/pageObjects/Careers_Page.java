package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Careers_Page extends BasePage{
	
	public @FindBy(linkText = "CAREERS") WebElement hyperlink_Careers;
	public @FindBy(xpath = "//h4[contains(text(),'JOIN OUR TEAM')]") WebElement join_Tag;
	
	public Careers_Page() throws IOException {
		super();
		
	}
	
	public Careers_Page getCareersPage() throws IOException{
		getDriver().get("https://www.ilabquality.com/");
		return new Careers_Page();
	}
	
	public Careers_Page selectCareersHyperlink() throws Exception{
		waitAndClickElement(hyperlink_Careers);
		return new Careers_Page();
	}
	
	public Careers_Page ValidateText() throws Exception{
		WaitUntilWebElementIsVisible(join_Tag);
		return new Careers_Page();
	}

	
}
