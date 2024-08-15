package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage 
{
	WebDriver driver;
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Elements
	//Sign up
	
	@FindBy(xpath = "//input[@placeholder='Name']")
	WebElement txtName;
	
	@FindBy(xpath = "//input[@data-qa='signup-email']")
	WebElement txtSignEmail;
	
	@FindBy(xpath = "//button[normalize-space()='Signup']")
	WebElement btnSignup;
	
	//Login 
	
	@FindBy(xpath = "//input[@data-qa='login-email']")
	WebElement txtLoginEmail;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement txtLoginPassword;
	
	@FindBy(xpath = "//button[normalize-space()='Login']")
	WebElement btnLogin;
	
	
	//Account Information
	
	@FindBy(xpath = "//input[@id='id_gender1']")
	WebElement rdMr;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement txtPassword;
	
	@FindBy(xpath = "//input[@id='first_name']")
	WebElement txtFname;
	
	@FindBy(xpath = "//input[@id='last_name']")
	WebElement txtLname;
	
	@FindBy(xpath = "//input[@id='address1']")
	WebElement txtAddress;
	
	@FindBy(xpath = "//input[@id='state']")
	WebElement txtState;
	
	@FindBy(xpath = "//input[@id='city']")
	WebElement txtCity;
	
	@FindBy(xpath = "//input[@id='zipcode']")
	WebElement txtZcode;
	
	@FindBy(xpath = "//input[@id='mobile_number']")
	WebElement txtMoNo;
	
	@FindBy(xpath = "//button[normalize-space()='Create Account']")
	WebElement btnCreateAcc;
	
	@FindBy(xpath = "//b[normalize-space()='Account Created!']")
	WebElement msgAccCreated;
	
	@FindBy(xpath = "//a[normalize-space()='Continue']")
	WebElement btnRegCont;

	//Action Method
	//Sign up
	
	public void setName(String name)
	{
		txtName.sendKeys(name);
	}
	
	public void setSignEmail(String signemail)
	{
		txtSignEmail.sendKeys(signemail);
	}
	
	public void clickSignup()
	{
		btnSignup.click();
	}
	
	//Account Information
	
	public void clickRdMr()
	{
		rdMr.click();
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void setFname(String fname)
	{
		txtFname.sendKeys(fname);
	}
	
	public void setLname(String lname)
	{
		txtLname.sendKeys(lname);
	}
	
	public void setAddress(String address)
	{
		txtAddress.sendKeys(address);
	}
	
	public void setState(String state)
	{
		txtState.sendKeys(state);
	}
	
	public void setCity(String city)
	{
		txtCity.sendKeys(city);
	}
	
	public void setZcode(String zcode)
	{
		txtZcode.sendKeys(zcode);
	}
	
	public void setMoNo(String mono)
	{
		txtMoNo.sendKeys(mono);
	}
	
	public void clickCreateAcc()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", btnCreateAcc);
	}
	
	public boolean regConfirmation()
	{
		try 
		{
			return (msgAccCreated.isDisplayed());			
		} 
		catch (Exception e) 
		{
			return (false);			
		}
	}
	
	public void clickRegCont()
	{
		btnRegCont.click();
	}
	
	
	//Action Method - Login
	
	public void setLoginEmail(String loginemail)
	{
		txtLoginEmail.sendKeys(loginemail);
	}
	
	public void setLoginPassword(String loginpassword)
	{
		txtLoginPassword.sendKeys(loginpassword);
	}
	
	public void clickLogin()
	{
		btnLogin.click();
	}
	
	
	
}
