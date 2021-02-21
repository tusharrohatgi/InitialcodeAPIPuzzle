package com.qa.rest.tests;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import com.qa.files.Payload;

import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class GetCallTests {
	
	@Test
	public void PostDetails()
	
	{
	String json= "";
	RestAssured.baseURI = "http://99.80.111.168:8080/";
	String response_user= given().log().all().contentType("application/json").body(Payload.AddUser())
	.when().post("api/user")
	.then().log().all().assertThat().statusCode(200).body("email", equalTo("testuser4@gmail.com"))
	.extract().response().asString();
	
	System.out.println(response_user);

	JsonPath js_user = new JsonPath(response_user);
	String user_id = js_user.get("id");
	System.out.println("The new user has been created with id as: "+user_id);
	
	
	String response_car = given().log().all().contentType("application/json").body(Payload.AddCar(user_id))
			.when().post("api/car")
			.then().log().all().assertThat().statusCode(200).body("model", equalTo("Model X"))
			.extract().response().asString();
	
	System.out.println(response_car);

	JsonPath js_car = new JsonPath(response_car);
	String car_id = js_car.get("id");
	System.out.println("The new car has been created with id as: "+car_id);
	
	}
}
