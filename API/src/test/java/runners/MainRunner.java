package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)

@CucumberOptions(	features = { "src/test/java/features/" }, 
				       	glue = { "stepDefinitions" }, 
				  monochrome = true, 
				     	tags = {}, 
				      plugin = { "pretty", "html:output/API_cucumber", "json:output/API_cucumber.json","com.cucumber.listener.ExtentCucumberFormatter:output/API_report.html" }
				)

public class MainRunner extends AbstractTestNGCucumberTests{

}
