package com.learning.listner;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.testng.IInvokedMethod;
import org.testng.IObjectFactory;
import org.testng.IObjectFactory2;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.SuiteRunState;
import org.testng.internal.annotations.IAnnotationFinder;
import org.testng.xml.XmlSuite;

import com.learning.report.ExtentReport;

public class ListnerClass implements ISuiteListener, ITestListener {

	public void onStart(ISuite suite) {
		ExtentReport.initsReport();

	}

	public void onFinish(ISuite suite) {
		ExtentReport.tearDownReport();
	}

	public void onTestStart(ITestResult result) {
		ExtentReport.createTest(result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		// not implemented
	}

	public void onTestFailure(ITestResult result) {
		// not implemented
	}

	public void onTestSkipped(ITestResult result) {
		// not implemented
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// not implemented
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		onTestFailure(result);
	}

	

}
