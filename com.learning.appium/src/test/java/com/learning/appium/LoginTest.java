package com.learning.appium;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.learning.pages.HomePage;
import com.learning.report.ExtentReport;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginTest extends BaseTest{

	AndroidDriver<AndroidElement> androidDriver;
	ExtentReports extentResports;
	ExtentSparkReporter extentSparkReporter;
	ExtentTest extentTest;
	
	//HomePage homePage=new HomePage();
	
	@Test
	public void loginTest() throws MalformedURLException
	{
		
		//new HomePage().clickOnViews();
		DriverManager.getDriver().findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
		
	}

	@Test
	public void loginTest1() throws MalformedURLException
	{
		
		
	}}
