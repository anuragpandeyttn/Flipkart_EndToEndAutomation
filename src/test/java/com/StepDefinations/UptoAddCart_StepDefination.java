package com.StepDefinations;

import com.Baseclass.Library;
import com.Pages.UptoAddCart_page;
import com.ReusableFuncitons.SeleniumReusable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UptoAddCart_StepDefination extends Library {
	UptoAddCart_page up;
	SeleniumReusable re;

@Given("User can move to the login link")
public void user_can_move_to_the_login_link() {
	
	 up=new UptoAddCart_page(driver);
	 
	 up.MoveLoginLink();
	 re= new SeleniumReusable(driver);
	 System.out.println("ParentWindow Title");
	 re.gettitle();
	
   
    
}

@When("User can click on Flipkart Plus zone")
public void user_can_click_on_Flipkart_Plus_zone() {
	up.MoveFlipkartPlusZone();
  
}

@When("Mouse move to the Home&Furniture link")
public void mouse_move_to_the_Home_Furniture_link() {
	up.MoveHomeFurniture();
	//System.out.println)

}

@When("Going to click the wall lamp")
public void going_to_click_the_wall_lamp() {
up.ClickWallLamp();
}

@When("Scroll down the page and click one perticular result")
public void scroll_down_the_page_and_click_one_perticular_result() {
   up.clickonResult();
   
}





@When("Enter the delivery pin code and click the check link")
public void enter_the_delivery_pin_code_and_click_the_check_link() throws InterruptedException {
	re.waits();
	up.EnterPinCode();
	
	
	System.out.println("pincode check");
   
}



@Then("Pincode should be checked and displayed and verify the titles")
public void pincode_should_be_checked_and_displayed_and_verify_the_titles() {
  System.out.println("ChildWindow title");
  
  re = new SeleniumReusable (driver);
  re.gettitle();
  re.screenshot("src/test/resources/Screenshots/uptoaddcart.png");
  driver.close();
}





}