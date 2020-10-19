package stepDefinitions;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasKey;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.testng.Assert;

import com.google.gson.Gson;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PetsSteps{
	
	public  String dogname = "";
	public static int getRandomNum = (int) Math.floor(((Math.random()* 100)+1));

	@Given("^I access dogs ceo breeds list all endpoint$")
	public void i_access_dogs_ceo_breeds_list_all_endpoint() throws Throwable {
		
		given()
		.get("https://dog.ceo/api/breeds/list/all")
	.then()
		.statusCode(200)
		.body("status", equalTo("success"));	
	}

	@When("^I search for a random dog$")
	public void i_search_for_a_random_dog() throws Throwable {

		given()
		.get("https://dog.ceo/api/breeds/list/all")
	.then()
		.statusCode(200)
		.body("status", equalTo("success"));
	}

	@Then("^I should get a Success response$")
	public void i_should_get_a_Success_response() throws Throwable {
		given()
		.get("https://dog.ceo/api/breeds/list/all")
	.then()
		.statusCode(200)
		.body("status", equalTo("success"));
			
	}
	
	@When("^I search the list for a specific breed$")
	public void i_search_the_list_for_a_specific_breed() throws Throwable {
		given().
		get("https://dog.ceo/api/breeds/list/all").
	then().
		statusCode(200).
		 //body("message", equalTo("bulldog")).
		 body("message", hasKey("bulldog")).
		 log().all();	
	}
	
	
	@Then("^I should get a Success response saying bulldog is on the list$")
	public void i_should_get_a_Success_response_saying_bulldog_is_on_the_list() throws Throwable {
		given().
		get("https://dog.ceo/api/breeds/list/all").
	then().
		statusCode(200).
		 //body("message", equalTo("bulldog")).
		 body("message", hasKey("bulldog")).
		 log().all();	
	}
	
	
	@Given("^I access dogs ceo breeds images endpoint$")
	public void i_access_dogs_ceo_breeds_images_endpoint() throws Throwable {
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

	@When("^I search the list for all bulldog sub breeds$")
	public void i_search_the_list_for_all_bulldog_sub_breeds() throws Throwable {
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

	@Then("^I should get a Success response showing list of all sub breeds$")
	public void i_should_get_a_Success_response_showing_list_of_all_sub_breeds() throws Throwable {
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
	
	@Given("^I access petstore find by status endpoint$")
	public void i_access_petstore_find_by_status_endpoint() throws Throwable {
		Response res = get("https://petstore.swagger.io/v2/pet/findByStatus?status=available");
				String body = res.getBody().asString();
				
				Assert.assertTrue(body.contains("doggie"));
				Assert.assertTrue(body.contains("12"));
	}

	@When("^I search the list for pet named doggie with ID of (\\d+)$")
	public void i_search_the_list_for_pet_named_doggie_with_ID_of(int arg1) throws Throwable {
		Response res = get("https://petstore.swagger.io/v2/pet/findByStatus?status=available");
				String body = res.getBody().asString();
				
				Assert.assertTrue(body.contains("doggie"));
				Assert.assertTrue(body.contains("12"));
	}

	@Then("^I should get a Success response showing available pets$")
	public void i_should_get_a_Success_response_showing_available_pets() throws Throwable {
		Response res = get("https://petstore.swagger.io/v2/pet/findByStatus?status=available");
				String body = res.getBody().asString();
				
				Assert.assertTrue(body.contains("doggie"));
				Assert.assertTrue(body.contains("12"));
	}

	@Given("^I access petstore pet endpoint$")
	public void i_access_petstore_pet_endpoint() throws Throwable {
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
						statusCode(200);  
	}

	@When("^I enter and submit the pet details$")
	public void i_enter_and_submit_the_pet_details() throws Throwable {
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
						statusCode(200);  
	}

	@Then("^I should get a Success response showing the pet is added$")
	public void i_should_get_a_Success_response_showing_the_pet_is_added() throws Throwable {
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

	@Given("^I access petstore find pet endpoint$")
	public void i_access_petstore_find_pet_endpoint() throws Throwable {
		given().
		with().
			pathParam("dogID", getRandomNum).
		when().	
			get("https://petstore.swagger.io/v2/pet/{dogID}").
		then().
			statusCode(200);	
	}

	@When("^I enter the pet id$")
	public void i_enter_the_pet_id() throws Throwable {
		given().
		with().
			pathParam("dogID", getRandomNum).
		when().	
			get("https://petstore.swagger.io/v2/pet/{dogID}").
		then().
			statusCode(200);	
	}

	@Then("^I should get a Success response showing the pet is found$")
	public void i_should_get_a_Success_response_showing_the_pet_is_found() throws Throwable {
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
