package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseClass.BasePage;
import pageObject.LoginPage;

public class TCC_001_Login extends BaseClass {
	
	@Test()
	void Login(WebDriver driver) throws Exception
	{
		LoginPage lp =new LoginPage(driver);
		lp.userEmail().sendKeys(getDataFromExcel("Sheet1",2,0));
		lp.userPassword().sendKeys(getDataFromExcel("Sheet1",2,1));
		WebElement welcome = lp.LoginPageAccessed();
		try {
			Assert.assertTrue(welcome.isDisplayed(), "Welcome Message Displayed");
		}catch(Exception e)
		{
			Assert.fail("Welcome Message Not Fetched");
		}
		lp.loginButton();
		lp.OTP().sendKeys(OTP);
		lp.verify().click();
	}
}
