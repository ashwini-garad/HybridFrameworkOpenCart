package com.OpenCart.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
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
		  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		  String actTitle=lp.getAppTitle();
		  String expTitle="Account Login";
		  Assert.assertEquals(actTitle,expTitle,"Title not mathced!");
		  System.out.println("Title matched!");
	  }
	  
	  @Test(priority=3)
	  public void TC_LF_001_validateLoginFunctionality() 
	  {
		//  hp1.clickMyAccount();
		//  hp1.clickRegister();
		  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
      lp.setEmail("garadash92@gmail.com");
      lp.setPassword("Abc@123");
      lp.ClickOnLoginButton();
      System.out.println(driver.getCurrentUrl());
      Assert.assertTrue(lp.getAppUrl().contains("account"), "Login Fail!");
	  System.out.println("Login Completed!");
	  }
	  
	  @Test()
	  public void TC_LF_002_validateWithInvalidCred()
	  {
		  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
			lp.doLogin("ga@gmail.com","aaa");
	      String act_msg=lp.invalidemail();
	      String exp_msg="Warning: No match for E-Mail Address and/or Password.";
	      
	      Assert.assertEquals(act_msg,exp_msg,"email_id and password is not matching...!");
	      System.out.println("Email_id and passward matching ....");
	  }
	  @Test()
	  public void TC_LF_003_invalidEmailvalidPassward()
	  {
		  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		  lp.doLogin("ga@gmail.com","Abc@123");
	      String act_msg=lp.invalidemail();
	      String exp_msg="Warning: No match for E-Mail Address and/or Password.";
	      
	      Assert.assertEquals(act_msg,exp_msg,"Email_id and passward matching ...");
	      System.out.println("invalid email and valid passward enter by user") ;
	  }
	  
	  @Test()
	  public void TC_LF_004_validEmailinvalidpassward()
	  {
		  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		  lp.doLogin("garadash92@gmail.com","bc@13");
	      String act_msg=lp.invalidemail();
	      String exp_msg="Warning: No match for E-Mail Address and/or Password.";
	      
	      Assert.assertEquals(act_msg,exp_msg,"Email_id and passward matching ...");
	      System.out.println("valid email and invalidpasward enter by user") ;
	  }
	  @Test()
	  public void TC_LF_005_validateWithoutCredentials()
	  {
		  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		  lp.doLogin(" ","  ");
	      String act_msg=lp.invalidemail();
	      String exp_msg="Warning: No match for E-Mail Address and/or Password.";
	      
	      Assert.assertEquals(act_msg,exp_msg,"Email_id and passward matching ...");
	      System.out.println("provide email_id and passward") ;
	  }
	  
	  @Test()
	  public void TC_LF_006_ValidateForgottenPasswordLnk()
	  {
		  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		  lp.validateForgottenPasswodlnk();
		  String act_link=driver.getTitle();
		  String exp_link="Forgot Your Password?";
		  Assert.assertEquals(act_link,exp_link,"forgotten passward link working fine");
		  System.out.println("Link not working");
	  }
	  
	  
	  @Test()
	  public void TC_LF_007_ValidatewithKeyboardkeys() throws InterruptedException
	  {
		  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		  
		  lp.setEmail("garadash2@gmail.com");
		  WebElement active = driver.switchTo().activeElement();
		  active.sendKeys(Keys.TAB);
		 // driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		  lp.setPassword("Ash@123");
		  active.sendKeys(Keys.TAB);
		  lp.clickLogin();
		  
		  String act_msg=lp.invalidemail();
	      String exp_msg="Warning: No match for E-Mail Address and/or Password.";
	      
	      Assert.assertEquals(act_msg,exp_msg,"email_id and password is not matching...!");
	      System.out.println("Email_id and passward matching ....");
	  }
	  @Test()
	  public void TC_LF_008_ValidatePlaceholderText () throws InterruptedException
	  {
		  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

	        
		  
		String act_emailPlaceholder=  lp.validateemailFieldPlaceholder();
		String exp_emialPlaceholder="E-Mail Address";
		Assert.assertEquals(act_emailPlaceholder,exp_emialPlaceholder,"❌ Placeholder validation failed" );
		 System.out.println("✅ Placeholders are correct."); 

			String act_passwordFieldPlaceholder=  lp.validatepasswordFieldPlaceholder();
			String passwordFieldPlaceholder="Password";
			Assert.assertEquals(act_emailPlaceholder,exp_emialPlaceholder,"❌ Placeholder validation failed" );
			 System.out.println("✅ Placeholders are correct"); 
	  }
	  @Test(priority=3)
	  public void TC_LF_009_validateBrowserbackbutton () 
	  {
		//  hp1.clickMyAccount();
		//  hp1.clickRegister();
		  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
      lp.setEmail("garadash92@gmail.com");
      lp.setPassword("Abc@123");
      lp.ClickOnLoginButton();
      driver.navigate().back();
      Assert.assertTrue(lp.getAppUrl().contains("account/login"), "navigate back working ...");
	  System.out.println("navigate back working fine");
	  }
	  
	  
	  @Test()
	  public void TC_LF_013_validatePaaswordVisibility () 
	  {
		  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		String act_password=lp.validatePaaswordVisibility();
		String exp_password="password";

		  Assert.assertEquals(act_password,exp_password,"❌ Password field does NOT hide text. Found type=");
		  System.out.println("✅ Password field hides text (type='password')");
	  }
	  
	  
	  
}
