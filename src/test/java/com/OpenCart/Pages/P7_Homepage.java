package com.OpenCart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P7_Homepage {
	//constructor
	private WebDriver driver;
	public P7_Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
		
	}
	//locater
	@FindBy (xpath="//span[normalize-space()='My Account']") WebElement lnkMyaccount;
	@FindBy (xpath="//a[normalize-space()='Register']") WebElement lnkRegister;
	@FindBy (linkText="Login") WebElement lnkLogin;
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
		lnkLogin.click();
	}
	public void clickSearch()
	{
		btnSearch.click();
	}

}
