package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.AppLauncherPage;

public class AppLauncherTest extends BaseTest {

	@Test
	public void openSalesConsole() throws InterruptedException {
		
		AppLauncherPage al = new AppLauncherPage(driver);
		Thread.sleep(10000);
		al.openSalesConsole();
		
		System.out.println("Title of Sales Console is " + driver.getTitle());
		//Test PR
	}
}
