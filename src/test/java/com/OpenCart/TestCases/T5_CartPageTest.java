package com.OpenCart.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.OpenCart.Base.BaseClass;

public class T5_CartPageTest extends BaseClass{
	@BeforeClass
	public void pageSetup()
	{
	
	
		hp=lp.doLogin("garadash92@gmail.com","Abc@123");
		addWait();
		hp.clickHome();
		hp.clickMacBook();
	hp.addProductToCart("MacBook");
		addWait();
		
	cp=hp.launchCartPage();
		addWait();
		
	}
	@Test(priority=1)
	  public void varifyTotalProductsInCart() 
	  {
		  cp.getProductDetailsAddedToCart();
	  }
	@Test(priority=2)
	  public void validateRemoveProduct()
	  {
		  cp.removeProduct("MacBook");
	  }
	  
	  @Test(priority=3)
	  public void validateContinueShopping()
	  {
		
		  hp=cp.doContinueShopping();
		  hp.addProductToCart("MacBook");
		  cp.clickoncartTotal();
		  cp=hp.launchCartPage();
	  }
	  
	  @Test(priority=4)
	  public void validateContinueCheckOut()
	  {
		  cp.doContinueCheckout();
	  }

}
