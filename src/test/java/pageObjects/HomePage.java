package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Elements
	
	@FindBy(xpath = "//a[normalize-space()='Signup / Login']")
	WebElement lnkSignLogin;
	
	@FindBy(xpath = "//a[contains(text(),'Test Cases')]")
	WebElement lnkTestcase;
	
	@FindBy(xpath = "//a[normalize-space()='Contact us']")
	WebElement lnkContactus;
	
	@FindBy(xpath = "//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
	WebElement lnkCart;
	
	@FindBy(xpath = "//a[@href='/products']")
	WebElement lnkProducthome;
	
	
	//Action Method
	
	public void clickSignLogin()
	{
		lnkSignLogin.click();
	}
	
	public void clickTestcase()
	{
		lnkTestcase.click();
	}
	
	public void clickContactus()
	{
		lnkContactus.click();
	}
	
	public void clickCart()
	{
		lnkCart.click();
	}
	
	public void clickProducthome()
	{
		lnkProducthome.click();
	}
}
