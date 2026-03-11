package com.selenium.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DemoPageTitleAssertion {
	WebDriver driver;
	
	@BeforeClass
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
	}
	@Test(priority = 1)
	public void testPageTitle() {
		
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "nopCommerce demo store. Home page title";
		//testng assertions
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	
	@Test(priority = 2)
	public void searchComputer() {
		WebElement searchBox_id = driver.findElement(By.id("small-searchterms"));
		searchBox_id.sendKeys("computer");
//		driver.navigate().refresh();
//		driver.navigate().back();
//		driver.navigate().forward();
		
		searchBox_id.sendKeys("mouse");
		
		String windowID = driver.getWindowHandle();
		System.out.println(windowID);
//		driver.close();
		driver.quit();
		//what exception do you now
		//no such elelment found
		//stale element exception
		
	}
}
