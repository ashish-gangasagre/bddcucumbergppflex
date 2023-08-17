package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class testrunner {
	
	

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = ".//features/leadpage.feature",
			glue = "stepdefination",
			dryRun =false ,
			monochrome = true,
			publish = true 
			
			
			)
	public class TestRunner {

		
	
	}



}
