package com.zohocrm.testscript;

import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.zohocrm.generic.BaseClass;
import com.zohocrm.pom.CampaignNameLookupPage;
import com.zohocrm.pom.CreateLeadsPage;
import com.zohocrm.pom.DisplayingCustomerPage;
import com.zohocrm.pom.HomePage;

@Listeners(com.zohocrm.generic.ListenerImplementation.class)
public class LeadsModule extends BaseClass
{
	@Test
	public void createLead()
	{
		HomePage h=new HomePage(driver);
		h.setLeadsTab(h.getLeadsTab());
		
		DisplayingCustomerPage d=new DisplayingCustomerPage(driver);
		d.setNewLeadsbtn();
		
		CreateLeadsPage c=new CreateLeadsPage(driver);
		String fName="f"+Math.random();
		c.setfNametbx(fName);
		
		String lName="l"+Math.random();
		c.setlNametbx(lName);
		
		String cName="c"+Math.random();
		c.setCompanytbx(cName);
		
//		c.setCampSrc();
//		Set<String> awh = driver.getWindowHandles();
//		for(String st : awh)
//		{
//			driver.switchTo().window(st);
//			if(driver.getTitle().contains("Zoho CRM - Campaign Name Lookup"))
//			{
//				CampaignNameLookupPage c1=new CampaignNameLookupPage(driver);
//				c1.setCampaign();
//						
//			}
//		}
		
		c.setSavebtn();
		
		SoftAssert s=new SoftAssert();
		s.assertEquals(driver.getTitle().contains("Zoho CRM - Lead Details"), true);
		s.assertAll();
		
	}

}
