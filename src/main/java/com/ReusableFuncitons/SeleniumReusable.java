package com.ReusableFuncitons;

import java.io.File;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import com.Baseclass.Library;

public class SeleniumReusable extends Library {
	Actions act;
	public SeleniumReusable(WebDriver driver)
	{
		this.driver=driver;

	}

	//Enter the text of the element When the user search
	
	public void EnterValue(WebElement element,String Text)
	{
		try 
		{
			element.sendKeys(Text);
		}
		catch(Exception e)
		{
			System.out.println("No such element exception");
		}
		
	
	}
	//Click the Element 
	
	public void click(WebElement element)
	{
		try 
		{
			element.click();
		}
		
		catch (Exception e )
		{
			System.out.println("No such element exception");
		}
		
	}
	
//Get the title of the page	
	public void gettitle()
	{
		try
		{
			System.out.println(driver.getTitle());
		}
		catch (Exception e)
		{
			System.out.println("Could Not get the title");
		}
	}
	
	public void MultipleGettext(List<WebElement> element) {
		
		List<WebElement> text =element;
		System.out.println(text.size());
		for (WebElement textcount:text)
			
		{
			String Totallist = textcount.getText();
			System.out.println("************************************************************************");
			System.out.println(Totallist);
		}
	}
	public void GetValue(WebElement element )
	{
		String Text=element.getText();
		System.out.println(Text);
	}
	
	
	public void dropdown(WebElement element,String Text) {
		Select dropdown = new Select(element);
		dropdown.selectByValue(Text);
		
		
	}
	public void Scroldown(WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
		
	}
	
	
	
	public void waits() throws InterruptedException
	{
		Thread.sleep(2000);
	}
	
	public void mousehover(WebElement element)
	{
		act=new Actions(driver);
		act.moveToElement(element).build().perform();
	}
	
	public void movelement(WebElement element)
	{
		act.moveToElement(element).click().perform();	}
	
	
	
	
	

//Takes the screenshot of Test cases	
	public void screenshot(String path)
	{
		TakesScreenshot TS =((TakesScreenshot)driver);
		File source =TS.getScreenshotAs(OutputType.FILE);
		try 
		{
			FileUtils.copyFile(source, new File(path));
			
		}
		
		catch (Exception e)
		{
			System.out.println("Screenshot Not Found");
		}
		
	}
	
	
public void windowhandling(WebElement element) {
	    
	    String parrentwindow = driver.getWindowHandle();
	    element.click();
	    System.out.println(parrentwindow);
	    
	    Set<String>allwindow= driver.getWindowHandles();
	    System.out.println(allwindow.size());
	    
	    for (String Childwindow:allwindow) {
	        driver.switchTo().window(Childwindow);
	        System.out.println(Childwindow);
	    }
	}

	
	
	

}