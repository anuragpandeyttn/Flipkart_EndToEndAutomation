package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ReusableFuncitons.SeleniumReusable;

public class Titleprice_page extends Library {

	SeleniumReusable se;
	
	public Titleprice_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="q")
	WebElement search;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement searchIcon;
	
	
	public void entersearch(String Text)
	{
		se=new SeleniumReusable(driver);
		se.EnterValue(search,Text);
		
	}
	
	public void ClickSearchIcon()
	{
		se.click(searchIcon);
	}
	
	
}
