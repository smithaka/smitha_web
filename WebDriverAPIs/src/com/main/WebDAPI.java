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
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebDAPI {
	
	public static void Pageopen() {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		driver.quit();
	}
	
static void ImpWaitEX() {
	
	WebDriver driver = new FirefoxDriver();
	driver.get("http://whiteboxqa.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	WebElement element = driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul/li[3]/a"));
	element.click();
	driver.quit();
}

static void ExplWaitEX()  {
	
	WebDriver driver = new FirefoxDriver();
	driver.get("http://whiteboxqa.com/");
	driver.manage().window().maximize();
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement element = driver.findElement(By.xpath(".//*[@id='navbar-collapse']/ul/li[3]/a"));
	element.click();
	driver.quit();
	}
static void ScreenShotEx() {
	
	WebDriver driver = new FirefoxDriver();
	driver.get("https://facebook.com/");
	driver.manage().window().maximize();
	File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	if(file.exists())
	{
      System.out.println(file.getAbsolutePath());	
      try {
		FileUtils.copyFile(file, new File("C:\\Users\\surekha\\Desktop\\screnn2.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      driver.quit();
}
	
}
public static void main(String[] args)
{
	
     //WebDAPI.Pageopen();
	 // WebDAPI.ImpWaitEX();
	//WebDAPI.ExplWaitEX();
      WebDAPI.ScreenShotEx();
}
}
