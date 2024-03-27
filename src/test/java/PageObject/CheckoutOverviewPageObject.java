package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPageObject 
{
private WebDriver driver;
	
	public  CheckoutOverviewPageObject (WebDriver Driver) 
	{
		this.driver = Driver;
	}
	
	By FinishButton = By.id("finish");
	By CancelButton = By.id("cancel");
	
	
	public void ClickFinishButton()
	{
		driver.findElement(FinishButton).click();
	}
	public void ClickCancelButton()
	{
		driver.findElement(CancelButton).click();
	}
	
	
}
