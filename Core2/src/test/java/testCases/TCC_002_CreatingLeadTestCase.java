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
	void Login() throws Exception
	{
		
		try {
		
			LoginPage lp =new LoginPage(driver);
			lp.userEmail().sendKeys(getDataFromExcel("Sheet1",2,0));
			lp.userPassword().sendKeys(getDataFromExcel("Sheet1",2,1));
			lp.loginButton().click();
			lp.OTP().sendKeys(OTP);
			lp.verify().click();
			
			DashBoardPage ds =new DashBoardPage(driver);
			ds.nineDot().click();
			ds.titleBcrm().click();
			
			LeadPage lg =new LeadPage(driver);
			lg.LeadsButton().click();
		
		}catch(Exception e)
		{
			Assert.fail();
		}
	}
//	@Test(groups={"Regression","Smoke","Master"},priority=2)
	void Bluetic() throws Exception
	{	try {
		LeadPage lg =new LeadPage(driver);
		lg.LeadsButton().click();
		lg.AddLeadButton().click();
		ProductPage pg=new ProductPage(driver);
		pg.Blutic().click();
		BasicDetails("Matthew","John","QA",randomMobileNumber(),"murali+"+randomNumber()+"@neokred.tech","Other");
		Thread.sleep(2000);
		validation("29AAMFT4121B1ZD","Matthew","www.demotesting.com");
		Thread.sleep(2000);
		AddSpoc("Murali","Kavalakuntla",randomMobileNumber(),"murali+"+randomNumber()+"@neokred.tech","QA");
		addRequirement("Text Entering","Requirement Entering");
		UploadNDAFile("NDA");
		LeadPage lp=new LeadPage(driver);
		lp.SendToRNC().click();
		lp.Confirm().click();
		lp.Apply().click();
	}catch(Exception e)
	{
		Assert.fail();
	}
	}
	
	@Test(groups={"Regression","Smoke","Master"},priority=3)
	void Collectbot() throws Exception
	{
		try {
		LeadPage lg =new LeadPage(driver);
		lg.LeadsButton().click();
		lg.AddLeadButton().click();
		ProductPage pg=new ProductPage(driver);
		pg.Collecbot().click();
		String mobile = randomMobileNumber();
		String email = "murali+"+randomNumber()+"@neokred.tech";
		
		BasicDetails("Matthew","John","QA",mobile,email,"Other");
		
	WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
//	wait.until(ExpectedConditions.textToBePresentInElementValue(lg.UserPhoneNumber(), "Mobile Number is Presented"));
		String ActualEmail = lg.UserEmail().getText();
		String ActualMobile = lg.UserPhoneNumber().getText();
		Assert.assertEquals(mobile, ActualMobile);
		Assert.assertEquals(email, ActualEmail);
		Actions act =new Actions(driver);
		act.moveToElement(lg.ViewMoreButton()).perform();
		lg.ViewMoreButton().click();
		lg.EditGSTNumber().click();
		lg.EnterGST().sendKeys("37AANFT0109J1Z2");
		Thread.sleep(2000);
		lg.Validate().click();
		lg.DirectorName().sendKeys("Demo");
		lg.BusinessWebSite().sendKeys("www.demotesting.com");
		
		lg.companypan().click();
		
		Robot rt=new Robot();
		rt.keyPress(KeyEvent.VK_CONTROL);
		rt.keyPress(KeyEvent.VK_A);
		rt.keyRelease(KeyEvent.VK_A);
		rt.keyPress(KeyEvent.VK_C);
		rt.keyRelease(KeyEvent.VK_C);
		rt.keyRelease(KeyEvent.VK_CONTROL);
		
		lg.dpan().click();
		
		rt.keyPress(KeyEvent.VK_CONTROL);
		rt.keyPress(KeyEvent.VK_V);
		rt.keyRelease(KeyEvent.VK_V);
		rt.keyRelease(KeyEvent.VK_CONTROL);
		
		lg.MccCode().sendKeys(randomNumber());
		lg.Din().sendKeys(randomNumber8());
		
		lg.Tin().sendKeys(randomNumber());
		lg.IndustryType().click();
		lg.IndustryOption().click();
		lg.Segment().click();
		lg.SegmentOption().click();
		lg.Save().click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(lg.AddSpoc()));
		AddSpoc("Murali","Kavalakuntla",randomMobileNumber(),"murali+"+randomNumber()+"@neokred.tech","QA");
		addRequirement("Text Entering","Requirement Entering");
		UploadNDAFile("NDA");
		LeadPage lp=new LeadPage(driver);
		lp.SendToRNC().click();
		lp.Confirm().click();
		lp.Apply().click();
		}catch(Exception e)
		{
			Assert.fail();
		}
	}
	
//	@Test(groups={"Regression","Smoke","Master"},priority=4)
	void Profilex() throws Exception
	{
		try {
		LeadPage lg =new LeadPage(driver);
		lg.LeadsButton().click();
		lg.AddLeadButton().click();
		ProductPage pg=new ProductPage(driver);
		pg.Profilex().click();
		BasicDetails("Matthew","John","QA",randomMobileNumber(),"murali+"+randomNumber()+"@neokred.tech","Other");
		Thread.sleep(2000);
		validation("29AHJPB8195P1ZG","Matthew","www.demotesting.com");
		Thread.sleep(2000);
		AddSpoc("Murali","Kavalakuntla",randomMobileNumber(),"murali+"+randomNumber()+"@neokred.tech","QA");
		addRequirement("Text Entering","Requirement Entering");
		UploadNDAFile("NDA");
		LeadPage lp=new LeadPage(driver);
		lp.SendToRNC().click();
		lp.Confirm().click();
		lp.Apply().click();
		}catch(Exception e)
		{
			Assert.fail();
		}
	}
	
//	@Test(groups={"Regression","Smoke","Master"},priority=5)
	void Profilex_AIGF() throws Exception
	{
		try {
		LeadPage lg =new LeadPage(driver);
		lg.LeadsButton().click();
		lg.AddLeadButton().click();
		ProductPage pg=new ProductPage(driver);
		pg.Profilex_AIGF().click();
		BasicDetails("Matthew","John","QA",randomMobileNumber(),"murali+"+randomNumber()+"@neokred.tech","Other");
		validation("37ACPFS7830P1Z3","Matthew","www.demotesting.com");
		Thread.sleep(2000);
		AddSpoc("Murali","Kavalakuntla",randomMobileNumber(),"murali+"+randomNumber()+"@neokred.tech","QA");
		addRequirement("Text Entering","Requirement Entering");
		UploadNDAFile("NDA");
		Thread.sleep(2000);
		LeadPage lp=new LeadPage(driver);
		lp.SendToRNC().click();
		lp.Confirm().click();
		lp.Apply().click();
		}catch(Exception e)
		{
			Assert.fail();
		}
		
	}
	
	
	@Test(groups= {"Regression","Smoke","Master"},priority=6)
	public void Logout() throws Exception
	{	try {
		LogOutPage lg = new LogOutPage(driver);
		Thread.sleep(2000);
		lg.ClickOnProfile().click();
		lg.ClickOnLogout().click();
	}catch(Exception e)
	{
		Assert.fail();
	}
	}
}

