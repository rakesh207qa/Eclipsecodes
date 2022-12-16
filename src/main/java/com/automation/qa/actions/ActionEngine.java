package com.automation.qa.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.automation.qa.base.BaseTest;

public class ActionEngine extends BaseTest{
	
	public void click(By locator, String locatorName) throws Throwable{
		try {
			driver.findElement(locator).click();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
		}
			  
		}
		
		public void type(By locator,String data, String locatorName) throws Throwable{
			try {
				driver.findElement(locator).sendKeys(data);
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				 
			}
				
			}
		//doing
   
		public void selectByVisibleText(By locator, String text,String locatorName) throws Throwable{
			try {
				WebElement we = driver.findElement(locator);
				Select select = new Select(we);
				select.selectByVisibleText(text);
			}catch(Exception e ) {
				e.printStackTrace();
			}
		}
}//testing
