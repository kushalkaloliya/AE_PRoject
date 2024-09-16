package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage 
{
	WebDriver driver;
	
	public DropDownPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Web Elements - Simple Dropdown
	
	@FindBy(xpath = "//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select")
	WebElement drpCountryEle;
	
	// Action Method - Simple DropDown
	
	public void selectDrpCountry()
	{
		Select drpCountry=new Select(drpCountryEle);
		//drpCountry.selectByVisibleText("India");
		drpCountry.selectByValue("CAN");
	}

}
