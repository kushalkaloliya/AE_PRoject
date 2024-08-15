package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
//						features = {".//Features/Register.feature"},
						features = {".//Features/Login.feature"},
						glue = "stepDefinitions",
						dryRun = false
		
				 )

public class Test 
{
	
}
