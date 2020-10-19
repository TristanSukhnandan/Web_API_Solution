$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("pets.feature");
formatter.feature({
  "line": 2,
  "name": "Query Dog CEO API",
  "description": "",
  "id": "query-dog-ceo-api",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@iLab_Assessment_API"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Verify that a successful message is returned when a user searches for a breed",
  "description": "",
  "id": "query-dog-ceo-api;verify-that-a-successful-message-is-returned-when-a-user-searches-for-a-breed",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@testOne"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I access dogs ceo breeds list all endpoint",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I search for a random dog",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should get a Success response",
  "keyword": "Then "
});
formatter.match({
  "location": "PetsSteps.i_access_dogs_ceo_breeds_list_all_endpoint()"
});
formatter.result({
  "duration": 4532198100,
  "status": "passed"
});
formatter.match({
  "location": "PetsSteps.i_search_for_a_random_dog()"
});
formatter.result({
  "duration": 987490800,
  "status": "passed"
});
formatter.match({
  "location": "PetsSteps.i_should_get_a_Success_response()"
});
formatter.result({
  "duration": 900269200,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Verify that a specific breed is returned when a user searches for a breed",
  "description": "",
  "id": "query-dog-ceo-api;verify-that-a-specific-breed-is-returned-when-a-user-searches-for-a-breed",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@testTwo"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I access dogs ceo breeds list all endpoint",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I search the list for a specific breed",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I should get a Success response saying bulldog is on the list",
  "keyword": "Then "
});
formatter.match({
  "location": "PetsSteps.i_access_dogs_ceo_breeds_list_all_endpoint()"
});
formatter.result({
  "duration": 906047600,
  "status": "passed"
});
formatter.match({
  "location": "PetsSteps.i_search_the_list_for_a_specific_breed()"
});
formatter.result({
  "duration": 988439600,
  "status": "passed"
});
formatter.match({
  "location": "PetsSteps.i_should_get_a_Success_response_saying_bulldog_is_on_the_list()"
});
formatter.result({
  "duration": 746490500,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Verify that all imaages are returned when a user searches for a breed",
  "description": "",
  "id": "query-dog-ceo-api;verify-that-all-imaages-are-returned-when-a-user-searches-for-a-breed",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@testThree"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "I access dogs ceo breeds images endpoint",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "I search the list for all bulldog sub breeds",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I should get a Success response showing list of all sub breeds",
  "keyword": "Then "
});
formatter.match({
  "location": "PetsSteps.i_access_dogs_ceo_breeds_images_endpoint()"
});
formatter.result({
  "duration": 1040602800,
  "status": "passed"
});
formatter.match({
  "location": "PetsSteps.i_search_the_list_for_all_bulldog_sub_breeds()"
});
formatter.result({
  "duration": 1397880600,
  "status": "passed"
});
formatter.match({
  "location": "PetsSteps.i_should_get_a_Success_response_showing_list_of_all_sub_breeds()"
});
formatter.result({
  "duration": 998168200,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Verify pet with name of doggie is present with ID of 12",
  "description": "",
  "id": "query-dog-ceo-api;verify-pet-with-name-of-doggie-is-present-with-id-of-12",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@testFour"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "I access petstore find by status endpoint",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "I search the list for pet named doggie with ID of 12",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "I should get a Success response showing available pets",
  "keyword": "Then "
});
formatter.match({
  "location": "PetsSteps.i_access_petstore_find_by_status_endpoint()"
});
formatter.result({
  "duration": 3965247700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12",
      "offset": 50
    }
  ],
  "location": "PetsSteps.i_search_the_list_for_pet_named_doggie_with_ID_of(int)"
});
formatter.result({
  "duration": 3363192500,
  "status": "passed"
});
formatter.match({
  "location": "PetsSteps.i_should_get_a_Success_response_showing_available_pets()"
});
formatter.result({
  "duration": 2764355200,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Add a new pet with auto generated name and available status",
  "description": "",
  "id": "query-dog-ceo-api;add-a-new-pet-with-auto-generated-name-and-available-status",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@testFive"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "I access petstore pet endpoint",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "I enter and submit the pet details",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "I should get a Success response showing the pet is added",
  "keyword": "Then "
});
formatter.match({
  "location": "PetsSteps.i_access_petstore_pet_endpoint()"
});
formatter.result({
  "duration": 2762812000,
  "status": "passed"
});
formatter.match({
  "location": "PetsSteps.i_enter_and_submit_the_pet_details()"
});
formatter.result({
  "duration": 2139421500,
  "status": "passed"
});
formatter.match({
  "location": "PetsSteps.i_should_get_a_Success_response_showing_the_pet_is_added()"
});
formatter.result({
  "duration": 2117640200,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "Verify if new pet was added",
  "description": "",
  "id": "query-dog-ceo-api;verify-if-new-pet-was-added",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 39,
      "name": "@testSix"
    }
  ]
});
formatter.step({
  "line": 41,
  "name": "I access petstore find pet endpoint",
  "keyword": "Given "
});
formatter.step({
  "line": 42,
  "name": "I enter the pet id",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "I should get a Success response showing the pet is found",
  "keyword": "Then "
});
formatter.match({
  "location": "PetsSteps.i_access_petstore_find_pet_endpoint()"
});
formatter.result({
  "duration": 2177687900,
  "status": "passed"
});
formatter.match({
  "location": "PetsSteps.i_enter_the_pet_id()"
});
formatter.result({
  "duration": 2448170100,
  "status": "passed"
});
formatter.match({
  "location": "PetsSteps.i_should_get_a_Success_response_showing_the_pet_is_found()"
});
formatter.result({
  "duration": 2147655500,
  "status": "passed"
});
});