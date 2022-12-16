package com.automation.test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class MyFirstTest {
	
	@Test
	public void myTest() throws Exception {
	
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+File.separator+"Drivers"+File.separator+"chromedriver.exe");
	ChromeDriver chromedriver = new ChromeDriver();
	chromedriver.manage().window().maximize();
	chromedriver.get("https://demoqa.com/text-box");
	chromedriver.findElement(By.xpath("//*[@id='userName']")).sendKeys("rakesh99");
	chromedriver.findElement(By.xpath("//*[@id='userEmail']")).sendKeys("rakeshmasapathri1@gmail.com");
	chromedriver.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("H NO 9-1,Gandhi Nagar,Bhupalpally.");
	chromedriver.findElement(By.xpath("//*[@id=\"permanentAddress\"]")).sendKeys("same as current address");
	Thread.sleep(2000);
	/*chromedriver.findElement(By.xpath("//*[@id='submit']")).click();
	chromedriver.findElement(By.xpath("//*[@id=\"output\"]/div"));*/
	Thread.sleep(5000);
	chromedriver.get("https://demoqa.com/checkbox");
	chromedriver.findElement(By.xpath("//*[@id='tree-node']/ol/li/span/button")).click();
	chromedriver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[1]/span/button")).click();
	chromedriver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/span/button")).click();
	chromedriver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[3]/span/button")).click();
	chromedriver.findElement(By.xpath("//*[@id='tree-node']/ol/li/span/label/span[1]")).click();
	

	}
}
