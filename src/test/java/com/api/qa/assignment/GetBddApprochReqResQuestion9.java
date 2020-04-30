package com.api.qa.assignment;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.api.qa.Util.infoCredential;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetBddApprochReqResQuestion9 {

	@BeforeMethod 
	void postData()
	{
	
		RestAssured.baseURI="https://reqres.in";
		RestAssured.basePath="/api/users/2";
	}
	
	@Test(priority = 1)
	public void getAPITest() {

		given().log().all().when().log().all().get()
		.then().log().all().assertThat()
				.statusCode(200);
	}

	@Test(priority = 2)
	void validateStatusCode() {
		given().when().get()
		.then().log().all().extract().body();
	}

	@Test(priority = 3)
	public void firstName() {

		given().log().all().when().log().all().get()
		.then().log().all().assertThat()
				.body("first_name", equalTo("Janet"));
	}

	@Test(priority = 4)
	public void companyStatus() {

		given().log().all().when().log().all().get()
		.then().log().all().assertThat()
				.body("company", equalTo("StatusCode Weekly"));
	}

	@Test(priority = 5)
	public void applicationType() {

		given().log().all().when().log().all().get()
		.then().log().all().assertThat()
				.contentType("application/json");
	}
}