package com.bootcamp.seleniumclass8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FrameDemo {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\BootCamp\\seleniumChromeDriver\\chromedriver.exe");

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");
		chromeOptions.addArguments("--remote-allow-origins=*");

		WebDriver webDriver = new ChromeDriver(chromeOptions);
		webDriver.manage().deleteAllCookies();
		webDriver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		//allow to switch the default to specified frame.
		webDriver.switchTo().frame("packageListFrame");
		
	 	WebElement webElmLeftTopFrameTitle =  webDriver.findElement(By.cssSelector("h2[title='Packages']"));
		System.out.println(webElmLeftTopFrameTitle.getText());
		
		webDriver.findElement(By.linkText("org.openqa.selenium.bidi")).click();
		
		//default content 
		webDriver.switchTo().defaultContent();
		
		//go to the left bo. frame
		
		webDriver.switchTo().frame("packageFrame");
		
		boolean checkWebElmHasBidiPResent =  webDriver.findElement(By.xpath("//span[text()='HasBiDi']")).isDisplayed();
		System.out.println("Check : "+checkWebElmHasBidiPResent);
		
		
		
		
		
	}

}
