package com.selenium.first;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoGetPageLinks {
	// get the number links count from a webpage
	@Test
	public void getLinksCount() {
//	open the webpage
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
//		get the number of links from the webpage
		// anchor tag <a
		// create a java list
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of Links : "+links.size());
		for(WebElement el : links) {
			String linkurl = el.getAttribute("href");
			System.out.println(linkurl);
		}
		//driver methods
		//get, getCurrentURL, maximize, minimize, fullscreen
		//get the link url
		//get and print all the links from a webpage
	}

}
