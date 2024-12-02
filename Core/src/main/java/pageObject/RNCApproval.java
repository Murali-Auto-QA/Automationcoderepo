package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import baseClass.BasePage;

public class RNCApproval extends BasePage{
	
	public RNCApproval(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//*[local-name()='svg' and @class='w-10 h-10 p-1  rounded-full bg-white-0 shadow-sm text-blue-20']")
	WebElement bt_ninedot;
	
	@FindBy(xpath="//div[@class='mt-2']/div[2]/a/span")
	WebElement option_Risk_Complience;
	
	@FindBy(xpath="//ul[@class='px-6 -mx-2 space-y-1 mt-6']/li[2]/button")
	WebElement option_pending;
	
	@FindBy(xpath="//div[@id='leads']/div/div[3]")
	WebElement produc_profilex;
	
	@FindBy(xpath="//div[@id='leads']/div/div[4]")
	WebElement produc_bluetic;
	
	@FindBy(xpath="//div[@id='leads']/div/div[5]")
	WebElement product_collectbot;
	
	@FindBy(xpath="//div[@id='leads']/div/div[6]")
	WebElement product_profilex_AIGF;
	
	@FindBy(xpath="//div[@id='leads']/div/div[7]")
	WebElement product_leanx;
	
	@FindBy(xpath="//div[@id='leads_leadsTable']/div/div/div/div/following-sibling::div/div/div/following-sibling::div/table/thead/following-sibling::tbody/tr[1]/td[10]")
	WebElement bt_ViewMore;
	
	@FindBy(xpath="//button[@id='leads_markAsVerified']")
	WebElement bt_markAsVerify_GST;
	
	@FindBy(xpath="//div[@class='flex self-end gap-4']/button[2]")
	WebElement bt_Yes;
	
	@FindBy(xpath="//div[@id='leads_leadDocuments']/div/div/following-sibling::div/div/div/div/button[2]/div/div/span")
	WebElement bt_NDA;
	
	@FindBy(xpath="//div[@id='leads_leadDocuments']/div/div[2]/div[2]/div/div/div/div/div/button")
	WebElement bt_markAsVerify_NDA;
	
	@FindBy(xpath="//div[@class='flex self-end gap-4']/button[2]")
	WebElement bt_NDA_yes;
	
	@FindBy(xpath="//div[@id='leads_leadsRncStatusUpdate']/div/button")
	WebElement drop_down_status;
	
	@FindBy(xpath="//div[@id='leads_leadsRncStatusUpdate']/div/button/following-sibling::ul/li[3]/div")
	WebElement option_Approval;
	
	@FindBy(xpath="//button[@id='headlessui-menu-button-:r2:']")
	WebElement user_profile ;
	
	@FindBy(xpath="//div[@id='headlessui-menu-items-:r4:']/a[2]")
	WebElement bt_Logout;
	
	
	
	public void nineDot()
	{
		bt_ninedot.click();
	}
	public void riskandcomplience()
	{
		option_Risk_Complience.click();
	}
	public void Pending()
	{
		option_pending.click();
	}
	public void profilex()
	{
		produc_profilex.click();
	}
	public void blutic()
	{
		produc_bluetic.click();
	}
	public void profilex_AIGF()
	{
		product_profilex_AIGF.click();
	}
	public void collectbot()
	{
		product_collectbot.click();
	}
	public void leanx()
	{
		product_leanx.click();
	}
	public void ViewMore()
	{
		bt_ViewMore.click();
	}
	public void GSTVerify()
	{
		bt_markAsVerify_GST.click();
	}
	public void GstYes()
	{
		bt_Yes.click();
	}
	public void NDA()
	{
		bt_NDA.click();
	}
	public void NDAVerify()
	{
		bt_markAsVerify_NDA.click();
	}
	public void NDAYes()
	{
		bt_NDA_yes.click();
	}
	public void Statu()
	{
		drop_down_status.click();
	}
	public void Approval()
	{
		option_Approval.click();
	}
	public void ClickonProfile()
	{
		user_profile.click();
	}
	public void logout()
	{
		bt_Logout.click();
	}
	
}
