package com.simplilearn.demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIt {
	
	public static void main(String[] args) throws IOException,InterruptedException {
		//assigning driver path
		 String path="D:\\\\phase5\\\\chromedriver\\\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", path);
		
		//initiate the driver
		WebDriver driver= new ChromeDriver();
		
		//giving Base Url
		String base_url="https://www.shine.com/register/general/";
		
		//launching in chrome
		driver.get(base_url);
		
		//getting name
		WebElement name= driver.findElement(By.id("id_name"));
		name.sendKeys("Sandeep");
		
		WebElement element= driver.findElement(By.id("id_file"));
		
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		
		executor.executeScript("arguments[0].click();", element);
		
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\sande\\Downloads\\upload.exe");
	}

}
