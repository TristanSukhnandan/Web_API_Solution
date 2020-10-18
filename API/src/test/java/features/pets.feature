@iLab_Assessment_API
Feature: Query Dog CEO API

@testOne
Scenario: Verify that a successful message is returned when a user searches for a breed
	Given I access dogs ceo breeds list all endpoint
	 When I search for a random dog
	 Then I should get a Success response

 
	 
@testTwo
Scenario Outline: Verify that a specific breed is returned when a user searches for a breed
	Given I access dogs ceo breeds list all endpoint
	 When I search the list for a specific breed "<breed>" 
	 Then I should get a Success response
	  
	 

	 Examples: 
	 |				breed						|
	 |	 		  bulldog					|	
	 
	 
	 
@testThree
Scenario: Verify that all imaages are returned when a user searches for a breed
	Given I access dogs ceo breeds list all endpoint
	 When I search the list for all bulldog sub breeds
	 Then I should get a Success response
	 	 
	 