package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pojo.base;
import pom.login.HOMEpom;
import pom.login.loginPOM;

public class test1 extends base {
	
	 WebDriver driver;
		loginPOM login;
		HOMEpom home;
		static ExtentTest test;
		static ExtentHtmlReporter reporter;
		
		@BeforeTest
		@Parameters("browser")
		public void launchBrowser(String browser) {
			reporter = new ExtentHtmlReporter("test-output//ExtendReport//Extent.html");
			ExtentReports extend = new ExtentReports();
			extend.attachReporter(reporter);
			System.out.println("BeforeTest");
			if(browser.equalsIgnoreCase("chrome"))
			{
				driver = openChromeBrowser();
			}
			else if(browser.equalsIgnoreCase("Firefox"))
			{
				driver = openFirefoxBrowser();
			}
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
			
			
		
		@BeforeClass
	    public void Beforeclass() throws InterruptedException {
			driver.get("https://kite.zerodha.com/");
			Thread.sleep(2000);
			login=new loginPOM(driver);
			Thread.sleep(2000);
			login.userid();
			login.password();
			login.login();
			Thread.sleep(2000);
			login.pin();
			login.conti();
		}
		
		@Test
		public void verifyOrder() throws InterruptedException {
			System.out.println("Verify order");
		    home=new HOMEpom(driver);
		    Thread.sleep(3000);
		    home.order();
		    String url=driver.getCurrentUrl();
		    
		    if(url.equals("https://kite.zerodha.com/orders")) {
		    	System.out.println("PASS");
		    }
		    else {
		    	System.out.println("FAIL");
		    }
		  
		}
		
		@Test
		public void Verifyholdings() throws InterruptedException {
			System.out.println("varify holdings");
		    home=new HOMEpom(driver);
		    Thread.sleep(3000);
		    home.holdings();
		    String url=driver.getCurrentUrl();
		    
		    if(url.equals("https://kite.zerodha.com/holdings")) {
		    	System.out.println("PASS");
		    }
		    else {
		    	System.out.println("FAIL");
		    }
			
		}
		
		@Test
		public void Verifyposition() throws InterruptedException {
			System.out.println("varify holdings");
		    home=new HOMEpom(driver);
		    Thread.sleep(3000);
		    home.position();
		    String url=driver.getCurrentUrl();
		    
		    if(url.equals("https://kite.zerodha.com/positions")) {
		    	System.out.println("PASS");
		    }
		    else {
		    	System.out.println("FAIL");
		    }
			
		}
		
		@AfterClass
		public void afterclass() throws InterruptedException {
			Thread.sleep(2000);
			home=new HOMEpom(driver);
				
			 home.Logout();
		}
		
		@AfterTest
		public void aftertest() {
			driver.quit();
//			openChromeBrowser().close();
//			openfirefoxBrowser().close();
		}

}
