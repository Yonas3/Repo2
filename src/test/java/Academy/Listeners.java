package Academy;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.ExtentReporterNG;

public class Listeners extends Base implements ITestListener  {

	
	ExtentReports extent =ExtentReporterNG.getRepoterObject();
	ExtentTest test;
	// for parallel testing, need to be thread safe(no overwriting)
	ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	
		test = extent.createTest(result.getMethod().getMethodName());
		extentTest.set(test);
		test.assignAuthor("Yonas");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// for parallel test add extentTest.get()
		extentTest.get().log(Status.PASS, "Test passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		extentTest.get().fail(result.getThrowable());
		WebDriver driver = null;
		// get the name of failed testcase
		String testMethodName =result.getMethod().getMethodName();
		// screenshot code and driver instance
		try {
			driver =(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
			String Screenpath= getScreenShotPath(testMethodName, driver);
			extentTest.get().addScreenCaptureFromPath(Screenpath, testMethodName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();
		
	}

}
