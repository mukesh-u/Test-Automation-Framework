package com.ui.listeners;

import java.util.Arrays;

import org.apache.logging.log4j.Logger;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.ui.tests.TestBase;
import com.utility.BrowserUtility;
import com.utility.ExtentReporterUtility;
import com.utility.LoggerUtility;

public class TestListener implements ITestListener {
	Logger logger = LoggerUtility.getLogger(this.getClass());

	ExtentSparkReporter extentSparkReporter;
	ExtentReports extentReports;
	ExtentTest extentTest;

	public void onTestStart(ITestResult result) {
		logger.info(result.getMethod().getMethodName());
		logger.info(result.getMethod().getDescription());
		logger.info(Arrays.toString(result.getMethod().getGroups()));
		ExtentReporterUtility.createExtentTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		logger.info(result.getMethod().getMethodName() + " " + " Passed ");
		ExtentReporterUtility.getTest().log(Status.PASS, result.getMethod().getMethodName() + " " + " Passed ");
	}

	public void onTestFailure(ITestResult result) {
		logger.error(result.getMethod().getMethodName() + " " + " Failed ");
		logger.error(result.getThrowable().getMessage());
		ExtentReporterUtility.getTest().log(Status.FAIL, result.getMethod().getMethodName() + " " + " Failed ");
		ExtentReporterUtility.getTest().log(Status.FAIL, result.getThrowable().getMessage());
		
		Object testclass=result.getInstance();
		BrowserUtility browserUtility=((TestBase)testclass).getInstance();
		logger.info("Capturing screenshot for the failed tests..");
		String screenhshotPath=browserUtility.takeScreenshot(result.getMethod().getMethodName());
		logger.info("Attaching the screenshot to the HTML file");
		ExtentReporterUtility.getTest().addScreenCaptureFromPath(screenhshotPath); 
	}

	public void onTestSkipped(ITestResult result) {
		logger.warn(result.getMethod().getMethodName() + " " + " Skipped ");
		ExtentReporterUtility.getTest().log(Status.SKIP, result.getMethod().getMethodName() + " " + " Skipped ");
	}

	public void onStart(ITestResult result) {
		logger.info("Test Suite Started");
		ExtentReporterUtility.setupSparkReporter("report.html");
	}

	public void onFinish(ITestResult result) {
		logger.info("Test Suite Ended");
		ExtentReporterUtility.flushReport(result);
	}

}
