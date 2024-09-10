package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ReusableFuncitons.SeleniumReusable;

public class Filter_page extends Library {
	SeleniumReusable se;
	Filter_page fp;
public Filter_page(WebDriver driver)
{ 
	//System.out.println("Filter");	
	this.driver =driver;
	PageFactory.initElements(driver, this);
	
	
	 

}


	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[2]/div[4]/div[1]/select")
	WebElement MinimumAmount;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[2]/div[4]/div[3]/select")
	WebElement MaximumAmount;
	
	
	@FindBy(xpath="//div[text()='SAMSUNG']/preceding-sibling::div")
	WebElement BrandName;
		
	
	@FindBy(xpath="//div[text()='4 GB']/preceding-sibling::div")
	WebElement Ram;
	
	@FindBy(xpath="//div[text()=\"Battery Capacity\"]/..")
	WebElement BatteryArrow;
	
	@FindBy(xpath="//div[text()=\"4000 - 4999 mAh\"]/preceding-sibling::div")
	WebElement BatteryCapacity;
	
	public void Min()
	{
		 se = new SeleniumReusable(driver);
		 se.dropdown(MinimumAmount, "10000");
	}
	
	public void Max()
	{		
		se.dropdown(MaximumAmount, "20000");
	
	}
	
	public void Brand()
	{
		se.click(BrandName);
	}
	public void Ram()
	{
		se.Scroldown(Ram);
		se.click(Ram);
	}
	public void ClickBattery()
	{	se.Scroldown(BatteryArrow);
		se.click(BatteryArrow);
		se.click(BatteryCapacity);
	}
 
	
}
