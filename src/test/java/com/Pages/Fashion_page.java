package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ReusableFuncitons.SeleniumReusable;

public class Fashion_page extends Library{
	SeleniumReusable se;
	public Fashion_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="//span[text()=\"Fashion\"]")
	WebElement fashionlink;
	
	
	@FindBy(xpath="//a[text()=\"Kids\"]")
	WebElement KidsLink;
	
	@FindBy(xpath="//a[text()=\"Girls Dresses\"]")
	WebElement GirlsDressesLink;
	
	@FindBy(xpath="//div[text()=\"Price -- Low to High\"]")
	WebElement PriceLowToHighLink;
	
	@FindBy(xpath="//div[text()=\"Price -- High to Low\"]")
	WebElement PriceHighToLowlink;
	
	public void movefashionlink()
	{
	 se = new SeleniumReusable(driver);
		se.mousehover(fashionlink);
		
	}
	public void moveKidsLink()
	{
		se.mousehover(KidsLink);
	}
	public void clickgirlslink()
	{
		se.movelement(GirlsDressesLink);
	}
	public void clickprice()
	{
		se.click(PriceLowToHighLink);
	}
	public void clickPriceHighToLow()
	{
		se.click(PriceHighToLowlink);
	}
	
}
