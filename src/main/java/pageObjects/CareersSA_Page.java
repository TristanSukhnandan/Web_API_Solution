package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CareersSA_Page extends BasePage{
	
	public @FindBy(linkText = "CAREERS") WebElement hyperlink_Careers;
	public @FindBy(xpath = "//h4[contains(text(),'JOIN OUR TEAM')]") WebElement join_Tag;

	public CareersSA_Page() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

}
