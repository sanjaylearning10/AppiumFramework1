package com.learning.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import com.learning.exception.FrameworkException;

public class Config {

	private static final Properties properties=new Properties();
	private static Map<String, String> propertyMap = new HashMap<String,String>();
	
	
	static
	{
		File file = new File("//Users//kanishk//eclipse-workspace//com.learning.appium//src//test//resources//config//Configurations.properties");
		try(FileInputStream fis= new FileInputStream(file)) {
			
			properties.load(fis);
			
			for( Entry<Object, Object> entry: properties.entrySet())
			{
				String key = String.valueOf( entry.getKey());
				String value = String.valueOf(entry.getValue());
				propertyMap.put(key, value);
			}
			
		} 
		catch(IOException e)
		{
			e.printStackTrace();
			System.exit(0);
		}
		
	}

	public static String getValueFromProperty(String key)
	{
		return propertyMap.get(key);
	}

}
