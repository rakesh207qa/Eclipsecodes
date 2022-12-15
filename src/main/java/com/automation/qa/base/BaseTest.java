package com.automation.qa.base;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
	
		public static WebDriver driver=null;

		@Parameters({"browser"})
		@BeforeMethod
		public void setup(ITestContext itc, String browser) {
			System.out.println("I'm in setup() method");
			System.out.println("Browser:: "+browser);
			if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+File.separator+"Drivers"+File.separator+"chromedriver.exe");
				driver = new ChromeDriver();
			} else if(browser.equals("ie")) {
				System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+File.separator+"Drivers"+File.separator+"IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get("https://demoqa.com/select-menu");
			//Thread.sleep(5000);
			
		}
		
		@AfterMethod
		public void tearDown() throws Throwable{
			driver.close();
			System.out.println("I'm in tearDown() method!!");
		}

	}



