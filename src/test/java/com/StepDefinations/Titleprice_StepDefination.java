package com.StepDefinations;

import org.openqa.selenium.By;

import com.Baseclass.Library;
import com.Pages.Titleprice_page;
import com.ReusableFuncitons.SeleniumReusable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Titleprice_StepDefination extends Library{

	Titleprice_page tp;
	SeleniumReusable re;


@Given("Enter the search text in the search field")
	public void enter_the_search_text_in_the_search_field() 
		{tp=new Titleprice_page(driver);
			tp.entersearch("Shirts");
		}
	
	
@When("Click the search icon")
	public void click_the_search_icon() {
		tp.ClickSearchIcon();
	}

@Then("it should display the search result and get title")
	public void it_should_display_the_search_result_and_get_title() {
	re = new SeleniumReusable(driver);
	
	re.MultipleGettext(driver.findElements(By.xpath("//img[@class=\"_53J4C-\"]")));
	 re.screenshot("src/test/resources/Screenshots/uptoaddcart.png");
	  driver.close();
	
	
	}


}