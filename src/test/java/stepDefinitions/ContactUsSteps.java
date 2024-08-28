package stepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObjects.ContactUsPage;
import pageObjects.HomePage;

public class ContactUsSteps

{
	WebDriver driver;
	HomePage hp;
	ContactUsPage cup;
	
	@Given("Launch browser and go to Home Page")
	public void launch_browser_and_go_to_home_page()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://automationexercise.com");
		driver.manage().window().maximize();
	}
	
	@When("user click on contact us page")
	public void user_click_on_contact_us_page() 
	{
	    hp=new HomePage(driver);
	    hp.clickContactus();
	}
	
	@When("user enter valid information into mandatory fields")
	public void user_enter_valid_information_into_mandatory_fields() throws InterruptedException 
	{
	    cup=new ContactUsPage(driver);
	    cup.setName("kk");
	    cup.setEmail("kk@gmail.com");
	    cup.setSubject("kk");
	    cup.setMessage("kkkk");
	    cup.clickUploadFile();
	    Thread.sleep(2000);
	    
	}
	
	@When("click on submit button")
	public void click_on_submit_button() throws InterruptedException
	{
	    cup.clickSubmit();
	    Thread.sleep(2000);
	    driver.switchTo().alert().accept();
	}
	
	@Then("user should be get confirmation message")
	public void user_should_be_get_confirmation_message() throws InterruptedException
	{
	    String conOfContactUS=cup.conOFSubmit();
	    Thread.sleep(3000);
	    Assert.assertEquals(conOfContactUS, "Success! Your details have been submitted successfully.");
	    driver.close();
	    
	}




}
