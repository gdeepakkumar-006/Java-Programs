package com.browsercommand;

import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firefox {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver =new FirefoxDriver();
 		
		driver.get("https://www.amazon.in/");
		
		String url =driver.getCurrentUrl();
		System.out.println(url);
		String title =driver.getTitle();
		System.out.println(title);

//		System.out.println(driver.getPageSource()); 
//
//		driver.get("https://www.amazon.in/s?k=mobile&ref=nb_sb_noss");
//		driver.findElement()
		
		driver.close();
		

	}

}
