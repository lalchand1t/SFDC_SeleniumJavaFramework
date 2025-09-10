package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

	protected WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		
		// Add the argument to disable notifications
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");	
	}
	
	@AfterSuite
	public void tearDown() {
		
		if(driver!=null) {
			driver.quit();
		}
	}
}
