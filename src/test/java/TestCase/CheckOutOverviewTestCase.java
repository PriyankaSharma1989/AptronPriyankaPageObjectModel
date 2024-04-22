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
		cartpage.ClickCheckoutButton();
		checkout.EnterFirstName("standard");
		checkout.EnterLastName("user");
		checkout.EnterPostalCode("12345");
		checkout.ClickContinueButton();
        String ActualPriceSaucelabsbacklight = driver.findElement(By.xpath("//div[@class='cart_list']//div[@class='cart_item'][1]")).getText();
        String ExpectedPriceSaucelabsbacklight = "$9.99";
        Assert.assertEquals(ActualPriceSaucelabsbacklight , ExpectedPriceSaucelabsbacklight);
        checkoutoverview.ClickFinishButton();
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
		cartpage.ClickCheckoutButton();
		checkout.EnterFirstName("standard");
		checkout.EnterLastName("user");
		checkout.EnterPostalCode("12345");
		checkout.ClickContinueButton();
		String ActualPriceBoltTshirt = driver.findElement(By.xpath("//div[@class='cart_list']//div[@class='cart_item'][2]")).getText();
        String ExpectedPriceBoltTshirt = "$15.99";
        Assert.assertEquals(ActualPriceBoltTshirt , ExpectedPriceBoltTshirt);
        checkoutoverview.ClickFinishButton();
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
		cartpage.ClickCheckoutButton();
		checkout.EnterFirstName("standard");
		checkout.EnterLastName("user");
		checkout.EnterPostalCode("12345");
		checkout.ClickContinueButton();
		 String ActualPriceFleeceJacket = driver.findElement(By.xpath("//div[@class='cart_list']//div[@class='cart_item'][3]")).getText();
         String ExpectedPriceFleeceJacket = "$49.99";
         Assert.assertEquals(ActualPriceFleeceJacket , ExpectedPriceFleeceJacket);
         checkoutoverview.ClickFinishButton();
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
		cartpage.ClickCheckoutButton();
		checkout.EnterFirstName("standard");
		checkout.EnterLastName("user");
		checkout.EnterPostalCode("12345");
		checkout.ClickContinueButton();
		String ActualPriceOnesie = driver.findElement(By.xpath("//div[@class='cart_list']//div[@class='cart_item'][4]")).getText();
        String ExpectedPriceOnesie = "$7.99";
        Assert.assertEquals(ActualPriceOnesie , ExpectedPriceOnesie);
        checkoutoverview.ClickFinishButton();
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
		cartpage.ClickCheckoutButton();
		checkout.EnterFirstName("standard");
		checkout.EnterLastName("user");
		checkout.EnterPostalCode("12345");
		checkout.ClickContinueButton();
		String ActualPriceSaucelabsbackpack = driver.findElement(By.xpath("//div[@class='cart_list']//div[@class='cart_item'][5]")).getText();
        String ExpectedPriceSaucelabsbackpack = "$29.99";
        Assert.assertEquals(ActualPriceSaucelabsbackpack , ExpectedPriceSaucelabsbackpack);
        checkoutoverview.ClickFinishButton();
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
		cartpage.ClickCheckoutButton();
		checkout.EnterFirstName("standard");
		checkout.EnterLastName("user");
		checkout.EnterPostalCode("12345");
		checkout.ClickContinueButton();
        String ActualPriceRedTshirt = driver.findElement(By.xpath(" //div[@class='cart_list']//div[@class='cart_item'][6]")).getText();
        String ExpectedPriceRedTshirt = "$15.99";
        Assert.assertEquals(ActualPriceRedTshirt ,ExpectedPriceRedTshirt );
        checkoutoverview.ClickFinishButton();
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
		cartpage.ClickCheckoutButton();
		checkout.EnterFirstName("standard");
		checkout.EnterLastName("user");
		checkout.EnterPostalCode("12345");
		checkout.ClickContinueButton();
		 String ActualTotalItemPrice = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']")).getText();
         String ExpectedTotalItemPrice = "Item total: $129.94";
         Assert.assertEquals(ActualTotalItemPrice ,ExpectedTotalItemPrice );
         checkoutoverview.ClickFinishButton();
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
		cartpage.ClickCheckoutButton();
		checkout.EnterFirstName("standard");
		checkout.EnterLastName("user");
		checkout.EnterPostalCode("12345");
		checkout.ClickContinueButton();
		 String ActualTaxPrice = driver.findElement(By.xpath("//div[@class='summary_tax_label']")).getText();
         String ExpectedTaxPrice = "Tax: $10.40";
         Assert.assertEquals(ActualTaxPrice ,ExpectedTaxPrice );
         checkoutoverview.ClickFinishButton();
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
		cartpage.ClickCheckoutButton();
		checkout.EnterFirstName("standard");
		checkout.EnterLastName("user");
		checkout.EnterPostalCode("12345");
		checkout.ClickContinueButton();
		 String ActualTotalPrice = driver.findElement(By.xpath("//div[@class='summary_total_label']")).getText();
         String ExpectedTotalPrice = "Total: $140.34";
         Assert.assertEquals(ActualTotalPrice ,ExpectedTotalPrice );
         checkoutoverview.ClickFinishButton();
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
