package com.base;

import org.openqa.selenium.WebDriver;


public abstract class BasePage {
       public WebDriver driver;
		public BasePage(WebDriver driver)
	{
		this.driver = driver();
	}
		private WebDriver driver() {
			// TODO Auto-generated method stub
			return null;
		}
}

