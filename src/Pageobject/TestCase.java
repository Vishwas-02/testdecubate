package Pageobject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class TestCase  {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver;
		
		DriverInitation ob =new DriverInitation ();
	
		driver = ob.initializeDriver();
		// TODO Auto-generated method stub
		
	
		driver.get("https://www.toolsqa.com/selenium-webdriver/selenium-navigation-commands/");
		driver.navigate().to("https://decubate.com/");
		driver.navigate().back();

	}

}
