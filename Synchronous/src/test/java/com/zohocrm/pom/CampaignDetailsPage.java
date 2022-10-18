package com.zohocrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

@Listeners(com.zohocrm.generic.ListenerImplementation.class)
public class CampaignDetailsPage 
{
	@FindBy(id = "mouseArea__Campaign Name")
	private WebElement actCampName;
	
	public CampaignDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getActCampName() 
	{
		return actCampName;
	}
	
	
	

}
