package com.automation.filehandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		
		
		Properties pro = new Properties();
		java.net.URL url = ClassLoader.getSystemResource("myfile.properties"); 
		
		//try {
		//pro.load(url.openStream());
		//}catch (FileNotFoundException file){
			//file.printStackTrace();	
		//}
     
		//catch (IOException e) {
			//e.printStackTrace();
		//}
		
		System.out.println(pro.getProperty("number"));
		Set <String> keys = pro.stringPropertyNames();
		
		for (String key:keys) {
			System.out.println(key+" "+ pro.getProperty(key));
		}
	}

}
