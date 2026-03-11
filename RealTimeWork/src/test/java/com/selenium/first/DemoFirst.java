package com.selenium.first;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoFirst {
	
	@Test
	public void testDemo() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?returnUrl=%2Fadmin%2F");
		
		//create a webelement 
		WebElement email_ele = driver.findElement(By.id("Email"));
		email_ele.sendKeys("sasi");
		
		driver.findElement(By.id("Email")).sendKeys("fdsafads");
		driver.findElement(By.id("Email")).click();
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).getText();
		driver.findElement(By.id("Email")).getTagName();
		driver.findElement(By.id("Email")).isDisplayed();
		driver.findElement(By.id("Email")).isEnabled();
		driver.findElement(By.id("Email")).isSelected();
		driver.findElement(By.id("Email")).getAttribute("name");
		

		
		driver.findElement(By.name("email")).sendKeys("dasfdaDF");
		driver.findElement(By.name("pass")).sendKeys("dfadsfasdFA");
		driver.findElement(By.className("x1n2onr6")).isEnabled();
		driver.findElement(By.className("x1n2onr6")).click();
		
		driver.findElement(By.tagName("input")).sendKeys("dfasdf");
		
		driver.findElement(By.tagName("img")).click();
		
		driver.findElements(By.tagName("a"));
		
		//what are the webelement methods do you know
		//driver methods / webdriver methods
		
		//locators- 
		
		
		
//		driver.close();
		
	}

}
