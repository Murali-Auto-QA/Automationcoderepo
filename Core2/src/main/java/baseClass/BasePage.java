package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import generalUtility.Utility;

public class BasePage  {
	
	WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

}
