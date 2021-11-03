package ScenarioDefinitions;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.loginTestProject;
import io.cucumber.java.en.*;

public class TestProjectLoginSteps {

	WebDriver driver=null;
	loginTestProject login;
	
	@Given("Browser should be open")
	public void browser_should_be_open() {

		System.out.println("Inside -Browser should be open page");
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@And("User navigates to the test project login page")
	public void user_navigates_to_the_test_project_login_page() throws InterruptedException {
		System.out.println("Inside -test project login page");
		driver.navigate().to("https://example.testproject.io/web/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}

	@When("^Enter (.*) and (.*) in login page$")
	public void enter_username_and_password(String username,String password) {
		System.out.println("Inside -Enter username and password");
		//driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys(username);
		//driver.findElement(By.id("password")).sendKeys(password);
		login=new loginTestProject(driver);
		login.enterUsername(username);
		login.enterPassword(password);
	}

	@And("click on login button")
	public void click_on_login_button() throws InterruptedException {
		System.out.println("Inside -Browser should be open page");
		Thread.sleep(1000);
		//driver.findElement(By.id("login")).click();
		login.clickLogin();
		Thread.sleep(1000);
		
	}

	@Then("Verify user logged in")
	public void verify_user_logged_in() throws InterruptedException {
		
			System.out.println("Inside -Verify user logged in");

		//if (driver.findElement(By.id("logout")).isDisplayed()==true)
		//{
			//System.out.println("Passed: User successfully logged in and log out button displayed");
			//driver.findElement(By.id("logout")).click();	
			//}
			login.verifyLogoutAndClick();
			Thread.sleep(1000);
			driver.close();
		

		driver.quit();
	}

}
