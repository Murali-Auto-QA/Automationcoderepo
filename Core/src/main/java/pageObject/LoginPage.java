package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import baseClass.BasePage;


public class LoginPage extends BasePage {
	

	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='email']")
	WebElement txt_userEmail;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement txt_userPassword;
	
	@FindBy(xpath="//button[text()='Login']")
	WebElement bt_loginButton;
	
	@FindBy(xpath="//div[@class='flex items-end']/div/input")
	WebElement bt_Otp;
	
	@FindBy(xpath="//button[text()='Verify']")
	WebElement bt_verify;
	
	
	public void userEmail(String email)
	{
		txt_userEmail.sendKeys(email);
	}
	public void userPassword(String pwd)
	{
		txt_userPassword.sendKeys(pwd);
	}
	public void loginButton()
	{
		bt_loginButton.click();
	}
	public void otp(String OTP)
	{
		bt_Otp.click();
		bt_Otp.sendKeys(OTP);
	}
	public void verify()
	{
		bt_verify.click();
	}
}
