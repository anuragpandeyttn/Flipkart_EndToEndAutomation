package com.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ReusableFuncitons.SeleniumReusable;


public class MultipleSearch_Page extends Library {
	SeleniumReusable se;
	public  MultipleSearch_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//input[@name='q']")
	WebElement Searchfield;
	
	
	public void Entersearch(String SearchText)
	{
		se = new SeleniumReusable(driver);
		se.EnterValue(Searchfield, SearchText);
	}
	public void clicksearch()
	{
		Searchfield.sendKeys(Keys.ENTER);
	}

}