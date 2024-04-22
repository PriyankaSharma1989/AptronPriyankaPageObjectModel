package TestCase;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.HomePageObject;
import PageObject.LoginPageObject;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeTestCase 
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
	public void HomeTestCase1()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		loginpageobject.Login("standard_user", "secret_sauce");
		Thread.sleep(1000);
		 String Actualhomepageheading = driver.findElement(By.xpath("//span[contains(text(),'Products')]")).getText();
         String Expectedhomepageheading = "Products";
         Assert.assertEquals(Actualhomepageheading,Expectedhomepageheading );
         Thread.sleep(1000);
	}
        
	@Test
	public void HomeTestCase2()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		loginpageobject.Login("standard_user", "secret_sauce");
		homepage.ClickAddToCartButton1();
		Thread.sleep(1000);
		}
	@Test
	public void HomeTestCase3()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		loginpageobject.Login("standard_user", "secret_sauce");
		homepage.ClickAddToCartButton2();
		Thread.sleep(1000);
		}
	@Test
	public void HomeTestCase4()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		loginpageobject.Login("standard_user", "secret_sauce");
		homepage.ClickAddToCartButton3();
		Thread.sleep(1000);
		}
	@Test
	public void HomeTestCase5()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		loginpageobject.Login("standard_user", "secret_sauce");
		homepage.ClickAddToCartButton4();
		Thread.sleep(1000);
		}
	@Test
	public void HomeTestCase6()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		loginpageobject.Login("standard_user", "secret_sauce");
		homepage.ClickAddToCartButton5();
		Thread.sleep(1000);
		}
	@Test
	public void HomeTestCase7()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		loginpageobject.Login("standard_user", "secret_sauce");
		homepage.ClickAddToCartButton6();
		Thread.sleep(1000);
		}
	@Test
	public void HomeTestCase8()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		loginpageobject.Login("standard_user", "secret_sauce");
		homepage.DropdownButtonOption1();
		Thread.sleep(1000);
	}
	@Test
	public void HomeTestCase9()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		loginpageobject.Login("standard_user", "secret_sauce");
		homepage.DropdownButtonOption2();
		Thread.sleep(1000);
	}
	@Test
	public void HomeTestCase10()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		loginpageobject.Login("standard_user", "secret_sauce");
		homepage.DropdownButtonOption3();
		Thread.sleep(1000);
	}
	@Test
	public void HomeTestCase11()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		loginpageobject.Login("standard_user", "secret_sauce");
		homepage.DropdownButtonOption4();
		Thread.sleep(1000);
	}
	@Test
	public void HomeTestCase12()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		loginpageobject.Login("standard_user", "secret_sauce");
		homepage.ClickShoppingCartContainer();
		Thread.sleep(1000);
	}
	@Test
	public void HomeTestCase13()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		loginpageobject.Login("standard_user", "secret_sauce");
		homepage.ClickSideMenuButton();
		Thread.sleep(1000);
	}
	@Test
	public void HomeTestCase14()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		loginpageobject.Login("standard_user", "secret_sauce");
	    homepage.ClickSideMenuButton();
		Thread.sleep(2000);
		homepage.ClickAboutSideBarLink();
		
	}
	@Test
	public void HomeTestCase15()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		HomePageObject homepage = new HomePageObject(driver);
		loginpageobject.Login("standard_user", "secret_sauce");
		homepage.ClickSideMenuButton();
		Thread.sleep(2000);
		homepage.ClickLogoutSideBarLink();
		
	}
		
		
	
	@AfterMethod
    public void TearDown()
    {
   	 driver.quit();
  
    }
}
