package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	private By usernameTextBox = By.id("username");
	private By passwordTextBox = By.id("password");
	private By loginButton = By.id("Login");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUserName(String username) {
		
		driver.findElement(usernameTextBox).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		
		driver.findElement(passwordTextBox).sendKeys(password);
	}
	
	public void clickLogin() {
		
		driver.findElement(loginButton).click();
	}

}
