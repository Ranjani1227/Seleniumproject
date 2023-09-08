package com.ranjani;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sathi\\eclipse-workspace\\Selenium_Project\\Driver 1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
	    driver.findElement(By.xpath("//a[text()='SwitchTo']")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[text()='Frames']")).click();
		Thread.sleep(2000);
		
		//SINGLE FRAME
		
		//Using Index
//		driver.switchTo().frame(0);
		
		//Using ID or Name
//		driver.switchTo().frame("singleframe");
		
		//Using Webelement
		WebElement single = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(single);
		WebElement  w = driver.findElement(By.xpath("//input[@type='text'][1]"));
		w.sendKeys("Selenium");
		
	    driver.switchTo().defaultContent();
		
		//MULTIPLE FRAME
		
		driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
		Thread.sleep(2000);
		
	
		driver.switchTo().frame(1);

		WebElement multiple = driver.findElement(By.xpath("//iframe[@src=\'SingleFrame.html\']"));
		driver.switchTo().frame(multiple);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium");
	    
		
		
		
		

		
		
	}

}
