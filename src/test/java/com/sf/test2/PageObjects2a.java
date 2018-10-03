package com.sf.test2;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import helper.BrowserDetails;



public class PageObjects2a {
	
	
@Test
public void loginPageValues()
{
	
	WebDriver driver=BrowserDetails.details("chrome","http://magnus2.jalatechnologies.com/Admin.aspx");
	PageObjects2 login=PageFactory.initElements(driver, PageObjects2.class);
	login.loginPage("admin", "admin");
	
	
}
	
	

}
