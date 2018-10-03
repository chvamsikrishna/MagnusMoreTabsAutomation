package com.moreTabs;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutoCompleteTest extends SetUp{
	
	Login login;
	MulitipleTabs multi;
	Menu menu;
	AutoComplete acom;
	CollapsibleContent coll;
	
@BeforeTest
public void basic() throws IOException
{
	testBed();
	
}
@Test(priority=1, groups= {"smokeTest"})
public void loginPage()
{
	login = PageFactory.initElements(d, Login.class);
	multi=login.admin(prop.getProperty("username"),prop.getProperty("password"));
}

@Test(priority=2,  groups= {"smokeTest"})
public void MultiplePage() throws InterruptedException
{
	multi =PageFactory.initElements(d, MulitipleTabs.class);
     menu =multi.multipleCheck1();
}

@Test(priority=3,  groups= {"smokeTest"})
public void MenuPage() throws InterruptedException
{
	menu =PageFactory.initElements(d, Menu.class);
	acom=menu.menuDetails();
}

@Test(priority=4,  groups= {"smokeTest"})
public void autoCompletePage() throws InterruptedException
{
	acom = PageFactory.initElements(d, AutoComplete.class);
	coll=acom.page3();
}

}
