package com.bootcamp.seleniumclass5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocateWebElementByUsingName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\BootCamp\\seleniumChromeDriver\\chromedriver.exe");

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");
		chromeOptions.addArguments("--remote-allow-origins=*");

		WebDriver webDriver = new ChromeDriver(chromeOptions);
		webDriver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
		
		webDriver.findElement(By.name("telephone")).sendKeys("234567");
		
		
	}
}
