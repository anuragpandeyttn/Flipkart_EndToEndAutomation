package com.StepDefinations;

import com.Baseclass.Library;
import com.Pages.Fashion_page;
import com.ReusableFuncitons.SeleniumReusable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Fashion_StepDefination extends Library{
	
	Fashion_page fp;
	SeleniumReusable se;
	@Given("User to move the Fashion link")
	public void user_to_move_the_Fashion_link() {
		se = new SeleniumReusable(driver);
		
		System.out.println("Before clicking Fashion link");
		se.gettitle();
		fp= new Fashion_page(driver);
		fp.movefashionlink();
	   
	}

	@When("Curser to move to the Kids link")
	public void curser_to_move_to_the_Kids_link() {
		fp.moveKidsLink();
	   
	}

	@When("Move to girls dress and click")
	public void move_to_girls_dress_and_click() {
	    fp.clickgirlslink();
	}

	@When("Click the price low to High link")
	public void click_the_price_low_to_high_link() {
	   fp.clickprice();
	}
	
	@When("Click the price High to low link")
	public void click_the_price_High_to_low_link() {
	    fp.clickPriceHighToLow();
	}

	@Then("It should display the relevent details and get the title")
	public void it_should_display_the_relevent_details_and_get_the_title() throws InterruptedException {
	    System.out.println("After clicking fashionlink");
	    se.gettitle();
	    se.waits();
	    driver.close();
	}
	
	
	
	

}
