package com.sf.test1;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import helper.BaseTestClass;

public class LoginTest extends BaseTestClass{
	LoginFbTest fb;



	public LoginTest() throws IOException {
		super();
	
	}
	
	@BeforeMethod
	public void test() throws IOException
	{
		setUp();
		fb =new LoginFbTest();
		
		
	}
	
	@Test
	public void initialize()
	{
	  
		fb.elementValues(p.getProperty("e-mail"), p.getProperty("password"));
	   
		
	}
	
	
	
	
	@AfterMethod
	public void after()
	{
		w.close();
	}
	

}
