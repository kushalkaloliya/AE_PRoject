package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObjects.DropDownPage;

public class DropDown 
{
	WebDriver driver;
	DropDownPage ddp;
	
	@Given("user launch browser and launch url {string}")
	public void user_launch_browser_and_launch_url(String url) 
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@When("user select India from the country drop down menu")
	public void user_select_india_from_the_country_drop_down_menu() 
	{
	   ddp=new DropDownPage(driver);
	   ddp.selectDrpCountry();
	}
	
	@Then("user should be select India successfully")
	public void user_should_be_select_india_successfully() throws InterruptedException 
	{
	    Thread.sleep(2000);
	    driver.close();
	}




}
