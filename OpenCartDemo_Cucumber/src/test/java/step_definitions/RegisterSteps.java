package step_definitions;

import org.testng.annotations.Parameters;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test_cases.BaseTest;

public class RegisterSteps extends BaseTest
{
	@Given("Click on My Account dropdown")
	public void click_on_my_account_dropdown() 
	{
		super.setup("firefox", "https://demo.opencart.com/");
	    register_page.click_my_account_dropdown();
	}

	@And("Click on register option")
	public void click_on_register_option() 
	{
		register_page.click_register_option();
	}

	@When("User Enters new Account Details into the Mandatory Fields")
	public void user_enters_new_account_details_into_the_mandatory_fields() 
	{
		register_page.fill_details();
	}

	@And("Check agree privacy policy and click on Continue button")
	public void check_agree_privacy_policy_and_click_on_continue_button() 
	{
		register_page.click_agree_checkbox_and_continue_button();
	}
	
//	@And("Click on Continue")
//	public void click_()
//	{
//		
//	}
}
