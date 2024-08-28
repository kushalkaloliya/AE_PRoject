package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObjects.HomePage;

public class LinkTextSteps 
{
	WebDriver driver;
	HomePage hp;
	

	@Given("Launch Browser and URL")
	public void launch_browser_and_url() 
	{
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("http://automationexercise.com");
	    driver.manage().window().maximize();
	}
	
	@When("Count Total no of Link")
	public void count_total_no_of_link() 
	{
	    hp=new HomePage(driver);
	    hp.noOfLinks();
	}
	
	@Then("Logout from application")
	public void logout_from_application() throws InterruptedException 
	{
		Thread.sleep(3000);
	    driver.close();
	}



}
