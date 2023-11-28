package com.simplilearn.demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotExample {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\phase5\\chromedriver\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com");
	TakesScreenshot screenshot=(TakesScreenshot) driver;
	File src= screenshot.getScreenshotAs(OutputType.FILE);
	
	try {
		FileHandler.copy(src, new File("C:\\Users\\sande\\OneDrive\\Pictures\\Screenshots\\demo.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.close();
	
}
}
