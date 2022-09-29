package stepsDefinitions;

import org.testng.Assert;

import Academy.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.PortalHomePage;

public class LoginSteps extends Base {
	@Given("^Intialize the browser with chrome$")
	public void intialize_the_browser_with_chrome() throws Throwable {
		driver = initializeDriver();

	}

	@And("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_site(String arg1) throws Throwable {
		driver.get(arg1);
		Thread.sleep(5000);

	}

	@And("^Click on Login link in home page to land on Sign in page$")
	public void click_on_Login_link_in_home_page_to_land_on_Sign_in_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		HomePage home = new HomePage(driver);
		home.getLogin();
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and logs in$")
	public void user_enters_and_and_logs_in(String arg1, String arg2) throws Throwable {
		LoginPage login = new LoginPage(driver);
		login.getEmail().sendKeys(arg1);
		login.getPassword().sendKeys(arg2);
		login.getLoginBtn().click();

	}

	@Then("^Verify that user is successfully logged in$")
	public void verify_that_user_is_successfully_logged_in() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		PortalHomePage portal =new PortalHomePage(driver);
		Assert.assertTrue(portal.getSearchBox().isDisplayed());
	}


}
