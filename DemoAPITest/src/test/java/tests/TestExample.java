package tests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.Response.*;

public class TestExample {
	@Test
	public void test1() {
		Response res=RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(res.getStatusCode());
		System.out.println(res.getStatusLine());
		System.out.println(res.getTime());
		System.out.println(res.getHeader("content-type"));
	}

}
