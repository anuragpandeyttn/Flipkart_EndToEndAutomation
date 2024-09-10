package com.StepDefinations;

import com.Baseclass.Library;
import com.Pages.Fashion_page;
import com.Pages.HomeAndFurniture_Page;
import com.ReusableFuncitons.SeleniumReusable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeAndFurniture_StepDefinations extends Library{

	HomeAndFurniture_Page hp;
	SeleniumReusable se;
	

@Given("User to move the Home&Furniture")
public void user_to_move_the_Home_Furniture() {
	se =new SeleniumReusable(driver);
    System.out.println("Before Clicking Home & Decor Link");
    se.gettitle();
    
    hp=new HomeAndFurniture_Page(driver);
    hp.moveHomeAndFurniturelink();	
}

@When("Curser to move the Home Decor link")
public void curser_to_move_the_Home_Decor_link() {
   hp.mouseHoverHomeDecor();
}

@When("Move to Lighting and click")
public void move_to_Lighting_and_click() {
   hp.moveElementLightings();
}

@When("Click the price Hight to low")
public void click_the_price_Hight_to_low() {
	hp.clickHighTolowPrice();
    
}

@Then("It should display the relevant details and get the title")
public void it_should_display_the_relevant_details_and_get_the_title() throws InterruptedException {
	System.out.println("After Clicking Home and Furniture link");
	se.gettitle();
	 se.waits();
	 driver.close();
}

}