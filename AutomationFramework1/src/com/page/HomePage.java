package com.page;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.base.BasePage;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver)
	{
		super(driver);
		}
	public void openpage()
	{
	driver.get("http://whiteboxqa.com:/");
	}
	public String clickLogin()
	{
		String url = null;
		url = driver.getCurrentUrl();
		driver.findElement( By.xpath(".//*[@id='loginButton']")).click();
		return url;
		}
	
	@AfterClass
	public void quit()
	{
		driver.quit();
	}
	
}


