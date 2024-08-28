package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage 
{
	WebDriver driver;
	
	public ProductsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Web-elements
	@FindBy(tagName = "p")
	List<WebElement> imgs;
	
	@FindBy(xpath = "//a[normalize-space()='Home']")
	WebElement lnkHome;
	
	
	//Action Method
	
	public void noOfProducts() 
	{
		System.out.println("Total Products are : "+imgs.size());
		
		try 
		{
			for(int i=0; i<=imgs.size(); i++)
			{
				System.out.println(imgs.get(i).getText());
			}
		} 
		catch (Exception e) 
		{
			System.out.println("Exception Occured : "+e.getMessage());
		}
		
	}
	
	public void clickLnkHome()
	{
		lnkHome.click();
	}
}
