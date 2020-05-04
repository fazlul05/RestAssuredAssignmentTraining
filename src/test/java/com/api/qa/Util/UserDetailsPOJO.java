package com.api.qa.Util;

public class UserDetailsPOJO {

	// class vars:
	private String First_name;
	private String Last_name;
	private String UserName;
	private String Password;
	private String Email;
	public UserDetailsPOJO(String first_name, String last_name, String userName, String password, String email) {
		super();
		First_name = first_name;
		Last_name = last_name;
		UserName = userName;
		Password = password;
		Email = email;
	}
	public String getFirst_name() {
		return First_name;
	}
	public void setFirst_name(String first_name) {
		First_name = first_name;
	}
	public String getLast_name() {
		return Last_name;
	}
	public void setLast_name(String last_name) {
		Last_name = last_name;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}

	
	
}