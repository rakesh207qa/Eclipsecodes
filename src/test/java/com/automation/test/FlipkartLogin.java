package com.automation.test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import net.sourceforge.htmlunit.corejs.javascript.ast.ThrowStatement;

public class FlipkartLogin {
	
	@Test
	public void testlogin() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+File.separator+"Drivers"+File.separator+"chromedriver.exe");
		ChromeDriver chromedriver = new ChromeDriver();
		chromedriver.manage().window().maximize();
		chromedriver.get("https://www.flipkart.com/");
		chromedriver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("7396720480");
		chromedriver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("nIKHIL@665866");
		chromedriver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
		Thread.sleep(3000);
		chromedriver.findElement(By.name("q")).sendKeys("iphone 13");
		chromedriver.findElement(By.className("_34RNph")).click();
		//chromedriver.findElement(By.tagName("APPLE iPhone 13 (Midnight, 128 GB)")).click();
		//chromedriver.findElement(By.name("_2KpZ6l _2U9uOA _3v1-ww")).click();
		Thread.sleep(2000);
		chromedriver.close();
		//chromedriver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[6]/div/div")).click();
	    //chromedriver.findElement(By.className("KK-o3G")).click();
		//chromedriver.findElement(By.className("_1psGvi _3BvnxG")).click();
		//chromedriver.findElement(By.className("_3vhnxf")).click();
		//chromedriver.close();
		//chromedriver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
		
	}

}
