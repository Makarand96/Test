package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	public static WebDriver openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	public static WebDriver openFirefoxBrowser() {
		System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\browsers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}

}
