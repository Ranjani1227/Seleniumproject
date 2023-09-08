package com.ranjani;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\Selenium_Project\\Driver 1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	
		driver.manage().window().maximize();
		
		WebElement q = driver.findElement(By.xpath("//select[@name='url']"));                          //Basic XPath
		q.click();
		Thread.sleep(2000);
		WebElement s = driver.findElement(By.xpath("//span[@style='visibility: visible;'][1]"));      //index
		s.click();
		Thread.sleep(2000);
		WebElement z = driver.findElement(By.xpath("//a[text()='Sell']"));                           //Text
		z.click();
		Thread.sleep(2000);
		WebElement w = driver.findElement(By.xpath("//a[contains (text(), 'Ideas')]"));              // ContainsText
		w.click();
		Thread.sleep(2000);
		WebElement t = driver.findElement(By.xpath("//a[contains(@href,'/mobile-phones')]"));       //ContainsAttribute
		t.click();
		Thread.sleep(2000);
		WebElement m = driver.findElement(By.linkText("Amazon miniTV"));                            //LinkText
		m.click();
		Thread.sleep(2000);
		WebElement a = driver.findElement(By.partialLinkText("Short Films"));                     //PartialLinkText
		a.click();

	}

}
