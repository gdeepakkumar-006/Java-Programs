package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		String FirstUrl="https://webdriveruniversity.com/Popup-Alerts/";
		driver.get(FirstUrl);
		
		driver.findElement(By.id("button1")).click();
		
		Thread.sleep(3000);
		
		Alert alt=driver.switchTo().alert();
		
		Thread.sleep(3000);

		String msg=alt.getText();
		if(msg.equals("I am an alert box!")) {
			System.out.println("message is same and message is: "+msg);
		}else {
				System.out.println("message is wrong");
				
			}
		
		
		Thread.sleep(3000);
		
		alt.accept();
		
		Thread.sleep(3000);

		driver.close();
		

		}
	}


