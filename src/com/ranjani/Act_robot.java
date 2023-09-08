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

public class Act_robot {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sathi\\eclipse-workspace\\Selenium_Project\\Driver 1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement NV = driver.findElement(By.xpath("//a[text()='New Releases']"));
		
		Actions act = new Actions (driver);
		act.contextClick(NV).perform();
		 Robot r = new Robot();
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 
		 
		 String wh = driver.getWindowHandle();
		 String title = driver.switchTo().window(wh).getTitle();
		 System.out.println(title);
		 
		 Set<String> z = driver.getWindowHandles();
		 for (String str : z) {
			 String title2 = driver.switchTo().window(str).getTitle();
			 System.out.println(title2);
		}
		 WebElement w = driver.findElement(By.xpath("//div[contains(text(),'Amazon Basics Port Carry Case/Messenger Bag for Office or College (16 L)')]"));
		 w.click();
		 Thread.sleep(2000);
		 WebElement id = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		 id.click();
		 Thread.sleep(2000);
		 WebElement cart = driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
	     cart.click();
	     Thread.sleep(2000);
	     WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	     email.sendKeys("djewiohfcfbfhu@gmail.com");
	     Thread.sleep(2000);
	     WebElement R = driver.findElement(By.xpath("//input[@id='continue']"));
	     R.click();
	     
	}

}
