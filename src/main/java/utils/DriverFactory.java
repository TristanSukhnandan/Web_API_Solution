package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import pageObjects.CareersSA_Page;
import pageObjects.Careers_Page;
import pageObjects.CurrentOpenings_Page;
import pageObjects.JobDetails_Page;

public class DriverFactory {
	public static WebDriver driver;
	public static Careers_Page careersPage;
	public static CareersSA_Page careersSAPage;
	public static CurrentOpenings_Page currentOpeningsPage;
	public static JobDetails_Page jobDetailsPage;
	
	public WebDriver getDriver() {
		try {		
			// ReadConfigFile
			ReadConfigFile file = new ReadConfigFile();
			String browserName = file.getBrowser();

			switch (browserName) {

			case "firefox":
				if (null == driver) {
					System.setProperty("webdriver.gecko.driver", Constant.GECKO_DRIVER_DRECTORY);
					DesiredCapabilities capabilities = DesiredCapabilities.firefox();
					capabilities.setCapability("marionette", true);
					driver = new FirefoxDriver();
				}
				break;

			case "chrome":
				if (null == driver) {
					System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DRECTORY);
					// CHROME OPTIONS
					ChromeOptions options = new ChromeOptions();
					driver = new ChromeDriver(options);
					driver.manage().window().maximize();
				}
				break;
			}

		} catch (Exception e) {

			System.out.println("Unable to load browser! - Exception: " + e.getMessage());

		} finally {

			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			  		careersPage = PageFactory.initElements(driver, Careers_Page.class);
			  	  careersSAPage = PageFactory.initElements(driver, CareersSA_Page.class);
			currentOpeningsPage = PageFactory.initElements(driver, CurrentOpenings_Page.class);
			     jobDetailsPage = PageFactory.initElements(driver, JobDetails_Page.class);

		}
		return driver;
	}
}
