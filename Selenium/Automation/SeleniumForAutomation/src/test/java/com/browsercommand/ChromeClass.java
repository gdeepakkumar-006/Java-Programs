package com.browsercommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
 

public class ChromeClass {
	public static void main(String[]args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
 		
		driver.get("http://demo.guru99.com/test/newtours/");
		
		 
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("userName")).sendKeys("Mercury");
		
		Thread.sleep(3000);

		
		driver.findElement(By.name("password")).sendKeys("mercury");

		
		Thread.sleep(3000);

		driver.findElement(By.name("submit")).click();

		Thread.sleep(3000);
		

//		System.out.println(driver.getPageSource()); 
//
//		driver.get("https://www.amazon.in/s?k=mobile&ref=nb_sb_noss");
//		driver.findElement()
		
		driver.close();
		
	}

}
