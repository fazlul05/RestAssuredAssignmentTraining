package com.api.qa.Util;

import org.apache.commons.lang3.RandomStringUtils;

public class infoCredential {
	
	public static String getFirstName()
	{
		String firstname = RandomStringUtils.randomAlphabetic(2);
		return ("Mohammad"+firstname);
	}
	
	public static String getLastName()
	{
		String lastname = RandomStringUtils.randomAlphabetic(2);
		return ("Chowdhury"+lastname);
	}
	
	public static String getUserName()
	{
		String username = RandomStringUtils.randomNumeric(1);
		return ("fazlul"+username);
	}
	
	public static String getPassword()
	{
		String password = RandomStringUtils.random(2);
		return ("fazlul"+password);
	}
	
	public static String getEmail()
	{
		String email = RandomStringUtils.randomNumeric(2);
		return ("fazlul"+email+"@gmail.com");
	}

}