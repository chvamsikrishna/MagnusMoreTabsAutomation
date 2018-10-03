package com.moreTabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Hover {
	
	WebDriver dr;
	
@Test
public void setUp() throws InterruptedException
{
	dr = new ChromeDriver();
	dr.get("http://magnus2.jalatechnologies.com/menu.aspx");
     
	WebElement menu= dr.findElement(By.xpath("//*[@id=\"left-navbar\"]/li[2]/a"));
	menu.click();
	
	WebElement subMenu=dr.findElement(By.xpath("//*[@id=\"UpdatePanel1\"]/ul/li[2]/a"));
	subMenu.click();
	
	WebElement dataClick=dr.findElement(By.xpath("//*[@id=\"b\"]/ul/li[4]/a"));
	WebElement oracleClick =dr.findElement(By.xpath("//a[text()='Oracle']"));
	
	Actions a = new Actions(dr);
	Thread.sleep(5000);
	a.moveToElement(dataClick).perform();
	a.moveToElement(oracleClick).click().perform();
}
	
	
	

}
