package com.zohocrm.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.zohocrm.generic.BaseClass;
import com.zohocrm.pom.CampaignDetailsPage;
import com.zohocrm.pom.CreateCampaignPage;
import com.zohocrm.pom.DisplayingCustomerPage;
import com.zohocrm.pom.HomePage;

@Listeners(com.zohocrm.generic.ListenerImplementation.class)
public class CampaignsModule extends BaseClass
{
	@Test
	public void createCampaign() throws EncryptedDocumentException, IOException, InterruptedException
	{
		HomePage h=new HomePage(driver);
		h.setCampaignsTab(h.getCampaignsTab());
		DisplayingCustomerPage d=new DisplayingCustomerPage(driver);
		d.setNewCampaignbtn();

		
		CreateCampaignPage c=new CreateCampaignPage(driver);
		
		String ExpectCampName=""+Math.random();
		c.getCampNametbx().sendKeys(ExpectCampName);
		c.type(c.getAdvertisement());
		
//		c.getStartDateClndr().click();
//		Set<String> awh = driver.getWindowHandles();
//		for(String st : awh)
//		{
//			driver.switchTo().window(st);
//			if(driver.getTitle().equals("Start Date"))
//			{
//				StartDatePage s=new StartDatePage(driver);
//				s.getFifteen().click();
//			}
//		}
		
		c.setSavebtn();
		
		CampaignDetailsPage c1=new CampaignDetailsPage(driver);
		
		SoftAssert s=new SoftAssert();
	//	Assert.fail();
		s.assertEquals(c1.getActCampName().getText(), ExpectCampName);
		s.assertAll();
		
		
		
		

		
		
		
		
		
		
		
	//	c.getStartDateClndr().click();

//		Set<String> awh = driver.getWindowHandles();
//		for(String st: awh)
//		{
//			driver.switchTo().window(st);
//
//
//			if(driver.getTitle().equals("Start Date"))
//			{
//				StartDatePage s=new StartDatePage(driver);
//				String calTitle = s.getCalTitle().getText();
//
//				String[] calTitleSplit = calTitle.split(" ");
//				List l=new ArrayList<>();
//				l.add(calTitleSplit);
//				String smonth = (String) l.get(0);
//				String syear = (String) l.get(1);
//
//				int month=Integer.parseInt(smonth);
//				int year=Integer.parseInt(syear);
//
//				if(s.getCalTitle().getText().contains(syear))
//				{
//
//					if(s.getCalTitle().getText().contains(smonth))
//					{
//						s.getFifteen().click();
//					}
//
//					else
//					{
//						FileLib f=new FileLib();
//						StartDatePage s1=new StartDatePage(driver);
//						for(int i=1; i<=11; i++ )
//						{
//							String temp = f.getExcelData("calendar", i, 1);
//							if(temp.contains(st))
//							s1.getNextMonthLookUp().click();
//						}
//					}
//
//				}
//				else if(year<2020)
//				{
//					StartDatePage s1=new StartDatePage(driver);
//					s1.getPrevYearLookUp().click();
//				}
//
//				else if(year>2020)
//				{
//					StartDatePage s1=new StartDatePage(driver);
//					s1.getNextYearLookUp().click();
//				}
//			}
//
//			else
//			{
//				StartDatePage s=new StartDatePage(driver);
//				String calTitle = s.getCalTitle().getText();
//
//
//				String[] calTitleSplit = calTitle.split(" ");
//				List l=new ArrayList<>();
//				l.add(calTitleSplit);
//				Object month = l.get(0);
//				Object year = l.get(1);
//
//				System.out.println(month);
//
//
//			}













		}

	}
