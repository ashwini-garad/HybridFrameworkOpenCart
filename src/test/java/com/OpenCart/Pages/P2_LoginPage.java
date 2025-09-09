package com.OpenCart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class P2_LoginPage {
		private WebDriver driver;

	public P2_LoginPage(WebDriver driver)//driver from base class
	{
		this.driver=driver;
		//to initialize elements identified by @FindBy
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement 		usernameEle;

	@FindBy(xpath = "//input[@id='input-password']")
	WebElement passwordEle;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement loginBtn;


	public P2_LoginPage setEmail(String email) {
		usernameEle.sendKeys(email);
		return this;
	}

	public P2_LoginPage setPassword1(String pwd) {
		passwordEle.sendKeys(pwd);
		return this;
	}

	public void clickLogin() {
		loginBtn.click();
	}
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public P2_LoginPage  setUserName(String un)
	{
		
		usernameEle.sendKeys(un);
		return this;
	}
	
	
	public P2_LoginPage setPassword(String psw)
	{
		passwordEle.sendKeys(psw);
		return this;
	}
	
	public P3_HomePage ClickOnLoginButton()
	{
		loginBtn.click();
		//page navigates to next page then return next page object
		return new P3_HomePage(driver);
	}
	
public P3_HomePage doLogin(String un,String psw)
	{
		
		usernameEle.sendKeys(un);
		passwordEle.sendKeys(psw);
		loginBtn.click();
		return new P3_HomePage(driver);
	}

	

}
