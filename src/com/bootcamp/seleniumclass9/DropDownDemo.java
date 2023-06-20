package com.bootcamp.seleniumclass9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\BootCamp\\seleniumChromeDriver\\chromedriver.exe");

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");
		chromeOptions.addArguments("--remote-allow-origins=*");

		WebDriver webDriver = new ChromeDriver(chromeOptions);
		webDriver.get("https://ecommerce-playground.lambdatest.io/index.php?route=product/manufacturer/info&manufacturer_id=8");
	
		WebElement webElmShowDropDown = webDriver.findElement(By.id("input-limit-212433"));
		Select select = new Select(webElmShowDropDown);
		
		//way 1 - : selectByVisibleText
		//select.selectByVisibleText("50");
		
		//way 2 : selectByIndex
		//select.selectByIndex(3); -- index 0 : n-1
		
		//way 3  : selectByValue
		//select.selectByValue("https://ecommerce-playground.lambdatest.io/index.php?route=product/manufacturer/info&manufacturer_id=8&limit=25");
		
		
		// get all option as a list
		List<WebElement> optionsList =  select.getOptions();
		
		for(int i=0;i<optionsList.size();i++) {
			
			WebElement webElmOpt = optionsList.get(i);
			
			if(webElmOpt.getText().equals("75")) {
				select.selectByIndex(i);
				break;
			}
		}
		
		
	}
}
