package com.ranjani;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\sathi\\eclipse-workspace\\Selenium_Project\\Driver 1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		System.out.println("===Single dropdown===");
		WebElement s = driver.findElement(By.id("oldSelectMenu"));
		
		Select single = new Select(s);
		boolean m = single.isMultiple();
		System.out.println(m);
		
		List<WebElement> options = single.getOptions();
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
			
		}
		System.out.println("===select by index===");
		single.selectByIndex(5);
		System.out.println(single.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		
		System.out.println("===select by value===");
		single.selectByValue("3");
		System.out.println(single.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		
		System.out.println("===select by visible text===");
		single.selectByVisibleText("Indigo");
		System.out.println(single.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		
		
		System.out.println("===Multiple dropdown===");
		WebElement z = driver.findElement(By.id("cars"));
		
		Select multiple = new Select(z);
		
		List<WebElement> options2 = multiple.getOptions();
		for (WebElement webElement : options2) {
			System.out.println(webElement.getText());
			
		}
	
		multiple.selectByIndex(3);                              //index
		Thread.sleep(2000);
		
		multiple.selectByValue("volvo");                       //value
		Thread.sleep(2000);
	
		multiple.selectByVisibleText("Saab");                 //visible text
		Thread.sleep(2000);
		
		System.out.println("===getallselectedoption===");
		
		List<WebElement> allSelectedOptions = multiple.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			System.out.println(webElement.getText());
			
		}
		
		multiple.deselectAll();
		
	}

}
