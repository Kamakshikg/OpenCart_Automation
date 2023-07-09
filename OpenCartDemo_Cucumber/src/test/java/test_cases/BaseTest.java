package test_cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import Page_Objects.RegisterPage;

import org.testng.Assert;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;

public class BaseTest 
{
	
	protected WebDriver driver;
	protected RegisterPage register_page;
	
	@BeforeMethod
	public void setup(String browser, String url)
	{
		// Cross browser testing.
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			Assert.assertEquals(false, "No browser type selected");
		}
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		register_page=PageFactory.initElements(driver, RegisterPage.class);
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}

}
