package com.OpenCart.TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OpenCart.Base.BaseClass;

public class T1_AccountRegistrationPageTest extends BaseClass {


	@Test
	public void validateMandatoryField()
	{
		//P7_Homepage hp=new P7_Homepage(driver);
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.elementToBeClickable((WebElement) hp1.clickMyAccount()));
	//hp1.clickMyAccount();
	//	hp1.clickRegister();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		//P1_AccountRegistrationPage ar=new P1_AccountRegistrationPage(driver);
	//WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));
//	wait.until(ExpectedConditions.visibilityOf(ar.setFirstName(randomeString().toUpperCase())));
		
		ar.setFirstName(randomeString().toUpperCase());
		ar.setLastName(randomeString().toUpperCase());
		ar.setEmail(randomeString()+"@gmail.com");// randomly generated the email
		ar.setTelephone(randomeNumber());
String password=ar.setPassword(randomeAlphaNumberic());		
	
		
		

	ar.setConfirmPassword(password);
		
		ar.setPrivacyPolicy();
		ar.clickContinue();
		
		
		 String act_url=driver.getCurrentUrl();
		 String exp_url="account/success";
		 
		 Assert.assertTrue(act_url.contains(exp_url),"account not created");
		 System.out.println("Account Created successfully.....!");
	}
	
		
		


		

	


	/*	@Test
		public void validateMandatoryField() throws InterruptedException
		{
			//hp1.clickMyAccount();
			//hp1.clickRegister();
			driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
			ar.setFirstName("ashwini12");
			ar.setLastName("patil");
			ar.setEmail("ashwini973@gmail.com");
			ar.setTelephone("12345678");
			ar.setPassword("abc@123");
			ar.setConfirmPassword("abc@123");
			ar.setPrivacyPolicy();
			ar.clickContinue();
			Thread.sleep(2000);
			
			
		}*/
		@Test
		public void validateNewsletterYesButton() throws InterruptedException
		{
			driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		//validateMandatoryField();
			ar.setFirstName(randomeString().toUpperCase());
			ar.setLastName(randomeString().toUpperCase());
			ar.setEmail(randomeString()+"@gmail.com");// randomly generated the email
			ar.setTelephone(randomeNumber());
	String password=ar.setPassword(randomeAlphaNumberic());		
		
			
			

		ar.setConfirmPassword(password);
		ar.verifynewsletterYesButton();
			ar.setPrivacyPolicy();
			ar.clickContinue();
			
			
			ar.verifynewselter();
			//ar.verifysubcribeLink();
			ar.verifynewseltterContinue();
			 String act_msg="Success: Your newsletter subscription has been successfully updated!";
			 String exp_msg="Success: Your newsletter subscription has been successfully updated!";
			 Assert.assertTrue(act_msg.contains(exp_msg), "subcribtion failed");
			 System.out.println("subcribtion success...!");
			
			
		}
		@Test
		public void validateNewsletterNoButton() throws InterruptedException
		{
		
			driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
			ar.setFirstName(randomeString().toUpperCase());
			ar.setLastName(randomeString().toUpperCase());
			ar.setEmail(randomeString()+"@gmail.com");// randomly generated the email
			ar.setTelephone(randomeNumber());
	String password=ar.setPassword(randomeAlphaNumberic());		
		
			
			

		ar.setConfirmPassword(password);
			
			ar.setPrivacyPolicy();
			ar.clickContinue();
			
			
			 String act_url=driver.getCurrentUrl();
			 String exp_url="account/success";
			 
			 Assert.assertTrue(act_url.contains(exp_url),"account not created");
			 System.out.println("Account Created successfully.....!");
		}
		
		
		
		@Test
		
		public void navigatediffwayOfRegister()
		{
			driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
			
		String	Act_url=driver.getCurrentUrl();
		String exp_url="account/register";
		Assert.assertTrue(Act_url.contains(exp_url),"register page failed....");
		System.out.println("clicking on register page is successful....");
			
		}
		@Test
		public void validateWithInvalidEmail()
		{
			driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		//ar.setEmail();
       ar.clickContinue();
      String act_email=ar.validateemail();
         String exp_email="E-Mail Address does not appear to be valid!";
         Assert.assertEquals(act_email,exp_email, "Invalid email id enter");
         System.out.println("validate email test case passed...!");
		}
		
		@Test
		public void validateWithInvalidphone()
		{
			driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		//ar.setEmail();
       ar.clickContinue();
      String act_phone=ar.validatephoneno();
         String exp_phone="Telephone must be between 3 and 32 characters!";
         Assert.assertEquals(act_phone,exp_phone, "Invalid email id enter");
         System.out.println("validate phone number test case passed...!");
		}
		
	 
@Test

public  void validatebothpassword()
{
	driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
	ar.setPassword("ashu");
	ar.setConfirmPassword("ghf");
	ar.clickContinue();
	
	   
	

	    String errorMsg = ar.getPasswordMismatchError();

	    Assert.assertTrue(errorMsg.contains("Password confirmation does not match")
	                      || errorMsg.contains("Password confirmation does not match password"),
	                      "Mismatch error not displayed correctly.");
	    Assert.assertFalse(driver.getCurrentUrl().contains("success"), 
	                      "User should not be registered with mismatched passwords.");
	    System.out.println("passward and confirme passward are same");
	}
	
	

}
	

