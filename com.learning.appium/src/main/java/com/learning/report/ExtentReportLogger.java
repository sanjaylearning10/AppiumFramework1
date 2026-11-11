package com.learning.report;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.learning.config.ScreenshotUtils;

public final class ExtentReportLogger {
	
	public static void pass(String testMessage)
	{
		ExtentReportManager.getExtentTest().pass(testMessage);
	}

	public static void fail(String testMessage)
	{
		ExtentReportManager.getExtentTest().fail(testMessage);
		ExtentReportManager.getExtentTest().fail(testMessage, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
	}
	
	public static void skip(String testMessage)
	{
		ExtentReportManager.getExtentTest().skip(testMessage);
	}
	
	public static void info(String testMessage)
	{
		ExtentReportManager.getExtentTest().info(testMessage);
	}
}

