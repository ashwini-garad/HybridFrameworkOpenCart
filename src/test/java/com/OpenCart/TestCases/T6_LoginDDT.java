package com.OpenCart.TestCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.OpenCart.Base.BaseClass;
import com.OpenCart.Pages.P2_LoginPage;
import com.OpenCart.Pages.P4_MyAccountPage;
import com.OpenCart.Pages.P7_Mainpage;

public class T6_LoginDDT extends BaseClass {
	/*Data is valid  - login success - test pass  - logout
		login failed - test fail

Data is invalid - login success - test fail  - logout
		login failed - test pass
*/
	@Test(dataProvider="LoginData", dataProviderClass=DataProvider.class,groups="Datadriven")// getting data provider from different class
	public void verify_loginDDT(String email, String pwd, String exp) throws InterruptedException
	{
		
		
		try
		{
		//HomePage
		P7_Mainpage hp=new P7_Mainpage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		//Login
		P2_LoginPage lp=new P2_LoginPage(driver);
		lp.setEmail(email);
		lp.setPassword(pwd);
		lp.clickLogin();
			
		//MyAccount
		P4_MyAccountPage macc=new P4_MyAccountPage(driver);
		boolean targetPage=macc.isMyAccountPageExists();
		
		
		if(exp.equalsIgnoreCase("Valid"))
		{
			if(targetPage==true)
			{			
				macc.clickLogout();
				Assert.assertTrue(true);
				
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		if(exp.equalsIgnoreCase("Invalid"))
		{
			if(targetPage==true)
			{
				macc.clickLogout();
				Assert.assertTrue(false);
				
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
		
		}catch(Exception e)
		{
			Assert.fail();
		}
		Thread.sleep(3000);
		
		
	}
	
	
	
	
	
}
