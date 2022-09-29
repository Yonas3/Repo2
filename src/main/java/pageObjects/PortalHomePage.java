package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PortalHomePage {

	WebDriver driver =null;

	private By searchBox = By.id("search-courses");


	// constructor
	public PortalHomePage(WebDriver driver) {
		this.driver = driver;
	}


	public WebElement getSearchBox() {
		return driver.findElement(searchBox);

	}




}
