package pageObjects;

import java.util.List;

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
	
	//Elements Total Links
	
	@FindBy(tagName = "a")
	List<WebElement> links;
	
	
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
	
		
	//Action Method Total Links
		
	public void noOfLinks()
	{
		System.out.println("Number of links present : "+links.size());
		
//		for(int i=0; i<=links.size(); i++)
//		{
//			System.out.println(links.get(i).getText()); 
//		}
		
		for(WebElement lnks:links)
		{
			System.out.println(lnks.getAttribute("href"));
		}
	}
}

