package com.listener;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.SkipException;

import com.base.TestBase;
import com.relevantcodes.extentreports.LogStatus;
import com.utils.TestUtil;


public class CustomListeners extends TestBase implements ITestListener {

	
	

	public void onFinish(ITestContext context) {
		
	}
	
     public void onStart(ITestContext context) {
		
	}

	public void onTestStart(ITestResult result) {
		
		test = rep.startTest(result.getName().toUpperCase());
		
		
		
	}
	
	
	public void onTestSuccess(ITestResult result) {
		test.log(LogStatus.PASS, result.getName().toUpperCase()+"PASS");
		rep.endTest(test);
		rep.flush();
	}
	
	
	public void onTestFailure(ITestResult result) {
		
		
		System.setProperty("org.uncommons.reportng.escape-output","false");
		try {
			TestUtil.captureScreenshot();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		test.log(LogStatus.FAIL, result.getName().toUpperCase()+"FAILED With Exception : "+result.getThrowable());
		test.log(LogStatus.FAIL,test.addScreenCapture(TestUtil.screenshotName));
		
		Reporter.log("<a target =\"_blank\" href="+TestUtil.screenshotName+">Screenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<a target =\"_blank\" href="+TestUtil.screenshotName+"><img src="+TestUtil.screenshotName+" height=300 width=300></img></a>");

		
		rep.endTest(test);
		rep.flush();
		
		
		
		
		
		
		/*
		 * System.setProperty("org.uncommons.reportng.escape-output","false");
		 * Reporter.log("Capturing Screenshot"); Reporter.
		 * log("<a target =\"_blank\" href=\"E:\\Wallpaper\\bike_chase.jpg\">Screenshot</a>"
		 * ); Reporter.log("<br>"); Reporter.
		 * log("<a target =\"_blank\" href=\"E:\\Wallpaper\\bike_chase.jpg\"><img src=\"E:\\Wallpaper\\bike_chase.jpg\" height=200 width=300></img></a>"
		 * );
		 */
	}
	
	
	public void onTestSkipped(ITestResult result) {
		
		
		test.log(LogStatus.SKIP,result.getName().toUpperCase()+" Skipped the Test as the Runmode is NO");
		rep.endTest(test);
		rep.flush();
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	
}
