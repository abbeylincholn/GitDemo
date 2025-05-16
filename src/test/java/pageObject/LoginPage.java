package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(name = "username")
	@CacheLookup
	WebElement Username;

	@FindBy(name = "password")
	@CacheLookup
	WebElement Password;

	@FindBy(xpath = "//button[text()=' Login ']")
	@CacheLookup
	WebElement Login;

	@FindBy(xpath = "//a[text()='Logout']")
	@CacheLookup
	WebElement Logout;

	public void setUserName(String uname) {
		Username.clear();
		Username.sendKeys(uname);
	}

	public void setPassword(String pwd) {
		Password.clear();
		Password.sendKeys(pwd);
	}

	public void clickLogin() {
		Login.click();
	}

	public void clickLogout() {
		Logout.click();
	}



}
