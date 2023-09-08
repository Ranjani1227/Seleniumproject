package com.ranjani;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Methods {
	
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\sathi\\eclipse-workspace\\Selenium_Project\\Driver 1\\chromedriver.exe" );
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://web.whatsapp.com/");
		 
		 driver.manage().window().maximize();
		 
		 System.out.println("==navigation methods==");
		 Thread.sleep(3000);
//		 driver.navigate().to("https://www.youtube.com/hashtag/youtubelink");
//		 Thread.sleep(3000);
//		 driver.navigate().back();
//		 Thread.sleep(3000);
//		 driver.navigate().forward();
//		 Thread.sleep(3000);
//		 driver.navigate().refresh();
//		 Thread.sleep(3000);
//		 driver.quit();
		 
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 String currenturl = driver.getCurrentUrl();
		 System.out.println(currenturl);
		 
//		 String pagesource = driver.getPageSource();
//		 System.out.println(pagesource);
		 
		 Dimension l = new Dimension(400,600);
		 driver.manage().window().setSize(l);
		 
		 Point p = new Point(300,600);
		 driver.manage().window().setPosition(p);
		
		 
	}

}
