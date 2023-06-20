package com.bootcamp.seleniumclass8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\BootCamp\\seleniumChromeDriver\\chromedriver.exe");

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");
		chromeOptions.addArguments("--remote-allow-origins=*");

		WebDriver webDriver = new ChromeDriver(chromeOptions);
		webDriver.manage().deleteAllCookies();
		webDriver.get("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
		
		String titleHomePage = webDriver.getTitle();
		System.out.println("Home Page Title : "+titleHomePage);

		WebElement webElmMyAccountMenu = webDriver.findElement(By.linkText("My account"));
		boolean checkMyAccountPresenet  = webElmMyAccountMenu.isDisplayed();
		System.out.println("My Account Menu Present check : "+checkMyAccountPresenet);
		
		//hover 
		Actions actions = new Actions(webDriver);
		actions.moveToElement(webElmMyAccountMenu).build().perform();
		
		WebElement webElmRegisterSubMenu = webDriver.findElement(By.linkText("Register"));
		boolean checkRegisterMenuDisplayed = webElmRegisterSubMenu.isDisplayed();
		
		System.out.println("Register menu display check : "+checkRegisterMenuDisplayed);

		webElmRegisterSubMenu.click();
		
		String titleRegistrationPage = webDriver.getTitle();
		System.out.println("tile of Registration page : "+titleRegistrationPage);
		
		
		String webElmTxtOfH1 = webDriver.findElement(By.tagName("h1")).getText();
		System.out.println("H1 Tag content  : "+webElmTxtOfH1);
		
		
		webDriver.findElement(By.id("input-firstname")).sendKeys("apple");
		
	}

}
