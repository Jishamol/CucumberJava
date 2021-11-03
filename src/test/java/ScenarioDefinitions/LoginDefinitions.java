package ScenarioDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginDefinitions {
	
	@Given("Login page the page is open")
	public void login_page_the_page_is_open() {
		System.out.println("User in Login page");
	}

	@When("Enter with valid username and password")
	public void enter_with_valid_username_and_password() {
		System.out.println("User enters username and password ");
	}

	@When("Click on login button")
	public void click_on_login_button() {
		System.out.println("User click on login button");
	}

	@Then("Logged in succesfully")
	public void logged_in_succesfully() {
		System.out.println("Logged in successfully");
	}


}
