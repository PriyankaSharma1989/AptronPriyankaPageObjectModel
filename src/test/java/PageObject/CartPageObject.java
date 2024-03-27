package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPageObject 
{
private WebDriver driver;
	
	public CartPageObject (WebDriver Driver) 
	{
		this.driver = Driver;
	}
	
	By RemoveButton1 = By.xpath("//button[@id='remove-sauce-labs-backpack']");
	By RemoveButton2 = By.xpath("//button[@id='remove-sauce-labs-bike-light']");
	By RemoveButton3 = By.xpath("//button[@id='remove-sauce-labs-bolt-t-shirt']");
	By RemoveButton4 = By.xpath("//button[@id='remove-sauce-labs-fleece-jacket']");
	By RemoveButton5 = By.xpath("//button[@id='remove-sauce-labs-onesie']");
	By RemoveButton6 = By.xpath("//button[@id='remove-test.allthethings()-t-shirt-(red)']");
	By SauceLabsBikeLightLink = By.xpath("//a[@id='item_0_title_link']");
	By SauceLabsBoltTShirtLink = By.xpath("//a[@id='item_1_title_link']");
	By SauceLabsOnesieLink = By.xpath("//a[@id='item_2_title_link']");
	By TShirtRedLink = By.xpath("//a[@id='item_3_title_link']");
	By SauceLabsBackpackLink = By.xpath("//a[@id='item_4_title_link']");
	By SauceLabsFleeceJacket = By.xpath("//a[@id='item_5_title_link']");
	By BackToProductsButton  = By.xpath("//button[@id='back-to-products']");
	By CheckoutButton   = By.xpath("//button[@id='checkout']");
	By ContinueShoppingButton = By.xpath("//button[@id='continue-shopping']");
	
	
	public void ClickRemoveButton1()
	{
		driver.findElement(RemoveButton1).click();
	}
	public void ClickRemoveButton2()
	{
		driver.findElement(RemoveButton2).click();
	}
	public void ClickRemoveButton3()
	{
		driver.findElement(RemoveButton3).click();
	}
	public void ClickRemoveButton4()
	{
		driver.findElement(RemoveButton4).click();
	}
	public void ClickRemoveButton5()
	{
		driver.findElement(RemoveButton5).click();
	}
	public void ClickRemoveButton6()
	{
		driver.findElement(RemoveButton6).click();
	}
	public void ClickSauceLabsBikeLightLink()
	{
		driver.findElement(SauceLabsBikeLightLink).click();
	}
	public void ClickSauceLabsBoltTShirtLink()
	{
		driver.findElement(SauceLabsBoltTShirtLink).click();
	}
	public void ClickSauceLabsOnesieLink()
	{
		driver.findElement(SauceLabsOnesieLink).click();
	}
	public void ClickTShirtRedLink()
	{
		driver.findElement(TShirtRedLink).click();
	}
	public void ClickSauceLabsBackpackLink()
	{
		driver.findElement(SauceLabsBackpackLink).click();
	}
	public void ClickSauceLabsFleeceJacket()
	{
		driver.findElement(SauceLabsFleeceJacket).click();
	}
	public void ClickBackToProductsButton()
	{
		driver.findElement(BackToProductsButton).click();
	}
	public void ClickCheckoutButton()
	{
		driver.findElement(CheckoutButton).click();
	}
	public void ClickBackContinueShoppingButton()
	{
		driver.findElement(ContinueShoppingButton).click();
	}


}
