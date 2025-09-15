package com.OpenCart.TestCases;

import org.testng.annotations.Test;

import com.OpenCart.Base.BaseClass;

public class T8_Logout extends BaseClass{
	
	@Test()
	
	public void TC_LG_001_ValidateLogoutFromMyAccount()
	{
		hp1.clickMyAccount();
		hp1.clickLogin();
		lp.doLogin("garadash92@gmail.com", "Abc@123");
		hp1.clickMyAccount();
		lo.clickLogout();
	}
	

}
