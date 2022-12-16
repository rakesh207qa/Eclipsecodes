package com.automation.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automation.qa.actions.ActionEngine;

public class SelectTest extends ActionEngine{
	
	By select =By.id("oldSelectMenu");
	
	@Test
	public void selectFromDropDown() throws Throwable{
		selectByVisibleText(select,"Red","old Style Select Menu");
		Thread.sleep(20000);
	}
	}


