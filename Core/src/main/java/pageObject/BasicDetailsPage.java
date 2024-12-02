package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.BasePage;

public class BasicDetailsPage extends BasePage {

	
	
	public BasicDetailsPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='firstName']")
	WebElement txt_FirstName;
	
	@FindBy(xpath="//input[@id='lastName']")
	WebElement txt_LastName;
	
	@FindBy(xpath="//input[@id='jobTitle']")
	WebElement txt_JobTitle;
	
	@FindBy(xpath="//input[@id='mobileNumber']")
	WebElement txt_MobileNumber;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement txt_Email;
	
	@FindBy(xpath="//input[@id='businessName']")
	WebElement txt_BusinessName;
	
	@FindBy(xpath="(//*[local-name()='svg'and @class='css-8mmkcg'])[1]")
	WebElement drop_down_Source;
	
	@FindBy(xpath="(//*[local-name()='svg'and @class='css-8mmkcg'])[2]")
	WebElement drop_down_LeadOwner;
	
	@FindBy(xpath="(//*[local-name()='svg'and @class='css-8mmkcg'])[2]")
	WebElement drop_down_QAReseller;
	
	@FindBy(xpath="(//*[local-name()='svg'and @class='css-8mmkcg'])[3]")
	WebElement drop_down_Reseller;
	
	@FindBy(xpath="//button[text()='Save']")
	WebElement bt_Save;
	
	@FindBy(xpath="//button[text()='Cancel']")
	WebElement bt_Cancel;
	
	
	public void SetFirstName(String FirstName)
	{
		txt_FirstName.sendKeys(FirstName);
	}
	public void SetLastName(String LastName)
	{
		txt_LastName.sendKeys(LastName);
	}
	public void SetJobTitle(String JobT) {
		txt_JobTitle.sendKeys(JobT);
	}
	public void SetMobileNumber(String Mobile)
	{
		txt_MobileNumber.sendKeys(Mobile);
	}
	public void SetEmail(String Email)
	{
		txt_Email.sendKeys(Email);
	}
	public void SetBusinessName(String Business) {
		txt_BusinessName.sendKeys(Business);
	}
	public WebElement SetSource() {
		return(drop_down_Source);
	}
	public WebElement SetLeadOwner() {
		return(drop_down_LeadOwner);
	}
	public WebElement SetResellerQA()
	{
		return(drop_down_QAReseller);
	}
	public WebElement SetReseller() 
	{
		return(drop_down_Reseller);
	}
	public WebElement ClickSaveButton() {
		return(bt_Save);
	}
	public void ClickCancelButton() {
		bt_Cancel.click();
	}
	
}
