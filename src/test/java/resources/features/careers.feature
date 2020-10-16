@iLab_Assessment
Feature: Open ilabquality.com/careers  website

@testOneDatatable
Scenario Outline: Apply to first job in SA careers page using dataTables as source
	Given I access iLabquality website
	 When I click on the Career hyperlink
	 Then I should see the ilab career page
	 When I click on the South Africa hyperlink
	 Then I should see the ilab careers South Africa page
	 When I click on the the first available job hyperlink
	 Then I should see the ilab job details page
	 When I click on the apply online button
	  And I enter a first name "<name>"
	  And I enter an email "<email>" address
	  And I enter an phone number
	  And I enter click send button
	 Then I should be presented with the validation alert message
	 

	 Examples: 
	 |				name						|									email														|
	 |	 		  user1						|			automationAssessment@iLABQuality.com				|	
	 
	 
@testTwoFlatFile
Scenario Outline: Apply to first job in SA careers page using FlatFiles as source
	Given I access iLabquality website
	 When I click on the Career hyperlink
	 Then I should see the ilab career page
	 When I click on the South Africa hyperlink
	 Then I should see the ilab careers South Africa page
	 When I click on the the first available job hyperlink
	 Then I should see the ilab job details page
	 When I click on the apply online button
	  And I enter a first name "<name>"
	  And I enter an email "<email>" address
	  And I enter an phone number
	  And I enter click send button
	 Then I should be presented with the validation alert message
 
 Examples: 
 |				name						|									email														|
 |	 		  user1						|			automationAssessment@iLABQuality.com				|	


@testThreeDatabase
Scenario Outline: Apply to first job in SA careers page using Database as source
	Given I access iLabquality website
	 When I click on the Career hyperlink
	 Then I should see the ilab career page
	 When I click on the South Africa hyperlink
	 Then I should see the ilab careers South Africa page
	 When I click on the the first available job hyperlink
	 Then I should see the ilab job details page
	 When I click on the apply online button
	  And I enter a first name "<name>"
	  And I enter an email "<email>" address
	  And I enter an phone number
	  And I enter click send button
	 Then I should be presented with the validation alert message	 
	 
	 	 Examples: 
	 |				name						|									email														|
	 |	 		  user1						|			automationAssessment@iLABQuality.com				|	