package helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestClass {
	
	public static WebDriver w;
	public static Properties p;
	
public BaseTestClass() throws IOException
{
    p = new Properties();
    FileInputStream f = null;
    
	try {
		f = new FileInputStream("C:\\repo\\work\\src\\main\\java\\helper\\config.properties");
	} catch (FileNotFoundException e)
	{
		e.printStackTrace();
	}
	p.load(f);
   
}

public void setUp()
{
	String title = p.getProperty("browser");
	if(title.equalsIgnoreCase("chrome"))
		{
		w = new ChromeDriver();
		}
	else
	{
		System.out.println("no browser found");
	}
	w.manage().window().maximize();
	w.manage().deleteAllCookies();
	w.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	w.get(p.getProperty("url"));
	
}
}
 

