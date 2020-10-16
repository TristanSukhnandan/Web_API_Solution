package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CareersSA_Page extends BasePage{
	
	public @FindBy(linkText = "South Africa") WebElement hyperlink_SA;
	public @FindBy(xpath = "//h3[contains(text(),'CURRENT OPENINGS')]") WebElement openings_header;

	public CareersSA_Page() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CareersSA_Page selectSAHyperlink() throws Exception{
		waitAndClickElement(hyperlink_SA);
		return new CareersSA_Page();	
	}
	
	public CareersSA_Page validateSAPage() throws Exception{
		WaitUntilWebElementIsVisible(openings_header);
		return new CareersSA_Page();	
	}

}
