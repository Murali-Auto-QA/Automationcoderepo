package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import baseClass.BasePage;

public class FileUpload extends BasePage{

	public FileUpload(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//p[text()='Add Document']")
	WebElement Add_Document;
	
	@FindBy(xpath="//p[text()='Drag and drop file, or browse file']")
	WebElement Upload_file;
	
	@FindBy(xpath="//input[@id='documentType']")
	WebElement Remove_name;
	
	
	@FindBy(xpath="//button[text()='Upload']")
	WebElement bt_Upload;
	
	public WebElement  AddDocument()
	{
		return Add_Document;
		
	}
	
	public WebElement UploadFile()
	{
		return Upload_file;
	}
	
	public WebElement RemoveName()
	{
		return Remove_name;
	}
	
	
	public WebElement upload()
	{
		return bt_Upload;
	}
}
