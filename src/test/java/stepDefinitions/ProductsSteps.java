package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObjects.HomePage;
import pageObjects.ProductsPage;

public class ProductsSteps 
{
	WebDriver driver;
	HomePage hp;
	ProductsPage pp;
	
	@Given("Launch browser and go to home page")
	public void launch_browser_and_go_to_home_page() 
	{
		driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("http://automationexercise.com");
	    driver.manage().window().maximize();
	}
	
	@When("user click on Products link")
	public void user_click_on_products_link() 
	{
		hp=new HomePage(driver);
		hp.clickProducthome();
	}
	
	@When("user capture all products in products page")
	public void user_capture_all_products_in_products_page() throws InterruptedException 
	{
		pp=new ProductsPage(driver);
		pp.noOfProducts();
		Thread.sleep(2000);
		//driver.navigate().back();
	}
	@Then("navigate back to home page")
	public void navigate_back_to_home_page() throws InterruptedException
	{
	    //pp.clickLnkHome();
		driver.navigate().back();
	    Thread.sleep(2000);
	    driver.close();
	}



}
