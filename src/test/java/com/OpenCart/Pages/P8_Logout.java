package com.OpenCart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P8_Logout {
	private WebDriver driver;
public	P8_Logout (WebDriver driver)
	{
		 this.driver=driver;
		 PageFactory.initElements( driver,this);
	}


@FindBy (xpath="//li//a[text()='Logout']")WebElement Logoutlnk;
@FindBy (xpath="//div[@class='list-group']//a[text()='Logout']")WebElement Logoutlist;

public void clickLogout()
{
	Logoutlnk.click();
}
public void clickLogoutList()
{
	Logoutlist.click();
}

}
