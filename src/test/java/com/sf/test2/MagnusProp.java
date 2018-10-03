package com.sf.test2;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagnusProp {

	static WebDriver w;
	
	public static void main(String[] args) throws IOException
	{
		Properties p = new Properties();
	    FileInputStream f = new FileInputStream("C:\\repo\\work\\src\\test\\java\\com"
	    		+ "\\sf\\test2\\config.properties");
	    p.load(f);
	      
	     String s =p.getProperty("browser");
	    if(s.equals("chrome"))
	    {
	    	w = new ChromeDriver();
	    	w.get(p.getProperty("url"));
	    }
	    else
	    {
	    	System.out.println("no browser exist");
	    }
	    
	    w.findElement(By.xpath(p.getProperty("user_xpath"))).sendKeys(p.getProperty("username"));
	    w.findElement(By.xpath(p.getProperty("password_xpath"))).sendKeys(p.getProperty("password"));
	    w.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	    w.close();
	    
	   
	    
	    
		
	}
	
	

}
