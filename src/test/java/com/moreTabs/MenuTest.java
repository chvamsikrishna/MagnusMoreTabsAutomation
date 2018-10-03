package com.moreTabs;

import java.io.IOException;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MenuTest extends SetUp{
	
	
	Login log;
	MulitipleTabs multi;
    Menu menu;
	AutoComplete acom;
	 
	  @BeforeTest
	public void basic() throws IOException
	{
		testBed();
		
	}
	@Test(priority=1)
	public void pageOne()
	{
		log = PageFactory.initElements(d, Login.class);
		multi = log.admin(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test(priority=2)
	public void pageTwo() throws InterruptedException
	{
		multi = PageFactory.initElements(d, MulitipleTabs.class);
	    menu=multi.multipleCheck1();
	}
	
	@Test(priority=3)
	public void pageThree() throws InterruptedException 
	{
		menu = PageFactory.initElements(d, Menu.class);
		acom =menu.menuDetails();
	
	}
	
}
