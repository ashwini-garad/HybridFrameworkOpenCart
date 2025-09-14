package com.OpenCart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P4_MyAccountPage {
	private WebDriver driver;
	public P4_MyAccountPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	

	@FindBy(xpath = "//h2[text()='My Account']") // MyAccount Page heading
	WebElement msgHeading;
	
	
	@FindBy(xpath = "//div[@class='list-group']//a[text()='Logout']")   //added in step6
	WebElement lnkLogout;
	
	
	public boolean isMyAccountPageExists()
	{
		try
		{
		return (msgHeading.isDisplayed());
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
	
	
	
	

	
}
