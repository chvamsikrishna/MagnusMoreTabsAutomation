package com.sf.test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class MagnusXml {
	WebDriver w;
	@Test
	@Parameters({"url","username","password"})
	public void tetsXml(String url,String username,String password)
	{
		w=new ChromeDriver();
		w.get(url);
		
		w.findElement(By.xpath("//*[@id=\"txtUserName\"]")).sendKeys(username);
		w.findElement(By.id("txtPassword")).sendKeys(password);
		w.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
	}
}
	
	
