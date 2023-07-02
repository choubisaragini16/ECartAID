package com.ECartAID.TestCases;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.ECartAID.TestBase.TestBase;

import com.ECartAID.TestPages.HomePage;

public class HomePageTestCases extends TestBase 
{
     HomePage hpage;
     HomePageTestCases()
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
     
     @Test(priority = 0)
    public void verifytitle()
    {
    	String title="Automation Exercise";
    	String actualtitle=driver.getTitle();
    	System.err.println(actualtitle);
    	Assert.assertEquals(title, actualtitle);
    }
     
     @Test(priority = 1)
     	 public void  verifycategoryvisiblity()
     	 {
    	 boolean status1 =hpage.categoryvisible();
    	 System.out.println(status1);
    	 Assert.assertEquals(status1, true);
     	 }
    	 
     
}
