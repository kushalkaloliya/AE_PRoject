package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage 
{
	WebDriver driver;
	public MyAccountPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Elements
	
	@FindBy(xpath = "//a[normalize-space()='Logout']")
	WebElement lnkLogout;
	
	
	//Action Method - Logout
	
	public boolean loginConfirm()
	{
		try 
		{
			return (lnkLogout.isDisplayed());			
		} catch (Exception e) 
		{
			return (false);
		}
	}
	
	public void clickLogout()
	{
		lnkLogout.click();
	}

}
