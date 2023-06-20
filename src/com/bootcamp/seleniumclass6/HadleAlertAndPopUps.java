package com.bootcamp.seleniumclass6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HadleAlertAndPopUps {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\BootCamp\\seleniumChromeDriver\\chromedriver.exe");

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");
		chromeOptions.addArguments("--remote-allow-origins=*");

		WebDriver webDriver = new ChromeDriver(chromeOptions);
		webDriver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		try {
			
			Thread.sleep(4000);
		}catch(Exception e) {
			
		}
		
		WebElement webElmSignInBtn = webDriver.findElement(By.cssSelector("input.signinbtn"));
		webElmSignInBtn.click();
		
		
		Alert alert =  webDriver.switchTo().alert();
		String messageAlert =  alert.getText();
		System.out.println("Alert Message : "+messageAlert);
		alert.accept();
		
		webDriver.findElement(By.id("login1")).sendKeys("Apple12");
		
		webDriver.findElement(By.cssSelector("input.signinbtn")).click();
	
		Alert alert1 =  webDriver.switchTo().alert();
		String messageAlert1 =  alert1.getText();
		
		//if text box is present 
		//alert1.sendKeys("Pass OTP Code");
		
		
		
		System.out.println("Alert Message : "+messageAlert1);
		alert.accept();
		
		
		
	}

}
