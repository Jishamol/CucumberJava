package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMWelcome {

	WebDriver driver;

	@FindBy(xpath = "//*[@id=\"welcome\"]")
	WebElement lnk_welcome;

	@FindBy(xpath = "//*[@id=\"welcome-menu\"]/ul/li[3]/a")
	WebElement lnk_logout;

	@FindBy(xpath = "//*[@id=\"menu_pim_viewMyDetails\"]/b")
	WebElement lnk_MyInfo;

	@FindBy(xpath = "//*[@id=\"sidenav\"]/li[1]/a")
	WebElement lnk_PDetails;

	public OrangeHRMWelcome(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void findAndClickWelcome() {
		lnk_welcome.click();
	}

	public void verifyAndClickLogout() {
		if (lnk_logout.isDisplayed()) {
			System.out.println("****Logout option is displayed****");
		}
		lnk_logout.click();
	}

	public void viewDetails() {
		lnk_MyInfo.click();
	}

	public void verifyPersonalDetails() {
		lnk_PDetails.click();

	}

}
