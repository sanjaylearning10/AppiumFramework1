package com.learning.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.learning.report.ExtentReport;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest {
	
	AndroidDriver<AndroidElement> androidDriver ;
	
	
	@BeforeSuite
	public void setUpSuite()
	{
		ExtentReport.initsReport();
		
	}
	
	@AfterSuite
	public void tearDownSuite()
	{
		ExtentReport.tearDownReport();
	}
	
	@BeforeMethod
	public void setup() throws MalformedURLException
	{
		
		Driver.initDriver();
		
	}
	
	@AfterMethod
	public void tearDown() throws MalformedURLException
	{
		Driver.quitDriver();
	}

}
