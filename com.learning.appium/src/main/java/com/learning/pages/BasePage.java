package com.learning.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import com.learning.appium.DriverManager;
import com.learning.report.ExtentReportLogger;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class BasePage {
	
	protected void click(MobileElement element, String elementName)
	{
		element.click();
		System.out.print(elementName+"Element has been clicked Successfully");
	}
	
	protected void click(By by, String elementName)
	{
		click((MobileElement) DriverManager.getDriver().findElement(by),elementName);
		System.out.print(elementName+"Element has been clicked Successfully using By");
		ExtentReportLogger.pass(elementName+"Element has been clicked Successfully using By");
	}
	
	protected void click(String locatorType, String value, String elementName)
	{
		if(locatorType.equalsIgnoreCase("xpath"))
		{
			click(By.xpath(value),elementName);
		}
		else if(locatorType.equalsIgnoreCase("class"))
		{
			click(By.className(value),elementName);
		}
	}

	protected void clickMenuItems(List<MobileElement> list, String menuName)
	{
		MobileElement mobileElement= list.parallelStream().filter(e->e.getText().contains("menuName")).findFirst().get();
		click(mobileElement,menuName);
	}
	
	protected void dragAndDrop(AndroidElement source, AndroidElement destination)
	{
		TouchActions touchAction = new TouchActions(DriverManager.getDriver());
		touchAction.longPress((WebElement) LongPressOptions.longPressOptions().withElement(ElementOption.element(source)))
		.moveToElement((WebElement) ElementOption.element(destination))
		.build().perform();
	}
	
	protected String getText(MobileElement element )
	{
		return element.getText();
	}
}
