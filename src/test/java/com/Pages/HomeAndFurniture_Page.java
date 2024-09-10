package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ReusableFuncitons.SeleniumReusable;

public class HomeAndFurniture_Page  extends Library{

	SeleniumReusable se;	
	
public HomeAndFurniture_Page(WebDriver driver) {
	

	this.driver = driver;
	PageFactory.initElements(driver, this);
	
}
	//Path HomeFunrniture link

	@FindBy(xpath="//span[text() = \"Home & Furniture\"]")
	WebElement HomeFurniture;
	
	//Path cursor on home decor
	
	@FindBy(xpath="//a[text()=\"Home Decor\"]")
	WebElement HomeDecor;
	
	
	//Path lighting
	
	@FindBy(xpath="//a[text()=\"Lightings\"]")
	WebElement Lightings;
	
	
	//Path PriceHight to low
	@FindBy(xpath="//div[text()=\"Price -- High to Low\"]")
	WebElement PriceHighToLow;




	public void moveHomeAndFurniturelink()
	{
		se=new SeleniumReusable(driver);
		se.mousehover(HomeFurniture);
		
	}
	
	public void mouseHoverHomeDecor()
	{
		se.mousehover(HomeDecor);
	}
	
	public void moveElementLightings()
	{
		se.movelement(Lightings);
	}
	
	
	public void clickHighTolowPrice()
	{
		se.click(PriceHighToLow);
	}




		
	}


