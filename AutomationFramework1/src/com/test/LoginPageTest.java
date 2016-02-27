package com.test;

	import org.junit.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
	import static org.testng.AssertJUnit.assertEquals;
	import com.base.BaseTest;
    import com.page.LoginPage;

	
	public class LoginPageTest extends BaseTest {
		
		LoginPage lp;
		
		@BeforeClass
		public void initialize()
		{
			lp = new LoginPage(driver);
		}
		
			
		@Test
		public void testInvalidLogin(String userName,String pwd)
		{
			String actString = lp.invalidLogin("smith.ra@gmail.com","ksdckj");
			assertEquals("Something went wrong...Please try again.",actString);
			
		}
		
		@AfterClass
		public void quit()
		{
			driver.quit();
		}
	}

