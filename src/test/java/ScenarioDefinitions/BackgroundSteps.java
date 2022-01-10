package ScenarioDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.OrangeHRMWelcome;
import Pages.loginOrangeHRM;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class BackgroundSteps {

	WebDriver driver;
	loginOrangeHRM loginHRM;
	OrangeHRMWelcome HRMWelcome;

	@Before
	public void browserSetup()
	{
		System.out.println("Inside - Browser is open page");
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	
	  @After public void closeBrowserInstance() {
	  System.out.println("******Inside closeBrowserInstance function********");
	  driver.close(); driver.quit(); }
	 

	@Given("User naviagtes to the HRM page")
	public void user_naviagtes_to_the_hrm_page() throws InterruptedException {

		System.out.println("***Inside User naviagtes to the HRM page**");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		Thread.sleep(1000);
		driver.manage().window().maximize();

	}

	@When("Enter the username and password")
	public void enter_the_username_and_password() throws InterruptedException {

		System.out.println("***Inside Enter the username and password**");
		loginHRM=new loginOrangeHRM(driver);
		loginHRM.enterUername();
		Thread.sleep(1000);
		loginHRM.enterPassword();
		Thread.sleep(1000);

	}

	@And("Click on login button in HRM")
	public void click_on_login_button_in_hrm() throws InterruptedException {

		System.out.println("***Inside Click on login button in HRM**");
		loginHRM.clickOnLogin();
		Thread.sleep(2000);
	}

	@Then("User navigates to the home page")
	public void user_navigates_to_the_home_page() {

		System.out.println("***Inside User navigates to the home page**");
		HRMWelcome=new OrangeHRMWelcome(driver);

	}
	
	/*
	 * @Given("User gets logged in") public void user_gets_logged_in() {
	 * 
	 * System.out.println("***User gets logged in**"); }
	 */

	@When("Click on welcome link")
	public void click_on_welcome_link() throws InterruptedException {
		
		Thread.sleep(1000);
		System.out.println("***Inside Click on welcome link**");
		HRMWelcome.findAndClickWelcome();
		Thread.sleep(1000);

	}

	@Then("Verify the log out button is displayed.")
	public void verify_the_log_out_button_is_displayed() throws InterruptedException {

		System.out.println("***Inside Verify the log out button is displayed.**");
		HRMWelcome.verifyAndClickLogout();
		Thread.sleep(1000);

	}

	@When("Click on My Info")
	public void click_on_my_info() throws InterruptedException {

		System.out.println("***Inside Click on My Info**");
		HRMWelcome.viewDetails();
		Thread.sleep(1000);

	}

	@Then("Verify the personal details")
	public void verify_the_personal_details() throws InterruptedException {

		System.out.println("***Inside Verify the personal details**");
		HRMWelcome.verifyPersonalDetails();
		Thread.sleep(1000);
	}


}
