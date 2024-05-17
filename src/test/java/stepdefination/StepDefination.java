package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination 
{
	
	@Given("^User is on NetBanking landing page$")
	public void User_is_on_netbanking_landing()
	{
		
	}
	
	@When("^user login with username and password$")
	public void Login_with_username_and_password()
	{
		System.out.println("this is new statement from person x");
	}
	
	@Then("^home screen should populate$")
	public void Home_screen_should_be_displayed()
	{
		System.out.println("this is new printing statement 1");
		System.out.println("this is new printing statement 2");
		System.out.println("this is new printing statement 3");

	}
	
	@And("^cards are displayed$")
	public void cardsDisplayed()
	{
		
	}

}
