package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class guruLogin_PageFactory {
	
	WebDriver driver;
	
	@FindBy(xpath ="//*[@id=\"email\"]")
	WebElement txt_username;
	
	@FindBy(id ="passwd")
	WebElement txt_password;
	
	@FindBy(id ="login")
	WebElement bt_login;
	
	
	public guruLogin_PageFactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, guruLogin_PageFactory.class);
	}
	
	
	public void guruDemoLogin(String username,String password)
	{
		txt_username.sendKeys(username);
		txt_password.sendKeys(password);
		bt_login.click();
	}

}
