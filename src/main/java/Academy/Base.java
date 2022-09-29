package Academy;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Base {
	public WebDriver driver = null;
	Properties prop =null;


	public WebDriver initializeDriver() throws IOException {
		prop = new Properties();
		//String properPath = System.getProperty("user.dir");
		FileInputStream fis = new FileInputStream("./src/main/java/resources/data.properties");
		prop.load(fis);

		// mvn test -Dbrowser=chrome (parameterize for mvn or jenkins)
		//String browserName = System.getProperty("browser");
		String browserName = prop.getProperty("browser");
		// when running use mvn test -Dbroswer=chromeheadless or chrome
		if (browserName.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
			// to run headless (without opening browsers)
			ChromeOptions options = new ChromeOptions();
			options.addArguments("chorme");
			if(browserName.contains("headless"))
			{
				options.addArguments("headless");
				
			}
			driver = new ChromeDriver(options);


		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();


		} else if (browserName.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		} else {
			System.out.println("browser doesn't match");
			//Assert.fail("Browser doesn't match");

		}

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver; 
	}

	
	public void getUrl()  {
		driver.get(prop.getProperty("url"));
	}

	
	public String getScreenShotPath(String testCaseName, WebDriver driver) {
		TakesScreenshot shot =(TakesScreenshot) driver;
		File source =shot.getScreenshotAs(OutputType.FILE);

		String destintionFile= System.getProperty("user.dir")+"//reports//"+testCaseName +".png";
		// you need to add commons io jars
		try {
			FileUtils.copyFile(source, new File(destintionFile));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return destintionFile;
	}
}
