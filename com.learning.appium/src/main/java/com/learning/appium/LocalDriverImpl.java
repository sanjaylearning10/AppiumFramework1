package com.learning.appium;

import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.learning.constants.FrameworkConstants;
import com.learning.constants.FrameworkConstantsSingleton;
import com.learning.constants.FrameworkConstantsWithLombak;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public  class LocalDriverImpl implements IDriver {

	@Override
	public WebDriver getDriver() throws MalformedURLException {
		
			DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
			desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_3a_API_32_arm64-v8a");
			desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
			desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			//desiredCapabilities.setCapability(MobileCapabilityType.APP, FrameworkConstants.getApplicationfilepath());	
			desiredCapabilities.setCapability(MobileCapabilityType.APP, FrameworkConstantsSingleton.frameworkConstantsSingletonGetInstance().getApplicationFilePath());	
			
				return new AndroidDriver<AndroidElement>(
						new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
			
		
	}

	
		
	

}
