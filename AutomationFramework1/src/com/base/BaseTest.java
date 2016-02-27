package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

public abstract class BaseTest {
	public WebDriver driver;

	@BeforeSuite
	public void setUp()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://whiteboxqa.com/");
		driver.manage().window().maximize();
	}
	
	
}