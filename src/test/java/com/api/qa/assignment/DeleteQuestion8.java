package com.api.qa.assignment;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteQuestion8 {

	int id= 20;
	
	@Test
	void deleteMethod()
	{
	
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/delete/"+id;
		given().log().all()
		.when().log().all()
		.delete()
		.then().log().all()
		.statusCode(200)
		.body("status", equalTo("success"))
		.body("message", equalTo("successfully! deleted Records"));
			
}
	}