import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.gson.JsonObject;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.select.Evaluator.ContainsText;
import org.openqa.selenium.support.FindAll;
import org.json.simple.JSONObject;


public class PetStore {
	public  String dogname = "";
	public static int ID = 0;
	/*@Test
	public void test_1(){
		
	
		
		Response res = get("https://petstore.swagger.io/v2/pet/findByStatus?status=available");
		
		System.out.println(res.asString());
		System.out.println(res.getBody().asString());
		System.out.println(res.getStatusCode());
		System.out.println(res.getStatusLine());
		System.out.println(res.getTime());
		
		String body = res.getBody().asString();
		
		Assert.assertTrue(body.contains("doggie"));
		Assert.assertTrue(body.contains("12"));
	
			
	}*/
	
	@Test
	public void test_2(){
		
		int getRandomNum = (int) Math.floor(((Math.random()* 100)+1));
		 dogname = "Pet" + getRandomNum + "Dog";
		 ID = getRandomNum;
		 
	Map<String, Object> map = new HashMap<String,Object>();	
		map.put("id", getRandomNum);
		map.put("category.id", getRandomNum);
		map.put("category.name", dogname);
		map.put("name", dogname);
		map.put("photoUrls", "Test");
		map.put("tags.id", 0);
		map.put("tags.name", "Example");
		map.put("status", "available");
		
		System.out.println(map);
		
		JSONObject request = new JSONObject(map);
		
		given().
			body(request).
			post("https://petstore.swagger.io/v2/pet");
			//.then()
			
	
	}
	
	
	/*@Test
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
	}*/
	
}
