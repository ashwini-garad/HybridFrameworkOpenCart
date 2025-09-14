package com.OpenCart.Pages;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P1_AccountRegistrationPage 
{
	private WebDriver driver;
	
	public P1_AccountRegistrationPage(WebDriver driver)//driver from base class
	{
		this.driver=driver;
		//to initialize elements identified by @FindBy
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//input[@id='input-firstname']") 
	WebElement txtFirstname;

	@FindBy(xpath="//input[@id='input-lastname']") 
	WebElement txtLasttname;

	@FindBy(xpath="//input[@id='input-email']") 
	WebElement txtEmail;

	@FindBy(xpath="//input[@id='input-telephone']") 
	WebElement txtTelephone;

	@FindBy(xpath="//input[@id='input-password']") 
	WebElement txtPassword;

	@FindBy(xpath="//input[@id='input-confirm']") 
	WebElement txtConfirmPassword;

	@FindBy(xpath="//input[@name='agree']") 
	WebElement chkdPolicy;

	@FindBy(xpath="//input[@value='Continue']") 
	WebElement btnContinue;

	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;

	@FindBy(xpath="//input[@name='newsletter'][1]") WebElement newsletterYesButton;
	@FindBy (xpath="//a[text()='Subscribe / unsubscribe to newsletter']") WebElement subscibelink;
     @FindBy(xpath="//input[@value='Continue']") WebElement newssletterContinue;
     
     @FindBy(xpath="//div//i[@class='fa fa-check-circle']")WebElement sucessMsg;
     @FindBy(xpath="//div[@class='list-group']//a[text()='Newsletter']")WebElement newselter;
     
     @FindBy(xpath="//div[text()='E-Mail Address does not appear to be valid!']")WebElement emailValidation;
     @FindBy(xpath="//div[text()='Telephone must be between 3 and 32 characters!']")WebElement phonevalidation;
     @FindBy(xpath="//div[text()='Password confirmation does not match password!']")WebElement warningMessage;
     
     
	public void setFirstName(String fname) {
		txtFirstname.sendKeys(fname);
		//return fname;

	}

	public String setLastName(String lname) {
		txtLasttname.sendKeys(lname);
		return lname;

	}

	public void setEmail(String email) {
		txtEmail.sendKeys(email);

	}

	public void setTelephone(String tel) {
		txtTelephone.sendKeys(tel);

	}

	public String setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
		return pwd;

	}

	public void setConfirmPassword(String pwd) {
		txtConfirmPassword.sendKeys(pwd);

	}

	public void setPrivacyPolicy() {
		chkdPolicy.click();

	}

	public void clickContinue() {
		//sol1 
		btnContinue.click();
	}
	 
	public void verifynewsletterYesButton()

	{
		newsletterYesButton.click();
	}
	public void verifynewselter()
	{
		newselter.click();
	}
	public void verifysubcribeLink()
	{
		subscibelink.click();
		
	}
	public void verifynewseltterContinue()
	{
		newssletterContinue.click();
	}
	public void verifysuccessMsg()
	{
		sucessMsg.click();
	}
  public String validateemail()
  {
	  
	 
	 return  emailValidation.getText() ;
  }
  public String validatephoneno()
  {
	  return phonevalidation.getText();
  }


	 public String getPasswordMismatchError() 
	 {
		    return warningMessage.getText();
		}
 }

 	
	
	
