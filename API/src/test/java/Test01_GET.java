import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class Test01_GET {

	@Test
	void test_01(){
		
		Response res = get("https://dog.ceo/api/breeds/list/all");
		
		System.out.println(res.asString());
		System.out.println(res.getBody().asString());
		System.out.println(res.getStatusCode());
		System.out.println(res.getStatusLine());
		System.out.println(res.getTime());
		
		int statuscode = res.getStatusCode();
		
		Assert.assertEquals(statuscode,200);
		
		
	}
	
	@Test
	void test_02(){
		
		given()
			.get("https://dog.ceo/api/breeds/list/all")
		.then()
			.statusCode(200)
			.body("status", equalTo("success"));	
	}
	
	
	
	
}
 