package com.learning.appium;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;

public final class DriverFactory {
	
	private DriverFactory() {}
	
	public static WebDriver get(Modes mode) throws MalformedURLException
	{
		WebDriver driver = null;
		
		if (mode.equals(Modes.BROWSERSTACK)) {

			driver = new BrowserStackImpl().getDriver();
		} else if (mode.equals(Modes.LOCAL)) {
			driver = new LocalDriverImpl().getDriver();
		}
		return driver;
		
	}

}
