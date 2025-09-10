package tests;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {
	@Test
	public void validLogin() {
		
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUserName("lalchand.rupali@salesforce.com");
		lp.enterPassword("Lalchand@123");
		lp.clickLogin();
		
		System.out.println("Title of Page is " + driver.getTitle());
		Assert.assertEquals(driver.getTitle(),"Login | Salesforce");
	}
}
