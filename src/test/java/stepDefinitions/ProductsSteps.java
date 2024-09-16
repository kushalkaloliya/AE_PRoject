package stepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.ProductsPage;

public class ProductsSteps 
{
	WebDriver driver;
	HomePage hp;
	ProductsPage pp;
	CartPage cp;
	
	@Given("Launch browser and go to home page")
	public void launch_browser_and_go_to_home_page() 
	{
		driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
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
	
	// Product Search
	
	@When("search product in search bar")
	public void search_product_in_search_bar() 
	{
		pp=new ProductsPage(driver);
		pp.setSearchProduct("polo");
		pp.clickBtnSubmitSear();
	}
	
	@Then("verify search product")
	public void verify_search_product() throws InterruptedException 
	{
		Thread.sleep(2000);
		String captureProduct=pp.verifySearchProduct();
		Assert.assertEquals("Premium Polo T-Shirts",captureProduct);
		pp.clickLnkHome();
		driver.close();	   
	}
	
	// Add to cart 
	
	@When("user add two products in cart")
	public void user_add_two_products_in_cart() throws InterruptedException
	{
	    pp=new ProductsPage(driver);
	    pp.clickViewPro1();
	    pp.clickAddtoCart1();
	    pp.clickConShopping();
	    driver.navigate().back();
	    Thread.sleep(2000);
	    pp.clickViewPro2();
	    pp.clickAddtoCart2();
	    
	}
	
	@When("user click on cart link")
	public void user_click_on_cart_link()
	{
		pp.clickViewCart();
	}
	
	@Then("user verify product in cart")
	public void user_verify_product_in_cart()
	{
	   cp=new CartPage(driver);
	   cp.cartProducts();
	   driver.close();
	}
	
	// Product Check-out before Login
	
	@When("user proceed to checkout")
	public void user_proceed_to_checkout() 
	{
	    cp=new CartPage(driver);
	    cp.clickProceedCheck();
	    cp.clickLoginCheck();
	}
	
	@When("user Login Account and click on cart")
	public void user_login_account_and_click_on_cart() 
	{
	   cp.setEmail("ks@gmail.com");
	   cp.setPassword("ks12345");
	   cp.clickLogin();
	   cp.clickLnkCartCheck();
	   cp.clickProceedCheck();
	}
	
	@When("user enter chechout details")
	public void user_enter_chechout_details() 
	{
		cp.verifyDeliveryAdd();
		cp.cartProducts();
	    cp.setOrderComment("Checkout 2 Products");
	    cp.clickPlaceOrder();
	    cp.setCardName("kk");
	    cp.setCardNo("12345");
	    cp.setCardCvv("123");
	    cp.setCardExpMm("12");
	    cp.setCardExpYy("1234");
	    cp.clickPayConfirm();
	}
	
	@Then("user got confirmation message")
	public void user_got_confirmation_message() throws InterruptedException 
	{
	    cp.confirmOrder();
	    Thread.sleep(2000);
	    cp.clickContinue();
	    Thread.sleep(2000);
	    cp.clickLogout();
	    System.out.println("End-To-End Test of Product Checkout........................");
	    driver.close();
	}












}
