package com.moreTabs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SetUp {
	public static WebDriver d;
	public static Properties prop;
	


	
public void testBed() throws IOException
{
	
	
	prop =new Properties();
	FileInputStream fs = new FileInputStream("C:\\repo\\work\\src\\test\\java\\com\\moreTabs\\config.properties");
	prop.load(fs);
	
	String Bname = prop.getProperty("browser");
    if(Bname.equals("chrome"))
    {
    	d= new ChromeDriver(); 
    	
    	
    }
    else
    {
    	System.out.println("no browser found");
    }
    
    d.manage().deleteAllCookies();
   // d.manage().window().maximize();
    d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    d.get(prop.getProperty("url"));
}
}
   
    
