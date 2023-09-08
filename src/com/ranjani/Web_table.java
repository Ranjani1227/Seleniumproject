package com.ranjani;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_table {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\Selenium_Project\\Driver 1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS );
		
		System.out.println("===To get all data===");
		List<WebElement> q = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement web : q) {
			System.out.println(web.getText());
			
		}
		
		System.out.println("===To get all data in particular table===");
		List<WebElement> table = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
		
		for (WebElement web : table) {
			System.out.println(web.getText());
			
		}
		System.out.println("===To get particular row data in particular table===");
		List<WebElement> z = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td"));
		for (WebElement web : z) {
			System.out.println(web.getText());
			}
		System.out.println("===To get particular column in particular table===");
		List<WebElement> w = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));
		for (WebElement web : w) {
			System.out.println(web.getText());
			
		}
		System.out.println("===To get single particular data in particular table===");
		List<WebElement> y = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td[2]"));
		for (WebElement web : y) {
			System.out.println(web.getText());
			
		}
		
	}

}
