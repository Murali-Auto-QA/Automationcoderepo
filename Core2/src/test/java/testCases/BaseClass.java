package testCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;


import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import generalUtility.Utility;
import pageObject.BasicDetailsPage;
import pageObject.FileUpload;
import pageObject.LeadPage;
import pageObject.ProductPage;

public class BaseClass implements Utility{
	
	public WebDriver driver;
	public Logger logger;
	@Test(groups= {"Regression","Smoke","Master"})
	@Parameters({"OS","browser"})
	void SetUp(String os,String br)
	{
		logger= LogManager.getLogger(this.getClass());
		switch(br.toLowerCase())
		{
		case "chrome":driver=new ChromeDriver();break;
		case "edge"	 :driver=new EdgeDriver();break;
		default :System.out.println("No Browser Selected");return;
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(QaURL);
	}

	
	@Test(groups= {"Regression","Smoke","Master"})
	public String randomNumber()
	{
		String randomNum=RandomStringUtils.randomNumeric(4);
		return randomNum;
	}
	@Test(groups= {"Regression","Smoke","Master"})
	public String randomNumber8()
	{
		String randomNum8=RandomStringUtils.randomNumeric(8);
		return randomNum8;
	}
	@Test(groups= {"Regression","Smoke","Master"})
	public String randomMobileNumber()
	{
		String randomMobile=RandomStringUtils.randomNumeric(10);
		return randomMobile;
	}
	public WebElement Wait(By Locr)
	{
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement clickable = wait.until(ExpectedConditions.elementToBeClickable(Locr));
		return clickable;
	}
	@Test
	public String getDataFromExcel(String sheetName,int row ,int cell) throws Exception
	{
		FileInputStream file=new FileInputStream(Utility.ExcelPath);
		Workbook book = WorkbookFactory.create(file);
		Sheet sheet = book.getSheet(sheetName);
		Cell value = sheet.getRow(row).getCell(cell);
		return (value.toString());
	}
	public void BasicDetails(String Firstname,String LastName,String job,String MobileNumber,String Email,String BussinessName) throws Exception
	{
		BasicDetailsPage bd=new BasicDetailsPage(driver);
		bd.SetFirstName().sendKeys(Firstname);
		bd.SetLastName().sendKeys(LastName);
		bd.SetJobTitle().sendKeys(job);
		bd.SetMobileNumber().sendKeys(MobileNumber);
		bd.SetEmail().sendKeys(Email);
		bd.SetBusinessName().sendKeys(BussinessName);
		bd.SetSource().click();
		Robot rt=new Robot();
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
		bd.SetResellerQA().click();
		rt.keyPress(KeyEvent.VK_DOWN);
		rt.keyRelease(KeyEvent.VK_DOWN);
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
		bd.ClickSaveButton().click();
	}
	public void UploadNDAFile(String FileName) throws Exception
	{
		FileUpload fl =new FileUpload(driver);
		WebElement element = fl.AddDocument();
		Actions act =new Actions(driver);
		act.moveToElement(element).perform();
		element.click();
		fl.UploadFile().click();
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
		fl.RemoveName().sendKeys(FileName);
		fl.upload().click();
	}
	public void AddSpoc(String FirstName,String LastName ,String MobileNumber,String Email,String Jobtitle)
	{	
		try {
		LeadPage lp=new LeadPage(driver);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(lp.AddSpoc()));
		Actions act =new Actions(driver);
		act.moveToElement(lp.AddSpoc()).perform();
		Thread.sleep(3000);
		lp.AddSpoc().click();
		lp.FirstName().sendKeys(FirstName);
		lp.LastName().sendKeys(LastName);
		lp.MobileNumber().sendKeys(MobileNumber);
		lp.Email().sendKeys(Email);
		lp.JobTitle().sendKeys(Jobtitle);
		lp.SopcSave().click();
		} catch(Exception e)
		{
			Assert.fail();
		}
	}
	public void addRequirement(String Note,String Requirement)
	{	try {
		
		LeadPage lp=new LeadPage(driver);
		lp.LeadNote().click();
		lp.PlaceHolder().click();
		lp.PlaceHolder().sendKeys(Note);
		lp.LeadNoteAddButton().click();
		Thread.sleep(2000);
		lp.LeadRequirement().click();
		lp.RequirePlaceHolder().click();
		lp.RequirePlaceHolder().sendKeys(Requirement);
		lp.RequirementAdd().click();
	}	catch(Exception e)
		{
			Assert.fail();
		}
	}
	public void validation(String GSTNum,String DirectName,String BussinessWebsite)
	{	try {
		LeadPage lp =new LeadPage(driver);
		lp.ViewMoreButton().click();
		lp.EditGSTNumber().click();
		lp.EnterGST().sendKeys(GSTNum);
		Thread.sleep(2000);
		lp.Validate().click();
		lp.DirectorName().sendKeys(DirectName);;
		lp.BusinessWebSite().sendKeys(BussinessWebsite);
		lp.Tin().sendKeys(randomNumber());
		lp.IndustryType().click();
		lp.IndustryOption().click();
		lp.Segment().click();
		lp.SegmentOption().click();
		lp.Save().click();
	} catch(Exception e)
	{
		Assert.fail();
	}
	}
}
