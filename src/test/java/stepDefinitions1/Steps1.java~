package stepDefinitions1;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LoginPage;

public class Steps {

	public WebDriver driver;
	public LoginPage lp;

	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {

		//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
		//		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		lp = new LoginPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {

		driver.get(url);
	}

	@When("User enters username\"Admin\" and password\"Admin123\"")
	public void user_enters_username_admin_and_password_admin123(String username, String password)
			throws InterruptedException {
		lp.setUserName(username);
		lp.setPassword(password);
		Thread.sleep(3000);
	}

	@When("Click on Login")
	public void click_on_login() throws InterruptedException {

		lp.clickLogin();
		Thread.sleep(3000);
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String title) {

		if (driver.getPageSource().contains("Invalid credentials")) {
			driver.close();
			Assert.assertTrue(false);

		} else {
			Assert.assertEquals(title, driver.getTitle());
		}
	}

	@When("user click on Logout link")
	public void user_click_on_logout_link() throws InterruptedException {

		lp.clickLogout();
		Thread.sleep(3000);
	}

	@Then("close browser")
	public void close_browser() {

	}

}
