package com.api.qa.assignment;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.api.qa.Util.infoCredential;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class PostBDDquestion4HashMap {

	static HashMap value = new HashMap();

	@BeforeMethod
	void postData() {
		value.put("FirstName", "Mohammad");
		value.put("LastName", "Chowdhury");
		value.put("UserName", "Fazlul");
		value.put("Password", "Hoque");
		value.put("Email", "fazlul12@gamil.com");

		RestAssured.baseURI = "http://restapi.demoqa.com/customer";
		RestAssured.basePath = "/register";

	}

	@Test
	void registerCustomer() {
		given().log().all().contentType("application/json").body(value).when().log().all().post().then().log().all()
				.statusCode(201).body("SuccessCode", equalTo("OPERATION_SUCCESS"))
				.header("Content-Type", equalTo("application/json"))
				.body("Message", equalTo("Operation completed successfully"));

	}
}
