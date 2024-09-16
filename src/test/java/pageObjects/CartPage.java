package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage 
{
	WebDriver driver;
	
	public CartPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Web-elements
	
	@FindBy(xpath = "//tr[@id]")
	List<WebElement> products;
	
	//Web-element - Check-out product
	
		@FindBy(xpath = "//a[normalize-space()='Proceed To Checkout']")
		WebElement btnProceedCheckout;
		
		@FindBy(xpath = "//u[normalize-space()='Register / Login']")
		WebElement btnLoginCheckout;
		
		@FindBy(xpath = "//input[@data-qa='login-email']")
		WebElement txtEmailCheck;
		
		@FindBy(xpath = "//input[@placeholder='Password']")
		WebElement txtPasswordCheck;
		
		@FindBy(xpath = "//button[normalize-space()='Login']")
		WebElement btnLoginCheck;
		
		@FindBy(xpath = "//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
		WebElement lnkCartChek;
		
		@FindBy(xpath = "//ul[@id='address_delivery']")
		WebElement deliveryAddress;
		
		@FindBy(xpath = "//textarea[@name='message']")
		WebElement txtOrderComment;
		
		@FindBy(xpath = "//a[normalize-space()='Place Order']")
		WebElement btnPlaceOrder;
		
		@FindBy(xpath = "//input[@name='name_on_card']")
		WebElement txtCardName;
		
		@FindBy(xpath = "//input[@name='card_number']")
		WebElement txtCardNo;
		
		@FindBy(xpath = "//input[@placeholder='ex. 311']")
		WebElement txtCardCvv;
		
		@FindBy(xpath = "//input[@placeholder='MM']")
		WebElement txtCardExpMm;
		
		@FindBy(xpath = "//input[@placeholder='YYYY']")
		WebElement txtCardExpYy;
		
		@FindBy(xpath = "//button[@id='submit']")
		WebElement btnPayAndConfirm;
		
		@FindBy(xpath = "//p[normalize-space()='Congratulations! Your order has been confirmed!']")
		WebElement msgConfirmOrder;
		
		@FindBy(xpath = "//a[normalize-space()='Continue']")
		WebElement btnContinue;
		
		@FindBy(xpath = "//a[normalize-space()='Logout']")
		WebElement btnLogout;
		
	
	// Action Method
	
	public void cartProducts()
	{
		try 
		{
			System.out.println("Total Products in Cart are :-> "+products.size());
		} 
		catch (Exception e) 
		{
			System.out.println("Exception Occured :-> "+e.getMessage());
		}
		
	}
	
	// Action Method - Check-out product before Login
	
		public void clickProceedCheck()
		{
			btnProceedCheckout.click();
		}
		
		public void clickLoginCheck()
		{
			btnLoginCheckout.click();
		}
		
		public void setEmail(String email)
		{
			txtEmailCheck.sendKeys(email);
		}
		
		public void setPassword(String pwd)
		{
			txtPasswordCheck.sendKeys(pwd);
		}
		
		public void clickLogin()
		{
			btnLoginCheck.click();
		}
		
		public void clickLnkCartCheck()
		{
			lnkCartChek.click();
		}
		
		public void verifyDeliveryAdd()
		{
			System.out.println(deliveryAddress.getText());
		}
	
		
		public void setOrderComment(String cmt)
		{
			txtOrderComment.sendKeys(cmt);
		}
		
		public void clickPlaceOrder()
		{
			btnPlaceOrder.click();
		}
		
		public void setCardName(String cname)
		{
			txtCardName.sendKeys(cname);
		}
		
		public void setCardNo(String cno)
		{
			txtCardNo.sendKeys(cno);
		}
		
		public void setCardCvv(String cvv)
		{
			txtCardCvv.sendKeys(cvv);
		}
		
		public void setCardExpMm(String cmm)
		{
			txtCardExpMm.sendKeys(cmm);
		}
		
		public void setCardExpYy(String cyy)
		{
			txtCardExpYy.sendKeys(cyy);
		}
		
		public void clickPayConfirm()
		{
			btnPayAndConfirm.click();
		}
		
		public void confirmOrder()
		{
			System.out.println(msgConfirmOrder.getText());
		}
		
		public void clickContinue()
		{
			btnContinue.click();
		}
		
		public void clickLogout()
		{
			btnLogout.click();
		}
		

}
