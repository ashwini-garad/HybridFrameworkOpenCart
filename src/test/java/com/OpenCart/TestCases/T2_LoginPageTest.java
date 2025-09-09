package com.OpenCart.TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.OpenCart.Base.BaseClass;

public class T2_LoginPageTest extends BaseClass {
	
	 @Test(priority=1)
	  public void varifyUrl() 
	  {
		 String actUrl=lp.getAppUrl();
		  String expUrl="tutorialsninja.com";
		  Assert.assertTrue(actUrl.contains(expUrl),"Url not matched!");
		  System.out.println("Url Matched!");
	  }
	  
	  @Test(priority=2)
	  public void varifyTitle() 
	  {
		  String actTitle=lp.getAppTitle();
		  String expTitle="Account Login";
		  Assert.assertEquals(actTitle,expTitle,"Title not mathced!");
		  System.out.println("Title matched!");
	  }
	  
	  @Test(priority=3)
	  public void validateLoginFunctionality() 
	  {

      lp.setEmail("garadash92@gmail.com");
      lp.setPassword("Abc@123");
      lp.ClickOnLoginButton();
      System.out.println(driver.getCurrentUrl());
      Assert.assertTrue(lp.getAppUrl().contains("account"), "Login Fail!");
	  System.out.println("Login Completed!");
	  }
}
