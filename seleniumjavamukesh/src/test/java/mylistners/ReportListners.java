package mylistners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ReportListners implements ITestListener {
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case is passed:" + result.getMethod().getMethodName());
	    
	  }
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case is failed:" + result.getMethod().getMethodName());
		System.out.println("Exception Trace" + result.getThrowable().getMessage());
		
		
	 }
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case is Skipped:" + result.getMethod().getMethodName());
		System.out.println("Exception Trace" + result.getThrowable().getMessage());
		
	 }
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test case start:" + result.getMethod().getMethodName());
	  }
	
	public void onFinish(ITestContext context) {
	    System.out.println("Test case finish:" + context.getName());
	  }

	

}
