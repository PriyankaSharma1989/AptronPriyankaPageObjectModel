package PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class HomePageObject 
{
private WebDriver driver;
	
	public HomePageObject(WebDriver Driver) 
	{
		this.driver = Driver;
	}
	
	By AddToCartButton1 = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	By AddToCartButton2 = By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");
	By AddToCartButton3 = By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']");
	By AddToCartButton4 = By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']");
	By AddToCartButton5 = By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']");
	By AddToCartButton6 = By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']");
	By DropdownButtonOption1 = By.xpath("//option[contains(text(),'Name (A to Z)')]");
	By DropdownButtonOption2 = By.xpath("//option[contains(text(),'Name (Z to A)')]");
	By DropdownButtonOption3 = By.xpath("//option[contains(text(),'Price (low to high)')]");
	By DropdownButtonOption4 = By.xpath("//option[contains(text(),'Price (high to low)')]");
	By ShoppingCartContainer = By.xpath("//div[@id='shopping_cart_container']");
	By SideMenuButton = By.xpath("//button[@id='react-burger-menu-btn']");
	By AboutSideBarLink = By.xpath("//a[@id='about_sidebar_link']");
	By LogoutSideBarLink = By.xpath("//a[@id='logout_sidebar_link']");
			
			
			
			
			
	public void ClickAddToCartButton1()
	{
		driver.findElement(AddToCartButton1).click();
	}
	public void ClickAddToCartButton2()
	{
		driver.findElement(AddToCartButton2).click();
	}
	public void ClickAddToCartButton3()
	{
		driver.findElement(AddToCartButton3).click();
	}
	public void ClickAddToCartButton4()
	{
		driver.findElement(AddToCartButton4).click();
	}
	public void ClickAddToCartButton5()
	{
		driver.findElement(AddToCartButton5).click();
	}
	public void ClickAddToCartButton6()
	{
		driver.findElement(AddToCartButton6).click();
	}
	public void DropdownButtonOption1()
	{
		Select dropdown = new Select(driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[2]/div[1]/span[1]/select[1]")));
	    dropdown.selectByVisibleText("Name (A to Z)");

      }
	public void DropdownButtonOption2()
	{
		Select dropdown = new Select(driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[2]/div[1]/span[1]/select[1]")));
		dropdown.selectByVisibleText("Name (Z to A)");
      }
	public void DropdownButtonOption3()
	{
		Select dropdown = new Select(driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[2]/div[1]/span[1]/select[1]")));
		dropdown.selectByVisibleText("Price (low to high)");
	}
	public void DropdownButtonOption4()
	{
		Select dropdown = new Select(driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[2]/div[1]/span[1]/select[1]")));
		dropdown.selectByVisibleText("Price (high to low)");
	}
	public void ClickShoppingCartContainer()
	{
		driver.findElement(ShoppingCartContainer).click();
	}
	public void ClickSideMenuButton ()
	{
		driver.findElement(SideMenuButton).click();
	}
	public void ClickAboutSideBarLink ()
	{
		driver.findElement(AboutSideBarLink).click();
	}

	public void ClickLogoutSideBarLink ()
	{
		driver.findElement(LogoutSideBarLink).click();
	}



}
