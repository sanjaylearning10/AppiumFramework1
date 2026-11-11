package com.learning.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BrowserStackImpl implements IDriver{

	@Override
	public WebDriver getDriver() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Google Pixel 3");
		desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		desiredCapabilities.setCapability("browserstack.user", "sanjay_GW5D0j");
		desiredCapabilities.setCapability("browserstack.key", "zw8SqRqS1yVVytYA86hD");
		desiredCapabilities.setCapability(MobileCapabilityType.APP, "bs://894d5f03e5c5a79c9d3e3e33049e14647ac059a8");		
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.2");	
		desiredCapabilities.setCapability(AndroidMobileCapabilityType.SYSTEM_PORT,  "8202");
		return new AndroidDriver<AndroidElement>(new URL("http://hub.browserstack.com/wd/hub"), desiredCapabilities);
		
	}
}
