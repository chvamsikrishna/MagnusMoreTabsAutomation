package com.sf.test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
  




public class PageObject1 {
	WebDriver d;
	
	PageObject1(WebDriver driver)
	{
		this.d=driver;
	}
	
   By username= By.xpath("//*[@id=\"txtUserName\"]");
   By password=By.id("txtPassword");
   By submitBtn=By.name("btnLogin");
   
   public void loginName(String uname,String pass)
   {
	   
	   d.findElement(username).sendKeys(uname);
	  

	   d.findElement(password).sendKeys(pass);
	   
 
	   d.findElement(submitBtn).click();
 
   }
}  
 
 
	


	
	


