package com.ranjani;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_project1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sathi\\eclipse-workspace\\Selenium_Project\\Driver 1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("adactin hotel");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span.VuuXrf")).click();	
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Sathish1826");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("Sathish3456");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByIndex(5);
		Thread.sleep(2000);
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select S1 = new Select(hotels);
	    S1.selectByIndex(2);
		Thread.sleep(2000);
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select S2 = new Select(roomtype);
		S2.selectByIndex(3);
		Thread.sleep(2000);
		WebElement roomnos = driver.findElement(By.id("room_nos"));
		Select S3 = new Select(roomnos);
		S3.selectByIndex(5);
		Thread.sleep(2000);
		WebElement datepickin = driver.findElement(By.id("datepick_in"));
		datepickin.clear();
		datepickin.sendKeys("11/08/23");
		Thread.sleep(2000);
		WebElement datepickout = driver.findElement(By.id("datepick_out"));
		datepickout.clear();
		datepickout.sendKeys("13/08/23");
		Thread.sleep(2000);
		WebElement adultroom = driver.findElement(By.id("adult_room"));
		Select S4 = new Select(adultroom);
		S4.selectByIndex(1);
		Thread.sleep(2000);
		WebElement childroom = driver.findElement(By.id("child_room"));
		Select S5 = new Select(childroom);
		S5.selectByIndex(2);
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("first_name")).sendKeys("Siva");
		driver.findElement(By.name("last_name")).sendKeys("Ranjani");
		driver.findElement(By.name("address")).sendKeys("dbfueisfbebfubaebuf");
		driver.findElement(By.name("cc_num")).sendKeys("4352637292498294");
		WebElement cctype = driver.findElement(By.name("cc_type"));
		Select S6 = new Select(cctype);
		S6.selectByIndex(1);
		WebElement expmonth = driver.findElement(By.name("cc_exp_month"));
		Select S7 = new Select(expmonth);
		S7.selectByIndex(6);
		WebElement expyear = driver.findElement(By.name("cc_exp_year"));
		Select S8 = new Select(expyear);
		S8.selectByIndex(15);
		driver.findElement(By.name("cc_cvv")).sendKeys("1227");
		
		driver.findElement(By.name("book_now")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		}

}
