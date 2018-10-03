package com.sf.test2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;






	public class Test2
	{
	
@Test(priority=1,enabled=true)
	
	public void urlName()
	{
        WebDriver d = new ChromeDriver();
	   d.get("http://magnus2.jalatechnologies.com/");
	    String s =d.getCurrentUrl();
	    System.out.println(s);
	    d.close();
	   	
	}
	
	
@Test(priority=2,enabled=true)
	public void text()
	{
		WebDriver f= new ChromeDriver();
		f.get("https://www.google.com/");
		f.manage().window().maximize();
		f.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement w=f.findElement(By.xpath("//*[@id=\"lst-ib\"]"));
		w.clear();
		w.sendKeys("vamsi");
		f.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    f.close();
	}
	

@Test (enabled=true)
	public void logo()
	{
		 WebDriver d = new ChromeDriver();
		 d.get("https://www.google.com/");
		boolean img= d.findElement(By.id("hplogo")).isDisplayed();
		d.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		System.out.println(img);
		d.close();
		
	}

@Test (priority=4,enabled=false)
	public void checkBox()
	{
        WebDriver d = new ChromeDriver();
	    d.get("http://magnus2.jalatechnologies.com/");
	  WebElement w= d.findElement(By.name("chkRememberMe"));
	    boolean b= w.isSelected();
	    System.out.println(b);
	     w.click();
	     
	     d.close();
	    
	}

@Test(priority=5,enabled=false)
	public void button()
	{
		 WebDriver d = new ChromeDriver();
		  d.get("http://magnus2.jalatechnologies.com/");
		  WebElement f=d.findElement(By.xpath("//*[@id=\"myNavbar\"]/ul[1]/li[2]/a"));
		  f.click();
	}
	
}
