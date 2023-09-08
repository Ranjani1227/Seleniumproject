package com.ranjani;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascripteditor {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\Selenium_Project\\Driver 1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("window.scrollBy(0,500)");
		
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		js.executeScript("arguments[0].value='cbiduscbf@gmail.com';", email);
		Thread.sleep(2000);
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		js.executeScript("arguments[0].value='dbyugf';",pass);
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		js.executeScript("arguments[0].click();",login);
		
	}

}
