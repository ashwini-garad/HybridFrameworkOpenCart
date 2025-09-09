package com.OpenCart.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.OpenCart.Base.BaseClass;
import com.OpenCart.Utilities.ExcelUtil;



public class T3_HomePageTest extends BaseClass {
	@BeforeClass
	public void pageSetup()
	{
		hp=lp.doLogin("garadash92@gmail.com","Abc@123");
		addWait();
		hp.clickHome();
		
		
	}
	
	
  @Test(priority=1)
  public void verifyProductCount()
  {
	  
	  int actCount=hp.getProductCount();
	  Assert.assertEquals(actCount,4);
	  System.out.println("Total Product count is matched: "+actCount);
  }
  
  @Test(priority=2)
  public void verifyProductDetails()
  {
	  hp.getProductDetails();
  }
  
  
  @Test(priority=3)
  public void validateAddToCart()
  {
	  hp.clickMacBook();
	  hp.addProductToCart("macBook");
  }
  
  
  @Test(priority=4)
  public void verifyCartPageLaunch() 
  {
	  hp.launchCartPage();
  }

}
