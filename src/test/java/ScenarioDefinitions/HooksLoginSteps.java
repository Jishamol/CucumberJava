
package ScenarioDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksLoginSteps {

	WebDriver driver = null;

	@Before
	public void browserSetUP() {
		System.out.println("******Inside Browser setUP function********");
	}

	@After
	public void closeBrowserInstance() {
		System.out.println("******Inside closeBrowserInstance function********");
	}

	@BeforeStep(order = 0) // this before function will execute first in queue order
	public void beforeSteps() {
		System.out.println("******Inside beforeSteps function********");
	}

	@AfterStep(order = 0)
	public void afterSteps() {
		System.out.println("******Inside afterSteps function********");
	}

	@BeforeStep(order = 1)
	public void beforeSteps1() {
		System.out.println("******Inside beforeSteps1 function********");
	}

	@AfterStep(order = 1) // this after function will execute first (execute in stack order)
	public void afterSteps1() {
		System.out.println("******Inside afterSteps1 function********");
	}

	@Given("Hook- Browser is open")
	public void hook_browser_is_open() {

		System.out.println("Inside- Hook- Browser is open");
	}

	@Given("Hook- User is in login page")
	public void hook_user_is_in_login_page() {

		System.out.println("Inside Hook- User is in login page");
	}

	@When("Hook- Enter username and password")
	public void hook_enter_username_and_password() {

		System.out.println("Inside Hook- Enter username and password");
	}

	@When("Hook- User click on login button")
	public void hook_user_click_on_login_button() {

		System.out.println("Inside Hook- User click on login button");
	}

	@Then("Hook- Verify user logged in successfully")
	public void hook_verify_user_logged_in_successfully() {

		System.out.println("Inside Hook- Verify user logged in successfully");
	}

}
