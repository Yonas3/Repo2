package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {

	WebDriver driver =null;

	private By emailId = By.xpath("//input[@id='user_email']");
	private By password = By.cssSelector("[id='user_password']");
	private By loginBtn = By.cssSelector("*[value='Log In']");
	private By forgotPassword = By.cssSelector("*[href*='password/new']"); 

	// constructor  "this" referral to variable in this class 
	//and webDriver driver has a life and its coming from test class
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}


	public WebElement getEmail() {
		return driver.findElement(emailId);

	}

	public WebElement getPassword() {
		return driver.findElement(password);

	}

	public WebElement getLoginBtn() {
		return driver.findElement(loginBtn);

	}

	public ForgotPassword getForgotPassword() {
		driver.findElement(forgotPassword).click();
		return new ForgotPassword(driver);
	}

}
