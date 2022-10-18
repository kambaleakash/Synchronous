package com.zohocrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

@Listeners(com.zohocrm.generic.ListenerImplementation.class)
public class CampaignNameLookupPage
{
	@FindBy(xpath = "//td[@class='tableData']")
	private WebElement campaign;
	
	public CampaignNameLookupPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void setCampaign() 
	{
		campaign.click();
	}
	
	

}
