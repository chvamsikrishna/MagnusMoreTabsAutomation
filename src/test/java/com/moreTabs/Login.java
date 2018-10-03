package com.moreTabs;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class Login extends SetUp{
	
	WebDriver driver;
	
	public Login(WebDriver driver)
	{
	this.driver = driver;
		
	}







@FindBy(xpath= "//*[@id=\"myNavbar\"]/ul[1]/li[2]/a")
 WebElement adminClicK;
	
@FindBy(xpath ="//*[@id=\"txtname\"]")
WebElement LoginUsername;

@FindBy(xpath = "//*[@id=\"txtpsw\"]")
WebElement LoginPass;

@FindBy(xpath = "//*[@id=\"btnlogin\"]")
WebElement Submit;





public MulitipleTabs admin (String uname, String pass) 
{
	adminClicK.click();
	LoginUsername.sendKeys(uname);
	LoginPass.sendKeys(pass);
    Submit.click();
	
	return new MulitipleTabs(driver);
}
}






