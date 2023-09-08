package com.ranjani;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
"C:\\Users\\sathi\\eclipse-workspace\\Selenium_Project\\Driver 1\\chromedriver.exe"	);	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement s = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
		s.click();
		Thread.sleep(2000);
		
		WebElement z = driver.findElement(By.xpath("//a[text()='Alerts']"));
		z.click();
		Thread.sleep(2000);
		
		//simple alert
	    driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
	    driver.switchTo().alert().accept();
	    Thread.sleep(2000);
	    
		//confirm alert
	   driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
	   driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
	   driver.switchTo().alert().dismiss();
	   Thread.sleep(2000);
	   
		//prompt alert
	   driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
	   driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	   driver.switchTo().alert().sendKeys("hello");
	   driver.switchTo().alert().accept();
	}

}
