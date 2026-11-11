package com.learning.appium;

import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import java.lang.Object.*;
import com.learning.config.Config;


public final class Driver {

	private Driver() {
	}
	
	private static WebDriver driver;

	//Properties property;
	//File file = new File("Users//kanishk//eclipse-workspace//com.learning.appium//Configurations.properties");
	//FileInputStream fis = null;

	public static void initDriver() throws MalformedURLException {
		WebDriver driver=null;	
		if(DriverManager.getDriver()==null)
		{
			String value= Config.getValueFromProperty("environment");
			driver= DriverFactory.get(Modes.valueOf(value.toUpperCase()));
			DriverManager.setDriver(driver);
		}
	}
	
	public static void quitDriver() throws MalformedURLException {
		
		if(DriverManager.getDriver()!=null)
		{
		DriverManager.getDriver().quit();
		DriverManager.unload();
		}
		
	}

}
