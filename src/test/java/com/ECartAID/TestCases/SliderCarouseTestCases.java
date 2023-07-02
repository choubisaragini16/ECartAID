package com.ECartAID.TestCases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ECartAID.TestBase.TestBase;
import com.ECartAID.TestPages.SliderCarouse;

public class SliderCarouseTestCases extends TestBase
{
	SliderCarouse sc;
	
	SliderCarouseTestCases()
	{
		super();
	}
	
	@BeforeMethod
	public void init()
	{
		Initialization();
		sc=new SliderCarouse();
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	@Test(priority = 0)
	public void testSliderCarouselDisplayed()
	{
		boolean status=sc.isSliderCarouselDisplayed();
		System.out.println(status);
		Assert.assertTrue(status, "Slider carousel is not displayed");
	}
	
	@Test(priority = 4)
	public void testMoveSliderCarouselNext()
	{
		  // Code to test moving the slider carousel to the next slide
        // Ensure to add appropriate assertions to validate the result
		sc.moveSliderCarouselNext();
	}
	
	@Test(priority = 5)
	public void testMoveSliderCarouselPrevious()
	{
	
	 // Code to test moving the slider carousel to the previous slide
    // Ensure to add appropriate assertions to validate the result
		sc.moveSliderCarouselPrevious();
	}
	

    @Test(priority = 1)
    public void testMoveSliderCarouselNextMultipleTimes() {
        int numSlides = 3; // Number of slides to iterate
        for (int i = 0; i < numSlides; i++) 
        {
            sc.moveSliderCarouselNext();
            
        }
       
    }
     @Test(priority = 2)
    public void testMoveSliderCarouselPreviousMultipleTimes() {
        int numSlides = 3; // Number of slides to iterate
        for (int i = 0; i < numSlides; i++) {
            sc.moveSliderCarouselPrevious();
        }
        
    }
    
    @Test(priority = 3)
	 public void VerifyCrousel()
	  {
		 sc.CrouselItem();
		 
		 
	  }
}
