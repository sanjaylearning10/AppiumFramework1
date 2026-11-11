package com.learning.constants;

import java.util.Objects;

import lombok.Synchronized;

public class FrameworkConstantsSingleton {
	
	private final  static String resourceFilePath = "//Users//kanishk//eclipse-workspace//com.learning.appium//src//test//resources";
	
	private final  String applicationFilePath = resourceFilePath +"//apkfiles//ApiDemos-debug.apk";

	private FrameworkConstantsSingleton()
	{
		
	}
	
	private static FrameworkConstantsSingleton frameworkConstantsSingleton;
	public static synchronized FrameworkConstantsSingleton frameworkConstantsSingletonGetInstance()
	{
		
		
		if(Objects.isNull(frameworkConstantsSingleton))
		{
			frameworkConstantsSingleton=new FrameworkConstantsSingleton();
		}
		return frameworkConstantsSingleton;
		
	}
	
	public String getApplicationFilePath() {
		return applicationFilePath;
	}

}
