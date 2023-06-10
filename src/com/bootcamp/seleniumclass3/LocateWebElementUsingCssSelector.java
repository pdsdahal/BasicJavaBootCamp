package com.bootcamp.seleniumclass3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocateWebElementUsingCssSelector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\BootCamp\\seleniumChromeDriver\\chromedriver.exe");
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");
		chromeOptions.addArguments("--remote-allow-origins=*");
		
		WebDriver webDriver = new ChromeDriver(chromeOptions);
		webDriver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
		
		
		//1. Select element by using tag
		
		WebElement webElmTitleH1 = webDriver.findElement(By.cssSelector("h1"));
		String actualTextH1 = webElmTitleH1.getText();
		
		System.out.println("Actual Title oh H1 : "+actualTextH1);
		
		
		List<WebElement> webElmsLabel = webDriver.findElements(By.cssSelector("label"));
		
		for(int i=0;i<webElmsLabel.size();i++) {
			WebElement webLbl = webElmsLabel.get(i);
			String actualLabelName = webLbl.getText();
			
			if(actualLabelName.equals("Password")) {
				System.out.println("Password label : "+actualLabelName);
				
				break;
			}	
		}
		
		//2. css selector using -  id (#NameOfId)
		
		WebElement webElmFirstNameTxtField = webDriver.findElement(By.cssSelector("#input-firstname"));
		webElmFirstNameTxtField.sendKeys("Shyam");
		
		
		//3. css selector using - className (.className)
		
		List<WebElement> webElmInputsReg = webDriver.findElements(By.cssSelector(".form-control"));
		WebElement webElementEmailTextField =  webElmInputsReg.get(2);
		webElementEmailTextField.sendKeys("pdsdahal@gmail.com");
		
		//4.Tag and Id (TagName#Id)
		
		webDriver.findElement(By.cssSelector("input#input-password")).sendKeys("Admin");
		
		//5. Tag and class (TagName.clssName)
		
		webDriver.findElements(By.cssSelector("label.custom-control-label")).get(0).click();
		
		//6. Attribute [for='value']
		
		boolean actualLblTelephoneCheck = webDriver.findElement(By.cssSelector("[for='input-telephone']")).isDisplayed();
		System.out.println("Telephone WebElement Present check : "+actualLblTelephoneCheck);
		
		//7. child selector (parent > child)
		
		String actualTextParagraphTag =  webDriver.findElement(By.cssSelector("[id='content'] > p")).getText();
		System.out.println("Content of P Tag : "+actualTextParagraphTag);
		
		//8. descendent selector (parent child)
		webDriver.findElement(By.cssSelector(".float-right [type='submit']")).click();
		
		
	}
}
