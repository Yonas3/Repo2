package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import Academy.Base;


public class HomePageTest extends Base {
	

	public static Logger log =LogManager.getLogger(Base.class.getName()); 
	// declare this so it works in parallel testing  
	public WebDriver driver = null;

	@BeforeTest()
	public void initial() throws IOException {
		driver = initializeDriver();

	}

	// in different class dataProvider 
	// dataProviderClass = HomePage.class, dataProvider = "getData

	@Test(dataProviderClass = HomePage.class, dataProvider = "getData")
	public void LoginTest(String username, String pass, String text) throws IOException {
		//driver.get(prop.getProperty("url"));
		getUrl();
		HomePage home = new HomePage(driver);
		Boolean flag =home.getMenuBar().isDisplayed();
		Assert.assertTrue(flag);
		
		LoginPage login = home.getLogin();
		login.getEmail().sendKeys(username);
		login.getPassword().sendKeys(pass);
		//System.out.println(text);
		log.info(text);
		
		//home.getMenuBar().isDisplayed();
		
	
		login.getLoginBtn().click();
		ForgotPassword fb= login.getForgotPassword();
		fb.getRestPassword().sendKeys("Tony@gamil.com");
		fb.sendMeInstructions().click();
	}



	@AfterTest()
	public void tearDown() {
		driver.close();
	}


	/* @DataProvider public Object[][] getData() { 
	  // Row stands for how many different data types test should run (2)
	  // Column stands for how many values per each test (3)
	  Object[][] data = new Object[2][3];  // 
	  // 0th row 
	    data[0][0]= "abcn@gmail.com"; 
	    data[0][1]= "pasword123"; 
	    data[0][2]="restricted student"; 

	    data[1][0]= "bob@gmail.com"; 
	    data[1][1]="bob123"; 
	    data[1][2]= "none restricted student";

	  	return data;

	  }
	 */

}
