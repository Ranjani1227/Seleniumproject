package com.ranjani;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sathi\\eclipse-workspace\\Selenium_Project\\Driver 1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.imdb.com/");
		
		driver.manage().window().maximize();
		
		WebElement w = driver.findElement(By.name("q"));
		w.sendKeys("Varisu");
		Thread.sleep(2000);
		
		WebElement f = driver.findElement(By.xpath("//div[text()='Varisu']"));
		f.click();
		Thread.sleep(2000);

		WebElement g = driver.findElement(By.xpath("//span[@class='sc-bde20123-1 iZlgcd'][1]"));
		System.out.println(g.getText());
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\HP\\eclipse-workspace\\Selenium_Project\\Screenshot\\image.png");
		
		FileUtils.copyFile(source, destination);
		

		
		
		
		
	}

}
