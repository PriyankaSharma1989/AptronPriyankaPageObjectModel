package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCompletePageObject 
{
private WebDriver driver;
	
	public  CheckoutCompletePageObject (WebDriver Driver) 
	{
		this.driver = Driver;
	}	
	
	By BackButton = By.id("back-to-products");
	
	
	public void ClickBackButton()
	{
		driver.findElement(BackButton).click();
	}

}
