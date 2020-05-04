package com.api.qa.assignment;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.File;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import com.api.qa.Util.UserDetailsPOJO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PostBddApprochQuestion4 {


	@Test
	public void PostRegister() {

		UserDetailsPOJO user = new UserDetailsPOJO ("Mohammad1", "Chowdhury1","fazlul","fazlul12",
				"fazlul12@gmail.com");
		
		ObjectMapper mapper = new ObjectMapper();
		String userJson = null;
		try {
			userJson = mapper.writeValueAsString(user);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		System.out.println(userJson);

		RestAssured.baseURI = "http://restapi.demoqa.com/customer";
		given().log().all().contentType(ContentType.JSON)
				.body(userJson)
				.when().log().all()
				.post("/register")
				.then().log().all().assertThat().statusCode(201)
				.and().body("SuccessCode", equalTo("OPERATION_SUCCESS"))
				.and().body("Message", equalTo("Operation completed successfully"));
	}
}