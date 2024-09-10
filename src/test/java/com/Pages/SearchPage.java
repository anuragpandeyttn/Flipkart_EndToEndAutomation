package com.Pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ReusableFuncitons.SeleniumReusable;

public class SearchPage extends Library {
	SeleniumReusable se;

	
		public SearchPage(WebDriver driver)
		{ 
			this.driver=driver;
			
			PageFactory.initElements(driver, this);
		}
		
		// For the search box page
		 
		@FindBy(xpath="//input[@name='q']")
		WebElement Searchtext;
		
		public void Search(String Text) {
			se = new SeleniumReusable(driver);
			se.EnterValue(Searchtext, Text);
		}
		
		
		//For the HomePage land
		
		@FindBy(xpath="//html[@lang=\"en-IN\"]")
		WebElement HomePage;
		{
				se = new SeleniumReusable(driver);
				se.EnterValue(Searchtext, null);
		}
		
		
		@FindBy(xpath="//span[@role=\"button\"]")
		WebElement Popup;
		
		
		
		
		@FindBy(xpath= "//div[@class=\"col col-7-12\"]")
		
			List<WebElement> EntireResult;
		
		

		@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[4]/div/div/div/a/div[2]/div[1]/div[1]")
		
		WebElement ThirdResult;
		
		
		
		
		
		
//Filter
		
		
		
		public void Clicksearch()
		{
			Searchtext.sendKeys(Keys.ENTER);
		}
		
		public void HomeScreen()
		{
			System.out.println(HomePage.isDisplayed());
		}
		public void Search()
		{
			System.out.println( );
		}
		
		
		public void Result()
		{
			//System.out.println(SearchResult.isDisplayed());
			System.out.println(driver.getTitle());
		}
		

		
		public void printEntireResult()
		{
			se.MultipleGettext(EntireResult);
		}

		
		public void Print3rdResult()
		{
			
			se.GetValue(ThirdResult);		
			}
	
	/*
		public void handlePopup()
		{
			se.click(Popup);
		}*/

}

