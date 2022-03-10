package Pageobject;

import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import commoncode.CommonAsset;

public class LaunchAppfunc 
{
    WebDriver driver;
	By projects = By.xpath("//strong[text()='Projects']");
	By Staking = By.xpath("(//a[text()='Staking'])[1]");
	By Portfolio=By.xpath("(//a[text()='Portfolio'])[1]");
	By img = By.xpath("//img[@class='h-8 w-8']");	
	By connectWallet= By.xpath("//div[text()='Connect wallet']");
	By signin= By.xpath("//div[text()='Sign in']");
	By register = By.xpath("//div[text()='Register']");
	By email= By.xpath("//input[@name='email']");
	By password=By.xpath("//input[@name='password']");
	By clicksignin = By.xpath("//button[text()='Sign in']");
	By text = By.xpath("//div[@class='text-sm']");
	By signUPmail=  By.xpath("//input[@placeholder='Enter your email address']");
	By signupPassword=  By.xpath("//input[@placeholder='Enter your password']");
	By country = By.xpath("//div/select");
	By check = By.xpath("(//span[@class='checkmark rounded'])[2]");
	By next =  By.xpath("(//button[text()='Next'])");
	By confirmMessage =  By.xpath("//div[@class='text-sm']");
    By signout= By.xpath("//div[text()='Sign out']");	
    By walletName= By.xpath("//div[text()='MetaMask']");
	
	
	public LaunchAppfunc(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver= driver;
	}

  public void clickProject() 
	{
	    System.out.println(driver.findElement(projects).getText());
		driver.findElement(projects).click();
	}
	
  public void clickStaking() 
	{
	    System.out.println(driver.findElement(Staking).getText());
		driver.findElement(Staking).click();
	}
  
  public void clickProtfolio() 
	{
	    System.out.println(driver.findElement( Portfolio).getText());
		driver.findElement( Portfolio).click();
	}
  
  
  public void SigninTest(String login, String pass) 
  {
	  
	  driver.findElement(img).click();
	  driver.findElement(signin).click();
	
	  driver.findElement(email).sendKeys(login);
	  driver.findElement(password).sendKeys(pass);
	  driver.findElement(clicksignin).click();
}
  
  
  public void Signout()
  {
	  driver.findElement(img).click();
	  driver.findElement(signout).click();
  }
  public void clear() 
  {
	  driver.findElement(email).clear();
	  driver.findElement(password).clear();  
  }
  
  public void Wallet () 
  {
	  driver.findElement(img).click(); 
	  System.out.println(driver.findElement(connectWallet).getText());
	  driver.findElement(connectWallet).click(); 
	  driver.findElement(walletName).click();
  }
  
  public void clickSignUp () throws IOException 
  {
	  driver.findElement(img).click(); 
	  System.out.println(driver.findElement(register).getText());
	  driver.findElement(register).click(); 
      CommonAsset ca= new CommonAsset();
	  Properties prop= ca.setpropertyobject();
	  driver.findElement(signUPmail).sendKeys(prop.getProperty("signUp"));
	  driver.findElement(signupPassword).sendKeys(prop.getProperty("signuppassword"));
	  WebElement ele=driver.findElement(country);
	  ele.click();
	  Select ss= new Select(ele);
	  ss.selectByVisibleText("India");
	  driver.findElement(check).click();
	  driver.findElement(next).click();
	  driver.findElement(confirmMessage).getText();
	  
	}
  
  
}
