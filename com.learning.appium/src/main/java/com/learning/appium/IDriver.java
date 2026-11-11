package com.learning.appium;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;

public interface IDriver {

	public WebDriver getDriver() throws MalformedURLException;
}
