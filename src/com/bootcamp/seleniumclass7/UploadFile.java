package com.bootcamp.seleniumclass7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UploadFile {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "F:\\BootCamp\\seleniumChromeDriver\\chromedriver.exe");

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");
		chromeOptions.addArguments("--remote-allow-origins=*");

		WebDriver webDriver = new ChromeDriver(chromeOptions);
		webDriver.get("https://www.hyperlinkinfosystem.com/contact.html");
		
		
		WebElement webElmChooseFile = webDriver.findElement(By.id("files_doc"));
		webElmChooseFile.sendKeys("C:\\Users\\admin\\Pictures\\logo.jpg");
		
		
		
	}
	
}
