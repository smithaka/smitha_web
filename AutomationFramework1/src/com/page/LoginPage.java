package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.base.BasePage;

public class LoginPage extends BasePage{
		public LoginPage(WebDriver driver)
	{
		super(driver);
		driver.findElement(By.xpath(".//*[@id='loginButton']")).click();
	}
	
		public String invalidLogin(String usrName,String pwd)
	{
		String error = null;
		driver.manage().window().maximize();;
		driver.findElement(By.id("usrName")).sendKeys(usrName);
		driver.findElement(By.name("pass")).sendKeys(pwd);
		driver.findElement(By.id("u_0_x")).click();
		
		error = driver.findElement(By.cssSelector("login-eror")).getText();
		return error;
	}

}
