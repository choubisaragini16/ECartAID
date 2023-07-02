package com.ECartAID.TestPages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ECartAID.TestBase.TestBase;

public class HomePage extends TestBase
{
 public HomePage()
 {
        PageFactory.initElements(driver,this);
 }
 
 //Page Factory
 @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")
 WebElement login;
 
 @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]")
 WebElement cart;
 
 @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
 WebElement home;
 
 @FindBy(xpath = "//h2[contains(text(),'Category')]")
 WebElement category;
 
 @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")
 WebElement signup;
 
 public boolean categoryvisible()
 {
	 boolean status=category.isDisplayed();
	 return status;
 }
 
 public LoginTestPage loginlink()
 {
	 login.click();
	 return new LoginTestPage();
}
 
 public void cartlink() 
 {
	cart.click();
}
 
 public void homelink()
 {
	 home.click();
	
}
 public UserSignPage signuplink()
 {
	 signup.click();
	 return new UserSignPage();
 }
}
