package com.bootcamp.seleniumclass9;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotationsDemo {
	
	
	@Test(priority = 2)
	public void testCase1() {
		System.out.println("this is @Test method...");//test case
	}
	
	@Test(priority = 1)
	public void testCase2() {
		System.out.println("this is @Test method...");//test case
	}
	
	@BeforeSuite
	public void beforeSuiteMethod() {
		System.out.println("this is @BeforeSuite method...");//1 priority 
	}
	
	@BeforeClass
	public void beforeClassMethod() {
		System.out.println("this is @BeforeClass method...");// 3 priority
	}
	
	
	@BeforeTest
	public void beforeTestMethod() {
		System.out.println("this is @BeforeTest method....");//2 priority
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("this is @BeforeMethod method...."); //4 priority
	}
	
	
	
	
	
}
