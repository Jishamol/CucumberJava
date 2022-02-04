package ScenarioDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class GoogleSearchSteps {

	WebDriver driver = null;

	@Given("Browser is open")
	public void browser_is_open() {

		System.out.println("Inside - Browser is open page");
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/Drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		// driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@And("User into the google page")
	public void user_navigates_into_the_google_page() throws InterruptedException {
		System.out.println("Inside - User into the google page");
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
	}

	@When("Enter the text to search")
	public void enter_the_text_to_search() {
		System.out.println("Inside - Enter the text to search page");
		driver.findElement(By.name("q")).sendKeys("Selenium Automation");

	}

	@And("Click on enter key")
	public void enter_the_search_box() throws InterruptedException {
		System.out.println("Inside - enter the search box");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
	}

	@And("Click on selenium dev link")
	public void click_on_selenium_dev_link() throws InterruptedException {
		System.out.println("Inside - selenium search results page");
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div/div[1]/a/div/cite")).click();
		Thread.sleep(1000);

	}

	@Then("User navigates to the Selenium official site")
	public void user_navigates_to_the_Selenium_official_site() {
		System.out.println("Inside - User navigates to the search results page");
		if (driver.getPageSource().contains("Selenium") == true) {
			System.out.println("User successfully navigates to the selenium dev page");
		}
		driver.close();
	}

}
