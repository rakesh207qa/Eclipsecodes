package com.automation.qa.pages;

import org.openqa.selenium.By;

import com.automation.qa.actions.ActionEngine;

public class LoginPage {
	
	private By username = By.name("username");
	private By password = By.name("password");
	private By loginButton = By.tagName("submit");
	
	public void login() throws Throwable{
	
    type(username,"rakesh_masapathri","username");
    type(password,"ramuluvijaya1988","password");
    click(loginButton,"Loginbutton");
    Thread.sleep(10000);

}
}
