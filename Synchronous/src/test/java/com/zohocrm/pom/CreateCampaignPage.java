package com.zohocrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.zohocrm.generic.ListenerImplementation.class)
public class CreateCampaignPage
{
	@FindBy(xpath = "//option[@value='Email']")
	private static String email="Email";
	
	@FindBy(xpath = "//option[@value='Advertisement']")
	private static String advertisement="Advertisement";
	
	@FindBy(xpath = "//option[@value='Banner Ads']")
	private static String bannerAds="Banner Ads";
	
	@FindBy(xpath = "//option[@value='Telemarketing']")
	private static String teleMarketing="Telemarketing";
	
	
	
	
	@FindBy(name = "property(Campaign Name)")
	private WebElement campNametbx;
	
	@FindBy(xpath = "//img[contains(@onclick,'Start Date')]")
	private WebElement startDateClndr;
	
	@FindBy(name = "property(Type)")
	private WebElement  typeList;
	
	@FindBy(xpath = "//input[@type='submit' and @value='Save']")
	private WebElement savebtn;
	
	@FindBy(name = "Cancel")
	private WebElement cancelbtn;
	
	public CreateCampaignPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCampNametbx() 
	{
		return campNametbx;
	}

	public WebElement getStartDateClndr() 
	{
		return startDateClndr;
	}

	public WebElement gettypeList() 
	{
		return typeList;
	}

	public WebElement getSavebtn() 
	{
		return savebtn;
	}

	public WebElement getCancelbtn() 
	{
		return cancelbtn;
	}
	
	
	public static String getEmail() 
	{
		return email;
	}

	public static String getAdvertisement() 
	{
		return advertisement;
	}

	public static String getBannerAds() 
	{
		return bannerAds;
	}

	public static String getTeleMarketing() 
	{
		return teleMarketing;
	}

	public WebElement getTypeList() 
	{
		return typeList;
	}

	
	public void type(String st)
	{
	Select s=new Select(typeList);
	s.selectByVisibleText(st);
	}

	public void setSavebtn() 
	{
		savebtn.click();
	}
	
	
	
	
	
	

}
