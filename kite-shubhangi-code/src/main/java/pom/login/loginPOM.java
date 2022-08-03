package pom.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPOM {
	
    WebDriver driver;
	@FindBy(xpath = "//input[@id='userid']")
	private WebElement userid;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement login;
	
//	@FindBy(xpath = "(//span[text()='VE3949']")
//	private WebElement account;
	
	@FindBy(xpath = "//input[@id='pin']")
	private WebElement Pin;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement conti;
	

	public loginPOM(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	
	System.out.print("Edited on git");
	
   public void userid()
	{
		
		userid.sendKeys("VE3949");
		
	}
	
	public void password()
	{
		
		password.sendKeys("Dresser@123");
		
	}
	public void login()
	{
		
		login.click();
		
	}
	public void pin()
	{
		
		Pin.sendKeys("883009");
		
	}
	public void conti()
	{
		
		conti.click();
		
	}

}
