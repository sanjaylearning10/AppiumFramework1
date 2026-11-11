package com.learning.pages;

import org.openqa.selenium.support.PageFactory;

import com.learning.appium.DriverManager;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DragAndDropPage extends BasePage{
	
	public DragAndDropPage()
	{
		PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver()), DragAndDropPage.class);
	}
	
	
	@AndroidFindBy(id="io.appium.android.apis:id/drag_dot_1")
	private AndroidElement dot1;
	
	@AndroidFindBy(id="io.appium.android.apis:id/drag_dot_2")
	private AndroidElement dot2;
	
	@AndroidFindBy(id="io.appium.android.apis:id/drag_result_text")
	private AndroidElement labelDropped;
	
	
	public void performDragAndDrop()
	{
		dragAndDrop(dot1,dot2);
	}
	
	public String getMessage()
	{
		return getText(labelDropped);
	}
	

}
