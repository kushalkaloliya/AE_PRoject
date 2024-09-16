package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
//						features = {".//Features/Register.feature"},
//						features = {".//Features/Login.feature"},
//						features = {".//Features/LinkText.feature"},
//						features = {".//Features/ContactUs.feature"},
//						features = {".//Features/Products.feature"},
						features = {".//Features/DropDown.feature"},
						glue = "stepDefinitions",
						dryRun = false
		
				 )

public class Test 
{
	
}
