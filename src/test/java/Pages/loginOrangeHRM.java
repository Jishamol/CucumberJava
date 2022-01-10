package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginOrangeHRM {

	WebDriver driver;

	@FindBy(id="txtUsername")
	WebElement txt_Username;

	@FindBy(id="txtPassword")
	WebElement txt_Pwd;

	@FindBy(id="btnLogin")
	WebElement bt_Login;

	
	public loginOrangeHRM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	public void enterUername()
	{
		txt_Username.sendKeys("Admin");
	}
	
	public void enterPassword()
	{
		txt_Pwd.sendKeys("admin123");
	}

	public void clickOnLogin()
	{
		bt_Login.click();
	}
}
