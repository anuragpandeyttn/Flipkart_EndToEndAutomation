package com.StepDefinations;
import java.io.IOException;

import org.openqa.selenium.WebElement;

import com.Baseclass.Library;
import com.Pages.SearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchMobile_Testcase extends Library {
	SearchPage sp;
	
	
	@Given("launch the Flipkart Application")
	public void launch_the_flipkart_application() throws IOException {
		launchapplication();
	}

	//@When("Close the popup")
	//public void close_the_popup() throws IOException {
		//sp.handlePopup();
	//	System.out.println(driver.getTitle());
	//}

	@Then("It should be Navigate to the home page")
	public void it_should_be_navigate_to_the_home_page() {
		 sp = new SearchPage(driver);
		 sp.HomeScreen();
		}	
	@Given("User enter the text in the search page")
	public void user_enter_the_text_in_the_search_page() {
		sp.Search("Mobile");
	
	}

	@When("Click the search button")
	public void click_the_search_button() {
		sp.Clicksearch();
	}

	@Then("It should navigate to the search result page and display the relevent details")
	public void it_should_navigate_to_the_search_resule_page_and_display_the_relevent_details() {
	sp.Result();
	}
	
	

	@Then("Extract the Results and print in console")
	public void extract_the_Results_and_print_in_console() {
	   sp.printEntireResult();
	}

	@Then("Print the Third result and keep it in the console")
	public void print_the_Third_result_and_keep_it_in_the_console() {
		sp.Print3rdResult();
		driver.close();
	}
	
}
	


