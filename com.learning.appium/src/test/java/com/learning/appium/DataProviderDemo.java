package com.learning.appium;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	@Test(dataProvider="getData")
	public void dataProviderTest1(String data1, String data2, String data3)
	{
		System.out.println("firstdata "+ data1);
		System.out.println("seconddata "+ data2);
		
	}
	
	@Test(dataProvider="getData")
	public void dataProviderTest(Map<String,String> map)
	{
		System.out.println("firstdata "+ map.get("ab"));
		System.out.println("seconddata "+ map.get("cd"));
		System.out.println("thirddata "+ map.get("ef"));
		System.out.println("fourthdata "+ map.get("gh"));
		System.out.println("fifthdata "+ map.get("ty"));
	}
	
	@DataProvider
	public Object[][] getData1()
	{
		return new Object[][] {
			{"ab","12"},{"cd","34"},{"ef","56"},{"gh","78",}
		};
		
		
	}
	
	@DataProvider
	public String[][] getData2()
	{
		return new String[][] {
			{"ab","12","temp"},{"cd","34","temp2"},{"ef","56","temp3"},{"gh","78","temp4"}
		};
		
	}
	
	@DataProvider
	public Object[][] getData3()
	{
		Map<String, String> map= new HashMap<String, String>();
		Map<String, String> map1= new HashMap<String, String>();
		map.put("ab", "12");
		map.put("cd", "34");
		map.put("ef", "56");
		map.put("gh", "78");
		map1.put("ab", "910");
		map1.put("cd", "1112");
		map1.put("ef", "1314");
		map1.put("gh", "1516");
		List<Map<String,String>> list = new ArrayList<>();
		return (Object[][]) list.toArray();
		
	}

	@DataProvider
	public Object[] getData()
	{
		Map<String, String> map= new HashMap<String, String>();
		Map<String, String> map1= new HashMap<String, String>();
		map.put("ab", "12");
		map.put("cd", "34");
		map.put("ef", "56");
		map.put("gh", "78");
		map.put("ty", "100");
		
		map1.put("ab", "910");
		map1.put("cd", "1011");
		map1.put("ef", "1213");
		map1.put("gh", "1415");
		List<Map<String,String>> list = new ArrayList<>();
		list.add(map);
		list.add(map1);
		return list.toArray();
		
	}
}
