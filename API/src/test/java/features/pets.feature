@iLab_Assessment_API
Feature: Query Dog CEO API

@testOne
Scenario: Verify that a successful message is returned when a user searches for a breed
	Given I access dogs ceo breeds list all endpoint
	 When I search for a random dog
	 Then I should get a Success response 
	 
	 
@testTwo
Scenario: Verify that a specific breed is returned when a user searches for a breed
	Given I access dogs ceo breeds list all endpoint
	 When I search the list for a specific breed  
	 Then I should get a Success response saying bulldog is on the list	 
 
 	 
@testThree
Scenario: Verify that all imaages are returned when a user searches for a breed
	Given I access dogs ceo breeds images endpoint
	 When I search the list for all bulldog sub breeds
	 Then I should get a Success response showing list of all sub breeds	 	 


@testFour
Scenario: Verify pet with name of doggie is present with ID of 12
	Given I access petstore find by status endpoint
	 When I search the list for pet named doggie with ID of 12
	 Then I should get a Success response showing available pets


@testFive
Scenario: Add a new pet with auto generated name and available status
	Given I access petstore pet endpoint
	 When I enter param
	 Then I should get a Success response showing available pets
	 	 	 	 	 	 