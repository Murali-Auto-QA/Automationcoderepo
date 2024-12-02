package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import baseClass.BasePage;

public class LogOutPage extends BasePage {
	
	public LogOutPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//div[@class='relative ml-3']/div/button")
	WebElement Profile_Icon;
	
	@FindBy(xpath="//div[@class='relative ml-3']/div[2]/a")
	WebElement logout_Button;
	
	public void ClickOnProfile()
	{
		Profile_Icon.click();
	}
	
	public void ClickOnLogout()
	{
		logout_Button.click();
	}
}
