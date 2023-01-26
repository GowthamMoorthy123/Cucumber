package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public WebDriver driver;

	@FindBy(id = "userId")
	WebElement Username;

	@FindBy(id = "twofieldNextBtn")
	WebElement nextBtn;

	@FindBy(name = "accountNumber")
	WebElement accountNumber;

	@FindBy(name = "password")
	WebElement Password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitBtn;

	public Login(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);
	}

	public void enterUsername(String un) {
		Username.sendKeys(un);
	}

	public void enterPassword(String PWD) {
		Password.sendKeys(PWD);
	}

	public void clickNextBtn() {
		nextBtn.click();
	}

	public void enterAccountNumber(String Account) {
		accountNumber.sendKeys(Account);
	}

	public void clickSignInBtn() {
		submitBtn.click();
	}

}
