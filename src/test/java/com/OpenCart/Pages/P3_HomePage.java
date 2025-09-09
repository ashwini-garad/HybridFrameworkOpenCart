package com.OpenCart.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;





public class P3_HomePage {

	private WebDriver driver;
	
	public P3_HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
	
	//locators
	@FindBy (xpath="//div[@class='product-thumb transition']") List<WebElement> products;
	@FindBy(xpath="//h4//a[text()='MacBook']") private WebElement clickmacBook;
	@FindBy (id="button-cart") private WebElement addToCartBtn;
	@FindBy(xpath="//span[@id='cart-total']")
	private WebElement cartOption;
	@FindBy(xpath="//a//i[@class='fa fa-home']") private WebElement home;
	
	
	
	//action
	
	public void clickHome()
	{
		home.click();
	}
	public void clickMacBook()
	{
		clickmacBook.click();
	}
	public int getProductCount()
	{
		return products.size();
	}
	public P3_HomePage getProductDetails()
	{
		System.out.println("**product details***");
		for(WebElement i:products)
		{
			System.out.println(i.getText());
		}
		return this;
	}
	public  P3_HomePage addProductToCart(String pname)
	{
		for(WebElement i:products)
		{
			if(i.getText().contains(pname))
			{
				
				//click on product
				i.click();//page will open
				System.out.println("Product found: "+pname);
				break;
			}
		}
		
		//click on addToCart button
		addToCartBtn.click();
		return this;  
		
		
	}
	public P5_CartPage launchCartPage()
	{
		cartOption.click();
		//navigate to cart page
		return new P5_CartPage (driver);
	}

}
