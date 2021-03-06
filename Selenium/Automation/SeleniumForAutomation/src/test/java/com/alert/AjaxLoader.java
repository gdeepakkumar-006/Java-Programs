package com.alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjaxLoader {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String FirstUrl="https://webdriveruniversity.com/Popup-Alerts/";
		
		driver.get(FirstUrl);
		
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.id("button3")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("button1")).click();
		
		Thread.sleep(3000);
		
		WebElement title=driver.findElement(By.className("modal-title"));
		
		System.out.println(title.getText());
		
		WebElement msg=driver.findElement(By.className("modal-body"));
		
		Thread.sleep(3000);

		
		System.out.println(msg.getText());
		
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		
		driver.close();
		
		
		
		
		
		
		
	}

}
