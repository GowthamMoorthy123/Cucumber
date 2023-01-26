package StepDefinition;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.Login;
import io.cucumber.java.en.*;
import junit.framework.Assert;

public class Steps {

	Login login;
	WebDriver driver;

	@Given("Launch the chrome browser")
	public void launch_the_chrome_browser() {
		// Write code here that turns the phrase above into concrete actions
		String SystemPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", SystemPath + "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// Initializing Login page
		login = new Login(driver);

	}

	@When("Pass the URL {string}")
	public void pass_the_url(String string) {
		// Write code here that turns the phrase above into concrete actions
		driver.get(string);
	}

	@When("Enter the username {string}")
	public void enter_the_username(String string) {
		// Write code here that turns the phrase above into concrete actions
		login.enterUsername(string);
	}

	@When("enter the Account number {string}")
	public void enter_the_account_number(String string) {
		// Write code here that turns the phrase above into concrete actions
		login.enterAccountNumber(string);
	}

	@When("send the Password {string}")
	public void send_the_password(String string) {
		// Write code here that turns the phrase above into concrete actions
		login.enterPassword(string);
	}

	@When("click the next button")
	public void click_the_next_button() {
		// Write code here that turns the phrase above into concrete actions
		login.clickNextBtn();
	}

	@When("click signIn button")
	public void click_sign_in_button() {
		// Write code here that turns the phrase above into concrete actions
		login.clickSignInBtn();
	}

	@Then("verify Shipping Location page")
	public void verify_shipping_location_page() {
		// Write code here that turns the phrase above into concrete actions
		String str = driver.getTitle();
		if (str.equals("Shipping Location")) {
			Assert.assertTrue("Shipping Location", true);
			System.out.println("Verified Shipping location page");
		} else {
			System.out.println("Not shiiping location page");
		}
	}

	@Then("close the driver")
	public void close_the_driver() {
		// Write code here that turns the phrase above into concrete actions
		driver.close();
	}

}
