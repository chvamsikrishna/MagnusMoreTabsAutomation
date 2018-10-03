package com.moreTabs;

import java.io.IOException;


import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleTabsTest extends SetUp {
	
	
	Login login;
	MulitipleTabs mTabs;
    Menu menu;

	
	@BeforeTest
	public void setUp() throws IOException
	{
		testBed();
	    login = PageFactory.initElements(d, Login.class);
		mTabs = login.admin(prop.getProperty("username"),prop.getProperty("password"));
		
		
	}
	@Test
	public void multiple1() throws InterruptedException
	{
        
		mTabs = PageFactory.initElements(d, MulitipleTabs.class);
		menu =mTabs.multipleCheck1();
	
	}
	
	
}
