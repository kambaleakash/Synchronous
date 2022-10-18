package com.zohocrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

@Listeners(com.zohocrm.generic.ListenerImplementation.class)
public class DisplayingCustomerPage 
{
	@FindBy(xpath = "//input[@value='New Campaign']")
	private WebElement newCampaignbtn;
	
	@FindBy(xpath = "//input[@value='New Lead']")
	private WebElement newLeadsbtn;
	
	public DisplayingCustomerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void setNewCampaignbtn() 
	{
		newCampaignbtn.click();
	}

	public void setNewLeadsbtn() 
	{
		newLeadsbtn.click();
	}
	
	
	
	

}
