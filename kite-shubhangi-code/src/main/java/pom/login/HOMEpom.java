package pom.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HOMEpom {
	
	WebDriver driver;
	Actions action;
	
	@FindBy(xpath = "//a[@href='/orders']")
	private WebElement order;
	
	@FindBy(xpath = "//a[@href='/holdings']")
	private WebElement holdings;
	
	@FindBy(xpath = "//a[@href=\"/positions\"]")
	private WebElement position;
	
	@FindBy(xpath = "//span[text()='VE3949']")
	private WebElement account;
	
	@FindBy(xpath = "//a[@href='/logout']")
	private WebElement logout;
	//button[@type="button"]
	//label[@for="radio-167"]
	
	public HOMEpom(WebDriver driver) 
	{   
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	
    public void order()
	{
		
	 order.click();
		
	}
	
	public void holdings()
	{
		
		holdings.click();
		
	}
	public void position()
	{
		
		position.click();
		
	}
	
	public void Logout() throws InterruptedException {
	       // this.driver=driver;
		    action=new Actions(driver);
		    Thread.sleep(2000);
			action.moveToElement(account).click().build().perform();
			Thread.sleep(2000);
			action.moveToElement(logout).click().build().perform();
		}

}
