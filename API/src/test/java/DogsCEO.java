import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.annotation.JsonInclude.Include;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.jsoup.select.Evaluator.ContainsText;
import org.openqa.selenium.support.FindAll;

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
		
		Response res = get("https://dog.ceo/api/breed/bulldog/images");
		
		System.out.println(res.asString());
		System.out.println(res.getBody().asString());
		System.out.println(res.getStatusCode());
		System.out.println(res.getStatusLine());
		System.out.println(res.getTime());
		
		String body = res.getBody().asString();
		
		Assert.assertTrue(body.contains("boston"));
		Assert.assertTrue(body.contains("english"));
		Assert.assertTrue(body.contains("french"));
	}
	
}
