package com.TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"com/StepDefinations"},
                 plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},tags="@tc006")


public class runner{

	
	
	
	
	
	
}
