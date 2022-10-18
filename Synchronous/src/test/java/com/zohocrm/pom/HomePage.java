package com.zohocrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

@Listeners(com.zohocrm.generic.ListenerImplementation.class)
public class HomePage 
{
	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	private WebElement lgtlnk;
	
	@FindBy(linkText = "Campaigns")
	private WebElement campaignsTab;
	
	@FindBy(linkText = "Leads")
	public WebElement leadsTab;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getLgtlnk() 
	{
		return lgtlnk;
	}
	
	public WebElement getCampaignsTab() 
	{
		return campaignsTab;
	}
	
	public WebElement getLeadsTab()
	{
		return leadsTab;
	}

	public void setLeadsTab(WebElement leadsTab) 
	{
		leadsTab.click();
	}

	public void setLgtlnk(WebElement lgtlnk) 
	{
		this.lgtlnk = lgtlnk;
	}
	
	

	public void setCampaignsTab(WebElement campaignsTab) 
	{
		campaignsTab.click();
	}

	
	
	

}
