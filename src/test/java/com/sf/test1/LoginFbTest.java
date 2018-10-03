package com.sf.test1;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import helper.BaseTestClass;

public class LoginFbTest extends BaseTestClass

{
public LoginFbTest() throws IOException {
	
	PageFactory.initElements(w,this);
	
		
	}



@FindBy(how=How.ID,using="email")
WebElement mail;

@FindBy(how=How.XPATH,using="//*[@id=\"pass\"]")
WebElement pass;

@FindBy(id="loginbutton")
WebElement btn;



public void elementValues(String em, String pw)

{
	mail.sendKeys(em);
	pass.sendKeys(pw);
	
}
}










