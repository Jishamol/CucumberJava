package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginTestProject {

	protected WebDriver driver;
	
	private By txt_username=By.id("name");
	private By txt_password=By.id("password");
	private By btn_login=By.id("login");
	private By btn_logout=By.id("logout");
	
	public loginTestProject(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterUsername(String username)
	{
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void clickLogin()
	{
		driver.findElement(btn_login).click();
	}
	
	public void verifyLogoutAndClick()
	{
		boolean vlogout=driver.findElement(btn_logout).isDisplayed();
		if (vlogout==true)
		{
			System.out.println("Pass:- User succesfully logged into the test project page");
			driver.findElement(btn_logout).click();
		}
		
	}
}
