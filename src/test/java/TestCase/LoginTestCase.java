package TestCase;
import PageObject.LoginPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestCase {
	
	
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
	
	public void LoginTestCase1()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		loginpageobject.EnterUserName("standard_user");
		loginpageobject.EnterPassword("secret_sauce");
		loginpageobject.ClickLoginButton();
		Thread.sleep(1000);
		
		
	}
	@Test
	public void LoginTestCase2()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		loginpageobject.EnterUserName("locked_out_user");
		loginpageobject.EnterPassword("secret_sauce");
		loginpageobject.ClickLoginButton();
		 String ActualErrorMessage = driver.findElement(By.tagName("h3")).getText();
         String ExpectedErrorMessage = "Epic sadface: Sorry, this user has been locked out.";
         Assert.assertEquals(ActualErrorMessage, ExpectedErrorMessage);
         Thread.sleep(1000);
		
		
	}
	@Test
	public void LoginTestCase3()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		loginpageobject.EnterUserName("standard_user");
		loginpageobject.EnterPassword("secret_sauce123");
		loginpageobject.ClickLoginButton();
		String ActualErrorMessage = driver.findElement(By.tagName("h3")).getText();
        String ExpectedErrorMessage = "Epic sadface: Username and password do not match any user in this service";
        Assert.assertEquals(ActualErrorMessage, ExpectedErrorMessage);
        Thread.sleep(1000);
	

	}
	@Test
	public void LoginTestCase4()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		loginpageobject.EnterUserName("problem_user");
		loginpageobject.EnterPassword("secret_sauce");
		loginpageobject.ClickLoginButton();
		Thread.sleep(1000);
}
	@Test
	public void LoginTestCase5()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		loginpageobject.EnterUserName("performance_glitch_user");
		loginpageobject.EnterPassword("secret_sauce");
		loginpageobject.ClickLoginButton();
		Thread.sleep(1000);

}
	@Test
	public void LoginTestCase6()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		loginpageobject.EnterUserName("error_user");
		loginpageobject.EnterPassword("secret_sauce");
		loginpageobject.ClickLoginButton();
		Thread.sleep(1000);

}
	@Test
	public void LoginTestCase7()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		loginpageobject.EnterUserName("visual_user");
		loginpageobject.EnterPassword("secret_sauce");
		loginpageobject.ClickLoginButton();
		Thread.sleep(1000);

}
	@Test
	public void LoginTestCase8()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		loginpageobject.EnterUserName("standard_user");
		loginpageobject.EnterPassword("");
		loginpageobject.ClickLoginButton();
		Thread.sleep(1000);
		String ActualMessage = driver.findElement(By.tagName("h3")).getText();
        String ExpectedMessage = "Epic sadface: Password is required";
        Assert.assertEquals(ActualMessage, ExpectedMessage);
        Thread.sleep(1000);

}
	@Test
	public void LoginTestCase9()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		loginpageobject.EnterUserName("");
		loginpageobject.EnterPassword("secret_sauce");
		loginpageobject.ClickLoginButton();
		Thread.sleep(1000);
		String ActualMessage = driver.findElement(By.tagName("h3")).getText();
        String ExpectedMessage = "Epic sadface: Username is required";
        Assert.assertEquals(ActualMessage, ExpectedMessage);
        Thread.sleep(1000);
	}
	@Test
	public void LoginTestCase10()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		loginpageobject.EnterUserName("Priyanka");
		loginpageobject.EnterPassword("secret_sauce");
		loginpageobject.ClickLoginButton();
		Thread.sleep(1000);
		String ActualMessage = driver.findElement(By.tagName("h3")).getText();
        String ExpectedMessage = "Epic sadface: Username and password do not match any user in this service";
        Assert.assertEquals(ActualMessage, ExpectedMessage);
        Thread.sleep(1000);
   }
	@Test
	public void LoginTestCase11()throws InterruptedException
	{
		LoginPageObject loginpageobject = new LoginPageObject(driver);
		loginpageobject.EnterUserName("");
		loginpageobject.EnterPassword("");
		loginpageobject.ClickLoginButton();
		Thread.sleep(1000);
		String ActualMessage = driver.findElement(By.tagName("h3")).getText();
        String ExpectedMessage = "Epic sadface: Username is required";
        Assert.assertEquals(ActualMessage, ExpectedMessage);
        Thread.sleep(1000);
   }
	@AfterMethod
    public void TearDown()
    {
   	 driver.quit();
    }
	
}
