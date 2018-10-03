package com.moreTabs;

import java.io.IOException;


import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends SetUp{
	

	Login login;
	MulitipleTabs mTabs;


	
@BeforeMethod
public void loginIn() throws IOException 
{
   testBed();
   login = PageFactory.initElements(d, Login.class);
}

@Test
public void loginData() 
{

mTabs =login.admin(prop.getProperty("username"),prop.getProperty("password"));
}




}
