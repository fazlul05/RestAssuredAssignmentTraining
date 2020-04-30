package com.api.qa.assignment;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteQuestion7 {
	
	Response response;
	RequestSpecification request = RestAssured.given();
	int id=20;
	
	@Test
	void deleteMethod()
	{
	
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath="/delete/"+id;
		
		response= request.delete();
		int statusCode= response.getStatusCode();
		
		Assert.assertEquals(statusCode, 200);
		
		}


}
