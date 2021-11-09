package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class guruLogin_PageFactory {

	WebDriver driver;

	@FindBy(xpath ="//*[@id=\"email\"]")
	@CacheLookup
	WebElement txt_username;

	//  Another way for find an element
	//	@FindBy(how=How.ID,using="passwd")
	//	WebElement txt_password;


	@FindBy(id ="passwd")

	@CacheLookup WebElement txt_password;

	@FindBy(id ="SubmitLogin")
	@CacheLookup
	WebElement bt_login;

 
	public guruLogin_PageFactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}


	public void guruDemoLogin(String username,String password)
	{
		txt_username.sendKeys(username);
		txt_password.sendKeys(password);
		bt_login.click();
	}


}
