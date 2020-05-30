package e2eprogram;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.ExtentReport;
import resources.base;

public class Listeners extends base implements ITestListener{
  ExtentReports extent = ExtentReport.config();
  ExtentTest test;
  ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();
  @Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		//on test start we will give extent object to create report
	 test = extent.createTest(result.getMethod().getMethodName());	
	extentTest.set(test);
  }

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	//how to when test success
		extentTest.get().log(Status.PASS, "Test Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//screenshot
		//when test got Fail
		//to get failure logs getThrowable method will give details for failure method
		extentTest.get().fail(result.getThrowable());
		WebDriver driver=null;
		String testMethodName = result.getMethod().getMethodName();
		
			try {
				driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		
		
			try {
				extentTest.get().addScreenCaptureFromPath(getScreenShot(testMethodName,driver),result.getMethod().getMethodName());
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
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
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();//to close the report we have to give info to stop
	}

	
	

}
