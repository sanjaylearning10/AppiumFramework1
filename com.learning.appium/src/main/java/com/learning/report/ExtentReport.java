package com.learning.report;

import java.security.Timestamp;
import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {

	private static ExtentReports extentReport;
	private static ExtentSparkReporter extentSparkReports;

	public static void initsReport() {
		if (Objects.isNull(ExtentReportManager.getExtentTest())) {
			extentReport = new ExtentReports();
			extentSparkReports = new ExtentSparkReporter(
					"//Users//kanishk//eclipse-workspace//com.learning.appium//src//test//resources//report//index.html");

			extentSparkReports.config().setTheme(Theme.DARK);
			extentSparkReports.config().setReportName("FrameworkAutomation");
			extentSparkReports.config().setDocumentTitle("DocumentTitle");

			extentReport.attachReporter(extentSparkReports);

			// ExtentTest extentTest =
			// extentReport.createTest("MyFirstTest").assignAuthor("sanjay").assignCategory("learning").assignDevice("emulator");
			// extentTest.pass("TC Passed");
			// extentTest.info("Pass info");
		}

	}

	public static void tearDownReport() {
		if (Objects.nonNull(ExtentReportManager.getExtentTest())) {
			extentReport.flush();
			ExtentReportManager.unloadExtentTest();
		}
	}

	public static void createTest(String testName) {
		ExtentTest test = extentReport.createTest(testName);
		ExtentReportManager.setExtentTest(test);
	}
}
