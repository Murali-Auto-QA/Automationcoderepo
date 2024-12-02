package testCases;

import java.time.Duration;


import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import generalUtility.Utility;

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
}
