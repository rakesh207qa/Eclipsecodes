package com.automation.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import com.automation.qa.actions.ActionEngine;
import com.automation.qa.pages.HomePage;
import com.automation.qa.pages.LoginPage;

public class InstaLogin extends ActionEngine {
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();

	@Test
	public void testinsta() throws Throwable {

		By username = By.name("username");
		By password = By.name("password");
		By loginButton = By.tagName("submit");

		type(username, "rakesh_masapathri", "username");
		type(password, "ramuluvijaya1998", "password");
		click(loginButton, "Loginbutton");
	}

}
/*
 * System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+
 * File.separator+"Drivers"+File.separator+"chromedriver.exe"); ChromeDriver
 * chromedriver = new ChromeDriver(); chromedriver.manage().window().maximize();
 * chromedriver.get("https://www.instagram.com/?hl=en");
 * System.out.println("in site");
 * chromedriver.findElement(By.name("username")).sendKeys("rakesh_masapathri");
 * System.out.println("enter username");
 * chromedriver.findElement(By.name("password")).sendKeys("ramuluvijaya1998");
 * System.out.println("enter password");
 * chromedriver.findElement(By.tagName("submit")).click();
 * System.out.println("end");
 */
