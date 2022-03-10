package Pageobject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import commoncode.CommonAsset;

public class DriverInitation  {
	
	public WebDriver driver;
	public Properties pr;
	public WebDriver initializeDriver() throws IOException
	
	{   
		CommonAsset ast= new CommonAsset();
	    Properties prop= ast.setpropertyobject();
		String browser= prop.getProperty("browser");
		
		if(browser.equalsIgnoreCase("chrome")) 
		{
			
			System.setProperty("webdriver.chrome.driver","C:\\\\work\\\\chromedriver_win32 (2)\\\\chromedriver.exe" );
			 driver= new ChromeDriver();
		}
		
		else if (browser.equalsIgnoreCase("FireFox")) 
		{
			System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		
		return driver;
	}

}
