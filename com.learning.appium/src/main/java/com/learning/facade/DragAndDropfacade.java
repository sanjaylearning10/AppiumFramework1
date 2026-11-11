package com.learning.facade;

import org.openqa.selenium.support.PageFactory;

import com.learning.appium.DriverManager;
import com.learning.pages.HomePage;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class DragAndDropfacade {
	
	HomePage homePage= new HomePage();
	private DragAndDropfacade()
	{
		PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver()), DragAndDropfacade.class);
	}
	
	
	
	public void navigateToDragAndDropPage()
	{
		//homePage.clickOnViews().performDragAndDrop();
	}

}
