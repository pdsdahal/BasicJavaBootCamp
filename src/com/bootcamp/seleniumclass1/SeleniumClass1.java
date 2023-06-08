package com.bootcamp.seleniumclass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumClass1 {

	public static void main(String[] args) {

		// Step 1. Set the path for ***driver.exe
		System.setProperty("webdriver.chrome.driver", "F:\\BootCamp\\seleniumChromeDriver\\chromedriver.exe");

		// Step 2. Set chrome Options

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");
		chromeOptions.addArguments("--remote-allow-origins=*");

		// Step 3. Create object of WebDriver
		WebDriver webDriver = new ChromeDriver(chromeOptions);
		webDriver.navigate().to("https://www.selenium.dev/");

		webDriver.switchTo().newWindow(WindowType.WINDOW);
		webDriver.get("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");

		// close
		
	
		
		try {
			
			
			Thread.sleep(4000);
			webDriver.close();
			Thread.sleep(4000);
			
			webDriver.quit();
			
		} catch (Exception e) {

		}
		

	}

}
