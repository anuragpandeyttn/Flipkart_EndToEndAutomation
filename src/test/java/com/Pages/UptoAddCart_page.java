package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

import com.Baseclass.Library;
import com.ReusableFuncitons.SeleniumReusable;

public class UptoAddCart_page extends Library {
	SeleniumReusable se;
	
	public UptoAddCart_page (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	
	
	}
	
	
	
	
	
	@FindBy(linkText="Login")
	WebElement loginLink;
	
	@FindBy(xpath= "//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[2]/div[2]/div/div/div/ul/a[3]")
	WebElement FlipkartPlusZone;
	
	
	
	@FindBy(xpath="//span[text()=\"Home & Furniture\"]")
	WebElement HomeAndFurnitureLink;
	
	
	@FindBy(linkText= "Wall Lamp")
	WebElement WallLampLink;
	
	@FindBy(xpath="//a[@title=\"GLINTAC Swing Arm Wall Light Wall Lamp With Bulb\"]")
	WebElement ClickonLamp;

	@FindBy(xpath="//input[@placeholder=\"Enter Delivery Pincode\"]")
	WebElement Pincode;
	
	@FindBy(xpath="//span[text()=\"Check\"]")
	WebElement Checklink;
	
	
	public void MoveLoginLink()
	{
		se= new SeleniumReusable(driver);
		se.mousehover(loginLink);
	}
	
	public void MoveFlipkartPlusZone()
	{
	se.movelement(FlipkartPlusZone);
				
	}
	
	public void MoveHomeFurniture()
	{
		se.mousehover(HomeAndFurnitureLink);
	}
	
	public void ClickWallLamp()
	{
		se.movelement(WallLampLink);
	}
	
	public void clickonResult()
	{
		se.Scroldown(ClickonLamp);
	}

	
	
	public void EnterPinCode()
	{
		se.windowhandling(ClickonLamp);
		Pincode.sendKeys("201301");
		
	}
	
	public void Clickcheckin()
	{
		se.click(Checklink);
	}

	
	
}



