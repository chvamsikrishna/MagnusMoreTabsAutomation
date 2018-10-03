package com.sf.test2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MagnusTestNgCases {
	WebDriver driver;
	Properties pro;
	FileInputStream fs;
	
@BeforeSuite
public void setUp() 
{    
	
	
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}



@BeforeTest
public void before()
{
	driver.get("http://magnus2.jalatechnologies.com/");
}
@Test
public void admin()
{
	WebElement adminClick = driver.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul[1]/li[2]/a"));
	adminClick.click();
}
@Test

public void loginDetails()
{
  WebElement user = driver.findElement(By.id("txtname"));
    user.sendKeys("admin");
  WebElement pass = driver.findElement(By.xpath("//*[@id=\"txtpsw\"]"));
    pass.sendKeys("admin");
    
    driver.findElement(By.xpath("//*[@id=\"btnlogin\"]")).click();
}
@Test
public void student()
{
	 WebElement studentLink = driver.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[1]/a"));
	    studentLink.click();
	
}
@Test
public void studentDetails() throws IOException
{
	pro = new Properties();

    fs = new FileInputStream("C:\\repo\\work\\src\\test\\java"
				+ "\\com\\sf\\test2\\config1.properties");

	pro.load(fs);
	
	driver.findElement(By.id("fname")).sendKeys(pro.getProperty("Firstname"));
	driver.findElement(By.id("lname")).sendKeys(pro.getProperty("Lastname"));
	driver.findElement(By.xpath("//*[@id=\"emailID\"]")).sendKeys(pro.getProperty("Email"));
	driver.findElement(By.xpath("//*[@id=\"mnum\"]")).sendKeys(pro.getProperty("Mobile"));
	driver.findElement(By.xpath("//*[@id=\"radiobtn_0\"]")).click();
	// drop-down
	WebElement dropDown= driver.findElement(By.xpath("//*[@id=\"ddlcountry\"]"));
	  Select s = new Select(dropDown);
	  s.selectByIndex(1);
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	  WebElement dropDown1= driver.findElement(By.xpath("//*[@id=\"ddlcity\"]"));
	  Select s1 = new Select(dropDown1);
	  s1.selectByValue("Hyderabad");
	  //clicking the box
	  WebElement box =  driver.findElement(By.xpath("//*[@id=\"CheckBoxList1_0\"]"));
	       box.click();
	   driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys("26091994");
	   
	   driver.findElement(By.xpath("//*[@id=\"btnsubmit\"]")).click();
	   
}
@AfterTest
public void WebDriver()
{
	driver.close();
}



}


