package com.ranjani;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_Login {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sathi\\eclipse-workspace\\Selenium_Project\\Driver 1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement email  = driver.findElement(By.id("email"));
		boolean selected = email.isSelected();
		System.out.println("email:"+selected);
		email.sendKeys("asdjabdhyue00@gmail.com");
		Thread.sleep(2000);
		
		WebElement pass = driver.findElement(By.name("pass"));
		boolean enabled = pass.isEnabled();
	    System.out.println("pass:" +enabled);
	    pass.sendKeys("122427");
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.name("login"));
		boolean displayed = login.isDisplayed();
		System.out.println("login:"+displayed);
		login.click();
		
		
		
		
		
		
	}

}
