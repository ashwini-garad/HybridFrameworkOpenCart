package com.OpenCart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P7_Mainpage {
	//constructor
	private WebDriver driver;
	public P7_Mainpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
		
	}
	//locater
	@FindBy(xpath="//a[contains(.,'My Account') or contains(.,'My account') or contains(@title,'My Account')]") 
	WebElement lnkMyaccount;
	@FindBy(xpath="//a[normalize-space()='Register']") 
	WebElement lnkRegister;

	@FindBy(linkText = "Login")   // Login link added in step5
	WebElement linkLogin;
	@FindBy (xpath="//input[@placeholder='Search']") WebElement txtSearchbox;
	@FindBy (xpath="//div[@id='search']//button[@type='button']") WebElement btnSearch;
	
	public WebElement clickMyAccount()
	{
		lnkMyaccount.click();
		return lnkMyaccount;
	}
	
	public void clickRegister()
	{
		lnkRegister.click();
	}
	public void clickLogin()
	{
		linkLogin.click();
	}
	public void clickSearch()
	{
		btnSearch.click();
	}
}
	  
	   

	

	        // Open My Account drop-down
	       
