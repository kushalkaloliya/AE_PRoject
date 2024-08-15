package stepDefinitions;

import java.time.Duration;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObjects.HomePage;
import pageObjects.RegisterPage;

public class RegisterSteps 
{
	WebDriver driver;
	HomePage hp;
	RegisterPage rp;
	
	@Given("user launch browser and navigate to home page of application")
	public void user_launch_browser_and_navigate_to_home_page_of_application()
	{
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("http://automationexercise.com");
	    driver.manage().window().maximize();
	    
	}
	@Given("click on sign up button")
	public void click_on_sign_up_button() 
	{
	    hp=new HomePage(driver);
	    hp.clickSignLogin();
	}


	@When("user click enter name as a {string} and email address as a {string} and click signup button")
	public void user_click_enter_name_as_a_and_email_address_as_a_and_click_signup_button(String signname, String signemail) 
	{
		rp=new RegisterPage(driver);
		rp.setName(signname);
		rp.setSignEmail(signemail);
		rp.clickSignup();
	}
	    		
	@When("user fill details into mandatory fields")
	public void user_fill_details_into_mandatory_fields(io.cucumber.datatable.DataTable dataTable) 
	{
	   Map<String, String> dataMap=dataTable.asMap(String.class, String.class);
	   rp.setPassword(dataMap.get("password"));
	   rp.setFname(dataMap.get("firstname"));
	   rp.setLname(dataMap.get("lastname"));
	   rp.setAddress(dataMap.get("address"));
	   rp.setState(dataMap.get("state"));
	   rp.setCity(dataMap.get("city"));
	   rp.setZcode(dataMap.get("zip"));
	   rp.setMoNo(dataMap.get("mobno"));
	}
	@When("user click on create account button")
	public void user_click_on_create_account_button() 
	{
		rp=new RegisterPage(driver);
	    rp.clickCreateAcc();
	}
	@Then("user verify that Account Created")
	public void user_verify_that_account_created() throws InterruptedException 
	{
	    boolean rpSuccess=rp.regConfirmation();
	    if(rpSuccess)
	    {
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	Assert.assertTrue(false);
	    }
	    
	    rp.clickRegCont();
	    Thread.sleep(3000);
	    driver.close();
	}

}
