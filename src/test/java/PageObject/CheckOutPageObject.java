package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPageObject 
{
private WebDriver driver;
	
	public CheckOutPageObject  (WebDriver Driver) 
	{
		this.driver = Driver;
	}
	
	
	By FirstnameInput = By.id("first-name");
	By LastnameInput = By.id("last-name");
	By PostalCodeInput = By.id("postal-code");
	By ContinueButton = By.id("continue");
	By CancelButton = By.id("cancel");
	
	public void EnterFirstName(String Firstname)
	{
		driver.findElement(FirstnameInput).sendKeys(Firstname);
	}
	public void EnterLastName(String Lastname)
	{
		driver.findElement(LastnameInput).sendKeys(Lastname);
	}
	public void EnterPostalCode(String Postalcode)
	{
		driver.findElement(PostalCodeInput).sendKeys(Postalcode);
	}
	
	public void ClickContinueButton()
	{
		driver.findElement(ContinueButton).click();
	}
	
	public void ClickCancelButton()
	{
		driver.findElement( CancelButton).click();
	}
	
	
	
	
}
