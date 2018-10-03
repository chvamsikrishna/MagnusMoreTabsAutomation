package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserDetails {

	static WebDriver dri;
	
public  static WebDriver details(String browser,String url)

{
	if(browser.equalsIgnoreCase("chrome"))
	{
		dri= new ChromeDriver();
		
	}
	else if(browser.equalsIgnoreCase("firefox"))
	{
		dri = new FirefoxDriver();
		
	}
	
	
	dri.manage().window().maximize();
	dri.get(url);
	
	return dri;
	
	
	
}

}
