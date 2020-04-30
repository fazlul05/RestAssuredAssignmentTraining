package com.api.qa.assignment;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class GetBddApprochQestion2 {

	@Test
	public void GetAPITest() {
		given().log().all()
		.when().log().all()
		.get("http://restapi.demoqa.com/utilities/weather/city/Pune")
		.then().log().all()
		.assertThat().statusCode(200)
		.assertThat().body("City", equalTo("Pune"))
		.body("Temperature", equalTo("36.64 Degree celsius"))
		.contentType("application/json");

	}
}
