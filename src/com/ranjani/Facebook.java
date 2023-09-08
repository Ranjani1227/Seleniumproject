package com.ranjani;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sathi\\eclipse-workspace\\Selenium_Project\\Driver 1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
//		WebElement email  = driver.findElement(By.id("email"));
//		email.sendKeys("asdjabdhyue00@gmail.com");
//		Thread.sleep(2000);
//		
//		WebElement pass = driver.findElement(By.name("pass"));
//		pass.sendKeys("122427");
//		Thread.sleep(2000);
		
		WebElement F = driver.findElement(By.xpath("//a[@rel='async']"));
		F.click();
		
		WebElement E = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		E.click();
		Thread.sleep(2000);
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("Siva");
		Thread.sleep(2000);
		WebElement surname = driver.findElement(By.xpath("//input[@name='lastname']"));
		surname.sendKeys("ranjani");
		Thread.sleep(2000);
		WebElement s = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		s.sendKeys("6374225604");
		Thread.sleep(2000);
		WebElement o = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		o.sendKeys("ranjani@12");
		WebElement z = driver.findElement(By.xpath("//label[@class='_58mt'][1]"));
		z.click();
		Thread.sleep(2000);

	}

}
