package testcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pageobject.DriverInitation;
import Pageobject.InitialPageFunc;
import commoncode.CommonAsset;

public class InitialPage extends DriverInitation {
	
	
	@BeforeTest
	
	public void driverInitialise () throws IOException
	{
	 	driver= initializeDriver();
		
	}
	
	@Test
	
	public void getsiteText() throws InterruptedException, IOException 
	{   
		CommonAsset ca= new CommonAsset(driver);
		ca.callsites();
		Thread.sleep(3000);
		InitialPageFunc ob= new InitialPageFunc(driver);
		ob.enablewbtitle();
		ob.aboutScrolling();
		ob.solutionScrolling();
		Thread.sleep(3000);
		ob.contactScrolling();
		Thread.sleep(3000);
		ob.buyDCBclick();
		ob.launchAppclick();
		
	}
	


}
