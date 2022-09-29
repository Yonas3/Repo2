package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;


public class HomePage {

	WebDriver driver =null;

	//private By signIn =By.xpath("//span[text()='Login']");
	private By siginBtn =By.cssSelector("a[href*='sign_in']");
	private By title =By.cssSelector(".text-center h2");
	private By menu =By.xpath("//ul[@class='nav navbar-nav navbar-right']/li[8]");
	private By headerTitle =By.cssSelector("*[class*='video-banner'] h3");

	// constructor "this" referral to variable in this class 
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPage getLogin() {
		driver.findElement(siginBtn).click();
		LoginPage login = new LoginPage(driver);
		return login;
	}

	public String getTitle() {
		return driver.findElement(title).getText();	
	}

	public WebElement getMenuBar() {
		return driver.findElement(menu);	
	}

	public WebElement getHeader() {
		return driver.findElement(headerTitle);	
	}

	public String getHomepageTitle() {
		return driver.getTitle();
	}

	@DataProvider
	public static Object[][] getData() {
		// Row stands for how many different data types test should run
		// Column stands for how many values per each test
		Object[][] data = new Object[2][3];
		// 0th row
		data[0][0]= "abcn@gmail.com";
		data[0][1]= "pasword123";
		data[0][2]= "restricted student";
		// 1 st row
		data[1][0]= "bob@gmail.com";
		data[1][1]= "bob123";
		data[1][2]= "none restricted student";

		return data;


	}

}
