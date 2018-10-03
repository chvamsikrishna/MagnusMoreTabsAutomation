package com.moreTabs;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;



public class Menu  extends SetUp
{
	WebDriver driver;
	
	public Menu(WebDriver driver)
	
	{
		this.driver=driver;                                   
		
	}
	
	@FindBy(xpath= "//*[@id=\"myNavbar\"]/ul/li[3]/a")
	WebElement MoreClick;
	
	@FindBy(xpath="//*[@id=\"left-navbar\"]/li[2]/a")
	WebElement Menu;
	
	@FindBy(xpath="//a[text()='Single Menus']")
	WebElement SingleMenuClick;
	
	@FindBy(xpath= "//*[@id=\"b1\"]")
	WebElement TestingClick1;
	
	@FindBy(xpath="//*[@id=\"UpdatePanel1\"]/ul/li[2]/a")
	WebElement SubMenus;
	
    @FindBy(xpath="//*[@id=\"b\"]/ul/li[1]/a")
    WebElement TestingClick2;
    
    @FindBy(xpath = "//*[@id=\"dbbtn\"]")
    WebElement DbTesting;
    
    
     public AutoComplete menuDetails() throws InterruptedException 
{
     
    /** WebDriverWait wait = new WebDriverWait(d, 10);
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"left-navbar\"]/li[2]/a"))).click();
      
	 
	 **/
       
      MoreClick.click();
      
      Menu.click();
      
	  SingleMenuClick.click();
	  
	  Thread.sleep(3000);
	  TestingClick1.click();
	  
	  Thread.sleep(3000);
	  SubMenus.click();
	  
	  Actions a = new Actions(driver);
	  Thread.sleep(5000);
	  a.moveToElement(TestingClick2).perform();
	  a.moveToElement(DbTesting).click().perform();
	  
	  
      return new AutoComplete(driver);
	
}
}
