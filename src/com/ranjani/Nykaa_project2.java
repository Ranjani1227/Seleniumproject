package com.ranjani;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa_project2 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\Selenium_Project\\Driver 1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("nykaa");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(2000);
		WebElement nykaa = driver.findElement(By.xpath("//span[text()='https://www.nykaa.com › newcustomer › shopnow']"));
		Actions act = new Actions(driver);
		act.contextClick(nykaa).perform();
		Robot r = new Robot();
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 
		 String wh = driver.getWindowHandle();
		 driver.switchTo().window(wh).getTitle();
		 
		 
		 Set<String> z = driver.getWindowHandles();
		 for (String str : z) {
		 driver.switchTo().window(str).getTitle();
			
		}
//		 driver.findElement(By.xpath("//a[text()='makeup']//ancestor::div[@id='my-menu']//descendant::a[text()='makeup']")).click();
//		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[text()='Foundation']//ancestor::div[@class='glamnfitstoreBox megaDropdown']//descendant::a[text()='Foundation']")).click();

		 
	}

}
