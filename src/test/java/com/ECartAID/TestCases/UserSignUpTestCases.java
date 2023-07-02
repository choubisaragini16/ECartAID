package com.ECartAID.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.ECartAID.TestPages.HomePage;
import com.ECartAID.TestBase.TestBase;

import com.ECartAID.TestPages.UserSignPage;



public class UserSignUpTestCases extends TestBase
{
	 HomePage hpage;
	 UserSignPage uspage;
	 
	 UserSignUpTestCases()
	 {
		 super();
	 }
	 
	 @BeforeMethod
	 public void init()
	 {
		 Initialization();
		 hpage=new HomePage();		 
	 }
	 	 
	 @AfterMethod(enabled = false)
	 public void teardown()
	 {                                                                               
		driver.quit();
	 }
	 
	 @Test
	 public void signup()
	 {
		 uspage=hpage.signuplink();
		 uspage.username1("dhruv");
		 uspage.emailaddress1("dhruv@test.in");
		 uspage.clickonsignupbutton();
		 uspage.clickonmrradiobutton();
		 uspage.password1("1612");
	     uspage.daydropdown("12");
	     uspage.monthdropdown("January");
	     uspage.yeardropdown("2021");
		 uspage.newslettercheckbox();
		 uspage.partnercheckbox();
		 uspage.fname("dhruv");
		 uspage.lname("choubisa");
		 uspage.company("ATCS");
		 uspage.address1("B-301 , Rainbow Grace");
		 uspage.address2("Infront of BJS college, Baakori phata , Wagholi");
		 uspage.country("India");
		 uspage.state("maharastra");
		 uspage.city("pune");
		 uspage.zipcode("41001");
		 uspage.mobilenumber("1234567890");
		 uspage.createaccount();
		 uspage.contbutton();
		 uspage.deleteaccountbutton();
	 }
	 @Test(enabled = false)
	 public void newusersignupvisiblity()
	 {
		uspage=hpage.signuplink();
		boolean status1 = uspage.newusersignupvisible();
		System.out.println(status1);
		Assert.assertEquals(status1, true);
	 }
	 
	@Test(enabled = false)
	public void enteraccountinfvisibilty()
	{
		uspage.clickonsignupbutton();
		boolean status3= uspage.enteraccountinfvisible();
		System.out.println(status3);
		//(boolean actual,boolean expected)
		Assert.assertEquals(status3, true);
	}
	
	public void accountcreatedvisibilty()
	{
		uspage.createaccount();
		boolean status5=uspage.accountcreatedvisible();
		System.out.println(status5);
		Assert.assertEquals(status5, true);
		
	}
	
	public void loggedinusernamevisibility()
	{
		uspage.contbutton();
		boolean status7= uspage.loggedinusernamevisible();
		System.out.println(status7);
		Assert.assertEquals(status7, true);
	}
	
	public void accountdeletedvisibilty()
	{
		uspage.deleteaccountbutton();
		boolean status9=uspage.accountdeletedvisible();
		System.out.println(status9);
		Assert.assertEquals(status9, true);
		uspage.contbutton();
		
	}
	
	public void automationexercisevisibility()
	{
		boolean status11=uspage.automationexercisevisible();
		System.out.println(status11);
		Assert.assertEquals(status11, true);
	}
}


  
