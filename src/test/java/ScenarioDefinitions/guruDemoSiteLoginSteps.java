package ScenarioDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.guruLogin_PageFactory;
import io.cucumber.java.en.*;

public class guruDemoSiteLoginSteps {
	
	
	WebDriver driver=null;
	
	guruLogin_PageFactory login;
	
	@Given("Guru demo site open")
	public void guru_demo_site_open() throws InterruptedException {
	  
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/Drivers/chromedriver");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://demo.guru99.com/test/login.html");
		Thread.sleep(1000);
		driver.manage().window().maximize();

	}

	@When("^User login with (.*) and (.*) and click on login$")
	public void user_login_with_username_and_password(String username,String password) throws InterruptedException {
		
		login=new guruLogin_PageFactory(driver);
		//Thread.sleep(1000);
		login.guruDemoLogin(username, password);
		//Thread.sleep(2000);
	}

	@Then("Verify whether user logged in successfully")
	public void verify_whether_user_logged_in_successfully() {
	   
		driver.close();
		driver.quit();
	}


}
