package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AppLauncherPage {

private WebDriver driver;
	
	private By applauncherIcon = By.xpath("//button[@title='App Launcher']");
	private By salesConsole = By.xpath("//p[text()='Sales Console']");
	
	public AppLauncherPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void openSalesConsole() {
		
		driver.findElement(applauncherIcon).click();
		driver.findElement(salesConsole).click();
	}
	
}
