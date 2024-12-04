package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import baseClass.BasePage;

public class DashBoardPage extends BasePage{


	public DashBoardPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//img[@class='h-8 w-auto lg:block ml-8']")
	WebElement text_Neokred;
	
	@FindBy(xpath="//button[@id='headlessui-popover-button-:r0:']")
	WebElement bt_nineDot;
	
	@FindBy(xpath="//div[@id='nav_item_bcrm']")
	WebElement title_Bcrm;
	
	public WebElement nineDot()
	{
		return bt_nineDot;
	}
	public WebElement titleBcrm()
	{
		return title_Bcrm;
	}
	public WebElement DashBoardVerify()
	{
		return text_Neokred;
	}
}
