package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptConform {
public static void main(String[]args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	
	String firstUrl="https://webdriveruniversity.com/Popup-Alerts/";
	driver.get(firstUrl);
	
	driver.findElement(By.id("button4")).click();
	
	Thread.sleep(3000);
	
	Alert alt=driver.switchTo().alert();
	
	Thread.sleep(3000);

	
	System.out.println(alt.getText());
	
	alt.dismiss();
	
	Thread.sleep(3000);
	
	driver.close();
   
	
	
	
	
	
	
	
}
}
