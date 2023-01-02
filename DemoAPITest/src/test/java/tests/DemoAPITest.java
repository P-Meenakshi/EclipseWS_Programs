package tests;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class DemoAPITest {
	
	@Test
	public void get() {
		baseURI = "http://localhost:3000";
		given().get("/clients").then().statusCode(200).log().all();
		
		
	}
	
	@Test
	public void post() {
	JSONObject req = new JSONObject();
	req.put("firstName","Serius");
	req.put("lastName","Black");
	req.put("subjectId", 1);
	
	baseURI = "http://localhost:3000";
	given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(req.toJSONString())
	.when()
		.post("/users")
	.then()
		.statusCode(201);
	}
	
	@Test
	public void put() {
	JSONObject req = new JSONObject();
	req.put("firstName","Tom");
	req.put("lastName","Riddle");
	req.put("subjectId", 2);
	
	baseURI = "http://localhost:3000";
	given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(req.toJSONString())
	.when()
		.put("/users/4")
	.then()
		.statusCode(200);
	}
	
	
	@Test
	public void patch() {
	JSONObject req = new JSONObject();
	//req.put("firstName","Hermione");
	req.put("lastName","Granger");
	//req.put("subjectId", 2);
	
	baseURI = "http://localhost:3000";
	given()
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(req.toJSONString())
	.when()
		.patch("/users/4")
	.then()
		.statusCode(200);
	}
	
	
	@Test
	public void delete() {
		baseURI = "http://localhost:3000";
		when()
			.delete("/clients/3")
		.then()
			.statusCode(200);
		
	}
	

}
