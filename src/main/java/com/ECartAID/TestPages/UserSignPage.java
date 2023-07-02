package com.ECartAID.TestPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ECartAID.TestBase.TestBase;

public class UserSignPage extends TestBase
{
	public UserSignPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	//PageFactory
	@FindBy(xpath = "//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[2]")
	WebElement usernametextfield;
	
	@FindBy(xpath = "//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[3]")
	WebElement emailaddresstextfield;
	
	@FindBy(xpath = "//button[contains(text(),'Signup')]")
	WebElement signupbutton;
	
	@FindBy(xpath = "//h2[contains(text(),'New User Signup!')]")
	WebElement newusersignup;
	
	@FindBy(xpath = "//b[contains(text(),'Enter Account Information')]")
	WebElement enteraccountinf;
	
	@FindBy(xpath = "//input[@id='id_gender1']")
	WebElement mr;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement pswfield;
	
	@FindBy(xpath = "//select[@id='days']")
	WebElement daydd;
	
	@FindBy(xpath = "//select[@id='months']")
	WebElement monthdd;
	
	@FindBy(xpath = "//select[@id='years']")
	WebElement yeardd;
	
	@FindBy(xpath = "//input[@id='newsletter']")
	WebElement newsletter;
	
	@FindBy(xpath = "//input[@id='optin']")
	WebElement partner;
	
	@FindBy(xpath = "//input[@id='first_name']")
	WebElement fnametxtfield;
	
	@FindBy(xpath = "//input[@id='last_name']")
	WebElement lnametxtfield;
	
	@FindBy(xpath = "//input[@id='company']")
	WebElement cmpytxtfield;
	
	@FindBy(xpath = "//input[@id='address1']")
	WebElement add1txtfield;
	
	@FindBy(xpath = "//input[@id='address2']")
	WebElement add2txtfield;
	
	@FindBy(xpath = "//select[@id='country']")
	WebElement cntydropdown;
	
	@FindBy(xpath = "//input[@id='state']")
	WebElement stttxtfield;
	
	@FindBy(xpath = "//input[@id='city']")
	WebElement  cittxtfield;
	
	@FindBy(xpath = "//input[@id='zipcode']")
	WebElement zctxtfield;
	
	@FindBy(xpath = "//input[@id='mobile_number']")
	WebElement mntxtfield;
	
	@FindBy(xpath = "//button[contains(text(),'Create Account')]")
	WebElement caccountbutton;
	
	@FindBy(xpath = "//b[contains(text(),'Account Created!')]")
	WebElement acc;
	
	@FindBy(xpath = "//a[contains(text(),'Continue')]")
	WebElement continuebutton;
	
	@FindBy(xpath = "//b[contains(text(),'dhruv')]")
	WebElement loggedin;
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]")
	WebElement deletebutton;
	
	@FindBy(xpath = "//b[contains(text(),'Account Deleted!')]")
	WebElement accountdbutton;
	
	@FindBy(xpath = "//body/section[@id='slider']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]/span[1]")
	WebElement autoexe;
	
	public void username1(String uname1)
	{
		usernametextfield.sendKeys(uname1);
	}
	
	public void emailaddress1(String emailadd)
	{
		emailaddresstextfield.sendKeys(emailadd);
	}
	
	public void password1(String psw1)
	{
		pswfield.sendKeys(psw1);
	}
	
	public void clickonsignupbutton() 
	{
		signupbutton.submit();
	}
	
	public void clickonmrradiobutton()
	{
		mr.click();
	}
	
	public void daydropdown(String item)
	{
		Select s1=new Select(daydd);
		s1.selectByVisibleText(item);
	}
	
	public void monthdropdown(String item1)
	{
	 Select s2=new Select(monthdd);	
	 s2.selectByVisibleText(item1);
	}
	
	public void yeardropdown(String item3)
	{
		Select s3=new Select(yeardd);
		s3.selectByVisibleText(item3);
	} 
	
	public void newslettercheckbox()
	{
		newsletter.click();		
	}
	
	public void partnercheckbox()
	{
		partner.click();
	}
	
	public void fname(String fn)
	{
		fnametxtfield.sendKeys(fn);
	}
	
	public void lname(String ln)
	{
		lnametxtfield.sendKeys(ln);
	}
	
	public void company(String cmp)
	{
		cmpytxtfield.sendKeys(cmp);
	}
	
	public void address1(String add1)
	{
		add1txtfield.sendKeys(add1);
	}
	
	public void address2(String add2)
	{
		add2txtfield.sendKeys(add2);
	}
	
	public void country(String item4)
	{
		Select s4=new Select(cntydropdown);
		s4.selectByVisibleText(item4);				
	}
	
	public void state(String stt)
	{
		stttxtfield.sendKeys(stt);
	}
	
	public void city(String cit)
	{
		cittxtfield.sendKeys(cit);
	}
	
	public void zipcode(String zc)
	{
		zctxtfield.sendKeys(zc);
	}
	
	public void mobilenumber(String mn)
	{
		mntxtfield.sendKeys(mn);
	}
	
	public void createaccount()
	{
		caccountbutton.submit();
	}
	
	public void contbutton()
	{
		continuebutton.click();
	}
	
	public void deleteaccountbutton()
	{
		deletebutton.click();
	}
	
	public boolean newusersignupvisible()
	{
		boolean status =newusersignup.isDisplayed();
		return status;
		
	}
	
	public boolean enteraccountinfvisible()
	{
		boolean status2 = enteraccountinf.isDisplayed();
		return status2;
	}
	
	public boolean accountcreatedvisible()
	{
		boolean status4= acc.isDisplayed();
		return status4;
	}
	
	public boolean loggedinusernamevisible()
	{
		boolean status6= loggedin.isDisplayed();
		return status6;
	}
	
	public boolean accountdeletedvisible()
	{
		boolean status8= accountdbutton.isDisplayed();
		return status8;
	}
	
	public boolean automationexercisevisible()
	{
		boolean status10= autoexe.isDisplayed();
		return status10;
	}
}
