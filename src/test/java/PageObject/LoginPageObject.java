package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObject
{
	private WebDriver driver;
	
	public LoginPageObject(WebDriver Driver) 
	{
		this.driver = Driver;
	}
	
	By UsernameInput = By.id("user-name");
	By PasswordInput = By.id("password");
	By LoginButton = By.id("login-button");

	
	public void EnterUserName(String Username)
	{
		driver.findElement(UsernameInput).sendKeys(Username);
	}
	public void EnterPassword(String Password)
	{
		driver.findElement(PasswordInput).sendKeys(Password);
	}
	public void ClickLoginButton()
	{
		driver.findElement(LoginButton).click();
	}
	public void Login(String Username,String Password)
	{
		driver.findElement(UsernameInput).sendKeys(Username);
		driver.findElement(PasswordInput).sendKeys(Password);
		driver.findElement(LoginButton).click();
		
	}
}
