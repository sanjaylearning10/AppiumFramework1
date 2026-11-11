package com.learning.report;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

public final class ExtentReportManager {
	
	public static ThreadLocal<ExtentTest> threadLocalExtentReport = new ThreadLocal();
	
	private ExtentReportManager()
	{
		
	}
	public static ExtentTest getExtentTest()
	{
		return threadLocalExtentReport.get();
	}
	
	public static void setExtentTest(ExtentTest test)
	{
		threadLocalExtentReport.set(test);
	}

	public static void unloadExtentTest()
	{
		threadLocalExtentReport.remove();
	}

}
