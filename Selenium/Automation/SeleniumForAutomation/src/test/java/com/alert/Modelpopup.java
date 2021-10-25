package com.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Modelpopup {

	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new  ChromeDriver();
		
		String Firsturl="https://webdriveruniversity.com/Popup-Alerts/";
		driver.get(Firsturl);
		
		
		System.out.println(driver.getCurrentUrl());
		
		
		driver.findElement(By.id("button2")).click();
		
		Thread.sleep(3000);
		
		WebElement closebutton=driver.findElement(By.xpath("//button[text()='Close']"));
		
		WebElement msg=driver.findElement(By.className("modal-body"));
		
		System.out.println(msg.getText());
		
		WebElement head=driver.findElement(By.className("modal-header"));
		
		System.out.println(head.getText());
		
		closebutton.click();
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
		
	}

}
