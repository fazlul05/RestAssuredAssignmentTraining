package com.api.qa.assignment;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.api.qa.Util.infoCredential;
import com.api.qa.Util.infoCredentialPut;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class PutQuestionHashMap {

	static HashMap value = new HashMap();
	int id = 32;

	@Test
	void postDataBdd() {
		value.put("name", "Mohammad");
		value.put("salary", "3000");
		value.put("age", "32");

		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath = "/update/" + id;

		given().log().all().contentType("application/json").body(value).when().log().all().put().then().log().all()
				.statusCode(200);
	}

	@Test
	void postData() {
		value.put("name", "Mohammad");
		value.put("salary", "3000");
		value.put("age", "32");

		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath = "/update/" + id;

		Response response = given().log().all().contentType("application/json").body(value).when().log().all().put();
		System.out.println(response.getStatusCode());
		System.out.println(response.prettyPrint());

	}
}
