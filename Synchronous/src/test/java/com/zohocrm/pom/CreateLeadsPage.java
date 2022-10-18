package com.zohocrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

@Listeners(com.zohocrm.generic.ListenerImplementation.class)
public class CreateLeadsPage
{
	@FindBy(name = "property(First Name)")
	private WebElement fNametbx;
	
	@FindBy(name = "property(Last Name)")
	private WebElement lNametbx;
	
	@FindBy(name = "property(Company)")
	private WebElement companytbx;
	
	@FindBy(xpath = "//img[@title='Campaign Name Lookup']")
	private WebElement campSrc;
	
	@FindBy(xpath = "//input[@value='Save']")
	private WebElement savebtn;
	
	public CreateLeadsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getfNametbx() 
	{
		return fNametbx;
	}

	public void setfNametbx(String st) 
	{
		fNametbx.sendKeys(st);
	}

	public WebElement getlNametbx() {
		return lNametbx;
	}

	public void setlNametbx(String st) 
	{
		lNametbx.sendKeys(st);
	}

	public WebElement getCompanytbx()
	{
		return companytbx;
	}

	public void setCompanytbx(String st) 
	{
		companytbx.sendKeys(st);
	}

	public WebElement getCampSrc() 
	{
		return campSrc;
	}

	public void setCampSrc() 
	{
		campSrc.click();              
	}

	public WebElement getSavebtn() 
	{
		return savebtn;
	}

	public void setSavebtn() 
	{
		savebtn.click();
	}
	
	
	
	
	
	

}
