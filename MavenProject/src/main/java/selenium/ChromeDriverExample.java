package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ChromeDriverExample {
	

	public static void main(String[] args) {
	//	By txtUsername = By.id("userName"); // locator
	//	By txtUsernames = By.
		
          

	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+File.separator+"Drivers"+File.separator+"chromedriver.exe");
	  ChromeDriver chromedriver = new ChromeDriver();
	  chromedriver.manage().window().maximize();
	  chromedriver.get("https://demoqa.com/text-box");
	  chromedriver.findElement(By.xpath("userName")).sendKeys("Hello world");
	//  WebElement we = chromedriver.findElement(txtUsername);
	 // we.click();
	//  we.sendKeys("hellow World");
	  //String attr = we.getAttribute("class");
	  
	 // System.out.println("Attribute Value:  "+attr);
	}
} 
	

