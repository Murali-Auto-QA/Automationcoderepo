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
	
	@FindBy(xpath="//button[@id='headlessui-popover-button-:r0:']")
	WebElement bt_nineDot;
	
	@FindBy(xpath="//div[@id='nav_item_bcrm']")
	WebElement title_Bcrm;
	
	public void nineDot()
	{
		bt_nineDot.click();
	}
	public void titleBcrm()
	{
		title_Bcrm.click();
	}
}
