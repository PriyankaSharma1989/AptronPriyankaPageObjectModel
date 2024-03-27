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
import PageObject.CheckoutOverviewPageObject;
import PageObject.HomePageObject;
import PageObject.LoginPageObject;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckOutOverviewTestCase 
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
	public void CheckOutOverviewTestCase1()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		CartPageObject cartpage = new CartPageObject(driver); 
		CheckOutPageObject checkout = new CheckOutPageObject(driver);
		CheckoutOverviewPageObject checkoutoverview = new CheckoutOverviewPageObject(driver);
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
	}
	
	@Test
	public void CheckOutOverviewTestCase2()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		CartPageObject cartpage = new CartPageObject(driver); 
		CheckOutPageObject checkout = new CheckOutPageObject(driver);
		CheckoutOverviewPageObject checkoutoverview = new CheckoutOverviewPageObject(driver);
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
        String ActualPriceSaucelabsbacklight = driver.findElement(By.cssSelector("div.page_wrapper div.checkout_summary_container div.cart_list div.cart_item:nth-child(4) div.cart_item_label div.item_pricebar:nth-child(3) > div.inventory_item_price")).getText();
        String ExpectedPriceSaucelabsbacklight = "$9.99";
        Assert.assertEquals(ActualPriceSaucelabsbacklight , ExpectedPriceSaucelabsbacklight);
        Thread.sleep(1000);
        }
	
	@Test
	public void CheckOutOverviewTestCase3()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		CartPageObject cartpage = new CartPageObject(driver); 
		CheckOutPageObject checkout = new CheckOutPageObject(driver);
		CheckoutOverviewPageObject checkoutoverview = new CheckoutOverviewPageObject(driver);
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
		String ActualPriceBoltTshirt = driver.findElement(By.cssSelector("div.page_wrapper div.checkout_summary_container div.cart_list div.cart_item:nth-child(5) div.cart_item_label div.item_pricebar:nth-child(3) > div.inventory_item_price")).getText();
        String ExpectedPriceBoltTshirt = "$15.99";
        Assert.assertEquals(ActualPriceBoltTshirt , ExpectedPriceBoltTshirt);
        Thread.sleep(1000);
	}
	
	@Test
	public void CheckOutOverviewTestCase4()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		CartPageObject cartpage = new CartPageObject(driver); 
		CheckOutPageObject checkout = new CheckOutPageObject(driver);
		CheckoutOverviewPageObject checkoutoverview = new CheckoutOverviewPageObject(driver);
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
		 String ActualPriceFleeceJacket = driver.findElement(By.cssSelector("div.page_wrapper div.checkout_summary_container div.cart_list div.cart_item:nth-child(6) div.cart_item_label div.item_pricebar:nth-child(3) > div.inventory_item_price")).getText();
         String ExpectedPriceFleeceJacket = "$49.99";
         Assert.assertEquals(ActualPriceFleeceJacket , ExpectedPriceFleeceJacket);
         Thread.sleep(1000);
	}
	
	@Test
	public void CheckOutOverviewTestCase5()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		CartPageObject cartpage = new CartPageObject(driver); 
		CheckOutPageObject checkout = new CheckOutPageObject(driver);
		CheckoutOverviewPageObject checkoutoverview = new CheckoutOverviewPageObject(driver);
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
		String ActualPriceOnesie = driver.findElement(By.cssSelector("div.page_wrapper div.checkout_summary_container div.cart_list div.cart_item:nth-child(7) div.cart_item_label div.item_pricebar:nth-child(3) > div.inventory_item_price")).getText();
        String ExpectedPriceOnesie = "$7.99";
        Assert.assertEquals(ActualPriceOnesie , ExpectedPriceOnesie);
        Thread.sleep(1000);
        
	}
	
	@Test
	public void CheckOutOverviewTestCase6()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		CartPageObject cartpage = new CartPageObject(driver); 
		CheckOutPageObject checkout = new CheckOutPageObject(driver);
		CheckoutOverviewPageObject checkoutoverview = new CheckoutOverviewPageObject(driver);
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
		String ActualPriceSaucelabsbackpack = driver.findElement(By.cssSelector("div.page_wrapper div.checkout_summary_container div.cart_list div.cart_item:nth-child(3) div.cart_item_label div.item_pricebar:nth-child(3) > div.inventory_item_price")).getText();
        String ExpectedPriceSaucelabsbackpack = "$29.99";
        Assert.assertEquals(ActualPriceSaucelabsbackpack , ExpectedPriceSaucelabsbackpack);
        Thread.sleep(1000);
        
	}
	
	@Test
	public void CheckOutOverviewTestCase7()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		CartPageObject cartpage = new CartPageObject(driver); 
		CheckOutPageObject checkout = new CheckOutPageObject(driver);
		CheckoutOverviewPageObject checkoutoverview = new CheckoutOverviewPageObject(driver);
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
        String ActualPriceRedTshirt = driver.findElement(By.cssSelector("div.page_wrapper div.checkout_summary_container div.cart_list div.cart_item:nth-child(8) div.cart_item_label div.item_pricebar:nth-child(3) > div.inventory_item_price")).getText();
        String ExpectedPriceRedTshirt = "$15.99";
        Assert.assertEquals(ActualPriceRedTshirt ,ExpectedPriceRedTshirt );
        Thread.sleep(1000);
        
	}
	
	@Test
	public void CheckOutOverviewTestCase8()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		CartPageObject cartpage = new CartPageObject(driver); 
		CheckOutPageObject checkout = new CheckOutPageObject(driver);
		CheckoutOverviewPageObject checkoutoverview = new CheckoutOverviewPageObject(driver);
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
		 String ActualTotalItemPrice = driver.findElement(By.cssSelector("div.page_wrapper div:nth-child(1) div.checkout_summary_container div:nth-child(1) div.summary_info > div.summary_subtotal_label:nth-child(6)")).getText();
         String ExpectedTotalItemPrice = "Item total: $129.94";
         Assert.assertEquals(ActualTotalItemPrice ,ExpectedTotalItemPrice );
         Thread.sleep(1000);
         
	}
	
	@Test
	public void CheckOutOverviewTestCase9()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		CartPageObject cartpage = new CartPageObject(driver); 
		CheckOutPageObject checkout = new CheckOutPageObject(driver);
		CheckoutOverviewPageObject checkoutoverview = new CheckoutOverviewPageObject(driver);
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
		 String ActualTaxPrice = driver.findElement(By.cssSelector("div.page_wrapper div:nth-child(1) div.checkout_summary_container div:nth-child(1) div.summary_info > div.summary_tax_label:nth-child(7)")).getText();
         String ExpectedTaxPrice = "Tax: $10.40";
         Assert.assertEquals(ActualTaxPrice ,ExpectedTaxPrice );
         Thread.sleep(1000);
         
	}
	
	@Test
	public void CheckOutOverviewTestCase10()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		CartPageObject cartpage = new CartPageObject(driver); 
		CheckOutPageObject checkout = new CheckOutPageObject(driver);
		CheckoutOverviewPageObject checkoutoverview = new CheckoutOverviewPageObject(driver);
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
		 String ActualTotalPrice = driver.findElement(By.cssSelector("div.page_wrapper div:nth-child(1) div.checkout_summary_container div:nth-child(1) div.summary_info > div.summary_info_label.summary_total_label:nth-child(8)")).getText();
         String ExpectedTotalPrice = "Total: $140.34";
         Assert.assertEquals(ActualTotalPrice ,ExpectedTotalPrice );
         Thread.sleep(1000);
         
	}
	@Test
	public void CheckOutOverviewTestCase11()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		CartPageObject cartpage = new CartPageObject(driver); 
		CheckOutPageObject checkout = new CheckOutPageObject(driver);
		CheckoutOverviewPageObject checkoutoverview = new CheckoutOverviewPageObject(driver);
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
		checkoutoverview.ClickCancelButton();
		Thread.sleep(1000);
	}
	@AfterMethod
	public void TearDown()
	{
		 driver.quit();
	}
	
	 


}
