package com.sf.test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageObjects2 {
	WebDriver w;
	
  public PageObjects2(WebDriver driver) {
	  
	  this.w=driver;
	
}
	
	// findBy always go with PageFactory---
	//one of two ways to use findby.
	@FindBy(xpath="//*[@id=\"txtname\"]")
	WebElement user;
	
	@FindBy(how=How.ID,using="txtpsw")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"btnlogin\"]")
	WebElement submitbtn;
	
	public void loginPage(String uname,String pass)
	{
		
		user.sendKeys(uname);
		password.sendKeys(pass);
		submitbtn.click();
	}
	

}
