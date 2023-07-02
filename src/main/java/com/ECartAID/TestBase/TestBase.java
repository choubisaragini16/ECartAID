package com.ECartAID.TestBase;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase 
{
 public static Properties prop;
 public static WebDriver driver;

 
 public TestBase()
 {
	 prop=new Properties();
	 
	 
	 try 
	 {
		FileInputStream fis =new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\com.ECartAID\\src\\main\\java\\com\\ECartAID\\Config\\config.properties");
		  prop.load(fis);
	 }
	 catch (FileNotFoundException e)
	 {
		e.printStackTrace();
	 }
	 catch(IOException e)
	 {
		System.out.println(e);
	 }	
	
 }
public void Initialization()
{
	String browsername=prop.getProperty("browser");
	
	if(browsername.equals("chrome"))
	{
		driver=new ChromeDriver();
	}
	else 
	{
		driver=new FirefoxDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(prop.getProperty("URL"));
	
	
}}