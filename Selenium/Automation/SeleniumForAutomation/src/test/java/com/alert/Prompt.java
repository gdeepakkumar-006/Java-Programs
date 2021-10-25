package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Prompt {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		String FirstUrl="https://demoqa.com/alerts";
		driver.get(FirstUrl);
		
 		
		
		driver.findElement(By.id("promtButton")).click();
		
		Thread.sleep(1000);
		
		Alert alt=driver.switchTo().alert();
		
		Thread.sleep(1000);

		
		System.out.println(alt.getText());
		
		Thread.sleep(3000);

		alt.sendKeys("Selenium automation testing");
		
		Thread.sleep(3000);

		alt.accept();
		
		Thread.sleep(5000);

		driver.close();
		
		
	}

}
