package com.StepDefinations;

import com.Baseclass.Library;
import com.Pages.MultipleSearch_Page;
import com.ReusableFuncitons.SeleniumReusable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultipleSearch_StepDefinations extends Library{
 SeleniumReusable rs;
 MultipleSearch_Page ms;

@Given("Enter the {string} in the search field")
public void enter_the_in_the_search_field(String searchtext) {
	ms= new MultipleSearch_Page(driver);
	ms.Entersearch(searchtext);
}
   

@When("click the search button")
public void click_the_search_button() {
	ms.clicksearch();
    
}

@Then("It should navigate to the next page and display the corresponding page")
public void it_should_navigate_to_the_next_page_and_display_the_corresponding_page() throws InterruptedException {
	rs=new SeleniumReusable(driver);
	rs.gettitle();

	System.out.println("***********************************************");
	 rs.screenshot("src/test/resources/Screenshots/search.png");
	 driver.close()
;}
}
