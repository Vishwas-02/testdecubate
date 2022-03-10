package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class InitialPageFunc {
	
 WebDriver driver;
 
 By wbname=	By.xpath("(//img[@class='attachment-full size-full entered lazyloaded'])[1]");
 By about = By.xpath("(//a[@class='elementor-item elementor-item-anchor elementor-item-active'])[2]");
 By solution=By.xpath("(//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-3595'])[1]");
 By contact = By.xpath("(//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-3599'])[1]");
 By buyDCB= By.xpath("(//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-3809'])[1]");
 By LaunchApp= By.xpath("(//span [text()='Launch App'])[1]");

public InitialPageFunc(WebDriver driver2) 
{
	 
	this.driver=driver2;
}

public InitialPageFunc() {
	// TODO Auto-generated constructor stub
}

public void enablewbtitle() 
{
 if (driver.findElement(wbname).isDisplayed()) 
 {
	System.out.println("the image is printed");
 }
}
 
 public void aboutScrolling() 
 {
	 String text = driver.findElement(about).getText();
	 System.out.println(text);
	 driver.findElement(about).click();
	
 }
 
 public void solutionScrolling() 
 {   String sol =(driver.findElement(solution).getText());
	 System.out.println(driver.findElement(solution).getText());
	 driver.findElement(solution).click();
 }
 
 public void contactScrolling() 
 {   String sol =(driver.findElement(contact).getText());
	 System.out.println(driver.findElement(contact).getText());
	 driver.findElement(contact).click();
 }
 
 public void buyDCBclick() 
 {   String sol =(driver.findElement(buyDCB).getText());
	 System.out.println(driver.findElement(buyDCB).getText());
	 driver.findElement(buyDCB).click();
	 driver.navigate().back();
 }
 
 public void launchAppclick()
 {   String sol =(driver.findElement(LaunchApp).getText());
	 System.out.println(driver.findElement( LaunchApp).getText());
	 driver.findElement( LaunchApp).click();
 }
}
