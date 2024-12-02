package testCases;


import java.awt.Robot;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.BasicDetailsPage;
import pageObject.DashBoardPage;
import pageObject.FileUpload;
import pageObject.LeadPage;
import pageObject.LogOutPage;
import pageObject.LoginPage;
import pageObject.ProductPage;

public class TCC_002_CreatingLeadTestCase extends BaseClass{

	
	@Test(groups={"Regression","Smoke","Master"},priority=1)
	void CreatingLead() throws Exception
	{
		
		try {
		
		LoginPage lg=new LoginPage(driver);
		lg.userEmail(UserEmail);
		lg.userPassword(Password);
		lg.loginButton();
		lg.otp(OTP);
		lg.verify();
		DashBoardPage ds=new DashBoardPage(driver);
		ds.nineDot();
		ds.titleBcrm();
		LeadPage lp=new LeadPage(driver);
		lp.LeadsButton();
		lp.AddLeadButton();
		ProductPage pg=new ProductPage(driver);
		
	
		
//			pg.Blutic();
		
//		pg.Profilex();
//		
			pg.Profilex_AIGF();
//		
//		pg.Collecbot();
		
		
		BasicDetailsPage bd=new BasicDetailsPage(driver);
		bd.SetFirstName("Matthew");
		bd.SetLastName("John");
		bd.SetJobTitle("QA");
		bd.SetMobileNumber(randomMobileNumber());
		bd.SetEmail("murali+82"+randomNumber()+"@neokred.tech");
		bd.SetBusinessName("Other");
		bd.SetSource().click();
		Robot rt=new Robot();
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
//		bd.SetLeadOwner().click();
//		rt.keyPress(KeyEvent.VK_DOWN);
//		rt.keyRelease(KeyEvent.VK_DOWN);
//		rt.keyPress(KeyEvent.VK_ENTER);
//		rt.keyRelease(KeyEvent.VK_ENTER);
	bd.SetResellerQA().click();
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
		bd.ClickSaveButton().click();
		
		
		}catch(Exception e)
		{
			Assert.fail();
		}
	
		
	}
	
	@Test(groups= {"Regression","Smoke","Master"},priority=2)
	void validation()
	{	try {
		LeadPage lp =new LeadPage(driver);
		lp.ViewMoreButton();
		lp.EditGSTNumber();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(lp.EnterGST("32AAKCM3292K1Z8")));
//		lp.EnterGST("33CYUPS2693P1Z7");
		Thread.sleep(2000);
		lp.Validate();
		lp.DirectorName("Matthew");
		lp.BusinessWebSite("www.testingfalcon.com");
		
//		lp.companypan();
//		lp.dpan();
//		lp.MccCode(randomNumber());
//		lp.Din(randomNumber8());
		
		lp.Tin(randomNumber());
		lp.IndustryType();
		lp.Segment();
		
		lp.Save();
	} catch(Exception e)
	{
		Assert.fail();
	}
	}
	@Test(groups= {"Regression","Master"},priority=3)
	void AddSpoc()
	{	
		try {
		LeadPage lp=new LeadPage(driver);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(lp.AddSpoc()));
		Actions act =new Actions(driver);
		act.moveToElement(lp.AddSpoc()).perform();
		Thread.sleep(2000);
		lp.AddSpoc().click();
		lp.FirstName("Matthew");
		lp.LastName("John");
		lp.MobileNumber(randomMobileNumber());
		lp.Email("murali+"+randomNumber()+"@neokred.tech");
		lp.JobTitle("QA");
		lp.SopcSave();
		} catch(Exception e)
		{
			Assert.fail();
		}
	}
	@Test(groups= {"Regression","Master"},priority=4)
	void addRequirement()
	{	try {
		
		LeadPage lp=new LeadPage(driver);
		lp.LeadNote("LeadNote Writing");
		Thread.sleep(2000);
		lp.LeadRequirement("LeadRequirement Entering");
	}	catch(Exception e)
		{
			Assert.fail();
		}
	}
	@Test(groups= {"Regression","Smoke","Master"},priority=5)
	public void UploadFile() throws Exception
	{
		FileUpload fl =new FileUpload(driver);
		WebElement element = fl.AddDocument();
		Actions act =new Actions(driver);
		act.moveToElement(element).perform();
		element.click();
		fl.UploadFile();
		StringSelection se =new StringSelection(FilePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(se, null);
		Robot rt =new Robot();
		Thread.sleep(2000);
		rt.keyPress(KeyEvent.VK_CONTROL);
		rt.keyPress(KeyEvent.VK_V);
		rt.keyRelease(KeyEvent.VK_V);
		rt.keyRelease(KeyEvent.VK_CONTROL);
		rt.keyPress(KeyEvent.VK_ENTER);		
		fl.RemoveName().click();
		rt.keyPress(KeyEvent.VK_CONTROL);
		rt.keyPress(KeyEvent.VK_A);
		rt.keyRelease(KeyEvent.VK_A);
		rt.keyRelease(KeyEvent.VK_CONTROL);
		rt.keyPress(KeyEvent.VK_BACK_SPACE);
		fl.RemoveName().sendKeys("NDA");
		fl.upload();
	
		
	}
	@Test(groups= {"Regression","Smoke","Master"},priority=6)
	public void Logout() throws Exception
	{
		LogOutPage lg = new LogOutPage(driver);
		Thread.sleep(2000);
		LeadPage lp=new LeadPage(driver);
		lp.SendToRNC();
		lp.Confirm();
		lp.Apply();
		Thread.sleep(2000);
		lg.ClickOnProfile();
		lg.ClickOnLogout();
	}
}
