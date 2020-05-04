package com.api.qa.assignment;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.File;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PostQuestion3 {


	@Test(priority=1)
	public void PostRegisterBDD() {
	RestAssured.baseURI = "http://restapi.demoqa.com/customer";
	RestAssured.basePath="/register";
	given().log().all()
	.contentType(ContentType.JSON)
	.body(new File("C:\\Users\\fhchy\\eclipse-workspace\\RestAssuredAssignment\\"
			+ "src\\test\\java\\com\\api\\qa\\Util\\data1.json"))
	.when().log().all()
	.post()
	.then().log().all()
	.assertThat()
	.statusCode(200);
	
}
	@Test(priority=2)
	public void PostRegisterNonBDD() {
	RestAssured.baseURI = "http://restapi.demoqa.com/customer";
	RestAssured.basePath="/register";
	Response response=
	given().log().all()
	.contentType(ContentType.JSON)
	.body(new File("C:\\Users\\fhchy\\eclipse-workspace\\RestAssuredAssignment\\"
			+ "src\\test\\java\\com\\api\\qa\\Util\\data1.json"))
	.when().log().all()
	.post();
	int statusCode= response.getStatusCode();
	System.out.println(statusCode);
	Assert.assertEquals(statusCode, 200);
	System.out.println(response.prettyPrint());
	
}
	
	
}