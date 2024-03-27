package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.CartPageObject;
import PageObject.HomePageObject;
import PageObject.LoginPageObject;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CartTestCase 
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
	public void CartTestCase1()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		CartPageObject cartpage = new CartPageObject(driver); 
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
		Thread.sleep(1000);
		}
	@Test
	public void CartTestCase2()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		CartPageObject cartpage = new CartPageObject(driver); 
		loginpageobject.Login("standard_user", "secret_sauce");
		Thread.sleep(1000);
		homepage.ClickAddToCartButton1();
		homepage.ClickAddToCartButton2();
		homepage.ClickAddToCartButton3();
		homepage.ClickAddToCartButton4();
		homepage.ClickAddToCartButton5();
		homepage.ClickAddToCartButton6();
		homepage.ClickShoppingCartContainer();
		cartpage.ClickRemoveButton2();
		Thread.sleep(1000);
		}
	@Test
	public void CartTestCase3()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		CartPageObject cartpage = new CartPageObject(driver); 
		loginpageobject.Login("standard_user", "secret_sauce");
		Thread.sleep(1000);
		homepage.ClickAddToCartButton1();
		homepage.ClickAddToCartButton2();
		homepage.ClickAddToCartButton3();
		homepage.ClickAddToCartButton4();
		homepage.ClickAddToCartButton5();
		homepage.ClickAddToCartButton6();
		homepage.ClickShoppingCartContainer();
		cartpage.ClickRemoveButton3();
		Thread.sleep(1000);
		}
	@Test
	public void CartTestCase4()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		CartPageObject cartpage = new CartPageObject(driver); 
		loginpageobject.Login("standard_user", "secret_sauce");
		Thread.sleep(1000);
		homepage.ClickAddToCartButton1();
		homepage.ClickAddToCartButton2();
		homepage.ClickAddToCartButton3();
		homepage.ClickAddToCartButton4();
		homepage.ClickAddToCartButton5();
		homepage.ClickAddToCartButton6();
		homepage.ClickShoppingCartContainer();
		cartpage.ClickRemoveButton4();
		Thread.sleep(1000);
		}
	@Test
	public void CartTestCase5()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		CartPageObject cartpage = new CartPageObject(driver); 
		loginpageobject.Login("standard_user", "secret_sauce");
		Thread.sleep(1000);
		homepage.ClickAddToCartButton1();
		homepage.ClickAddToCartButton2();
		homepage.ClickAddToCartButton3();
		homepage.ClickAddToCartButton4();
		homepage.ClickAddToCartButton5();
		homepage.ClickAddToCartButton6();
		homepage.ClickShoppingCartContainer();
		cartpage.ClickRemoveButton5();
		Thread.sleep(1000);
		}
	@Test
	public void CartTestCase6()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		CartPageObject cartpage = new CartPageObject(driver); 
		loginpageobject.Login("standard_user", "secret_sauce");
		Thread.sleep(1000);
		homepage.ClickAddToCartButton1();
		homepage.ClickAddToCartButton2();
		homepage.ClickAddToCartButton3();
		homepage.ClickAddToCartButton4();
		homepage.ClickAddToCartButton5();
		homepage.ClickAddToCartButton6();
		homepage.ClickShoppingCartContainer();
		cartpage.ClickRemoveButton6();
		Thread.sleep(1000);
		}
	@Test
	public void CartTestCase7()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		CartPageObject cartpage = new CartPageObject(driver); 
		loginpageobject.Login("standard_user", "secret_sauce");
		Thread.sleep(1000);
		homepage.ClickAddToCartButton1();
		homepage.ClickAddToCartButton2();
		homepage.ClickAddToCartButton3();
		homepage.ClickAddToCartButton4();
		homepage.ClickAddToCartButton5();
		homepage.ClickAddToCartButton6();
		homepage.ClickShoppingCartContainer();
		cartpage.ClickSauceLabsBikeLightLink();
		cartpage.ClickBackToProductsButton();
		Thread.sleep(1000);
		}
	@Test
	public void CartTestCase8()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		CartPageObject cartpage = new CartPageObject(driver); 
		loginpageobject.Login("standard_user", "secret_sauce");
		Thread.sleep(1000);
		homepage.ClickAddToCartButton1();
		homepage.ClickAddToCartButton2();
		homepage.ClickAddToCartButton3();
		homepage.ClickAddToCartButton4();
		homepage.ClickAddToCartButton5();
		homepage.ClickAddToCartButton6();
		homepage.ClickShoppingCartContainer();
		cartpage.ClickSauceLabsBoltTShirtLink();
		cartpage.ClickBackToProductsButton();
		Thread.sleep(1000);
		}
	@Test
	public void CartTestCase9()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		CartPageObject cartpage = new CartPageObject(driver); 
		loginpageobject.Login("standard_user", "secret_sauce");
		Thread.sleep(1000);
		homepage.ClickAddToCartButton1();
		homepage.ClickAddToCartButton2();
		homepage.ClickAddToCartButton3();
		homepage.ClickAddToCartButton4();
		homepage.ClickAddToCartButton5();
		homepage.ClickAddToCartButton6();
		homepage.ClickShoppingCartContainer();
		cartpage.ClickSauceLabsOnesieLink();
		cartpage.ClickBackToProductsButton();
		Thread.sleep(1000);
		}
	@Test
	public void CartTestCase10()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		CartPageObject cartpage = new CartPageObject(driver); 
		loginpageobject.Login("standard_user", "secret_sauce");
		Thread.sleep(1000);
		homepage.ClickAddToCartButton1();
		homepage.ClickAddToCartButton2();
		homepage.ClickAddToCartButton3();
		homepage.ClickAddToCartButton4();
		homepage.ClickAddToCartButton5();
		homepage.ClickAddToCartButton6();
		homepage.ClickShoppingCartContainer();
		cartpage.ClickTShirtRedLink();
		cartpage.ClickBackToProductsButton();
		Thread.sleep(1000);
		}
	@Test
	public void CartTestCase11()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		CartPageObject cartpage = new CartPageObject(driver); 
		loginpageobject.Login("standard_user", "secret_sauce");
		Thread.sleep(1000);
		homepage.ClickAddToCartButton1();
		homepage.ClickAddToCartButton2();
		homepage.ClickAddToCartButton3();
		homepage.ClickAddToCartButton4();
		homepage.ClickAddToCartButton5();
		homepage.ClickAddToCartButton6();
		homepage.ClickShoppingCartContainer();
		cartpage.ClickSauceLabsFleeceJacket();
		cartpage.ClickBackToProductsButton();
		Thread.sleep(1000);
		}
	@Test
	public void CartTestCase12()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		CartPageObject cartpage = new CartPageObject(driver); 
		loginpageobject.Login("standard_user", "secret_sauce");
		Thread.sleep(1000);
		homepage.ClickAddToCartButton1();
		homepage.ClickAddToCartButton2();
		homepage.ClickAddToCartButton3();
		homepage.ClickAddToCartButton4();
		homepage.ClickAddToCartButton5();
		homepage.ClickAddToCartButton6();
		homepage.ClickShoppingCartContainer();
		cartpage.ClickSauceLabsBackpackLink();
		cartpage.ClickBackToProductsButton();
		Thread.sleep(1000);
		}
	@Test
	public void CartTestCase13()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		CartPageObject cartpage = new CartPageObject(driver); 
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
		Thread.sleep(1000);
	}
	@Test
	public void CartTestCase14()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		CartPageObject cartpage = new CartPageObject(driver); 
		loginpageobject.Login("standard_user", "secret_sauce");
		Thread.sleep(1000);
		homepage.ClickAddToCartButton1();
		homepage.ClickAddToCartButton2();
		homepage.ClickAddToCartButton3();
		homepage.ClickAddToCartButton4();
		homepage.ClickAddToCartButton5();
		homepage.ClickAddToCartButton6();
		homepage.ClickShoppingCartContainer();
		cartpage.ClickBackContinueShoppingButton();
		Thread.sleep(1000);
	}
	
	
}
