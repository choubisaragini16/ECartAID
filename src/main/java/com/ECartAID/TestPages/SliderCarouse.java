package com.ECartAID.TestPages;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.ECartAID.TestBase.TestBase;

public class SliderCarouse extends TestBase
{
	

	public SliderCarouse()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//body/section[@id='slider']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/img[1]")
	WebElement slider;
	
	@FindBy(xpath = "//body/section[@id='slider']/div[1]/div[1]/div[1]/div[1]/a[2]/i[1]")
	WebElement nextbutton;
	
	@FindBy(xpath = "//body/section[@id='slider']/div[1]/div[1]/div[1]/div[1]/a[1]/i[1]")
	WebElement previousbutton;
	
	@FindBys(value = @FindBy(xpath = "//body/section[@id='slider']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/img[1]"))
	WebElement images;
	
	@FindBys(value = {@FindBy(xpath = "//img[@alt = 'demo website for practice']")} )
     private List<WebElement> SliderImages;
	
	/* @FindBy(xpath = "//*[@id=\"slider-carousel\"]/a[1]") 
	 WebElement CrouselPrev;
	 
	 @FindBy(xpath = "//*[@id=\"slider-carousel\"]/a[2]") 
	 WebElement CrouselNext;*/
	 
	 @FindBy(xpath = "//*[@id=\"slider-carousel\"]/div") 
	 WebElement Crousel;
	
	public boolean isSliderCarouselDisplayed()
	{
		boolean status1= slider.isDisplayed();
		return status1;
	}
	
	public void moveSliderCarouselNext()
	{
		// Code to move the slider carousel to the next slide
		nextbutton.click();
	}
	
	public void moveSliderCarouselPrevious()
	{
		// Code to move the slider carousel to the previous slide
		previousbutton.click();
	}

    
	 public void CrouselItem()
	 {
		int SilderImage = SliderImages.size();
		System.out.println("SilderImage=" +SilderImage);
		for(int i =0; i<SilderImage; i++)
		{  System.out.println( Crousel.getText());
 		     boolean Result= SliderImages.get(i).isDisplayed(); 
 		     if(Result == true)
 		     {
 		    	System.out.println(SliderImages.get(i).getAttribute("width")); 
 		     }
 		        System.out.println("******* Next Slide Content ************");
 		       nextbutton.click();
		}
			
	 }
	}
