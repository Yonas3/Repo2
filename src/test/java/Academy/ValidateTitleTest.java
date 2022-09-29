package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import Academy.Base;

public class ValidateTitleTest extends Base {
	// write the path of class
	public static Logger log =LogManager.getLogger(ValidateTitleTest.class.getName()); 
	
	// declare this so it works in parallel testing  
	public WebDriver driver = null;
	HomePage home;

	@BeforeTest()
	public void initial() throws IOException {

		driver = initializeDriver();
		log.info("Driver is initialized");
		getUrl();
		log.info("Navigated to homepage");
	}


	@Test
	public void vaildateAppTitle() throws IOException {
		 home = new HomePage(driver);
		// compares the text from the browser with actual text
		String text = home.getTitle();
		Assert.assertEquals(text, "FEATURED COURSES123");
		log.info("successfully validated text message");

	}

	@Test
	public void vaildateMenuBarTest() throws IOException {
	
		//HomePage home = new HomePage(driver);
		// compares the text from the browser with actual text
		Assert.assertTrue(home.getMenuBar().isDisplayed());
		log.info("menu bar displayed");
	}
	
	@Test
	public void vaildateHeaderTest() {
		Assert.assertEquals(home.getHeader().getText(), "AN ACADEMY TO LEARN EVERYTHING ABOUT TESTING");
		//log.info("header title is displayed");
	}
	
	@Test
	public void vaildateHomepageTitle()  {
	System.out.println(home.getHomepageTitle());
		log.info("homepage title is displayed");
	}

	
	@AfterTest()
	public void tearDown() {
		driver.close();
	}

}
