package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class ForgotPassword {
	
	WebDriver driver =null;
	
	By emailId = By.xpath("//input[@id='user_email']");
	By sendMeInstruction = By.cssSelector("*[type='submit']");

	// constructor
	public ForgotPassword(WebDriver driver) {
		this.driver = driver;
	}

	
	public WebElement getRestPassword() {
		
		return driver.findElement(emailId);
		
	}

	public WebElement sendMeInstructions() {
		return driver.findElement(sendMeInstruction);
	}

		
		
	}


