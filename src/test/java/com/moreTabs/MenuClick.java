package com.moreTabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MenuClick {
	
	WebDriver driver;
	
@Test
public void menuClicks()
{
	driver = new ChromeDriver();
	
	driver.get("http://magnus2.jalatechnologies.com/UserPage.aspx");
	
	driver.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul/li[4]/a")).click();
	
	driver.findElement(By.xpath("//a[text()='Menu']")).click();
	
}
	

}
