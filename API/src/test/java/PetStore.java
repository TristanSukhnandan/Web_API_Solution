import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.bytebuddy.implementation.bytecode.assign.Assigner.EqualTypesOnly;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.jsoup.select.Evaluator.ContainsText;
import org.openqa.selenium.support.FindAll;
import org.json.simple.JSONObject;


public class PetStore {
	public  String dogname = "";
	public static int getRandomNum = (int) Math.floor(((Math.random()* 100)+1));
	public int IDTES = 25251;

	@Test
	public void test_1(){
		
	
		
		Response res = get("https://petstore.swagger.io/v2/pet/findByStatus?status=available");
		
		System.out.println(res.asString());
		System.out.println(res.getBody().asString());
		System.out.println(res.getStatusCode());
		System.out.println(res.getStatusLine());
		System.out.println(res.getTime());
		
		//Response res = get("https://petstore.swagger.io/v2/pet/findByStatus?status=available")
		String body = res.getBody().asString();
		
		Assert.assertTrue(body.contains("doggie"));
		Assert.assertTrue(body.contains("12"));
	
			
	}
	
	@Test
	public void test_2(){
		
		 dogname = "Pet" + getRandomNum + "Dog";
			
		Map<String, Object> Categorydetails = new HashMap<>();
		Categorydetails.put("id", getRandomNum);  
		Categorydetails.put("name", dogname);
		
		List<Map<String, Object>> Tag = new ArrayList<>();
		Map<String, Object> Tagdetails = new HashMap<>();
		Tagdetails.put("id", getRandomNum);
		Tagdetails.put("name", dogname);  
		Tag.add(Tagdetails);	
		
		String[] photourls = {"String"};	
		
		Map<String, Object> maps = new LinkedHashMap<String, Object>(); 
		maps.put("id", getRandomNum);
		maps.put("category", Categorydetails);
		maps.put("name", dogname);
		maps.put("photoUrls", photourls);
		maps.put("tags", Tag);
		maps.put("status", "available");
	
				Gson gson = new Gson();
				
				String jsonp = gson.toJson(maps);
				//System.out.println(jsonp);
				
				given().
						header("Content-Type","application/json").
						contentType("application/json").
				with().
						body(jsonp).
				when(). 
						post("https://petstore.swagger.io/v2/pet").
				then().
						statusCode(200).
						log().all();        			
	}
	
	
	@Test
	public void test_3(){
		
	given().
		with().
			pathParam("dogID", getRandomNum).
		when().	
			get("https://petstore.swagger.io/v2/pet/{dogID}").
		then().
			statusCode(200).
			 log().all();	
	}
	
}
