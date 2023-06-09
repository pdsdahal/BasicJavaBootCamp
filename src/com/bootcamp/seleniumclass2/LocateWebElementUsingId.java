package com.bootcamp.seleniumclass2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocateWebElementUsingId {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\BootCamp\\seleniumChromeDriver\\chromedriver.exe");

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");
		chromeOptions.addArguments("--remote-allow-origins=*");

		WebDriver webDriver = new ChromeDriver(chromeOptions);
		webDriver.navigate().to("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
		
		String actualPageTitle = webDriver.getTitle();
		String expectedPageTitle = "Register Account";
		
		if(actualPageTitle.equals(expectedPageTitle)){
			System.out.println("title is matching as expected");
		}else {
			System.out.println("Title is not matching....");
		}
		
		System.out.println(actualPageTitle);
		
		
		WebElement webElmFirstNameTxtField =  webDriver.findElement(By.id("input-firstname"));
		
		//chekes whether element is displayed or not in the browser 
		boolean actWENameTxtFDisplay = webElmFirstNameTxtField.isDisplayed();
		boolean expWENameTxtFDisplay = true;
		
		if(actWENameTxtFDisplay==expWENameTxtFDisplay) {
			System.out.println("First Name text  filed is displayed in the browser");
		}else {
			System.out.println("First Name text  filed is not displayed in the browser");
		}
		
		//checks whether element is enabled or disabled 
		boolean actWebElmFNameTxtFEnab = webElmFirstNameTxtField.isEnabled();
		boolean expWebElmFNameTxtFEnab = true;
		
		if(actWebElmFNameTxtFEnab==expWebElmFNameTxtFEnab) {
			System.out.println("First Name text  filed is enabled in the browser");
		}else {
			System.out.println("First Name text  filed is not enabled in the browser");
		}
		
		//using sendKeys --- you are allow to enter the value in text fields  
		webElmFirstNameTxtField.sendKeys("Ram");
		
		
		webDriver.findElement(By.id("input-lastname")).sendKeys("Dahal");
	}
}
