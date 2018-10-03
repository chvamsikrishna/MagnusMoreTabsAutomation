package com.sf.test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PageObject1a {

@Test

public void loginBrowser()
{
	WebDriver driver = new ChromeDriver();
	driver.get("http://magnus2.jalatechnologies.com");
	driver.manage().window().maximize();
	
	PageObject1 po = new PageObject1(driver);

	  po.loginName("vamsi","admin");
	
}
}