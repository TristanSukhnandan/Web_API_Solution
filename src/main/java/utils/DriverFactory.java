package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverFactory {
	public static WebDriver driver;
	
	public WebDriver getDriver() throws Exception {
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

		}
		return driver;
	}
}