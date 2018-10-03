package com.moreTabs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

public class AutoComplete extends SetUp
{
	WebDriver driver;
	 
     public AutoComplete(WebDriver driver) {
    	 this.driver=driver;
	 
   }
     @FindBy(xpath= "//*[@id=\"myNavbar\"]/ul/li[3]/a")
 	WebElement MoreClick;
     
	@FindBy(xpath="//*[@id=\"left-navbar\"]/li[3]/a")
	WebElement autoClick;
	
	@FindBy(xpath="//a[@href='#a']")
	WebElement  sValue;
	
	@FindBy(xpath="//input[@id='tags']")
	WebElement  sValueTag;
	
	@FindBy(xpath="//*[@id=\"more-tab\"]/div/ul/li[2]/a")
	WebElement  mValue;
	
	@FindBy(xpath="//*[@id=\"mtags\"]")
	WebElement  mValueTag;
	
	
	public CollapsibleContent page3() throws InterruptedException
	{
		MoreClick.click();
		
		autoClick.click();
	
		sValue.click();
		
		sValueTag.sendKeys("j");
	    
	   List<WebElement> options = sValueTag.findElements(By.xpath("//*[@class='ui-menu-item-wrapper']"));
	    
	   Thread.sleep(5000);
	    for(WebElement optionToSelect : options)
      
	    {
	         System.out.println("Object is "+optionToSelect.getText());
	         
	         String element = optionToSelect.getText();
	        		 
	    	if(element.equalsIgnoreCase("Java"))
	    	{
	    	    optionToSelect.click();
	    		break;
	    	}
	    	else
	    	{
	    		System.out.println("Element not found");
	    	}
	    }
	
		
		
		return new CollapsibleContent();
		
	}
	
	}
