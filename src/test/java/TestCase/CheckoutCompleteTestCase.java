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
import PageObject.CheckoutCompletePageObject;
import PageObject.CheckoutOverviewPageObject;
import PageObject.HomePageObject;
import PageObject.LoginPageObject;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckoutCompleteTestCase 
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
	public void CheckOutCompleteTestCase1()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		CartPageObject cartpage = new CartPageObject(driver); 
		CheckOutPageObject checkout = new CheckOutPageObject(driver);
		CheckoutOverviewPageObject checkoutoverview = new CheckoutOverviewPageObject(driver);
		CheckoutCompletePageObject checkoutcomplete = new CheckoutCompletePageObject(driver);
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
		checkoutoverview.ClickFinishButton();
		checkoutcomplete.ClickBackButton();
		Thread.sleep(1000);
	}
	@Test
	public void CheckOutCompleteTestCase2()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		CartPageObject cartpage = new CartPageObject(driver); 
		CheckOutPageObject checkout = new CheckOutPageObject(driver);
		CheckoutOverviewPageObject checkoutoverview = new CheckoutOverviewPageObject(driver);
		CheckoutCompletePageObject checkoutcomplete = new CheckoutCompletePageObject(driver);
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
		checkoutoverview.ClickFinishButton();
		Thread.sleep(1000);
		String ActualErrorMessage = driver.findElement(By.xpath("//h2[contains(text(),'Thank you for your order!')]")).getText();
	     String ExpectedErrorMessage = "Thank you for your order!";
	     Assert.assertEquals(ActualErrorMessage, ExpectedErrorMessage);
	     Thread.sleep(1000);
	
	}
	@AfterMethod
	public void TearDown()
	{
		 driver.quit();
	}
	


}
