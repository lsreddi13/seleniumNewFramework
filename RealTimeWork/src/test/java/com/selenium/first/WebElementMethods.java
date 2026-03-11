package com.selenium.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebElementMethods {

	WebDriver driver;
	
	String appURL = "https://demo.nopcommerce.com/";

	@BeforeClass
	public void launchApp() {
		driver = new ChromeDriver();
		driver.get(appURL);
	}

	@Test
	public void testWebEleMethods() {
		
		WebElement currencySelectList_ele = driver.findElement(By.className("currency-selector"));
		currencySelectList_ele.click();
		WebElement selectedCurrency_ele = driver.findElement(By.id("customerCurrency"));
		String name = selectedCurrency_ele.getAttribute("name");
		
		String areaLabel = selectedCurrency_ele.getAttribute("aria-label");
	
		System.out.println(name +" : "+ areaLabel);
		
		boolean val = 	driver.findElement(By.className("search-box-button")).isDisplayed();
		
		Assert.assertTrue(val);
		Assert.assertEquals(val, true);
		
		boolean val2 = 	driver.findElement(By.className("search-box-button")).isEnabled();
		Assert.assertTrue(val2);
		Assert.assertEquals(val2, true);
		
		String val3 = driver.findElement(By.className("search-box-button")).getText();
		
		Assert.assertEquals(val3, "search");
		
	
		
	}

}
