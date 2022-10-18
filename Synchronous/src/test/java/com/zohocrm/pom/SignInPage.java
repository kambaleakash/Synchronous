package com.zohocrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

@Listeners(com.zohocrm.generic.ListenerImplementation.class)
public class SignInPage 
{
	@FindBy(id="userName")
	private WebElement untbx;
	
	@FindBy(id="passWord")
	private WebElement pwdtbx;
	
	@FindBy(xpath = "//input[@alt]")
	private WebElement sginbtn;
	
	public SignInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getUntbx()
	{
		return untbx;
	}

	public WebElement getPwdtbx() 
	{
		return pwdtbx;
	}

	public WebElement getSginbtn() 
	{
		return sginbtn;
	}
	
	

}
