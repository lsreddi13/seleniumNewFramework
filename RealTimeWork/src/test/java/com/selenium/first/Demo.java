package com.selenium.first;

import org.testng.annotations.Test;

public class Demo {
	
	@Test(priority = 1)
	public void registerTest() {
		System.out.println("this is registerTest");
	}
	
	@Test(priority = 2)
	public void loginTest() {
		System.out.println("this is loginTest");
	}
	
	
	@Test(priority = 3)
	public void logoutTest() {
		
		System.out.println("this is logoutTest");
	}
	

}
