package stepDefinitions;

import java.time.Duration;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObjects.HomePage;
import pageObjects.MyAccountPage;
import pageObjects.RegisterPage;

public class LoginSteps 
{
	WebDriver driver;
	HomePage hp;
	RegisterPage rp;
	MyAccountPage map;
	
	
	@Given("user Launch browser and navigate to home page")
	public void user_launch_browser_and_navigate_to_home_page() 
	{
		driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("http://automationexercise.com");
	    driver.manage().window().maximize();
	}
	
	@Given("click on sign up\\/login button")
	public void click_on_sign_up_login_button() 
	{
		 hp=new HomePage(driver);
		 hp.clickSignLogin();
	    
	}
	   
	@When("user enter email as {string} and password as {string} and click on login button")
	public void user_enter_email_as_and_password_as_and_click_on_login_button(String loginemail, String loginpassword) 
	{
		rp=new RegisterPage(driver);
		rp.setLoginEmail(loginemail);
		rp.setLoginPassword(loginpassword);
		rp.clickLogin();
	}
	
	@Then("user should be redirected to the my account page")
	public void user_should_be_redirected_to_the_my_account_page() throws InterruptedException 
	{
	    map=new MyAccountPage(driver);
	    boolean loginSuccess=map.loginConfirm();
	    if(loginSuccess)
	    {
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	Assert.assertTrue(false);
	    }
	    
	    Thread.sleep(3000);
	}
	
	@Then("user click on logout button and should be logout from the application")
	public void user_click_on_logout_button_and_should_be_logout_from_the_application() 
	{
	    map.clickLogout();
	    driver.close();
	}
	
	
	//Invalid Login Credential
	
	
	@When("user enter invalid email as {string} and password as {string} and click on login button")
	public void user_enter_invalid_email_as_and_password_as_and_click_on_login_button(String invalidEmail, String invalidPassword) 
	{
	   rp=new RegisterPage(driver);
	   rp.setLoginEmail(invalidEmail);
	   rp.setLoginPassword(invalidPassword);
	   rp.clickLogin();
	}
	
	@Then("user should not be redirected to the my account page")
	public void user_should_not_be_redirected_to_the_my_account_page() throws InterruptedException
	{
		rp.loginInvalidDetails();
		Thread.sleep(2000);
		driver.close();
	}




	

}
