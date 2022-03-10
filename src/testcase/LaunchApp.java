package testcase;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pageobject.DriverInitation;
import Pageobject.InitialPageFunc;
import Pageobject.LaunchAppfunc;
import commoncode.CommonAsset;

public class LaunchApp extends DriverInitation
{
	CommonAsset ca;
	InitialPageFunc oj;
	LaunchAppfunc obj;

	@BeforeTest
	public void driverInitialise () throws IOException
	{
	 	driver= initializeDriver();
	}
	
@Test

public void testLaunch() throws IOException, InterruptedException //for checking display on title bar 
{
	 ca = new CommonAsset(driver);     //for handling windows and initialising propertirs file variable and opening decubate .
	 oj = new InitialPageFunc(driver);    //for clicking "launchApp" button of landing page 
	 obj =new LaunchAppfunc (driver);
	
	ca.callsites();
	Thread.sleep(5000);
	oj.launchAppclick();
	ca.windowHandles();
	obj.clickProject();
	obj.clickStaking();
	//obj.clickProtfolio();
}

@Test (dataProvider="sendLogin")
public void testLogin(String login , String pass ) throws InterruptedException  //for checking login function 
{   
	obj =new LaunchAppfunc (driver);
	obj.SigninTest(login, pass);
	Thread.sleep(3000);
}

@DataProvider

public Object[][] sendLogin () {
	 
	Object [][] lginp= new Object[2][2];
	lginp[0][0]="vishwas020293@gmail.com";
	lginp[0][1]= "vishwas02021993";
    lginp[1][0]= "shitut.vishwas@gmail.com";
	lginp[1][1]= "Vishwas@93";
	return lginp;
} 


@Test 

public void testSignOut() 
{
	obj =new LaunchAppfunc(driver);
	obj.Signout();
}


@Test

public void testSignUp() throws IOException 
{
	obj =new LaunchAppfunc(driver);
	obj.clickSignUp();
	
}

@Test

public void testWallet()

{
	obj =new LaunchAppfunc(driver);
	obj.Wallet();

}

	
}
