package com.sf.test2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class LoginTest {
	WebDriver w;

	
@BeforeMethod
public void before()
{

	w= new ChromeDriver();
	w.get("https://www.google.com/");
	w.manage().window().maximize();
	w.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	
}

@Test(priority=1)
public void Test()
{
  w.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys("testng");
 
}


@AfterMethod

public void after()
{
	w.close();
	
}
}