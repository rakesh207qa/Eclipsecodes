package selenium;

import java.io.File;

import org.openqa.selenium.edge.EdgeDriver;

public class MyFristSeleniumCOde {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.Edge.driver",System.getProperty("user.dir")+File.separator+"Drivers"+File.separator+"msedgedriver.exe");
		EdgeDriver edgedriver = new EdgeDriver();
		edgedriver.manage().window().maximize();
		edgedriver.get("https://google.com");
		Thread.sleep(10000);
		edgedriver.close();
	}

}
