package com.zohocrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

@Listeners(com.zohocrm.generic.ListenerImplementation.class)
public class StartDatePage
{
	@FindBy(linkText = "«")
	private WebElement prevYearLookUp;
	                      
	@FindBy (linkText = "‹")
	private WebElement prevMonthLookUp;
	
	@FindBy(linkText = "»")
	private WebElement nextYearLookUp;
	
	@FindBy (linkText = "›")
	private WebElement nextMonthLookUp;
	
	@FindBy(xpath = "(//span[@class='calTitle'])[2]")
	private WebElement calTitle;
	
	@FindBy(linkText = "5")
	private WebElement five;
	
	@FindBy(linkText = "8")
	private WebElement eight;
	
	@FindBy(linkText = "25")
	private WebElement twentyFive;
	
	@FindBy(linkText = "15")
	private WebElement fifteen;
	
	
	public WebElement getPrevYearLookUp() {
		return prevYearLookUp;
	}

	public WebElement getPrevMonthLookUp() {
		return prevMonthLookUp;
	}

	public WebElement getNextYearLookUp() {
		return nextYearLookUp;
	}

	public WebElement getNextMonthLookUp() {
		return nextMonthLookUp;
	}

	public WebElement getCalTitle() {
		return calTitle;
	}

	public WebElement getFive() {
		return five;
	}

	public WebElement getEight() {
		return eight;
	}

	public WebElement getTwentyFive() {
		return twentyFive;
	}

	public WebElement getFifteen() {
		return fifteen;
	}

	public StartDatePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void setPrevYearLookUp(WebElement prevYearLookUp) 
	{
		prevYearLookUp.click();
	}

	public void setPrevMonthLookUp(WebElement prevMonthLookUp) 
	{
		prevMonthLookUp.click();
	}

	public void setNextYearLookUp(WebElement nextYearLookUp) 
	{
		nextYearLookUp.click();
	}

	public void setNextMonthLookUp(WebElement nextMonthLookUp) 
	{
		nextMonthLookUp.click();
	}

	
	

}
