package com.main;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage {
	public static void PLP()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Smitha.surekha@gmail.com");
		
		WebElement pwd = driver.findElement(By.name("pass"));
		pwd.sendKeys("smithaka");
		
		WebElement LogButton = driver.findElement(By.id("u_0_x"));
		LogButton.click();
		
		}
	static void waitEx(){
		
	WebDriver driver = new FirefoxDriver();
	driver.get("http://whiteboxqa.com/");
	driver.manage().window().maximize();
	
	//driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
	//WebElement element= driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul/li[3]/a"));

	//WebDriverWait wait = new WebDriverWait(driver,5);
	//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='navbar-collapse']/ul/li[3]/a")));
	
	//element.click();
	driver.quit();
	}
	
	static void ScreenshotEx(){
		WebDriver driver = new FirefoxDriver();
		driver.get("https://facebook.com/");
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		if(file.exists())
		{
			System.out.println(file.getAbsolutePath());
			try {
				FileUtils.copyFile(file,new File("C:\\Users\\surekha\\Desktop\\screnn1.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
			
	}	
	public static void main(String[] args)
	{
		//LoginPage.PLP();
		//LoginPage.waitEx();
		LoginPage.ScreenshotEx();
		
	}

}
