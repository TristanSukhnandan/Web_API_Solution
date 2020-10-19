import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class DogsCEO {

	@Test
	public void test_1(){
		
		given()
			.get("https://dog.ceo/api/breeds/list/all")
		.then()
			.statusCode(200)
			.body("status", equalTo("success"));	
	}
	
	@Test
	public void test_2(){
		
		given().
			get("https://dog.ceo/api/breeds/list/all").
		then().
			statusCode(200).
			 //body("message", equalTo("bulldog")).
			 body("message", hasKey("bulldog")).
			 log().all();	
	}
	
	
	@Test
	public void test_3(){
		
//		Response res = get("https://dog.ceo/api/breed/bulldog/images");
//		
//		System.out.println(res.asString());
//		System.out.println(res.getBody().asString());
//		System.out.println(res.getStatusCode());
//		System.out.println(res.getStatusLine());
//		System.out.println(res.getTime());
//		
//		String body = res.getBody().asString();
//		
//		Assert.assertTrue(body.contains("boston"));
//		Assert.assertTrue(body.contains("english"));
//		Assert.assertTrue(body.contains("french"));
		
		
	given().
	with().
		pathParam("post", "bulldog").
	when().	
		get("https://dog.ceo/api/breed/{post}/images").
	then().
		statusCode(200).
		body(containsString("english"),containsString("english")).
		body(containsString("french"),containsString("french")).
		body(containsString("boston"),containsString("boston")).
		 log().all();		
		
	}
		
}
