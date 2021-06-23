package ADV.EMCO;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


public class Listerners extends base implements ITestListener {

	ExtentReports extent=extentReportNG.getReportObj();
	ThreadLocal<ExtentTest> extenttest=new ThreadLocal<ExtentTest>();
	
	ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		 test=extent.createTest(result.getMethod().getMethodName());
		 extenttest.set(test);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

		extenttest.get().log(Status.PASS, "Test Passed");
		String tcname=result.getMethod().getMethodName();
		
		WebDriver driver=null;
		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (Exception e) {
					}
		try {
			getscreenshotpath(tcname,driver);
		}catch(IOException e)
		{
			e.printStackTrace();
			
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
	
	extenttest.get().fail(result.getThrowable());
	String tcname=result.getMethod().getMethodName();
	
	WebDriver driver=null;
	try {
		driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
	} catch (Exception e) {
				}
	try {
		extenttest.get().addScreenCaptureFromPath(getscreenshotpath(tcname,driver), tcname);
	
	}catch(IOException e)
	{
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
		;
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
		extent.flush();
	
	}
	
	public void teststepresult(String message) {
		this.extenttest.get().log(Status.INFO, message);
		
	}

}
