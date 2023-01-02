package tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestAssuredTest1 {
	public static void main(String[] args) 
	{
		 Response res = RestAssured.get("https://reqres.in/api/users?page=2");
		 
		 //System.out.println(res.getStatusCode());
		 
		 int status = res.getStatusCode();
		 System.out.println("The Status code for URI is.."+status);
	     System.out.println("The Content Type is..."+res.getContentType());
	     System.out.println("The Status line is.."+res.getStatusLine());
	
	}

}
