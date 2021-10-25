package com.browsercommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeRegistrationForm {
	public static void main(String[]args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("firstName")).sendKeys("deepak");
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("lastName")).sendKeys("kumar");
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("phone")).sendKeys("8838622078");
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("userName")).sendKeys("deepakgovindharaj006@gmail.com");
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("address1")).sendKeys("2/245,pannikiruppu st");
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("city")).sendKeys("mayiladuthurai");
		Thread.sleep(5000);
		driver.findElement(By.name("state")).sendKeys("tamilnadu");
		Thread.sleep(5000);
		driver.findElement(By.name("postalCode")).sendKeys("609108");
		Thread.sleep(5000);
		driver.findElement(By.name("country")).sendKeys("india");
		Thread.sleep(5000);
		driver.findElement(By.name("email")).sendKeys("deepakgovindharaj006@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("deepak@123");
		Thread.sleep(5000);
		driver.findElement(By.name("confirmPassword")).sendKeys("deepak@123");
		Thread.sleep(5000);
		
		System.out.println(driver.getPageSource());
		
	
		
		
		driver.findElement(By.name("submit")).click();
		
		driver.close();
		

		
		
		
		
		
		
	 
	}

}
