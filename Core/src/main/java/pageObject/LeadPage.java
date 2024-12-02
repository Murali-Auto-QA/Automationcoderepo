package pageObject;



import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import baseClass.BasePage;

public class LeadPage extends BasePage{
	
	
	
	public LeadPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//li[@id='leads']")
	WebElement bt_leads;
	
	@FindBy(xpath="//div[@id='bcrm-users-create-transaction-btn']")
	WebElement bt_AddLead;
	
	@FindBy(xpath="//div[@id='leads_leads']/div/div/div/div/div/div/div/following-sibling::div/table/thead/following-sibling::tbody/tr[1]/td[11]")
	WebElement bt_ViewMore;
	
	@FindBy(xpath="//img[@id='leads_editGst']")
	WebElement Edit_bt_GST;
	
	@FindBy(xpath="//input[@id='gstNumber']")
	WebElement txt_GSTNumber;
	
	@FindBy(xpath="//button[text()='Validate']")
	WebElement bt_Validate;
	
	@FindBy(xpath="//input[@id='directorsName']")
	WebElement txt_DirectorName;
	
	@FindBy(xpath="//input[@id='businessWebsite']")
	WebElement txt_BusinessWebSite;
	
	@FindBy(xpath="//input[@id='companyPan']")
	WebElement txt_CompanyPan;
	
	@FindBy(xpath="//input[@id='tin']")
	WebElement txt_Tin;
	
	@FindBy(xpath="//div[@id='industryType']/div[1]/div/input")
	WebElement drop_down_IndustryType;
	
	@FindBy(xpath="//div[@id='industryType']/div[2]/ul/li[3]")
	WebElement drop_down_IndustryTypeOption;
	
	@FindBy(xpath="//div[@id='segment']")
	WebElement drop_down_Segment;
	
	@FindBy(xpath="//div[@id='segment']/div[2]/ul/li[2]")
	WebElement drop_down_SegmentOption;
	
	@FindBy(xpath="//button[text()='Save']")
	WebElement bt_Save;
	
	@FindBy(css="#leads_addSpoc")  ////*[local-name()='svg' and @id='leads_addSpoc']
	WebElement Edit_bt_AddSpoc;
	
	@FindBy(xpath="//input[@id='firstName']")
	WebElement txt_FirstName;
	
	@FindBy(xpath="//input[@id='lastName']")
	WebElement txt_LastName;
	
	@FindBy(xpath="//input[@id='mobileNumber']")
	WebElement txt_MobileNumber;
	
	
	@FindBy(xpath="//input[@id='email']")
	WebElement txt_Email;
	
	@FindBy(xpath="//input[@id='jobTitle']")
	WebElement txt_JobTitle;
	
	@FindBy(xpath="//button[text()='Save']")
	WebElement Spocbt_Save;
	
	@FindBy(xpath="//button[@id='leads_addNotes']")
	WebElement bt_LeadNote;
	
	@FindBy(css="[placeholder='Take a note...']")
	WebElement txt_PlaceHolder;
	
	@FindBy(xpath="//div[@class='flex  justify-end gap-[16px] w-[100%]']/button[2]")
	WebElement bt_Add;
	
	@FindBy(xpath="//button[text()='Add Requirements']")
	WebElement bt_AddRequirement;
	
	@FindBy(css="[placeholder='What is the requirement from the client?']")
	WebElement txt_placeHolder;
	
	@FindBy(xpath="//div[@class='flex  justify-end gap-[16px] w-[100%]']/button[2]")
	WebElement bt_RAdd;
	
	@FindBy(xpath="//input[@id='dPan']")
	WebElement txt_Dpan;
	
	@FindBy(xpath="//input[@id='mccCode']")
	WebElement txt_Mcc;
	
	@FindBy(xpath="//input[@id='din']")
	WebElement txt_din;
	
	@FindBy(xpath="//button[text()='Send to R&C']")
	WebElement bt_SendToRNC;
	
	@FindBy(xpath="//button[text()='Confirm']")
	WebElement bt_Confirm;
	
	@FindBy(xpath="//button[text()='Apply']")
	WebElement bt_Apply;
	
	

	
	public void LeadsButton()
	{
		bt_leads.click();
	}
	public void AddLeadButton()
	{
		bt_AddLead.click();
	}
	public void ViewMoreButton()
	{
		bt_ViewMore.click();
	}
	public void EditGSTNumber()
	{
		Edit_bt_GST.click();
	}
	public WebElement EnterGST(String GST)
	{
		txt_GSTNumber.sendKeys(GST);
		return txt_GSTNumber;
	}
	public void Validate()
	{
		bt_Validate.click();
	}
	public void DirectorName(String Name)
	{
		txt_DirectorName.sendKeys(Name);
	}
	public void BusinessWebSite(String WebSite)
	{
		txt_BusinessWebSite.sendKeys(WebSite);
	}
	public void Tin(String tin)
	{
		txt_Tin.sendKeys(tin);
	}
	public void IndustryType()
	{
		drop_down_IndustryType.click();
		drop_down_IndustryTypeOption.click();
	}
	public void Segment()
	{
		drop_down_Segment.click();
		drop_down_SegmentOption.click();
	}
	public void Save()
	{
		bt_Save.click();
	}
	public WebElement AddSpoc() 
	{
		 return Edit_bt_AddSpoc;
	}
	public void FirstName(String Name)
	{
		txt_FirstName.sendKeys(Name);
	}
	public void LastName(String Name)
	{
		txt_LastName.sendKeys(Name);
		
	}public void MobileNumber(String Mobile)
	{
		txt_MobileNumber.sendKeys(Mobile);
	}public void Email(String Email)
	{
		txt_Email.sendKeys(Email);
	}public void JobTitle(String titl)
	{
		txt_JobTitle.sendKeys(titl);
	}
	public void SopcSave()
	{
		Spocbt_Save.click();
		
	}public void LeadNote(String Note)
	{
		bt_LeadNote.click();
		txt_PlaceHolder.click();
		txt_PlaceHolder.sendKeys(Note);
		bt_Add.click();
	}public void LeadRequirement(String Req)
	{
		bt_AddRequirement.click();
		txt_placeHolder.click();
		txt_placeHolder.sendKeys(Req);
		bt_RAdd.click();
		
		
	}public void companypan() throws Exception {
		txt_CompanyPan.click();
		Robot rt=new Robot();
		rt.keyPress(KeyEvent.VK_CONTROL);
		rt.keyPress(KeyEvent.VK_A);
		rt.keyRelease(KeyEvent.VK_A);
		rt.keyPress(KeyEvent.VK_C);
		rt.keyRelease(KeyEvent.VK_C);
		rt.keyRelease(KeyEvent.VK_CONTROL);
	}
	public void dpan() throws Exception {
		txt_Dpan.click();
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);

		
	}
	public void MccCode(String mcc)
	{
		txt_Mcc.sendKeys(mcc);
	}
	public void Din(String din)
	{
		txt_din.sendKeys(din);
	}
	public void SendToRNC()
	{
		bt_SendToRNC.click();
	}
	public void Confirm()
	{
		bt_Confirm.click();
	}
	public void Apply()
	{
		bt_Apply.click();
	}
//	public void ();
//	{
//		
//	}
}




/*driver.findElement(By.xpath("//button[@id='leads_addNotes']")).click();
WebElement addNote = driver.findElement(By.cssSelector("[placeholder='Take a note...']"));
addNote.click();
addNote.sendKeys("Text Entering");
driver.findElement(By.xpath("//div[@class='flex  justify-end gap-[16px] w-[100%]']/button[2]")).click();
Thread.sleep(2000L);
driver.findElement(By.xpath("//button[text()='Add Requirements']")).click();
WebElement addRequire = driver.findElement(By.cssSelector("[placeholder='What is the requirement from the client?']"));
addRequire.click();
addRequire.sendKeys("Requirement Entered");
driver.findElement(By.xpath("//div[@class='flex  justify-end gap-[16px] w-[100%]']/button[2]")).click();
*/
