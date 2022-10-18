package com.zohocrm.generic;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.zohocrm.pom.HomePage;
import com.zohocrm.pom.SignInPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	static
	{
		WebDriverManager.chromedriver().setup();
	}
	
	public static WebDriver driver;
	FileLib f=new FileLib();
	
	
	@BeforeTest
	public void openBrowser() throws IOException
	{
		
		driver=new ChromeDriver();
		driver.get(f.getPropertyData("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@BeforeMethod
	public void signIn() throws IOException
	{
		
		SignInPage s=new SignInPage(driver);
		s.getUntbx().sendKeys(f.getPropertyData("un"));
		s.getPwdtbx().sendKeys(f.getPropertyData("pwd"));
		s.getSginbtn().click();
	}
	
	@AfterMethod(enabled = true)
	public void logOut()
	{
		HomePage h=new HomePage(driver);
		h.getLgtlnk().click();
	}
	
	@AfterTest(enabled = true)
	public void closeBrowser()
	{
		driver.close();
	}

}
