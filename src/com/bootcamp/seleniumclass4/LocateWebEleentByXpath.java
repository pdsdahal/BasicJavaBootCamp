package com.bootcamp.seleniumclass4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocateWebEleentByXpath {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\BootCamp\\seleniumChromeDriver\\chromedriver.exe");
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");
		chromeOptions.addArguments("--remote-allow-origins=*");
		
		WebDriver webDriver = new ChromeDriver(chromeOptions);
		webDriver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
		
		//Absolute Xpath 
		
		String actualH1Title = webDriver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/div/div/h1")).getText();
		System.out.println("Title : "+actualH1Title);
		
		
		WebElement webElmFirstNameTxtField = webDriver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/div/div/form/fieldset[1]/div[2]/div/input"));
		webElmFirstNameTxtField.sendKeys("Ram");
		
		
		//Relative Xpath
		System.out.println("Content of H1 Tag : "+webDriver.findElement(By.xpath("//div[@id='content']//h1")).getText());
		
		boolean firstNameLblPresentCheck =  webDriver.findElement(By.xpath("//div[@class='form-group row required'][2]//label[@for='input-firstname']")).isDisplayed();
		System.out.println("First Name label : "+firstNameLblPresentCheck);
		
	
		//Attribute based Xpath 
		
		webDriver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("pdsdahal@gmail.com");
		
	
		//text based xpath
		System.out.println("Label Contains for Email : "+webDriver.findElement(By.xpath("//label[text()='E-Mail']")).getText());
		
		
		//following sibling  (immediate top sibling / following-sibling:: target element) 
		
		//input[@id='input-agree']/following-sibling::label
		webDriver.findElement(By.xpath("//input[@id='input-agree']/following-sibling::label")).click();
		
		
		//partial text based xpath:
		String actualLblConfirmPass =  webDriver.findElement(By.xpath("//label[contains(text(),'Confirm')]")).getText();
		System.out.println("Label Contains : "+actualLblConfirmPass);		
	}	
}
