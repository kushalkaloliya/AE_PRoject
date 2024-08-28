package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage 
{
	WebDriver driver;
	
	public ContactUsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Elements
	
	@FindBy(xpath = "//input[@placeholder='Name']")
	WebElement txtName;
	
	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement txtEmail;
	
	@FindBy(xpath = "//input[@placeholder='Subject']")
	WebElement txtSubject;
	
	@FindBy(xpath = "//textarea[@id='message']")
	WebElement txtMessage;
	
	@FindBy(xpath = "//input[@name='upload_file']")
	WebElement btnUploadFile;
	
	@FindBy(xpath = "//input[@name='submit']")
	WebElement btnSubmit;
	
	@FindBy(xpath = "//div[@class='status alert alert-success']")
	WebElement msgSuccessSubmit;
	
	@FindBy(xpath = "//span[normalize-space()='Home']")
	WebElement btnHome;
	
	//Action Method
	
	public void setName(String name)
	{
		txtName.sendKeys(name);
	}
	
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void setSubject(String subject)
	{
		txtSubject.sendKeys(subject);
	}
	
	public void setMessage(String message)
	{
		txtMessage.sendKeys(message);
	}
	
	public void clickUploadFile()
	{
		btnUploadFile.sendKeys("E:\\Testingfile.txt");
	}
	
	public void clickSubmit()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", btnSubmit);
	}
	
	public String conOFSubmit()
	{
		return msgSuccessSubmit.getText();
	}
	
	public void clickHome()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", btnHome);
	}

}
