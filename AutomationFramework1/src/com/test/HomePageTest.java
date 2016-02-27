package com.test;

	import static org.testng.AssertJUnit.assertEquals;
	import org.junit.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
	import com.base.BaseTest;
	import com.page.HomePage;

	public class HomePageTest extends BaseTest{
		HomePage hp;
		
		@BeforeClass
		public void initialize()
		{
			hp = new HomePage(driver);
		}
		
		@Test
		public void testLoginClick()
		{
			String actual = hp.clickLogin();
			assertEquals("http://www.whiteboxqa.com/login.php", actual);
			driver.manage().window().maximize();
		}
		
		@AfterClass
		public void quit()
		{
			driver.quit();
		}
	}

