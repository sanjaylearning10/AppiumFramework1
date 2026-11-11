package com.learning.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.learning.appium.DriverManager;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage extends BasePage{
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Views']")
	private MobileElement views;
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Date Widgets']")
	private AndroidElement dateWidget;
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='2. Inline']")
	private AndroidElement inLine;
	
	public void clickOnViews()
	{
		views.click();
	}
	
	public void clickOnDateWidget()
	{
		dateWidget.click();
	}
	
	public void clickOnInLine()
	{
		inLine.click();
	}
	
	public HomePage()
	{
		//PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver()), this);
		PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver()), this);	
	}
}
