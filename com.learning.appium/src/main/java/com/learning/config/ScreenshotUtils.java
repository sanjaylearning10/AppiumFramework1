package com.learning.config;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.learning.appium.DriverManager;

public final class ScreenshotUtils {

	
	private ScreenshotUtils()
	{
		
	}
	
	public static String getBase64Image()
	{
		TakesScreenshot screenshot = (TakesScreenshot) DriverManager.getDriver();
		return screenshot.getScreenshotAs(OutputType.BASE64);
	}
}
