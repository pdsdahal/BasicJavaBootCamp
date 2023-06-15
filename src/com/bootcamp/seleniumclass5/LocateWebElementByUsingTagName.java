package com.bootcamp.seleniumclass5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocateWebElementByUsingTagName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\BootCamp\\seleniumChromeDriver\\chromedriver.exe");

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");
		chromeOptions.addArguments("--remote-allow-origins=*");

		WebDriver webDriver = new ChromeDriver(chromeOptions);
		webDriver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");

		WebElement webElmH1 = webDriver.findElement(By.tagName("h1"));
		System.out.println("Content of H1 tag : "+webElmH1.getText());
		
	
	}
}
