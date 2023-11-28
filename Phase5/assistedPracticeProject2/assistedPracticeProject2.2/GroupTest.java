package com.simplilearn.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GroupTest {
	WebDriver driver= null;
  @Test(groups="Chrome")
  public void launchChrome() {
	  System.out.println("Before Method");
	  System.setProperty("webdriver.chrome.driver", "D:\\phase5\\chromedriver\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
  @Test(groups="Chrome",dependsOnMethods = {"launchChrome"} )
  public  void loginWithChrome() {
	  

	  driver.findElement(By.id("email")).sendKeys("sandy@gmail.com");
	  driver.findElement(By.id("pass")).sendKeys("sandy@123");
	  driver.findElement(By.name("login")).click();
	  driver.close();
	  
  }
}
