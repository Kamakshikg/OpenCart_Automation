package Page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class RegisterPage
{
	WebDriver driver;

	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	// Inspect the elements.
	@FindBy(how=How.XPATH,using="(//span[@class=\"d-none d-md-inline\"])[3]")
	private WebElement my_account_dropdown;
	
	@FindBy(how=How.XPATH,using="//a[normalize-space()='Register']")
	private WebElement register_dropdown_link;
	
	@FindBy(how=How.XPATH,using="//input[@id='input-firstname']")
	private WebElement first_name;
	
	@FindBy(how=How.XPATH,using="//input[@id='input-lastname']")
	private WebElement last_name;
	
	@FindBy(how=How.XPATH,using="//input[@id='input-email']")
	private WebElement email;
	
	@FindBy(how=How.XPATH,using="//input[@id='input-password']")
	private WebElement password;
	
	@FindBy(how=How.XPATH,using="//input[@id='input-newsletter-yes']")
	private WebElement subscribe_radio_button;
	
	@FindBy(how=How.XPATH,using="//input[@name='agree']")
	private WebElement agree_checkbox;
	
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	private WebElement continue_button;
	
	public void click_my_account_dropdown()
	{
		my_account_dropdown.click();
	}
	
	public void click_register_option()
	{
		register_dropdown_link.click();
	}
	
	public void fill_details()
	{
		first_name.sendKeys("Kamakshi");
		last_name.sendKeys("Goyal");
		email.sendKeys("kamakshigoyal@gmail.com");
		password.sendKeys("KamakshiGoyal@48");
	}
	
	public void click_agree_checkbox_and_continue_button()
	{	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1200)");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		subscribe_radio_button.click();
		agree_checkbox.click();
		continue_button.click();
		
	}
}
