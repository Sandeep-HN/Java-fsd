package com.testpack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestClass extends BaseTest {
	// Hard Assertions
	@Test
	public void TestGoogle() throws Exception
	{
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Seven Wonders of the world", Keys.ENTER);
		System.out.println("Title of the Page : " + driver.getTitle());
		String exp = "Seven Wonders of the world - Google Search1";
		String act = driver.getTitle();
		Assert.assertEquals(act, exp, "Title Mismatched....");
		Thread.sleep(2000);
		String act1 = driver.getCurrentUrl();
		System.out.println(act1);
		String exp1 = "https://www.google.com/search?q=Seven+Wonders+of+the+world&sca_esv=585519558&source=hp&ei=uC1kZZnADse5hwOt0qzYAg&iflsig=AO6bgOgAAAAAZWQ7yP8Z9A3__gik34l6Rv6ZQHcTudv8&ved=0ahUKEwiZ_IHVveOCAxXH3GEKHS0pCysQ4dUDCAo&uact=5&oq=Seven+Wonders+of+the+world&gs_lp=Egdnd3Mtd2l6IhpTZXZlbiBXb25kZXJzIG9mIHRoZSB3b3JsZEiEAVAAWIABcAB4AJABAJgBAKABAKoBALgBA8gBAPgBAQ&sclient=gws-wiz";
		Assert.assertNotEquals(act1, exp1, "Url Mismatched...");
		
		Thread.sleep(2000);
	}
	
	@Test
	public void TestFb() throws Exception
	{
		driver.get("http://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("venugopal@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("12345");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).submit();
		Thread.sleep(2000);
	}
	
	// Soft Assertions
	@Test
	public void TestGoogle1() throws Exception
	{
		SoftAssert soft = new SoftAssert();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Seven Wonders of the world", Keys.ENTER);
		System.out.println("Title of the Page : " + driver.getTitle());
		String exp = "Seven Wonders of the world - Google Search";
		String act = driver.getTitle();
		soft.assertEquals(act, exp, "Title Mismatched....");
		Thread.sleep(2000);
		String act1 = driver.getCurrentUrl();
		System.out.println(act1);
		String exp1 = "https://www.google.com/search?q=Seven+Wonders+of+the+world&sca_esv=585519558&source=hp&ei=uC1kZZnADse5hwOt0qzYAg&iflsig=AO6bgOgAAAAAZWQ7yP8Z9A3__gik34l6Rv6ZQHcTudv8&ved=0ahUKEwiZ_IHVveOCAxXH3GEKHS0pCysQ4dUDCAo&uact=5&oq=Seven+Wonders+of+the+world&gs_lp=Egdnd3Mtd2l6IhpTZXZlbiBXb25kZXJzIG9mIHRoZSB3b3JsZEiEAVAAWIABcAB4AJABAJgBAKABAKoBALgBA8gBAPgBAQ&sclient=gws-wiz";
		soft.assertNotEquals(act1, exp1, "Url Mismatched...");
		soft.assertAll();
		Thread.sleep(2000);
	}

}
