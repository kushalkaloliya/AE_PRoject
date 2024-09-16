package pageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage 
{
	WebDriver driver;
	WebDriverWait wait;
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
	
	//Elements - click on 1 product
	@FindBy(xpath = "//div[@class='brands_products']//a[@href]")
	List<WebElement> brandProducts;
	
//	@FindBy(xpath = "//div[@class='productinfo text-center']//p[contains(text(),'Men Tshirt')]")
//	WebElement confirmBrandName;
	
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
	
	//Action Method - click on 1 product
	
	public void noOfProducts()
	{
		for(WebElement product:brandProducts)
		{
			System.out.println(product.getText());
		}

	}
	
	public void clickBrandProducts()
	{
		for(WebElement pro:brandProducts)
		{
			if(pro.getText().contains("H&M"))
			{
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].click();", pro);
//				pro.click();
			}
		}
	}
	
}

