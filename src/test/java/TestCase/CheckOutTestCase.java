package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.CartPageObject;
import PageObject.CheckOutPageObject;
import PageObject.HomePageObject;
import PageObject.LoginPageObject;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckOutTestCase 
{
WebDriver driver;
	
	@BeforeMethod
	public void Setup() 
	{
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
		
	}
	@Test
	public void CheckOutTestCase1()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		CartPageObject cartpage = new CartPageObject(driver); 
		CheckOutPageObject checkout = new CheckOutPageObject(driver);
		loginpageobject.Login("standard_user", "secret_sauce");
		Thread.sleep(1000);
		homepage.ClickAddToCartButton1();
		homepage.ClickAddToCartButton2();
		homepage.ClickAddToCartButton3();
		homepage.ClickAddToCartButton4();
		homepage.ClickAddToCartButton5();
		homepage.ClickAddToCartButton6();
		homepage.ClickShoppingCartContainer();
		cartpage.ClickRemoveButton1();
		cartpage.ClickRemoveButton2();
		cartpage.ClickRemoveButton3();
		cartpage.ClickRemoveButton4();
		cartpage.ClickRemoveButton5();
		cartpage.ClickRemoveButton6();
		cartpage.ClickCheckoutButton();
		checkout.EnterFirstName("standard");
		checkout.EnterLastName("user");
		checkout.EnterPostalCode("12345");
		checkout.ClickContinueButton();
		Thread.sleep(1000);
		
		
		}
	@Test
	public void CheckOutTestCase2()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		CartPageObject cartpage = new CartPageObject(driver); 
		CheckOutPageObject checkout = new CheckOutPageObject(driver);
		loginpageobject.Login("standard_user", "secret_sauce");
		Thread.sleep(1000);
		homepage.ClickAddToCartButton1();
		homepage.ClickAddToCartButton2();
		homepage.ClickAddToCartButton3();
		homepage.ClickAddToCartButton4();
		homepage.ClickAddToCartButton5();
		homepage.ClickAddToCartButton6();
		homepage.ClickShoppingCartContainer();
		cartpage.ClickRemoveButton1();
		cartpage.ClickRemoveButton2();
		cartpage.ClickRemoveButton3();
		cartpage.ClickRemoveButton4();
		cartpage.ClickRemoveButton5();
		cartpage.ClickRemoveButton6();
		cartpage.ClickCheckoutButton();
		checkout.EnterFirstName("standard");
		checkout.EnterLastName("user");
		checkout.EnterPostalCode("12345");
		checkout.ClickCancelButton();
		Thread.sleep(1000);
		
		
		}
	@Test
	public void CheckOutTestCase3()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		CartPageObject cartpage = new CartPageObject(driver); 
		CheckOutPageObject checkout = new CheckOutPageObject(driver);
		loginpageobject.Login("standard_user", "secret_sauce");
		Thread.sleep(1000);
		homepage.ClickAddToCartButton1();
		homepage.ClickAddToCartButton2();
		homepage.ClickAddToCartButton3();
		homepage.ClickAddToCartButton4();
		homepage.ClickAddToCartButton5();
		homepage.ClickAddToCartButton6();
		homepage.ClickShoppingCartContainer();
		cartpage.ClickRemoveButton1();
		cartpage.ClickRemoveButton2();
		cartpage.ClickRemoveButton3();
		cartpage.ClickRemoveButton4();
		cartpage.ClickRemoveButton5();
		cartpage.ClickRemoveButton6();
		cartpage.ClickCheckoutButton();
		checkout.EnterFirstName("");
		checkout.EnterLastName("");
		checkout.EnterPostalCode("");
		checkout.ClickContinueButton();
		Thread.sleep(1000);
		String ActualErrorMessage = driver.findElement(By.tagName("h3")).getText();
	     String ExpectedErrorMessage = "Error: First Name is required";
	     Assert.assertEquals(ActualErrorMessage, ExpectedErrorMessage);
	     Thread.sleep(1000);
	}
	@AfterMethod
    public void TearDown()
    {
   	 driver.quit();
    }
		
		
		

}
