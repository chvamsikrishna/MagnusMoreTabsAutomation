package com.moreTabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class  MulitipleTabs extends SetUp
{
	WebDriver driver;
	
	public MulitipleTabs(WebDriver driver)
	{
      this.driver=driver;
      
	}
	
	

	@FindBy(xpath= "//*[@id=\"myNavbar\"]/ul/li[4]/a/span")
	WebElement MoreClick;
	
	@FindBy(xpath="//*[@id=\"left-navbar\"]/li[1]/a") 
	WebElement MultipleTab;
	
	@FindBy(xpath="//*[@id=\"more-tab\"]/div/ul/li[1]/a")
	WebElement One;
	
	@FindBy(xpath = "//*[@id=\"a\"]/form/center[1]/div/input")
	WebElement Text11;
	
	@FindBy(xpath = "//*[@id=\"a\"]/form/center[2]/div/input")
	WebElement Text12;
	
	
	@FindBy(xpath = "//*[@id=\"more-tab\"]/div/ul/li[2]/a")	
	WebElement Two;
	
	@FindBy(xpath = "//*[@id=\"b\"]/form/center[1]/div/input")
	WebElement Text21;
	
	@FindBy(xpath = "//*[@id=\"b\"]/form/center[2]/div/input")
	WebElement Text22;
	
	
	public  Menu multipleCheck1() throws InterruptedException
	{
		
		MoreClick.click();
		Thread.sleep(2000);
		MultipleTab.click();
		One.click();
		Text11.sendKeys(prop.getProperty("text11"));
		Text12.sendKeys(prop.getProperty("text12"));
		Two.click();
		Text21.sendKeys(prop.getProperty("text21"));
		Text22.sendKeys(prop.getProperty("text22"));
	   
	
		return new Menu(driver);
	}
		
	  
	 
}

	

