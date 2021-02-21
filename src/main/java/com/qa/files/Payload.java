package com.qa.files;

public class Payload {

	public static String AddUser()
	{
		return "{\r\n" + 
				"  \"email\": \"testuser4@gmail.com\",\r\n" + 
				"  \"name\": \"TestAPI\"\r\n" + 
				"}";
	}
	
	public static String AddCar(String id)
	{
		return "{\r\n" + 
				"  \"manufacture\": \"BMW\",\r\n" + 
				"  \"model\": \"Model X\",\r\n" + 
				"  \"imageUrl\": \"https://en.wikipedia.org/wiki/Tesla_Model_3#/media/File:2019_Tesla_Model_3_Performance_AWD_Front.jpg\",\r\n" + 
				"  \"userId\": \""+id+"\"\r\n" + 
				"}";
	}
}
