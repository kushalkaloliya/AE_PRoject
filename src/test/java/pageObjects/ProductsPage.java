package pageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
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
	
	//Web-elements - No of Product
	
	@FindBy(tagName = "p")
	List<WebElement> imgs;
	
	@FindBy(xpath = "//a[normalize-space()='Home']")
	WebElement lnkHome;
	
	//Web-element - Product Search
	
	@FindBy(xpath = "//input[@id='search_product']")
	WebElement txtSearchProduct;
	
	@FindBy(xpath = "//button[@id='submit_search']")
	WebElement btnSubmitSearch;
	
	@FindBy(xpath = "//div[@class='productinfo text-center']//p[contains(text(),'Premium Polo T-Shirts')]")
	WebElement searchProduct;
	
	//Web-elememnt - add to cart
	
	@FindBy(xpath = "//body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/a[1]")
	WebElement btnViewPro1;
	
	@FindBy(xpath = "//button[normalize-space()='Add to cart']")
	WebElement btnAddtoCart1;
	
	@FindBy(xpath = "//body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/ul[1]/li[1]/a[1]")
	WebElement btnViePro2;
	
	@FindBy(xpath = "//button[normalize-space()='Add to cart']")
	WebElement btnAddtoCart2;
	
	@FindBy(xpath = "//button[normalize-space()='Continue Shopping']")
	WebElement btnConShopping;
	
	@FindBy(xpath = "//u[normalize-space()='View Cart']")
	WebElement btnViewCart;
	
	
	
	
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
	
	
	// Action Method - Search Product
	
	public void setSearchProduct(String sproduct)
	{
		txtSearchProduct.sendKeys(sproduct);
	}
	
	public void clickBtnSubmitSear()
	{
		btnSubmitSearch.click();
	}
	
	public String verifySearchProduct()
	{
		return searchProduct.getText();
		//System.out.println(searchProduct.getText());		
	}
	
	// Action Method - add to cart
	
	public void clickViewPro1()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", btnViewPro1);
//		btnViewPro1.click();
	}
	
	public void clickAddtoCart1()
	{
		btnAddtoCart1.click();
	}
	
	public void clickViewPro2()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", btnViePro2);
//		btnViePro2.click();
	}
	
	public void clickAddtoCart2()
	{
		btnAddtoCart2.click();
	}
	
	public void clickConShopping()
	{
		btnConShopping.click();
	}
	
	public void clickViewCart()
	{
		btnViewCart.click();
	}
	
	
	

}
