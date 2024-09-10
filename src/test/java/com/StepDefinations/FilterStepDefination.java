package com.StepDefinations;

import org.openqa.selenium.By;

import com.Baseclass.Library;
import com.Pages.Filter_page;
import com.ReusableFuncitons.SeleniumReusable;
import io.cucumber.java.en.Then;


public class FilterStepDefination extends Library{
	Filter_page fp;
	SeleniumReusable se;
	public static void main(String[] args) {
		

	}
	
	
	@Then("Select Minimum and Maximum Amount")
	public void select_Minimum_and_Maximum_Amount() throws InterruptedException {
		
		fp= new  Filter_page(driver); 
		 String BeforeFilter=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]")).getText();
		 System.out.println("Before Filter:"+BeforeFilter);
		 
		 fp.Min();
		 se = new SeleniumReusable(driver);
		 se.waits();
		 fp.Max();
		 se.waits();
	}

	@Then("Select the Brand")
	public void select_the_Brand() throws InterruptedException {
	    fp.Brand();
	    se.waits();
	}

	@Then("Select the Ram")
	public void select_the_Ram() throws InterruptedException {
	    fp.Ram();
	    se.waits();
	}

	@Then("Select the Battery Capacity")
	public void select_the_Battery_Capacity() {
	  fp.ClickBattery();
	}

	@Then("It should display the Relevant Result")
	public void it_should_display_the_Relevant_Result() throws InterruptedException {
		System.out.println("******************************************");
		 String AfterFilter=driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")).getText();
		 System.out.println("After Filter:"+AfterFilter);
		 se.waits();
		 driver.close();

	}

}
