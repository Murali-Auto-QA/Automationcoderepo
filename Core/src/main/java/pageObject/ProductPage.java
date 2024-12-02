package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import baseClass.BasePage;

public class ProductPage extends BasePage{


	private static final String Collectbot = null;



	public ProductPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//div[@class='flex py-4 gap-4'][1]/div[1]/div/following-sibling::div/div/following-sibling::button")
	WebElement prod_Blutic;
	
	@FindBy(xpath="//div[@class='flex py-4 gap-4'][1]/div[2]/div/following-sibling::div/div/following-sibling::button")
	WebElement prod_Collectbot;
	
	@FindBy(xpath="//div[@class='flex py-4 gap-4'][1]/div[3]/div/following-sibling::div/div/following-sibling::button")
	WebElement prod_Datai;
	
	@FindBy(xpath="//div[@class='flex py-4 gap-4'][1]/div[5]/div/following-sibling::div/div/following-sibling::button")
	WebElement prod_profilex;
	
	@FindBy(xpath="//div[@class='flex py-4 gap-4'][1]/div[6]/div/following-sibling::div/div/following-sibling::button")
	WebElement prod_profilex_AIGF;
	
	
	
	public void Blutic()
	{
		prod_Blutic.click();
	}
	public void Collecbot()
	{
		prod_Collectbot.click();
		
	}
	public void Datai()
	{
		prod_Datai.click();
	}
	public void Profilex()
	{
		prod_profilex.click();
	}
	public void Profilex_AIGF()
	{
		prod_profilex_AIGF.click();
	}
}
