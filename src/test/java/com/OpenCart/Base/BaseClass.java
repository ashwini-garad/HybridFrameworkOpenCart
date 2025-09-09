package com.OpenCart.Base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.OpenCart.Pages.P1_AccountRegistrationPage;
import com.OpenCart.Pages.P2_LoginPage;
import com.OpenCart.Pages.P3_HomePage;
import com.OpenCart.Pages.P5_CartPage;
import com.OpenCart.Pages.P7_Homepage;
import com.OpenCart.Utilities.PropertiesUtil;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseClass 
{
	//public variables + Annotations +Page class object
	public WebDriver driver;
	public P1_AccountRegistrationPage ar;
	public P2_LoginPage lp;
	public P3_HomePage hp;
	public P5_CartPage cp;
	public PropertiesUtil prop;
	public P7_Homepage hp1;
	
	
	

	@BeforeMethod
	@Parameters({"bname"})
	public void setUp()
	{
		prop=new PropertiesUtil("Config");
		
		//driver=BrowserProvider.setDriver(bname);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getData("url"));
		ar=new P1_AccountRegistrationPage(driver);
		lp=new P2_LoginPage(driver);
		hp=new P3_HomePage(driver);
		cp=new P5_CartPage(driver);
		prop=new PropertiesUtil("Config");
		hp1=new P7_Homepage(driver);
	}
		
	@AfterMethod
	public void waitForTest()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void addWait()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public String randomeString()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(5);
		return generatedstring;
	}
	
	public String randomeNumber()
	{
		String generatednumber=RandomStringUtils.randomNumeric(10);
		return generatednumber;
	}
	
	public String randomeAlphaNumberic()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(3);
		String generatednumber=RandomStringUtils.randomNumeric(3);
		return (generatedstring+"@"+generatednumber);
	}
	public void randomData()
	{
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
