package com.ECartAID.TestCases;

import org.testng.annotations.Test;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import com.ECartAID.TestBase.TestBase;
import com.ECartAID.TestPages.HomePage;
import com.ECartAID.TestPages.LoginTestPage;

public class LoginPageTestCases extends TestBase
{
	
	HomePage hpage;
	LoginTestPage lpage;
	
	LoginPageTestCases()
	{
		super();	
	}
	
	@BeforeMethod
	public void init()
	{
		Initialization();
		hpage=new HomePage();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	
	@Test(priority = 1)
	public void login()
	{
		lpage=hpage.loginlink();
		lpage.username(prop.getProperty("Uname"));
		lpage.password(prop.getProperty("psw"));
		lpage.clickonloginbutton();
		
	}
}

