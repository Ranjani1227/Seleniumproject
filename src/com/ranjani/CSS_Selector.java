package com.ranjani;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\Selenium_Project\\Driver 1\\chromedriver.exe");
		
	    WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement id = driver.findElement(By.cssSelector("select#searchDropdownBox"));                    //ID
		id.click();
		Thread.sleep(2000); 
		WebElement cls = driver.findElement(By.cssSelector("a.nav-logo-link "));                          //Class
		cls.click();
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.cssSelector("[name='field-keywords']"));                 //Name
		name.click();
		Thread.sleep(2000);
		WebElement startswith = driver.findElement(By.cssSelector("[id^='icp-nav']"));                  // Starts with
		startswith.click();
		Thread.sleep(2000);
		WebElement Endswith = driver.findElement(By.cssSelector("[id$='submit-button']"));             //Ends with
		Endswith.click();
		Thread.sleep(2000);
		WebElement substring = driver.findElement(By.cssSelector("[data-csa-c-content-id*='help']")); //Substring
		substring.click();
		Thread.sleep(2000);
		WebElement m = driver.findElement(By.linkText("Amazon miniTV"));                              //LinkText
		m.click();
		Thread.sleep(2000);
		WebElement a = driver.findElement(By.partialLinkText("Short Films"));                        //PartialLinkText
		a.click();

		
		
		
		
		
		
		
		
		
	}

}
