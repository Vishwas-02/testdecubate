package commoncode;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import Pageobject.DriverInitation;

public class CommonAsset {

	
	WebDriver driver;
	public CommonAsset(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver =driver;
	}

 public CommonAsset() {
		// TODO Auto-generated constructor stub
	}

public void callsites() throws IOException 
 {
	    Properties prop= setpropertyobject();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(prop.getProperty("URL1"));
		driver.navigate().to(prop.getProperty("URL2"));
		driver.manage().window().maximize();
	 
 }
	
  public Properties setpropertyobject() throws IOException 
  {
	    Properties pr= new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\shitu\\eclipse-workspace\\decubate\\src\\DataFiles\\Config.properties");
	    pr.load(fis); 
	    return pr;
  }
  
  public void windowHandles() 
	
  { 
  	Set<String> window =driver.getWindowHandles();
  	Iterator<String> it =window.iterator();
  	String landingPage = it.next();
  	String launchAppPage= it.next();	
  	driver.switchTo().window(launchAppPage);
  }

}
