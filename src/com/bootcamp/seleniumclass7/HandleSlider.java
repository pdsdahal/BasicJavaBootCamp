package com.bootcamp.seleniumclass7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class HandleSlider {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "F:\\BootCamp\\seleniumChromeDriver\\chromedriver.exe");

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");
		chromeOptions.addArguments("--remote-allow-origins=*");

		WebDriver webDriver = new ChromeDriver(chromeOptions);
		webDriver.manage().deleteAllCookies();
		webDriver.get("https://www.hyperlinkinfosystem.com/contact.html");
		
		
		WebElement webElmChooseFile = webDriver.findElement(By.id("files_doc"));
		webElmChooseFile.sendKeys("C:\\Users\\admin\\Pictures\\logo.jpg");
		
		//slider 
		
		
		try {
			Thread.sleep(4000);
		}catch(Exception e) {
			
		}
		WebElement webElmSlider = webDriver.findElement(By.xpath("//span[@class='irs-slider single']"));
		//create an instance of actions 
		Actions actions = new Actions(webDriver);
		actions.dragAndDropBy(webElmSlider, 1, 0).build().perform();
		
		
	}
	
}
