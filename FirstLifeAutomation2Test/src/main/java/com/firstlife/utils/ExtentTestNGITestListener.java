package com.firstlife.utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class ExtentTestNGITestListener implements ITestListener 
{
	private ExtentReportManager extentReportManager= new ExtentReportManager();
	private ExtentReports extent = extentReportManager.createInstance("report.html");
	private static ThreadLocal<ExtentTest> parentTest = new ThreadLocal<ExtentTest>();
	private static ThreadLocal<ExtentTest> test = new ThreadLocal<ExtentTest>();

	public synchronized void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("I am in onTestStart method " + getTestMethodName(result) + " start");
		ExtentTest child = parentTest.get().createNode(getTestMethodName(result));
		test.set(child);

	}

	public synchronized void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("I am in onTestSuccess method " + getTestMethodName(result) + " succeed");
		test.get().pass("Test passed");

	}

	public synchronized void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("I am in onTestFailure method " + getTestMethodName(result) + " failed");
		//test.get().fail(result.getThrowable());
		test.get().fail("Test failed");
		

	}

	public synchronized void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("I am in onTestSkipped method " + getTestMethodName(result) + " skipped");
		//test.get().skip(result.getThrowable());
		test.get().fail("Test skipped");

	}

	public synchronized void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test failed but it is in defined success ratio " + getTestMethodName(result));

	}

	public synchronized void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("I am in onStart method " + context.getName());
		ExtentTest parent = extent.createTest(context.getName());
		parentTest.set(parent);

	}

	public synchronized void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("I am in onFinish method " + context.getName());
		extent.flush();

	}

	private static String getTestMethodName(ITestResult iTestResult) {
		return iTestResult.getMethod().getConstructorOrMethod().getName();
	}

	public static synchronized ExtentTest getTest() {
		return test.get();
	}

	public static synchronized void addExtentReportLog(String message) {
		getTest().info(message);
	}

}
