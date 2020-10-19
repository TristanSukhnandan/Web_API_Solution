package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)

@CucumberOptions(	features = { "src/test/java/resources/features/" }, 
				       	glue = { "stepDefinitions" }, 
				  monochrome = true, 
				     	tags = {"@iLab_Assessment"}, 
				      plugin = { "pretty", "html:output/Web_cucumber", "json:output/Web_cucumber.json","com.cucumber.listener.ExtentCucumberFormatter:output/Web_report.html" }
				)

public class MainRunner extends AbstractTestNGCucumberTests{

}
