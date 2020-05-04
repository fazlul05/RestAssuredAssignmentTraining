package com.api.qa.assignment;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.api.qa.Util.infoCredential;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class PostBddQuestion4 {
	public static HashMap random = new HashMap();
	@BeforeMethod 
	void postData()
	{
		random.put("FirstName",infoCredential.getFirstName());
		random.put("LastName",infoCredential.getLastName());
		random.put("UserName",infoCredential.getUserName());
		random.put("Password",infoCredential.getPassword());
		random.put("Email",infoCredential.getEmail());
		RestAssured.baseURI="http://restapi.demoqa.com/customer";
		RestAssured.basePath="/register";
		
	}

	@Test
	void registerCustomer()
	{
		given().log().all()
		.contentType("application/json")
		.body(random)
		.when().log().all()
		.post()
		.then().log().all()
		.statusCode(201)
		.body("SuccessCode", equalTo("OPERATION_SUCCESS"))
		.header("Content-Type", equalTo("application/json"))
		.body("Message", equalTo("Operation completed successfully"));
	

}
}
