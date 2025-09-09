package com.OpenCart.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class P5_CartPage {

	private WebDriver driver;
	
	public P5_CartPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	@FindBy (xpath="//span[@id='cart-total']") private WebElement cartTotal;
	@FindBy (xpath="//strong[text()='View Cart']") WebElement viewCart;
	@FindBy(xpath="//table[@class='table table-bordered'][1]") List <WebElement> shippingCart;
	@FindBy(xpath="//i[@class='fa fa-times-circle']")private List <WebElement> removeBtn;
	
	@FindBy(xpath="//a[text()='Continue Shopping']")WebElement continueShoppingBtn;
	
	@FindBy(xpath="//span[text()='Checkout']") WebElement checkoutBtn;
	public void clickoncartTotal()
	{
		cartTotal.click();
		viewCart.click();
	}
	public P5_CartPage getProductDetailsAddedToCart()
	{
		int count=shippingCart.size();
		
		System.out.println("Total Products added inti Cart: "+count);
		for(WebElement i:shippingCart)
		{
			System.out.println(i.getText());
		}
		
		return this;
		
	}
	
	public P5_CartPage removeProduct(String name)
	{
		
		for(WebElement i:shippingCart)
		{
		
			int n=1;
			for(WebElement i1:shippingCart)
			{
			n++;
			if(i1.getText().contains(name))
			{
				removeBtn.get(n).click();
			}
			
		}}
		return this;
	}
	
	public P3_HomePage doContinueShopping()
	{
		continueShoppingBtn.click();
		return new P3_HomePage(driver);
	}
	
	public P5_CartPage doContinueCheckout()
	{
		checkoutBtn.click();
		return new P5_CartPage(driver);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
