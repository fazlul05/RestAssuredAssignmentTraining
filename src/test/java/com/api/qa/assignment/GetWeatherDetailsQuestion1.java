package com.api.qa.assignment;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;


public class GetWeatherDetailsQuestion1 {

	@Test (priority=1)
	public void GetAPITest() {
		 given().log().all()
		.when().log().all()
		.get("http://restapi.demoqa.com/utilities/weather/city/Pune")
		.then().log().all()
		.assertThat()
				.statusCode(200);
}
	
		@Test(priority=2)
		public void GetAPITestNonBDD() {
			given().log().all();

			Response response=
			get("http://restapi.demoqa.com/utilities/weather/city/Pune");
			
			int statusCode= response.getStatusCode();
			System.out.println(statusCode);
			Assert.assertEquals(statusCode, 200);
			System.out.println(response.prettyPrint());
			
		}
	
}