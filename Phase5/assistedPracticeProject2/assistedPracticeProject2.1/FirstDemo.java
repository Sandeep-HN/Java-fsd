package com.simplilearn.demo;

import org.testng.annotations.*;


public class FirstDemo {
	@Test
	public void Hello() {
		System.out.println("-------TEST-1---------");
	}
	
	@Test
	public void Hello1() {
		System.out.println("-------TEST-2---------");
	}
@BeforeMethod
public void beforeMethod() {
	System.out.println("Before Method");
}
@AfterMethod
public void afterMethod() {
	System.out.println("After Method");
}
@BeforeTest
public void beforeTest() {
	System.out.println("Before Test");
}
@AfterTest
public void afterTest() {
	System.out.println("After Test");
}
@BeforeClass
public void beforeClass() {
	System.out.println("Before Class");
}
@AfterClass
public void afterClass() {
	System.out.println("After Class");
}
@BeforeSuite
public void beforeSuite() {
	System.out.println("Before Suite");
}
@AfterSuite
public void afterSuite() {
	System.out.println("After Suite");
}
}
